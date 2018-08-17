
  // IntelliJ API Decompiler stub source generated from a class file
  // Implementation of methods is not available

package com.microsoft.z3;

public class Context implements java.lang.AutoCloseable {
    private final long m_ctx;
    static final java.lang.Object creation_lock;
    private com.microsoft.z3.BoolSort m_boolSort;
    private com.microsoft.z3.IntSort m_intSort;
    private com.microsoft.z3.RealSort m_realSort;
    private com.microsoft.z3.SeqSort m_stringSort;
    private com.microsoft.z3.ASTDecRefQueue m_AST_DRQ;
    private com.microsoft.z3.ASTMapDecRefQueue m_ASTMap_DRQ;
    private com.microsoft.z3.ASTVectorDecRefQueue m_ASTVector_DRQ;
    private com.microsoft.z3.ApplyResultDecRefQueue m_ApplyResult_DRQ;
    private com.microsoft.z3.FuncInterpEntryDecRefQueue m_FuncEntry_DRQ;
    private com.microsoft.z3.FuncInterpDecRefQueue m_FuncInterp_DRQ;
    private com.microsoft.z3.GoalDecRefQueue m_Goal_DRQ;
    private com.microsoft.z3.ModelDecRefQueue m_Model_DRQ;
    private com.microsoft.z3.ParamsDecRefQueue m_Params_DRQ;
    private com.microsoft.z3.ParamDescrsDecRefQueue m_ParamDescrs_DRQ;
    private com.microsoft.z3.ProbeDecRefQueue m_Probe_DRQ;
    private com.microsoft.z3.SolverDecRefQueue m_Solver_DRQ;
    private com.microsoft.z3.StatisticsDecRefQueue m_Statistics_DRQ;
    private com.microsoft.z3.TacticDecRefQueue m_Tactic_DRQ;
    private com.microsoft.z3.FixedpointDecRefQueue m_Fixedpoint_DRQ;
    private com.microsoft.z3.OptimizeDecRefQueue m_Optimize_DRQ;
    private com.microsoft.z3.ConstructorDecRefQueue m_Constructor_DRQ;
    private com.microsoft.z3.ConstructorListDecRefQueue m_ConstructorList_DRQ;

    public Context() { /* compiled code */ }

    protected Context(long l) { /* compiled code */ }

    public Context(java.util.Map<java.lang.String,java.lang.String> map) { /* compiled code */ }

    private void init() { /* compiled code */ }

    public com.microsoft.z3.IntSymbol mkSymbol(int i) { /* compiled code */ }

    public com.microsoft.z3.StringSymbol mkSymbol(java.lang.String s) { /* compiled code */ }

    com.microsoft.z3.Symbol[] mkSymbols(java.lang.String[] strings) { /* compiled code */ }

    public com.microsoft.z3.BoolSort getBoolSort() { /* compiled code */ }

    public com.microsoft.z3.IntSort getIntSort() { /* compiled code */ }

    public com.microsoft.z3.RealSort getRealSort() { /* compiled code */ }

    public com.microsoft.z3.BoolSort mkBoolSort() { /* compiled code */ }

    public com.microsoft.z3.SeqSort getStringSort() { /* compiled code */ }

    public com.microsoft.z3.UninterpretedSort mkUninterpretedSort(com.microsoft.z3.Symbol symbol) { /* compiled code */ }

