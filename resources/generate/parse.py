from os import makedirs, path as osp
from sys import argv, exit


template = """
; Auto-generated file
; Generated from source {}

(ns {}
  (:import (com.microsoft.z3 {})){}
  (:gen-class))

{}"""

clojure_names = {'update', 'when', 'cond', 'repeat', 'and', 'or', 'not', 'pop'}

primitives = {'int', 'long', 'float', 'byte', 'char', 'double', 'short', 'boolean'}
imports = set()
z3_prefix = 'com.microsoft.z3'
lang_prefix = 'java.lang.'

def param_to_str(t, n, type_hints=True):
    """Return a tuple (param, invok), where param is how the parameter
    will show in the new function and invok is how the parameter will be
    invoked in the call to the Java method"""

    t = t.strip()
    n = n.strip()

    if t.startswith(z3_prefix):
        t = t[len(z3_prefix):]
        imports.add(t.strip('.[]'))

    elif t.startswith(lang_prefix):
        t = t[len(lang_prefix):]

    elif '.' in t:
        print("FOUND UNEXPECTED TYPE:", t)
        exit()

    if t.endswith('...'):
        t = t.strip('.')

        result =  (n, "(into-array {} {})".format(t, n))
        return result

    t = t.strip('.')
    if t in primitives:
        result = n, n
    else:
        result = (n, "^{} {}".format(t, n)) if type_hints else (n, n)
    return result

def make_fn_body(entry, classname, type_hints=True):
    """
    :entry: map of characteristics of a method to produce
    :type_hints: a boolean flag determining if type hints are produced
    """
    name = entry['name']
    tp = entry['type']
    ps = entry['params']
    if ps:
        tps, nms = zip(*ps)
    xs = [param_to_str(p[0], p[1], type_hints) for p in ps]
    params, invoks = [], []
    if xs:
        params, invoks = list(zip(*xs))
    p = classname.lower()
    fn_body = """[{} {}]\n    (.. {} ({} {}))""".format(
            p,                         # Instance param name
            ' '.join(list(params)),    # Args
            p,                         # Instance param name
            name,                      # Name of Java method
            ' '.join(list(invoks)))    # Invocation of args
    return fn_body
    
def make_fn_str(name, classname, entries):
    """
    :entries: a list of entries
    """
    entries_by_param_len = {}    # Maps param_len => entry
    for e in entries:
        l = len(e['params'])
        if l not in entries_by_param_len:
            entries_by_param_len[l] = []
        entries_by_param_len[l].append(e)
    bodies = []
    for l, es in entries_by_param_len.items():
        fn_body = make_fn_body(es[0], classname, len(es) == 1)
        bodies.append(fn_body)

    if len(bodies) is 1:
        return """(defn {} {})""".format(name, bodies[0])
    else:
        bodies = ["\n  ({})".format(body) for body in bodies]
        bodies = ''.join(bodies)
        return """(defn {} {})""".format(name, bodies)

