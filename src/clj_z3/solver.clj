
; Auto-generated file
; Generated from source decompiled/com/microsoft/z3/Solver.decomp.java

(ns clj-z3.solver
  (:import (com.microsoft.z3 RealExpr FuncDecl Constructor IntExpr Solver FPSort Pattern AST Symbol SeqExpr Sort BoolExpr ArrayExpr ReExpr Tactic FPRMExpr FPExpr Expr BitVecExpr ArithExpr Params Context Probe enumerations.Z3_ast_print_mode))
  (:refer-clojure :exclude [pop])
  (:gen-class))

(defn check 
  ([solver ]
    (.. solver (check )))
  ([solver exprs]
    (.. solver (check (into-array Expr exprs)))))

(defn getProof [solver ]
    (.. solver (getProof )))

(defn getHelp [solver ]
    (.. solver (getHelp )))

(defn getNumAssertions [solver ]
    (.. solver (getNumAssertions )))

(defn getModel [solver ]
    (.. solver (getModel )))

(defn assertAndTrack [solver boolExprs boolExprs1]
    (.. solver (assertAndTrack boolExprs boolExprs1)))

(defn translate [solver context]
    (.. solver (translate ^Context context)))

(defn getReasonUnknown [solver ]
    (.. solver (getReasonUnknown )))

(defn getStatistics [solver ]
    (.. solver (getStatistics )))

(defn getNumScopes [solver ]
    (.. solver (getNumScopes )))

(defn getAssertions [solver ]
    (.. solver (getAssertions )))

(defn reset [solver ]
    (.. solver (reset )))

(defn toString [solver ]
    (.. solver (toString )))

(defn add [solver boolExprs]
    (.. solver (add (into-array BoolExpr boolExprs))))

(defn fromString [solver s]
    (.. solver (fromString ^String s)))

(defn setParameters [solver params]
    (.. solver (setParameters ^Params params)))

(defn push [solver ]
    (.. solver (push )))

(defn fromFile [solver s]
    (.. solver (fromFile ^String s)))

(defn pop 
  ([solver ]
    (.. solver (pop )))
  ([solver i]
    (.. solver (pop i))))

(defn getParameterDescriptions [solver ]
    (.. solver (getParameterDescriptions )))

(defn getUnsatCore [solver ]
    (.. solver (getUnsatCore )))