
  // IntelliJ API Decompiler stub source generated from a class file
  // Implementation of methods is not available

package com.microsoft.z3;

public class Solver extends com.microsoft.z3.Z3Object {
    public java.lang.String getHelp() { /* compiled code */ }

    public void setParameters(com.microsoft.z3.Params params) { /* compiled code */ }

    public com.microsoft.z3.ParamDescrs getParameterDescriptions() { /* compiled code */ }

    public int getNumScopes() { /* compiled code */ }

    public void push() { /* compiled code */ }

    public void pop() { /* compiled code */ }

    public void pop(int i) { /* compiled code */ }

    public void reset() { /* compiled code */ }

    public void add(com.microsoft.z3.BoolExpr... boolExprs) { /* compiled code */ }

    public void fromFile(java.lang.String s) { /* compiled code */ }

    public void fromString(java.lang.String s) { /* compiled code */ }

    public void assertAndTrack(com.microsoft.z3.BoolExpr[] boolExprs, com.microsoft.z3.BoolExpr[] boolExprs1) { /* compiled code */ }

    public void assertAndTrack(com.microsoft.z3.BoolExpr boolExpr, com.microsoft.z3.BoolExpr boolExpr1) { /* compiled code */ }

    public int getNumAssertions() { /* compiled code */ }

    public com.microsoft.z3.BoolExpr[] getAssertions() { /* compiled code */ }

    public com.microsoft.z3.Status check(com.microsoft.z3.Expr... exprs) { /* compiled code */ }

    public com.microsoft.z3.Status check() { /* compiled code */ }

    public com.microsoft.z3.Model getModel() { /* compiled code */ }

    public com.microsoft.z3.Expr getProof() { /* compiled code */ }

    public com.microsoft.z3.BoolExpr[] getUnsatCore() { /* compiled code */ }

    public java.lang.String getReasonUnknown() { /* compiled code */ }

    public com.microsoft.z3.Solver translate(com.microsoft.z3.Context context) { /* compiled code */ }

    public com.microsoft.z3.Statistics getStatistics() { /* compiled code */ }

    public java.lang.String toString() { /* compiled code */ }

    Solver(com.microsoft.z3.Context context, long l) { /* compiled code */ }

    void incRef() { /* compiled code */ }

    void addToReferenceQueue() { /* compiled code */ }
}