class DecompClassTranslator:
    def __init__(self, source, target_dir='clj_z3'):
        self.source = source
        self.target_dir = target_dir
        self.entries = []   # A dict mapping each public method entry to be
                            # forwarded to the Clojure API
        self.body = ""
        self.classname = "Obj"
        self.package = ""
        self.namespace = "clj_z3"
        self.fns = []       # Clojure functions to write
        self.exclusions = []
        self.constructors = []
        with open(self.source) as f:
            self.lines = f.readlines()

    def parse(self):
        '''
        Parse the decompiled source file, storing public methods as entries
        '''
        print()
        print('-' * 80)
        print("Parsing", self.source)
        entries = self.entries
        for i, line in enumerate(self.lines):
            building_constructor = False
            l = line.strip()
            if l.startswith('package'):
                # print("Line " + str(i) + ": " + line.strip())
                # print("Found Package")
                #"package com.microsoft.z3.Blah; => com.microsoft.z3.Blah
                self.package = l.split()[1][:-1].strip()
                # print(self.package)
                if self.package.startswith(z3_prefix):
                    package = self.package[len(z3_prefix): ]   # Strip com.microsoft.z3
                    path_components = package.split('.')
                    # print("Path Components: {}".format( path_components))
                    self.target_dir = osp.join(self.target_dir, *path_components)
                    # print("TARGET = {}".format( self.target_dir))
                    ns = '.'.join(path_components).lower()
                    self.namespace += '.' + ns if ns else ''
                    # print("Namespace:", self.namespace)
                else:
                    continue
            if "public " in l:
                if " class " in l:
                    strs = l.split()
                    self.classname = strs[2].strip()
                    # print("Line " + str(i) + ": " + line.strip())
                    # print("Class name:", self.classname)
                        
                    # XXX: Kludgy
                    continue
                entry = {}
                try:
                    idx = l.index("{ /* compiled code */ }")
                except ValueError as e:
                    idx = -1
                if idx >= 0:
                    l = l[ : idx] .strip()
                if l.startswith("public "):
                    l = l[len("public "):].strip()

                # Get type
                try:
                    idx = l.index(' ')
                    entry['type'] = l[:idx]
                    l = l[idx:].strip()
                except ValueError as e:
                    # print("Line " + str(i) + ": " + line)
                    # print("No space when looking for type: " + l)
                    print("Creating constructor...")
                    entry['type'] = ''
                    building_constructor = True

                # Get method name
                try:
                    popen = l.index('(')
                    pclose = l.index(')')
                except ValueError as e:
                    # print("Line " + str(i) + ": " + line)
                    # print("Couldn't find open or close paren, not a method: " + l)
                    continue
                name = l[:popen].strip()
                if name in clojure_names:
                    self.exclusions.append(name)
                entry['name'] = name
                ps = list(filter(lambda e : len(e) > 0, [s.strip() for s in l[popen + 1: pclose].strip().split(',')]))
                entry['params'] = [tuple(xs.split()) for xs in ps]

                if building_constructor:
                    # print("Constructor entry: ", entry)
                    self.constructors.append(entry)
                else:
                    entries.append(entry)

    def make_body(self):
        entries = self.entries
        fns = self.fns
        # print(entries)

        entry_map = {}
        for entry in entries:
            name = entry['name']
            if name not in entry_map:
                entry_map[name] = []
            entry_map[name].append(entry)

        for entry in self.constructors:
            # print("CONSTRUCTOR ENTRY")
            # print(entry)
            name = entry['name']
            ps = entry['params']
            xs = [param_to_str(p[0], p[1]) for p in ps]
            params, invoks = [], []
            if xs:
                params, invoks = list(zip(*xs))
            fn_body = """
(defn {}
  [{}] ({}. {}))""".format(
                        name.lower(),              # Name of clojure fn
                        ' '.join(list(params)),    # Args
                        name,
                        ' '.join(list(invoks)))    # Invocation of args
            # print("-" * 80)
            # print("FN_BODY")
            # print(fn_body)
            fns.append(fn_body)

        # print("ENTRY MAP:", entry_map)
        for name, es in entry_map.items():
            # print(name, es)
            fn_body = make_fn_str(name, self.classname, es)
            # print(fn_body)
            fns.append(fn_body)

        imports.add(self.classname)
        self.body = template.format(
                self.source,
                self.namespace.replace('_', '-') + '.' + self.classname.lower(),
                ' '.join(imports),
                self.make_exclusions(),
                '\n\n'.join(fns))
        return self.body

    def write_body(self, target=None):
        if target is None:
            target = self.target_dir + self.namespace.replace('.', '/') + '/' + self.classname.lower() + ".clj"
        dirname = osp.dirname(target)
        if not osp.exists(dirname):
            makedirs(dirname)
        print("-" * 80)
        print("Writing to '{}'".format(target))
        with open(target, 'w') as f:
            f.write(self.body)
        return target

    def make_exclusions(self):
        if self.exclusions:
            return '\n  (:refer-clojure :exclude [{}])'.format(' '.join(list(set(self.exclusions))))
        return  ''

def main():
    if len(argv) == 1:
        print("Usage: python parse.py dest [src1 src2 src3 ...]")
        exit(0)

    dest = argv[1]
    srcs = argv[2:]
    if not osp.exists(dest) or not osp.isdir(dest):
        print("Creating destination directory: " + dest)
        makedirs(dest)
    targets = []
    dcts = []
    for src in srcs:
        print("Inspecting source file: " + src)
        dct = DecompClassTranslator(src, dest)
        dct.parse()
        dct.make_body()
        trg = dct.write_body()
        targets.append(trg)
    print("Wrote to: ")
    for trg in targets:
        print("    " + trg)

if __name__ == '__main__':
    main()

