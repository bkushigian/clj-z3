#!/usr/bin/env bash

# TODO: This should detect the os that it is working on and pull the correct
#       version of Z3
Z3RELEASE="https://github.com/Z3Prover/z3/releases/download/z3-4.7.1/z3-4.7.1-x64-ubuntu-16.04.zip"
Z3="z3-4.7.1-x64-ubuntu-16.04"
DIRNAME=`dirname "$0"`
RESOURCES="$DIRNAME/resources"

wget "$Z3RELEASE" -O "$RESOURCES/z3.zip" --progress=bar
cd "$RESOURCES"
unzip -o z3.zip
mv "$Z3" "z3"
rm z3.zip
cd ..
