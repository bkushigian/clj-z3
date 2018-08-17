
; Auto-generated file
; Generated from source decompiled/com/microsoft/z3/Context.decomp.java

(ns clj-z3.context
  (:import (com.microsoft.z3 RealExpr FuncDecl Constructor IntExpr FPSort Pattern AST Symbol SeqExpr Sort BoolExpr ArrayExpr ReExpr Tactic FPRMExpr FPExpr Expr BitVecExpr ArithExpr Params Context Probe enumerations.Z3_ast_print_mode))
  (:refer-clojure :exclude [when not repeat or cond and])
  (:gen-class))


(defn context
  [] (Context. ))

(defn mkSetSort [context sort]
    (.. context (mkSetSort ^Sort sort)))

(defn mkFPIsInfinite [context fpExpr]
    (.. context (mkFPIsInfinite ^FPExpr fpExpr)))

(defn mkFreshConstDecl [context s sort]
    (.. context (mkFreshConstDecl ^String s ^Sort sort)))

(defn getNumProbes [context ]
    (.. context (getNumProbes )))

(defn mkArraySort [context sort sort1]
    (.. context (mkArraySort sort sort1)))

(defn mkBVNAND [context bitVecExpr bitVecExpr1]
    (.. context (mkBVNAND ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkProbe [context s]
    (.. context (mkProbe ^String s)))

(defn mkFPRoundTowardPositive [context ]
    (.. context (mkFPRoundTowardPositive )))

(defn mkBVULE [context bitVecExpr bitVecExpr1]
    (.. context (mkBVULE ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkFPSort16 [context ]
    (.. context (mkFPSort16 )))

(defn mkBVNeg [context bitVecExpr]
    (.. context (mkBVNeg ^BitVecExpr bitVecExpr)))

(defn mkAdd [context arithExprs]
    (.. context (mkAdd (into-array ArithExpr arithExprs))))

(defn mkSimpleSolver [context ]
    (.. context (mkSimpleSolver )))

(defn mkBVSHL [context bitVecExpr bitVecExpr1]
    (.. context (mkBVSHL ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkFPZero [context fpSort b]
    (.. context (mkFPZero ^FPSort fpSort b)))

(defn mkReplace [context seqExpr seqExpr1 seqExpr2]
    (.. context (mkReplace ^SeqExpr seqExpr ^SeqExpr seqExpr1 ^SeqExpr seqExpr2)))

(defn getParamDescrsDRQ [context ]
    (.. context (getParamDescrsDRQ )))

(defn repeat [context tactic i]
    (.. context (repeat ^Tactic tactic i)))

(defn mkPBEq [context ints boolExprs i]
    (.. context (mkPBEq ^int[] ints ^BoolExpr[] boolExprs i)))

(defn mkPlus [context reExpr]
    (.. context (mkPlus ^ReExpr reExpr)))

(defn mkLoop 
  ([context reExpr i]
    (.. context (mkLoop ^ReExpr reExpr i)))
  ([context reExpr i i1]
    (.. context (mkLoop ^ReExpr reExpr i i1))))

(defn mkBV [context s i]
    (.. context (mkBV s i)))

(defn mkFPSortHalf [context ]
    (.. context (mkFPSortHalf )))

(defn mkFPToReal [context fpExpr]
    (.. context (mkFPToReal ^FPExpr fpExpr)))

(defn mkTermArray [context arrayExpr]
    (.. context (mkTermArray ^ArrayExpr arrayExpr)))

(defn mkUninterpretedSort [context symbol]
    (.. context (mkUninterpretedSort symbol)))

(defn getASTMapDRQ [context ]
    (.. context (getASTMapDRQ )))

(defn mkFPSort32 [context ]
    (.. context (mkFPSort32 )))

(defn mkBound [context i sort]
    (.. context (mkBound i ^Sort sort)))

(defn parAndThen [context tactic tactic1]
    (.. context (parAndThen ^Tactic tactic ^Tactic tactic1)))

(defn mkConst 
  ([context funcDecl]
    (.. context (mkConst ^FuncDecl funcDecl)))
  ([context symbol sort]
    (.. context (mkConst symbol sort))))

(defn mkFPRTN [context ]
    (.. context (mkFPRTN )))

(defn mkOr [context boolExprs]
    (.. context (mkOr (into-array BoolExpr boolExprs))))

(defn getOptimizeDRQ [context ]
    (.. context (getOptimizeDRQ )))

(defn mkNot [context boolExpr]
    (.. context (mkNot ^BoolExpr boolExpr)))

(defn mkBVSubNoUnderflow [context bitVecExpr bitVecExpr1 b]
    (.. context (mkBVSubNoUnderflow ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1 b)))

(defn mkEq [context expr expr1]
    (.. context (mkEq ^Expr expr ^Expr expr1)))

(defn parseSMTLIB2String [context s symbols sorts symbols1 funcDecls]
    (.. context (parseSMTLIB2String ^String s ^Symbol[] symbols ^Sort[] sorts ^Symbol[] symbols1 ^FuncDecl[] funcDecls)))

(defn mkAtLeast [context boolExprs i]
    (.. context (mkAtLeast ^BoolExpr[] boolExprs i)))

(defn mkFPLEq [context fpExpr fpExpr1]
    (.. context (mkFPLEq ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn mkSelect [context arrayExpr expr]
    (.. context (mkSelect arrayExpr expr)))

(defn mkBVRotateLeft [context i bitVecExpr]
    (.. context (mkBVRotateLeft i bitVecExpr)))

(defn mkDistinct [context exprs]
    (.. context (mkDistinct (into-array Expr exprs))))

(defn mkBVSMod [context bitVecExpr bitVecExpr1]
    (.. context (mkBVSMod ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkFreshConst [context s sort]
    (.. context (mkFreshConst ^String s ^Sort sort)))

(defn benchmarkToSMTString [context s s1 s2 s3 boolExprs boolExpr]
    (.. context (benchmarkToSMTString ^String s ^String s1 ^String s2 ^String s3 ^BoolExpr[] boolExprs ^BoolExpr boolExpr)))

(defn mkBVSDivNoOverflow [context bitVecExpr bitVecExpr1]
    (.. context (mkBVSDivNoOverflow ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkFullSet [context sort]
    (.. context (mkFullSet ^Sort sort)))

(defn getSimplifyParameterDescriptions [context ]
    (.. context (getSimplifyParameterDescriptions )))

(defn mkIndexOf [context seqExpr seqExpr1 arithExpr]
    (.. context (mkIndexOf ^SeqExpr seqExpr ^SeqExpr seqExpr1 ^ArithExpr arithExpr)))

(defn mkBVSDiv [context bitVecExpr bitVecExpr1]
    (.. context (mkBVSDiv ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkRem [context intExpr intExpr1]
    (.. context (mkRem ^IntExpr intExpr ^IntExpr intExpr1)))

(defn mkXor [context boolExpr boolExpr1]
    (.. context (mkXor ^BoolExpr boolExpr ^BoolExpr boolExpr1)))

(defn getConstructorListDRQ [context ]
    (.. context (getConstructorListDRQ )))

(defn mkFPNumeral 
  ([context v fpSort]
    (.. context (mkFPNumeral v fpSort)))
  ([context b i i1 fpSort]
    (.. context (mkFPNumeral b i i1 fpSort))))

(defn parOr [context tactics]
    (.. context (parOr (into-array Tactic tactics))))

(defn gt [context probe probe1]
    (.. context (gt ^Probe probe ^Probe probe1)))

(defn mkFPToIEEEBV [context fpExpr]
    (.. context (mkFPToIEEEBV ^FPExpr fpExpr)))

(defn mkReal2Int [context realExpr]
    (.. context (mkReal2Int ^RealExpr realExpr)))

(defn getFixedpointDRQ [context ]
    (.. context (getFixedpointDRQ )))

(defn mkFPSort [context i i1]
    (.. context (mkFPSort i i1)))

(defn mkNumeral [context s sort]
    (.. context (mkNumeral s sort)))

(defn mkFreshFuncDecl [context s sorts sort]
    (.. context (mkFreshFuncDecl ^String s ^Sort[] sorts ^Sort sort)))

(defn mkInt [context s]
    (.. context (mkInt s)))

(defn mkFPRoundTowardNegative [context ]
    (.. context (mkFPRoundTowardNegative )))

(defn mkListSort [context symbol sort]
    (.. context (mkListSort symbol sort)))

(defn getGoalDRQ [context ]
    (.. context (getGoalDRQ )))

(defn mkEmptySet [context sort]
    (.. context (mkEmptySet ^Sort sort)))

(defn mkBVNOR [context bitVecExpr bitVecExpr1]
    (.. context (mkBVNOR ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkBVConst [context symbol i]
    (.. context (mkBVConst symbol i)))

(defn eq [context probe probe1]
    (.. context (eq ^Probe probe ^Probe probe1)))

(defn mkPrefixOf [context seqExpr seqExpr1]
    (.. context (mkPrefixOf ^SeqExpr seqExpr ^SeqExpr seqExpr1)))

(defn mkBitVecSort [context i]
    (.. context (mkBitVecSort i)))

(defn fail [context ]
    (.. context (fail )))

(defn mkString [context s]
    (.. context (mkString ^String s)))

(defn mkBVRotateRight [context i bitVecExpr]
    (.. context (mkBVRotateRight i bitVecExpr)))

(defn getFuncInterpDRQ [context ]
    (.. context (getFuncInterpDRQ )))

(defn mkEnumSort [context symbol symbols]
    (.. context (mkEnumSort symbol (into-array Symbol symbols))))

(defn mkFPMin [context fpExpr fpExpr1]
    (.. context (mkFPMin ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn mkFPToBV [context fprmExpr fpExpr i b]
    (.. context (mkFPToBV ^FPRMExpr fprmExpr ^FPExpr fpExpr i b)))

(defn mkFPIsSubnormal [context fpExpr]
    (.. context (mkFPIsSubnormal ^FPExpr fpExpr)))

(defn interrupt [context ]
    (.. context (interrupt )))

(defn unwrapAST [context ast]
    (.. context (unwrapAST ^AST ast)))

(defn mkFPInf [context fpSort b]
    (.. context (mkFPInf ^FPSort fpSort b)))

(defn getNumTactics [context ]
    (.. context (getNumTactics )))

(defn mkSetAdd [context arrayExpr expr]
    (.. context (mkSetAdd ^ArrayExpr arrayExpr ^Expr expr)))

(defn mkInt2BV [context i intExpr]
    (.. context (mkInt2BV i ^IntExpr intExpr)))

(defn getApplyResultDRQ [context ]
    (.. context (getApplyResultDRQ )))

(defn getProbeDRQ [context ]
    (.. context (getProbeDRQ )))

(defn mkBVRedAND [context bitVecExpr]
    (.. context (mkBVRedAND ^BitVecExpr bitVecExpr)))

(defn mkIsInteger [context realExpr]
    (.. context (mkIsInteger ^RealExpr realExpr)))

(defn mkForall 
  ([context sorts symbols expr i patterns exprs symbol symbol1]
    (.. context (mkForall ^Sort[] sorts ^Symbol[] symbols ^Expr expr i ^Pattern[] patterns ^Expr[] exprs ^Symbol symbol ^Symbol symbol1)))
  ([context exprs expr i patterns exprs1 symbol symbol1]
    (.. context (mkForall ^Expr[] exprs ^Expr expr i ^Pattern[] patterns ^Expr[] exprs1 ^Symbol symbol ^Symbol symbol1))))

(defn mkRepeat [context i bitVecExpr]
    (.. context (mkRepeat i ^BitVecExpr bitVecExpr)))

(defn mkBVMul [context bitVecExpr bitVecExpr1]
    (.. context (mkBVMul ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn getParamsDRQ [context ]
    (.. context (getParamsDRQ )))

(defn mkExists 
  ([context sorts symbols expr i patterns exprs symbol symbol1]
    (.. context (mkExists ^Sort[] sorts ^Symbol[] symbols ^Expr expr i ^Pattern[] patterns ^Expr[] exprs ^Symbol symbol ^Symbol symbol1)))
  ([context exprs expr i patterns exprs1 symbol symbol1]
    (.. context (mkExists ^Expr[] exprs ^Expr expr i ^Pattern[] patterns ^Expr[] exprs1 ^Symbol symbol ^Symbol symbol1))))

(defn mkFPMul [context fprmExpr fpExpr fpExpr1]
    (.. context (mkFPMul ^FPRMExpr fprmExpr ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn mkIntSort [context ]
    (.. context (mkIntSort )))

(defn mkComplement [context reExpr]
    (.. context (mkComplement ^ReExpr reExpr)))

(defn mkBool [context b]
    (.. context (mkBool b)))

(defn getTacticNames [context ]
    (.. context (getTacticNames )))

(defn mkFPAbs [context fpExpr]
    (.. context (mkFPAbs ^FPExpr fpExpr)))

(defn mkAt [context seqExpr intExpr]
    (.. context (mkAt ^SeqExpr seqExpr ^IntExpr intExpr)))

(defn setPrintMode [context z3_ast_print_mode]
    (.. context (setPrintMode ^enumerations.Z3_ast_print_mode z3_ast_print_mode)))

(defn mkFPMax [context fpExpr fpExpr1]
    (.. context (mkFPMax ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn and [context probe probe1]
    (.. context (and ^Probe probe ^Probe probe1)))

(defn mkOptimize [context ]
    (.. context (mkOptimize )))

(defn mkFPRoundingModeSort [context ]
    (.. context (mkFPRoundingModeSort )))

(defn mkBoolSort [context ]
    (.. context (mkBoolSort )))

(defn when [context probe tactic]
    (.. context (when ^Probe probe ^Tactic tactic)))

(defn failIfNotDecided [context ]
    (.. context (failIfNotDecided )))

(defn mkBVSub [context bitVecExpr bitVecExpr1]
    (.. context (mkBVSub ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn not [context probe]
    (.. context (not ^Probe probe)))

(defn getFuncEntryDRQ [context ]
    (.. context (getFuncEntryDRQ )))

(defn mkConstructor [context symbol symbol1 symbols sorts ints]
    (.. context (mkConstructor symbol symbol1 symbols sorts ints)))

(defn mkFPSub [context fprmExpr fpExpr fpExpr1]
    (.. context (mkFPSub ^FPRMExpr fprmExpr ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn mkOption [context reExpr]
    (.. context (mkOption ^ReExpr reExpr)))

(defn mkFPSortDouble [context ]
    (.. context (mkFPSortDouble )))

(defn cond [context probe tactic tactic1]
    (.. context (cond ^Probe probe ^Tactic tactic ^Tactic tactic1)))

(defn mkBVXOR [context bitVecExpr bitVecExpr1]
    (.. context (mkBVXOR ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkAnd [context boolExprs]
    (.. context (mkAnd (into-array BoolExpr boolExprs))))

(defn mkInRe [context seqExpr reExpr]
    (.. context (mkInRe ^SeqExpr seqExpr ^ReExpr reExpr)))

(defn mkBVSLT [context bitVecExpr bitVecExpr1]
    (.. context (mkBVSLT ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkStar [context reExpr]
    (.. context (mkStar ^ReExpr reExpr)))

(defn mkBVAddNoOverflow [context bitVecExpr bitVecExpr1 b]
    (.. context (mkBVAddNoOverflow ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1 b)))

(defn mkIntersect [context reExprs]
    (.. context (mkIntersect (into-array ReExpr reExprs))))

(defn with [context tactic params]
    (.. context (with ^Tactic tactic ^Params params)))

(defn getProbeDescription [context s]
    (.. context (getProbeDescription ^String s)))

(defn mkFPIsNegative [context fpExpr]
    (.. context (mkFPIsNegative ^FPExpr fpExpr)))

(defn mkFPRTP [context ]
    (.. context (mkFPRTP )))

(defn mkExtract [context i i1 bitVecExpr]
    (.. context (mkExtract i i1 bitVecExpr)))

(defn mkFPSortQuadruple [context ]
    (.. context (mkFPSortQuadruple )))

(defn mkFuncDecl [context symbol sorts sort]
    (.. context (mkFuncDecl symbol sorts sort)))

(defn or [context probe probe1]
    (.. context (or ^Probe probe ^Probe probe1)))

(defn mkFPSort64 [context ]
    (.. context (mkFPSort64 )))

(defn mkBVAddNoUnderflow [context bitVecExpr bitVecExpr1]
    (.. context (mkBVAddNoUnderflow ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkFPGEq [context fpExpr fpExpr1]
    (.. context (mkFPGEq ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn mkFPSortSingle [context ]
    (.. context (mkFPSortSingle )))

(defn mkFPSort128 [context ]
    (.. context (mkFPSort128 )))

(defn mkMul [context arithExprs]
    (.. context (mkMul (into-array ArithExpr arithExprs))))

(defn mkFPNeg [context fpExpr]
    (.. context (mkFPNeg ^FPExpr fpExpr)))

(defn mkConcat 
  ([context seqExprs]
    (.. context (mkConcat (into-array SeqExpr seqExprs))))
  ([context bitVecExpr bitVecExpr1]
    (.. context (mkConcat ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1))))

(defn mkBVXNOR [context bitVecExpr bitVecExpr1]
    (.. context (mkBVXNOR ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkBVAdd [context bitVecExpr bitVecExpr1]
    (.. context (mkBVAdd ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkTupleSort [context symbol symbols sorts]
    (.. context (mkTupleSort ^Symbol symbol ^Symbol[] symbols ^Sort[] sorts)))

(defn mkSuffixOf [context seqExpr seqExpr1]
    (.. context (mkSuffixOf ^SeqExpr seqExpr ^SeqExpr seqExpr1)))

(defn mkFPIsNaN [context fpExpr]
    (.. context (mkFPIsNaN ^FPExpr fpExpr)))

(defn mkFPLt [context fpExpr fpExpr1]
    (.. context (mkFPLt ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn mkFPRNE [context ]
    (.. context (mkFPRNE )))

(defn mkFP 
  ([context v fpSort]
    (.. context (mkFP v fpSort)))
  ([context bitVecExpr bitVecExpr1 bitVecExpr2]
    (.. context (mkFP ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1 ^BitVecExpr bitVecExpr2)))
  ([context b i i1 fpSort]
    (.. context (mkFP b i i1 fpSort))))

(defn mkSub [context arithExprs]
    (.. context (mkSub (into-array ArithExpr arithExprs))))

(defn mkFPEq [context fpExpr fpExpr1]
    (.. context (mkFPEq ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn mkBVSLE [context bitVecExpr bitVecExpr1]
    (.. context (mkBVSLE ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn constProbe [context v]
    (.. context (constProbe v)))

(defn mkFalse [context ]
    (.. context (mkFalse )))

(defn mkMod [context intExpr intExpr1]
    (.. context (mkMod ^IntExpr intExpr ^IntExpr intExpr1)))

(defn orElse [context tactic tactic1]
    (.. context (orElse ^Tactic tactic ^Tactic tactic1)))

(defn mkBVUDiv [context bitVecExpr bitVecExpr1]
    (.. context (mkBVUDiv ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkPower [context arithExpr arithExpr1]
    (.. context (mkPower ^ArithExpr arithExpr ^ArithExpr arithExpr1)))

(defn mkBVLSHR [context bitVecExpr bitVecExpr1]
    (.. context (mkBVLSHR ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn le [context probe probe1]
    (.. context (le ^Probe probe ^Probe probe1)))

(defn close [context ]
    (.. context (close )))

(defn mkPattern [context exprs]
    (.. context (mkPattern (into-array Expr exprs))))

(defn mkBVSGE [context bitVecExpr bitVecExpr1]
    (.. context (mkBVSGE ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkIff [context boolExpr boolExpr1]
    (.. context (mkIff ^BoolExpr boolExpr ^BoolExpr boolExpr1)))

(defn mkBVASHR [context bitVecExpr bitVecExpr1]
    (.. context (mkBVASHR ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkGoal [context b b1 b2]
    (.. context (mkGoal b b1 b2)))

(defn usingParams [context tactic params]
    (.. context (usingParams ^Tactic tactic ^Params params)))

(defn failIf [context probe]
    (.. context (failIf ^Probe probe)))

(defn mkSetIntersection [context arrayExprs]
    (.. context (mkSetIntersection (into-array ArrayExpr arrayExprs))))

(defn mkRealConst [context symbol]
    (.. context (mkRealConst symbol)))

(defn mkBoolConst [context symbol]
    (.. context (mkBoolConst symbol)))

(defn mkBVUGT [context bitVecExpr bitVecExpr1]
    (.. context (mkBVUGT ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkBVMulNoUnderflow [context bitVecExpr bitVecExpr1]
    (.. context (mkBVMulNoUnderflow ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkIntConst [context symbol]
    (.. context (mkIntConst symbol)))

(defn mkUnit [context expr]
    (.. context (mkUnit ^Expr expr)))

(defn mkFPIsNormal [context fpExpr]
    (.. context (mkFPIsNormal ^FPExpr fpExpr)))

(defn mkApp [context funcDecl exprs]
    (.. context (mkApp ^FuncDecl funcDecl (into-array Expr exprs))))

(defn mkDatatypeSorts [context symbols constructors]
    (.. context (mkDatatypeSorts symbols constructors)))

(defn mkSetUnion [context arrayExprs]
    (.. context (mkSetUnion (into-array ArrayExpr arrayExprs))))

(defn mkSymbol [context i]
    (.. context (mkSymbol i)))

(defn mkUnion [context reExprs]
    (.. context (mkUnion (into-array ReExpr reExprs))))

(defn mkBVULT [context bitVecExpr bitVecExpr1]
    (.. context (mkBVULT ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkConstArray [context sort expr]
    (.. context (mkConstArray ^Sort sort ^Expr expr)))

(defn mkInt2Real [context intExpr]
    (.. context (mkInt2Real ^IntExpr intExpr)))

(defn getProbeNames [context ]
    (.. context (getProbeNames )))

(defn mkFPRoundNearestTiesToEven [context ]
    (.. context (mkFPRoundNearestTiesToEven )))

(defn mkRange [context seqExpr seqExpr1]
    (.. context (mkRange ^SeqExpr seqExpr ^SeqExpr seqExpr1)))

(defn mkAtMost [context boolExprs i]
    (.. context (mkAtMost ^BoolExpr[] boolExprs i)))

(defn getASTDRQ [context ]
    (.. context (getASTDRQ )))

(defn mkTactic [context s]
    (.. context (mkTactic ^String s)))

(defn mkBVMulNoOverflow [context bitVecExpr bitVecExpr1 b]
    (.. context (mkBVMulNoOverflow ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1 b)))

(defn mkGt [context arithExpr arithExpr1]
    (.. context (mkGt ^ArithExpr arithExpr ^ArithExpr arithExpr1)))

(defn mkBVNegNoOverflow [context bitVecExpr]
    (.. context (mkBVNegNoOverflow ^BitVecExpr bitVecExpr)))

(defn getASTVectorDRQ [context ]
    (.. context (getASTVectorDRQ )))

(defn mkDiv [context arithExpr arithExpr1]
    (.. context (mkDiv ^ArithExpr arithExpr ^ArithExpr arithExpr1)))

(defn mkBV2Int [context bitVecExpr b]
    (.. context (mkBV2Int ^BitVecExpr bitVecExpr b)))

(defn getTacticDRQ [context ]
    (.. context (getTacticDRQ )))

(defn mkBVSGT [context bitVecExpr bitVecExpr1]
    (.. context (mkBVSGT ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn updateParamValue [context s s1]
    (.. context (updateParamValue ^String s ^String s1)))

(defn mkLt [context arithExpr arithExpr1]
    (.. context (mkLt ^ArithExpr arithExpr ^ArithExpr arithExpr1)))

(defn mkBVUGE [context bitVecExpr bitVecExpr1]
    (.. context (mkBVUGE ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkReal 
  ([context s]
    (.. context (mkReal s)))
  ([context i i1]
    (.. context (mkReal i i1))))

(defn mkSetMembership [context expr arrayExpr]
    (.. context (mkSetMembership ^Expr expr ^ArrayExpr arrayExpr)))

(defn mkGe [context arithExpr arithExpr1]
    (.. context (mkGe ^ArithExpr arithExpr ^ArithExpr arithExpr1)))

(defn getModelDRQ [context ]
    (.. context (getModelDRQ )))

(defn mkTrue [context ]
    (.. context (mkTrue )))

(defn getIntSort [context ]
    (.. context (getIntSort )))

(defn mkFPIsZero [context fpExpr]
    (.. context (mkFPIsZero ^FPExpr fpExpr)))

(defn mkSignExt [context i bitVecExpr]
    (.. context (mkSignExt i ^BitVecExpr bitVecExpr)))

(defn mkMap [context funcDecl arrayExprs]
    (.. context (mkMap ^FuncDecl funcDecl (into-array ArrayExpr arrayExprs))))

(defn SimplifyHelp [context ]
    (.. context (SimplifyHelp )))

(defn mkRealSort [context ]
    (.. context (mkRealSort )))

(defn mkLe [context arithExpr arithExpr1]
    (.. context (mkLe ^ArithExpr arithExpr ^ArithExpr arithExpr1)))

(defn mkArrayConst [context symbol sort sort1]
    (.. context (mkArrayConst symbol sort sort1)))

(defn mkParams [context ]
    (.. context (mkParams )))

(defn getRealSort [context ]
    (.. context (getRealSort )))

(defn mkSetDifference [context arrayExpr arrayExpr1]
    (.. context (mkSetDifference ^ArrayExpr arrayExpr ^ArrayExpr arrayExpr1)))

(defn mkFPSqrt [context fprmExpr fpExpr]
    (.. context (mkFPSqrt ^FPRMExpr fprmExpr ^FPExpr fpExpr)))

(defn mkSetComplement [context arrayExpr]
    (.. context (mkSetComplement ^ArrayExpr arrayExpr)))

(defn mkUnaryMinus [context arithExpr]
    (.. context (mkUnaryMinus ^ArithExpr arithExpr)))

(defn mkFiniteDomainSort [context symbol l]
    (.. context (mkFiniteDomainSort symbol l)))

(defn mkFPRoundToIntegral [context fprmExpr fpExpr]
    (.. context (mkFPRoundToIntegral ^FPRMExpr fprmExpr ^FPExpr fpExpr)))

(defn mkFPNaN [context fpSort]
    (.. context (mkFPNaN ^FPSort fpSort)))

(defn mkSetSubset [context arrayExpr arrayExpr1]
    (.. context (mkSetSubset ^ArrayExpr arrayExpr ^ArrayExpr arrayExpr1)))

(defn mkToRe [context seqExpr]
    (.. context (mkToRe ^SeqExpr seqExpr)))

(defn mkFPRoundTowardZero [context ]
    (.. context (mkFPRoundTowardZero )))

(defn getTacticDescription [context s]
    (.. context (getTacticDescription ^String s)))

(defn andThen [context tactic tactic1 tactics]
    (.. context (andThen ^Tactic tactic ^Tactic tactic1 (into-array Tactic tactics))))

(defn mkFPDiv [context fprmExpr fpExpr fpExpr1]
    (.. context (mkFPDiv ^FPRMExpr fprmExpr ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn tryFor [context tactic i]
    (.. context (tryFor ^Tactic tactic i)))

(defn parseSMTLIB2File [context s symbols sorts symbols1 funcDecls]
    (.. context (parseSMTLIB2File ^String s ^Symbol[] symbols ^Sort[] sorts ^Symbol[] symbols1 ^FuncDecl[] funcDecls)))

(defn mkBVAND [context bitVecExpr bitVecExpr1]
    (.. context (mkBVAND ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkSolver 
  ([context ]
    (.. context (mkSolver )))
  ([context symbol]
    (.. context (mkSolver symbol))))

(defn mkPBGe [context ints boolExprs i]
    (.. context (mkPBGe ^int[] ints ^BoolExpr[] boolExprs i)))

(defn mkFPToFP 
  ([context bitVecExpr fpSort]
    (.. context (mkFPToFP ^BitVecExpr bitVecExpr ^FPSort fpSort)))
  ([context fprmExpr fpExpr fpSort]
    (.. context (mkFPToFP fprmExpr fpExpr fpSort)))
  ([context fprmExpr bitVecExpr fpSort b]
    (.. context (mkFPToFP fprmExpr bitVecExpr fpSort b))))

(defn mkBVURem [context bitVecExpr bitVecExpr1]
    (.. context (mkBVURem ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkBVNot [context bitVecExpr]
    (.. context (mkBVNot ^BitVecExpr bitVecExpr)))

(defn mkStringSort [context ]
    (.. context (mkStringSort )))

(defn mkQuantifier 
  ([context b exprs expr i patterns exprs1 symbol symbol1]
    (.. context (mkQuantifier b ^Expr[] exprs ^Expr expr i ^Pattern[] patterns ^Expr[] exprs1 ^Symbol symbol ^Symbol symbol1)))
  ([context b sorts symbols expr i patterns exprs symbol symbol1]
    (.. context (mkQuantifier b ^Sort[] sorts ^Symbol[] symbols ^Expr expr i ^Pattern[] patterns ^Expr[] exprs ^Symbol symbol ^Symbol symbol1))))

(defn mkEmptySeq [context sort]
    (.. context (mkEmptySeq ^Sort sort)))

(defn mkStore [context arrayExpr expr expr1]
    (.. context (mkStore arrayExpr expr expr1)))

(defn mkUpdateField [context funcDecl expr expr1]
    (.. context (mkUpdateField ^FuncDecl funcDecl ^Expr expr ^Expr expr1)))

(defn mkFPRoundNearestTiesToAway [context ]
    (.. context (mkFPRoundNearestTiesToAway )))

(defn mkFPAdd [context fprmExpr fpExpr fpExpr1]
    (.. context (mkFPAdd ^FPRMExpr fprmExpr ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn mkFPRem [context fpExpr fpExpr1]
    (.. context (mkFPRem ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn mkFPIsPositive [context fpExpr]
    (.. context (mkFPIsPositive ^FPExpr fpExpr)))

(defn mkLength [context seqExpr]
    (.. context (mkLength ^SeqExpr seqExpr)))

(defn mkFPRTZ [context ]
    (.. context (mkFPRTZ )))

(defn lt [context probe probe1]
    (.. context (lt ^Probe probe ^Probe probe1)))

(defn mkFixedpoint [context ]
    (.. context (mkFixedpoint )))

(defn mkFPFMA [context fprmExpr fpExpr fpExpr1 fpExpr2]
    (.. context (mkFPFMA ^FPRMExpr fprmExpr ^FPExpr fpExpr ^FPExpr fpExpr1 ^FPExpr fpExpr2)))

(defn mkBVSRem [context bitVecExpr bitVecExpr1]
    (.. context (mkBVSRem ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn getSolverDRQ [context ]
    (.. context (getSolverDRQ )))

(defn mkPBLe [context ints boolExprs i]
    (.. context (mkPBLe ^int[] ints ^BoolExpr[] boolExprs i)))

(defn mkSeqSort [context sort]
    (.. context (mkSeqSort ^Sort sort)))

(defn then [context tactic tactic1 tactics]
    (.. context (then ^Tactic tactic ^Tactic tactic1 (into-array Tactic tactics))))

(defn mkImplies [context boolExpr boolExpr1]
    (.. context (mkImplies ^BoolExpr boolExpr ^BoolExpr boolExpr1)))

(defn skip [context ]
    (.. context (skip )))

(defn mkContains [context seqExpr seqExpr1]
    (.. context (mkContains ^SeqExpr seqExpr ^SeqExpr seqExpr1)))

(defn mkFPRNA [context ]
    (.. context (mkFPRNA )))

(defn mkReSort [context sort]
    (.. context (mkReSort ^Sort sort)))

(defn getStatisticsDRQ [context ]
    (.. context (getStatisticsDRQ )))

(defn mkDatatypeSort [context symbol constructors]
    (.. context (mkDatatypeSort symbol constructors)))

(defn getBoolSort [context ]
    (.. context (getBoolSort )))

(defn mkZeroExt [context i bitVecExpr]
    (.. context (mkZeroExt i ^BitVecExpr bitVecExpr)))

(defn mkSetDel [context arrayExpr expr]
    (.. context (mkSetDel ^ArrayExpr arrayExpr ^Expr expr)))

(defn wrapAST [context l]
    (.. context (wrapAST l)))

(defn mkArrayExt [context arrayExpr arrayExpr1]
    (.. context (mkArrayExt ^ArrayExpr arrayExpr ^ArrayExpr arrayExpr1)))

(defn mkFPGt [context fpExpr fpExpr1]
    (.. context (mkFPGt ^FPExpr fpExpr ^FPExpr fpExpr1)))

(defn mkConstDecl [context symbol sort]
    (.. context (mkConstDecl symbol sort)))

(defn mkBVOR [context bitVecExpr bitVecExpr1]
    (.. context (mkBVOR ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))

(defn mkITE [context boolExpr expr expr1]
    (.. context (mkITE ^BoolExpr boolExpr ^Expr expr ^Expr expr1)))

(defn mkBVRedOR [context bitVecExpr]
    (.. context (mkBVRedOR ^BitVecExpr bitVecExpr)))

(defn getStringSort [context ]
    (.. context (getStringSort )))

(defn ge [context probe probe1]
    (.. context (ge ^Probe probe ^Probe probe1)))

(defn getConstructorDRQ [context ]
    (.. context (getConstructorDRQ )))

(defn mkBVSubNoOverflow [context bitVecExpr bitVecExpr1]
    (.. context (mkBVSubNoOverflow ^BitVecExpr bitVecExpr ^BitVecExpr bitVecExpr1)))