    public com.microsoft.z3.UninterpretedSort mkUninterpretedSort(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.IntSort mkIntSort() { /* compiled code */ }

    public com.microsoft.z3.RealSort mkRealSort() { /* compiled code */ }

    public com.microsoft.z3.BitVecSort mkBitVecSort(int i) { /* compiled code */ }

    public com.microsoft.z3.ArraySort mkArraySort(com.microsoft.z3.Sort sort, com.microsoft.z3.Sort sort1) { /* compiled code */ }

    public com.microsoft.z3.ArraySort mkArraySort(com.microsoft.z3.Sort[] sorts, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.SeqSort mkStringSort() { /* compiled code */ }

    public com.microsoft.z3.SeqSort mkSeqSort(com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.ReSort mkReSort(com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.TupleSort mkTupleSort(com.microsoft.z3.Symbol symbol, com.microsoft.z3.Symbol[] symbols, com.microsoft.z3.Sort[] sorts) { /* compiled code */ }

    public com.microsoft.z3.EnumSort mkEnumSort(com.microsoft.z3.Symbol symbol, com.microsoft.z3.Symbol... symbols) { /* compiled code */ }

    public com.microsoft.z3.EnumSort mkEnumSort(java.lang.String s, java.lang.String... strings) { /* compiled code */ }

    public com.microsoft.z3.ListSort mkListSort(com.microsoft.z3.Symbol symbol, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.ListSort mkListSort(java.lang.String s, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.FiniteDomainSort mkFiniteDomainSort(com.microsoft.z3.Symbol symbol, long l) { /* compiled code */ }

    public com.microsoft.z3.FiniteDomainSort mkFiniteDomainSort(java.lang.String s, long l) { /* compiled code */ }

    public com.microsoft.z3.Constructor mkConstructor(com.microsoft.z3.Symbol symbol, com.microsoft.z3.Symbol symbol1, com.microsoft.z3.Symbol[] symbols, com.microsoft.z3.Sort[] sorts, int[] ints) { /* compiled code */ }

    public com.microsoft.z3.Constructor mkConstructor(java.lang.String s, java.lang.String s1, java.lang.String[] strings, com.microsoft.z3.Sort[] sorts, int[] ints) { /* compiled code */ }

    public com.microsoft.z3.DatatypeSort mkDatatypeSort(com.microsoft.z3.Symbol symbol, com.microsoft.z3.Constructor[] constructors) { /* compiled code */ }

    public com.microsoft.z3.DatatypeSort mkDatatypeSort(java.lang.String s, com.microsoft.z3.Constructor[] constructors) { /* compiled code */ }

    public com.microsoft.z3.DatatypeSort[] mkDatatypeSorts(com.microsoft.z3.Symbol[] symbols, com.microsoft.z3.Constructor[][] constructors) { /* compiled code */ }

    public com.microsoft.z3.DatatypeSort[] mkDatatypeSorts(java.lang.String[] strings, com.microsoft.z3.Constructor[][] constructors) { /* compiled code */ }

    public com.microsoft.z3.Expr mkUpdateField(com.microsoft.z3.FuncDecl funcDecl, com.microsoft.z3.Expr expr, com.microsoft.z3.Expr expr1) throws com.microsoft.z3.Z3Exception { /* compiled code */ }

    public com.microsoft.z3.FuncDecl mkFuncDecl(com.microsoft.z3.Symbol symbol, com.microsoft.z3.Sort[] sorts, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.FuncDecl mkFuncDecl(com.microsoft.z3.Symbol symbol, com.microsoft.z3.Sort sort, com.microsoft.z3.Sort sort1) { /* compiled code */ }

    public com.microsoft.z3.FuncDecl mkFuncDecl(java.lang.String s, com.microsoft.z3.Sort[] sorts, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.FuncDecl mkFuncDecl(java.lang.String s, com.microsoft.z3.Sort sort, com.microsoft.z3.Sort sort1) { /* compiled code */ }

    public com.microsoft.z3.FuncDecl mkFreshFuncDecl(java.lang.String s, com.microsoft.z3.Sort[] sorts, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.FuncDecl mkConstDecl(com.microsoft.z3.Symbol symbol, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.FuncDecl mkConstDecl(java.lang.String s, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.FuncDecl mkFreshConstDecl(java.lang.String s, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.Expr mkBound(int i, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.Pattern mkPattern(com.microsoft.z3.Expr... exprs) { /* compiled code */ }

    public com.microsoft.z3.Expr mkConst(com.microsoft.z3.Symbol symbol, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.Expr mkConst(java.lang.String s, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.Expr mkFreshConst(java.lang.String s, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.Expr mkConst(com.microsoft.z3.FuncDecl funcDecl) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBoolConst(com.microsoft.z3.Symbol symbol) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBoolConst(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.IntExpr mkIntConst(com.microsoft.z3.Symbol symbol) { /* compiled code */ }

    public com.microsoft.z3.IntExpr mkIntConst(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.RealExpr mkRealConst(com.microsoft.z3.Symbol symbol) { /* compiled code */ }

    public com.microsoft.z3.RealExpr mkRealConst(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVConst(com.microsoft.z3.Symbol symbol, int i) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVConst(java.lang.String s, int i) { /* compiled code */ }

    public com.microsoft.z3.Expr mkApp(com.microsoft.z3.FuncDecl funcDecl, com.microsoft.z3.Expr... exprs) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkTrue() { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFalse() { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBool(boolean b) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkEq(com.microsoft.z3.Expr expr, com.microsoft.z3.Expr expr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkDistinct(com.microsoft.z3.Expr... exprs) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkNot(com.microsoft.z3.BoolExpr boolExpr) { /* compiled code */ }

    public com.microsoft.z3.Expr mkITE(com.microsoft.z3.BoolExpr boolExpr, com.microsoft.z3.Expr expr, com.microsoft.z3.Expr expr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkIff(com.microsoft.z3.BoolExpr boolExpr, com.microsoft.z3.BoolExpr boolExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkImplies(com.microsoft.z3.BoolExpr boolExpr, com.microsoft.z3.BoolExpr boolExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkXor(com.microsoft.z3.BoolExpr boolExpr, com.microsoft.z3.BoolExpr boolExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkAnd(com.microsoft.z3.BoolExpr... boolExprs) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkOr(com.microsoft.z3.BoolExpr... boolExprs) { /* compiled code */ }

    public com.microsoft.z3.ArithExpr mkAdd(com.microsoft.z3.ArithExpr... arithExprs) { /* compiled code */ }

    public com.microsoft.z3.ArithExpr mkMul(com.microsoft.z3.ArithExpr... arithExprs) { /* compiled code */ }

    public com.microsoft.z3.ArithExpr mkSub(com.microsoft.z3.ArithExpr... arithExprs) { /* compiled code */ }

    public com.microsoft.z3.ArithExpr mkUnaryMinus(com.microsoft.z3.ArithExpr arithExpr) { /* compiled code */ }

    public com.microsoft.z3.ArithExpr mkDiv(com.microsoft.z3.ArithExpr arithExpr, com.microsoft.z3.ArithExpr arithExpr1) { /* compiled code */ }

    public com.microsoft.z3.IntExpr mkMod(com.microsoft.z3.IntExpr intExpr, com.microsoft.z3.IntExpr intExpr1) { /* compiled code */ }

    public com.microsoft.z3.IntExpr mkRem(com.microsoft.z3.IntExpr intExpr, com.microsoft.z3.IntExpr intExpr1) { /* compiled code */ }

    public com.microsoft.z3.ArithExpr mkPower(com.microsoft.z3.ArithExpr arithExpr, com.microsoft.z3.ArithExpr arithExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkLt(com.microsoft.z3.ArithExpr arithExpr, com.microsoft.z3.ArithExpr arithExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkLe(com.microsoft.z3.ArithExpr arithExpr, com.microsoft.z3.ArithExpr arithExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkGt(com.microsoft.z3.ArithExpr arithExpr, com.microsoft.z3.ArithExpr arithExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkGe(com.microsoft.z3.ArithExpr arithExpr, com.microsoft.z3.ArithExpr arithExpr1) { /* compiled code */ }

    public com.microsoft.z3.RealExpr mkInt2Real(com.microsoft.z3.IntExpr intExpr) { /* compiled code */ }

    public com.microsoft.z3.IntExpr mkReal2Int(com.microsoft.z3.RealExpr realExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkIsInteger(com.microsoft.z3.RealExpr realExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVNot(com.microsoft.z3.BitVecExpr bitVecExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVRedAND(com.microsoft.z3.BitVecExpr bitVecExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVRedOR(com.microsoft.z3.BitVecExpr bitVecExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVAND(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVOR(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVXOR(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVNAND(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVNOR(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVXNOR(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVNeg(com.microsoft.z3.BitVecExpr bitVecExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVAdd(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVSub(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVMul(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVUDiv(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVSDiv(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVURem(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVSRem(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVSMod(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVULT(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVSLT(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVULE(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVSLE(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVUGE(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVSGE(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVUGT(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVSGT(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkConcat(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkExtract(int i, int i1, com.microsoft.z3.BitVecExpr bitVecExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkSignExt(int i, com.microsoft.z3.BitVecExpr bitVecExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkZeroExt(int i, com.microsoft.z3.BitVecExpr bitVecExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkRepeat(int i, com.microsoft.z3.BitVecExpr bitVecExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVSHL(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVLSHR(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVASHR(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVRotateLeft(int i, com.microsoft.z3.BitVecExpr bitVecExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVRotateRight(int i, com.microsoft.z3.BitVecExpr bitVecExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVRotateLeft(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkBVRotateRight(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkInt2BV(int i, com.microsoft.z3.IntExpr intExpr) { /* compiled code */ }

    public com.microsoft.z3.IntExpr mkBV2Int(com.microsoft.z3.BitVecExpr bitVecExpr, boolean b) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVAddNoOverflow(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1, boolean b) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVAddNoUnderflow(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVSubNoOverflow(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVSubNoUnderflow(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1, boolean b) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVSDivNoOverflow(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVNegNoOverflow(com.microsoft.z3.BitVecExpr bitVecExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVMulNoOverflow(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1, boolean b) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkBVMulNoUnderflow(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkArrayConst(com.microsoft.z3.Symbol symbol, com.microsoft.z3.Sort sort, com.microsoft.z3.Sort sort1) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkArrayConst(java.lang.String s, com.microsoft.z3.Sort sort, com.microsoft.z3.Sort sort1) { /* compiled code */ }

    public com.microsoft.z3.Expr mkSelect(com.microsoft.z3.ArrayExpr arrayExpr, com.microsoft.z3.Expr expr) { /* compiled code */ }

    public com.microsoft.z3.Expr mkSelect(com.microsoft.z3.ArrayExpr arrayExpr, com.microsoft.z3.Expr[] exprs) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkStore(com.microsoft.z3.ArrayExpr arrayExpr, com.microsoft.z3.Expr expr, com.microsoft.z3.Expr expr1) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkStore(com.microsoft.z3.ArrayExpr arrayExpr, com.microsoft.z3.Expr[] exprs, com.microsoft.z3.Expr expr) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkConstArray(com.microsoft.z3.Sort sort, com.microsoft.z3.Expr expr) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkMap(com.microsoft.z3.FuncDecl funcDecl, com.microsoft.z3.ArrayExpr... arrayExprs) { /* compiled code */ }

    public com.microsoft.z3.Expr mkTermArray(com.microsoft.z3.ArrayExpr arrayExpr) { /* compiled code */ }

    public com.microsoft.z3.Expr mkArrayExt(com.microsoft.z3.ArrayExpr arrayExpr, com.microsoft.z3.ArrayExpr arrayExpr1) { /* compiled code */ }

    public com.microsoft.z3.SetSort mkSetSort(com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkEmptySet(com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkFullSet(com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkSetAdd(com.microsoft.z3.ArrayExpr arrayExpr, com.microsoft.z3.Expr expr) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkSetDel(com.microsoft.z3.ArrayExpr arrayExpr, com.microsoft.z3.Expr expr) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkSetUnion(com.microsoft.z3.ArrayExpr... arrayExprs) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkSetIntersection(com.microsoft.z3.ArrayExpr... arrayExprs) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkSetDifference(com.microsoft.z3.ArrayExpr arrayExpr, com.microsoft.z3.ArrayExpr arrayExpr1) { /* compiled code */ }

    public com.microsoft.z3.ArrayExpr mkSetComplement(com.microsoft.z3.ArrayExpr arrayExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkSetMembership(com.microsoft.z3.Expr expr, com.microsoft.z3.ArrayExpr arrayExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkSetSubset(com.microsoft.z3.ArrayExpr arrayExpr, com.microsoft.z3.ArrayExpr arrayExpr1) { /* compiled code */ }

    public com.microsoft.z3.SeqExpr mkEmptySeq(com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.SeqExpr mkUnit(com.microsoft.z3.Expr expr) { /* compiled code */ }

    public com.microsoft.z3.SeqExpr mkString(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.SeqExpr mkConcat(com.microsoft.z3.SeqExpr... seqExprs) { /* compiled code */ }

    public com.microsoft.z3.IntExpr mkLength(com.microsoft.z3.SeqExpr seqExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkPrefixOf(com.microsoft.z3.SeqExpr seqExpr, com.microsoft.z3.SeqExpr seqExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkSuffixOf(com.microsoft.z3.SeqExpr seqExpr, com.microsoft.z3.SeqExpr seqExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkContains(com.microsoft.z3.SeqExpr seqExpr, com.microsoft.z3.SeqExpr seqExpr1) { /* compiled code */ }

    public com.microsoft.z3.SeqExpr mkAt(com.microsoft.z3.SeqExpr seqExpr, com.microsoft.z3.IntExpr intExpr) { /* compiled code */ }

    public com.microsoft.z3.SeqExpr mkExtract(com.microsoft.z3.SeqExpr seqExpr, com.microsoft.z3.IntExpr intExpr, com.microsoft.z3.IntExpr intExpr1) { /* compiled code */ }

    public com.microsoft.z3.IntExpr mkIndexOf(com.microsoft.z3.SeqExpr seqExpr, com.microsoft.z3.SeqExpr seqExpr1, com.microsoft.z3.ArithExpr arithExpr) { /* compiled code */ }

    public com.microsoft.z3.SeqExpr mkReplace(com.microsoft.z3.SeqExpr seqExpr, com.microsoft.z3.SeqExpr seqExpr1, com.microsoft.z3.SeqExpr seqExpr2) { /* compiled code */ }

    public com.microsoft.z3.ReExpr mkToRe(com.microsoft.z3.SeqExpr seqExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkInRe(com.microsoft.z3.SeqExpr seqExpr, com.microsoft.z3.ReExpr reExpr) { /* compiled code */ }

    public com.microsoft.z3.ReExpr mkStar(com.microsoft.z3.ReExpr reExpr) { /* compiled code */ }

    public com.microsoft.z3.ReExpr mkLoop(com.microsoft.z3.ReExpr reExpr, int i, int i1) { /* compiled code */ }

    public com.microsoft.z3.ReExpr mkLoop(com.microsoft.z3.ReExpr reExpr, int i) { /* compiled code */ }

    public com.microsoft.z3.ReExpr mkPlus(com.microsoft.z3.ReExpr reExpr) { /* compiled code */ }

    public com.microsoft.z3.ReExpr mkOption(com.microsoft.z3.ReExpr reExpr) { /* compiled code */ }

    public com.microsoft.z3.ReExpr mkComplement(com.microsoft.z3.ReExpr reExpr) { /* compiled code */ }

    public com.microsoft.z3.ReExpr mkConcat(com.microsoft.z3.ReExpr... reExprs) { /* compiled code */ }

    public com.microsoft.z3.ReExpr mkUnion(com.microsoft.z3.ReExpr... reExprs) { /* compiled code */ }

    public com.microsoft.z3.ReExpr mkIntersect(com.microsoft.z3.ReExpr... reExprs) { /* compiled code */ }

    public com.microsoft.z3.ReExpr mkRange(com.microsoft.z3.SeqExpr seqExpr, com.microsoft.z3.SeqExpr seqExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkAtMost(com.microsoft.z3.BoolExpr[] boolExprs, int i) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkAtLeast(com.microsoft.z3.BoolExpr[] boolExprs, int i) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkPBLe(int[] ints, com.microsoft.z3.BoolExpr[] boolExprs, int i) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkPBGe(int[] ints, com.microsoft.z3.BoolExpr[] boolExprs, int i) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkPBEq(int[] ints, com.microsoft.z3.BoolExpr[] boolExprs, int i) { /* compiled code */ }

    public com.microsoft.z3.Expr mkNumeral(java.lang.String s, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.Expr mkNumeral(int i, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.Expr mkNumeral(long l, com.microsoft.z3.Sort sort) { /* compiled code */ }

    public com.microsoft.z3.RatNum mkReal(int i, int i1) { /* compiled code */ }

    public com.microsoft.z3.RatNum mkReal(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.RatNum mkReal(int i) { /* compiled code */ }

    public com.microsoft.z3.RatNum mkReal(long l) { /* compiled code */ }

    public com.microsoft.z3.IntNum mkInt(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.IntNum mkInt(int i) { /* compiled code */ }

    public com.microsoft.z3.IntNum mkInt(long l) { /* compiled code */ }

    public com.microsoft.z3.BitVecNum mkBV(java.lang.String s, int i) { /* compiled code */ }

    public com.microsoft.z3.BitVecNum mkBV(int i, int i1) { /* compiled code */ }

    public com.microsoft.z3.BitVecNum mkBV(long l, int i) { /* compiled code */ }

    public com.microsoft.z3.Quantifier mkForall(com.microsoft.z3.Sort[] sorts, com.microsoft.z3.Symbol[] symbols, com.microsoft.z3.Expr expr, int i, com.microsoft.z3.Pattern[] patterns, com.microsoft.z3.Expr[] exprs, com.microsoft.z3.Symbol symbol, com.microsoft.z3.Symbol symbol1) { /* compiled code */ }

    public com.microsoft.z3.Quantifier mkForall(com.microsoft.z3.Expr[] exprs, com.microsoft.z3.Expr expr, int i, com.microsoft.z3.Pattern[] patterns, com.microsoft.z3.Expr[] exprs1, com.microsoft.z3.Symbol symbol, com.microsoft.z3.Symbol symbol1) { /* compiled code */ }

    public com.microsoft.z3.Quantifier mkExists(com.microsoft.z3.Sort[] sorts, com.microsoft.z3.Symbol[] symbols, com.microsoft.z3.Expr expr, int i, com.microsoft.z3.Pattern[] patterns, com.microsoft.z3.Expr[] exprs, com.microsoft.z3.Symbol symbol, com.microsoft.z3.Symbol symbol1) { /* compiled code */ }

    public com.microsoft.z3.Quantifier mkExists(com.microsoft.z3.Expr[] exprs, com.microsoft.z3.Expr expr, int i, com.microsoft.z3.Pattern[] patterns, com.microsoft.z3.Expr[] exprs1, com.microsoft.z3.Symbol symbol, com.microsoft.z3.Symbol symbol1) { /* compiled code */ }

    public com.microsoft.z3.Quantifier mkQuantifier(boolean b, com.microsoft.z3.Sort[] sorts, com.microsoft.z3.Symbol[] symbols, com.microsoft.z3.Expr expr, int i, com.microsoft.z3.Pattern[] patterns, com.microsoft.z3.Expr[] exprs, com.microsoft.z3.Symbol symbol, com.microsoft.z3.Symbol symbol1) { /* compiled code */ }

    public com.microsoft.z3.Quantifier mkQuantifier(boolean b, com.microsoft.z3.Expr[] exprs, com.microsoft.z3.Expr expr, int i, com.microsoft.z3.Pattern[] patterns, com.microsoft.z3.Expr[] exprs1, com.microsoft.z3.Symbol symbol, com.microsoft.z3.Symbol symbol1) { /* compiled code */ }

    public void setPrintMode(com.microsoft.z3.enumerations.Z3_ast_print_mode z3_ast_print_mode) { /* compiled code */ }

    public java.lang.String benchmarkToSMTString(java.lang.String s, java.lang.String s1, java.lang.String s2, java.lang.String s3, com.microsoft.z3.BoolExpr[] boolExprs, com.microsoft.z3.BoolExpr boolExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr parseSMTLIB2String(java.lang.String s, com.microsoft.z3.Symbol[] symbols, com.microsoft.z3.Sort[] sorts, com.microsoft.z3.Symbol[] symbols1, com.microsoft.z3.FuncDecl[] funcDecls) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr parseSMTLIB2File(java.lang.String s, com.microsoft.z3.Symbol[] symbols, com.microsoft.z3.Sort[] sorts, com.microsoft.z3.Symbol[] symbols1, com.microsoft.z3.FuncDecl[] funcDecls) { /* compiled code */ }

    public com.microsoft.z3.Goal mkGoal(boolean b, boolean b1, boolean b2) { /* compiled code */ }

    public com.microsoft.z3.Params mkParams() { /* compiled code */ }

    public int getNumTactics() { /* compiled code */ }

    public java.lang.String[] getTacticNames() { /* compiled code */ }

    public java.lang.String getTacticDescription(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.Tactic mkTactic(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.Tactic andThen(com.microsoft.z3.Tactic tactic, com.microsoft.z3.Tactic tactic1, com.microsoft.z3.Tactic... tactics) { /* compiled code */ }

    public com.microsoft.z3.Tactic then(com.microsoft.z3.Tactic tactic, com.microsoft.z3.Tactic tactic1, com.microsoft.z3.Tactic... tactics) { /* compiled code */ }

    public com.microsoft.z3.Tactic orElse(com.microsoft.z3.Tactic tactic, com.microsoft.z3.Tactic tactic1) { /* compiled code */ }

    public com.microsoft.z3.Tactic tryFor(com.microsoft.z3.Tactic tactic, int i) { /* compiled code */ }

    public com.microsoft.z3.Tactic when(com.microsoft.z3.Probe probe, com.microsoft.z3.Tactic tactic) { /* compiled code */ }

    public com.microsoft.z3.Tactic cond(com.microsoft.z3.Probe probe, com.microsoft.z3.Tactic tactic, com.microsoft.z3.Tactic tactic1) { /* compiled code */ }

    public com.microsoft.z3.Tactic repeat(com.microsoft.z3.Tactic tactic, int i) { /* compiled code */ }

    public com.microsoft.z3.Tactic skip() { /* compiled code */ }

    public com.microsoft.z3.Tactic fail() { /* compiled code */ }

    public com.microsoft.z3.Tactic failIf(com.microsoft.z3.Probe probe) { /* compiled code */ }

    public com.microsoft.z3.Tactic failIfNotDecided() { /* compiled code */ }

    public com.microsoft.z3.Tactic usingParams(com.microsoft.z3.Tactic tactic, com.microsoft.z3.Params params) { /* compiled code */ }

    public com.microsoft.z3.Tactic with(com.microsoft.z3.Tactic tactic, com.microsoft.z3.Params params) { /* compiled code */ }

    public com.microsoft.z3.Tactic parOr(com.microsoft.z3.Tactic... tactics) { /* compiled code */ }

    public com.microsoft.z3.Tactic parAndThen(com.microsoft.z3.Tactic tactic, com.microsoft.z3.Tactic tactic1) { /* compiled code */ }

    public void interrupt() { /* compiled code */ }

    public int getNumProbes() { /* compiled code */ }

    public java.lang.String[] getProbeNames() { /* compiled code */ }

    public java.lang.String getProbeDescription(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.Probe mkProbe(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.Probe constProbe(double v) { /* compiled code */ }

    public com.microsoft.z3.Probe lt(com.microsoft.z3.Probe probe, com.microsoft.z3.Probe probe1) { /* compiled code */ }

    public com.microsoft.z3.Probe gt(com.microsoft.z3.Probe probe, com.microsoft.z3.Probe probe1) { /* compiled code */ }

    public com.microsoft.z3.Probe le(com.microsoft.z3.Probe probe, com.microsoft.z3.Probe probe1) { /* compiled code */ }

    public com.microsoft.z3.Probe ge(com.microsoft.z3.Probe probe, com.microsoft.z3.Probe probe1) { /* compiled code */ }

    public com.microsoft.z3.Probe eq(com.microsoft.z3.Probe probe, com.microsoft.z3.Probe probe1) { /* compiled code */ }

    public com.microsoft.z3.Probe and(com.microsoft.z3.Probe probe, com.microsoft.z3.Probe probe1) { /* compiled code */ }

    public com.microsoft.z3.Probe or(com.microsoft.z3.Probe probe, com.microsoft.z3.Probe probe1) { /* compiled code */ }

    public com.microsoft.z3.Probe not(com.microsoft.z3.Probe probe) { /* compiled code */ }

    public com.microsoft.z3.Solver mkSolver() { /* compiled code */ }

    public com.microsoft.z3.Solver mkSolver(com.microsoft.z3.Symbol symbol) { /* compiled code */ }

    public com.microsoft.z3.Solver mkSolver(java.lang.String s) { /* compiled code */ }

    public com.microsoft.z3.Solver mkSimpleSolver() { /* compiled code */ }

    public com.microsoft.z3.Solver mkSolver(com.microsoft.z3.Tactic tactic) { /* compiled code */ }

    public com.microsoft.z3.Fixedpoint mkFixedpoint() { /* compiled code */ }

    public com.microsoft.z3.Optimize mkOptimize() { /* compiled code */ }

    public com.microsoft.z3.FPRMSort mkFPRoundingModeSort() { /* compiled code */ }

    public com.microsoft.z3.FPRMExpr mkFPRoundNearestTiesToEven() { /* compiled code */ }

    public com.microsoft.z3.FPRMNum mkFPRNE() { /* compiled code */ }

    public com.microsoft.z3.FPRMNum mkFPRoundNearestTiesToAway() { /* compiled code */ }

    public com.microsoft.z3.FPRMNum mkFPRNA() { /* compiled code */ }

    public com.microsoft.z3.FPRMNum mkFPRoundTowardPositive() { /* compiled code */ }

    public com.microsoft.z3.FPRMNum mkFPRTP() { /* compiled code */ }

    public com.microsoft.z3.FPRMNum mkFPRoundTowardNegative() { /* compiled code */ }

    public com.microsoft.z3.FPRMNum mkFPRTN() { /* compiled code */ }

    public com.microsoft.z3.FPRMNum mkFPRoundTowardZero() { /* compiled code */ }

    public com.microsoft.z3.FPRMNum mkFPRTZ() { /* compiled code */ }

    public com.microsoft.z3.FPSort mkFPSort(int i, int i1) { /* compiled code */ }

    public com.microsoft.z3.FPSort mkFPSortHalf() { /* compiled code */ }

    public com.microsoft.z3.FPSort mkFPSort16() { /* compiled code */ }

    public com.microsoft.z3.FPSort mkFPSortSingle() { /* compiled code */ }

    public com.microsoft.z3.FPSort mkFPSort32() { /* compiled code */ }

    public com.microsoft.z3.FPSort mkFPSortDouble() { /* compiled code */ }

    public com.microsoft.z3.FPSort mkFPSort64() { /* compiled code */ }

    public com.microsoft.z3.FPSort mkFPSortQuadruple() { /* compiled code */ }

    public com.microsoft.z3.FPSort mkFPSort128() { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFPNaN(com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFPInf(com.microsoft.z3.FPSort fpSort, boolean b) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFPZero(com.microsoft.z3.FPSort fpSort, boolean b) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFPNumeral(float v, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFPNumeral(double v, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFPNumeral(int i, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFPNumeral(boolean b, int i, int i1, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFPNumeral(boolean b, long l, long l1, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFP(float v, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFP(double v, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFP(int i, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFP(boolean b, int i, int i1, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPNum mkFP(boolean b, long l, long l1, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPAbs(com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPNeg(com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPAdd(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPSub(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPMul(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPDiv(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPFMA(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1, com.microsoft.z3.FPExpr fpExpr2) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPSqrt(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPRem(com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPRoundToIntegral(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPMin(com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPMax(com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPLEq(com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPLt(com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPGEq(com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPGt(com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPEq(com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPExpr fpExpr1) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPIsNormal(com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPIsSubnormal(com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPIsZero(com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPIsInfinite(com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPIsNaN(com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPIsNegative(com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.BoolExpr mkFPIsPositive(com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFP(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.BitVecExpr bitVecExpr1, com.microsoft.z3.BitVecExpr bitVecExpr2) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPToFP(com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPToFP(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.FPExpr fpExpr, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPToFP(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.RealExpr realExpr, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPToFP(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.BitVecExpr bitVecExpr, com.microsoft.z3.FPSort fpSort, boolean b) { /* compiled code */ }

    public com.microsoft.z3.FPExpr mkFPToFP(com.microsoft.z3.FPSort fpSort, com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkFPToBV(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.FPExpr fpExpr, int i, boolean b) { /* compiled code */ }

    public com.microsoft.z3.RealExpr mkFPToReal(com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkFPToIEEEBV(com.microsoft.z3.FPExpr fpExpr) { /* compiled code */ }

    public com.microsoft.z3.BitVecExpr mkFPToFP(com.microsoft.z3.FPRMExpr fprmExpr, com.microsoft.z3.IntExpr intExpr, com.microsoft.z3.RealExpr realExpr, com.microsoft.z3.FPSort fpSort) { /* compiled code */ }

    public com.microsoft.z3.AST wrapAST(long l) { /* compiled code */ }

    public long unwrapAST(com.microsoft.z3.AST ast) { /* compiled code */ }

    public java.lang.String SimplifyHelp() { /* compiled code */ }

    public com.microsoft.z3.ParamDescrs getSimplifyParameterDescriptions() { /* compiled code */ }

    public void updateParamValue(java.lang.String s, java.lang.String s1) { /* compiled code */ }

    long nCtx() { /* compiled code */ }

    void checkContextMatch(com.microsoft.z3.Z3Object z3Object) { /* compiled code */ }

    void checkContextMatch(com.microsoft.z3.Z3Object z3Object, com.microsoft.z3.Z3Object z3Object1) { /* compiled code */ }

    void checkContextMatch(com.microsoft.z3.Z3Object z3Object, com.microsoft.z3.Z3Object z3Object1, com.microsoft.z3.Z3Object z3Object2) { /* compiled code */ }

    void checkContextMatch(com.microsoft.z3.Z3Object[] z3Objects) { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.Constructor> getConstructorDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.ConstructorList> getConstructorListDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.AST> getASTDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.ASTMap> getASTMapDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.ASTVector> getASTVectorDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.ApplyResult> getApplyResultDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.FuncInterp.Entry> getFuncEntryDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.FuncInterp> getFuncInterpDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.Goal> getGoalDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.Model> getModelDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.Params> getParamsDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.ParamDescrs> getParamDescrsDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.Probe> getProbeDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.Solver> getSolverDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.Statistics> getStatisticsDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.Tactic> getTacticDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.Fixedpoint> getFixedpointDRQ() { /* compiled code */ }

    public com.microsoft.z3.IDecRefQueue<com.microsoft.z3.Optimize> getOptimizeDRQ() { /* compiled code */ }

    public void close() { /* compiled code */ }
}
