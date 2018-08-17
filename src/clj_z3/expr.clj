
; Auto-generated file
; Generated from source decompiled/com/microsoft/z3/Expr.decomp.java

(ns clj-z3.expr
  (:import (com.microsoft.z3 RealExpr FuncDecl Constructor IntExpr FPSort Pattern AST Symbol SeqExpr Sort BoolExpr ArrayExpr ReExpr Tactic FPRMExpr FPExpr Expr BitVecExpr ArithExpr Params Context Probe enumerations.Z3_ast_print_mode))
  (:refer-clojure :exclude [update])
  (:gen-class))

(defn isRealToInt [expr ]
    (.. expr (isRealToInt )))

(defn isProofAndElimination [expr ]
    (.. expr (isProofAndElimination )))

(defn isGT [expr ]
    (.. expr (isGT )))

(defn isMul [expr ]
    (.. expr (isMul )))

(defn isSetDifference [expr ]
    (.. expr (isSetDifference )))

(defn isBVCarry [expr ]
    (.. expr (isBVCarry )))

(defn update [expr exprs]
    (.. expr (update ^Expr[] exprs)))

(defn isNumeral [expr ]
    (.. expr (isNumeral )))

(defn isArray [expr ]
    (.. expr (isArray )))

(defn isRemainder [expr ]
    (.. expr (isRemainder )))

(defn isBVRotateLeftExtended [expr ]
    (.. expr (isBVRotateLeftExtended )))

(defn isProofTransitivityStar [expr ]
    (.. expr (isProofTransitivityStar )))

(defn isProofPullQuant [expr ]
    (.. expr (isProofPullQuant )))

(defn isWellSorted [expr ]
    (.. expr (isWellSorted )))

(defn isBVAdd [expr ]
    (.. expr (isBVAdd )))

(defn isReal [expr ]
    (.. expr (isReal )))

(defn isRelationClone [expr ]
    (.. expr (isRelationClone )))

(defn isBool [expr ]
    (.. expr (isBool )))

(defn isNot [expr ]
    (.. expr (isNot )))

(defn isProofPullQuantStar [expr ]
    (.. expr (isProofPullQuantStar )))

(defn isLabel [expr ]
    (.. expr (isLabel )))

(defn isBVSignExtension [expr ]
    (.. expr (isBVSignExtension )))

(defn getSort [expr ]
    (.. expr (getSort )))

(defn isBVRepeat [expr ]
    (.. expr (isBVRepeat )))

(defn isProofDER [expr ]
    (.. expr (isProofDER )))

(defn isBVBitOne [expr ]
    (.. expr (isBVBitOne )))

(defn isBVZeroExtension [expr ]
    (.. expr (isBVZeroExtension )))

(defn isSetComplement [expr ]
    (.. expr (isSetComplement )))

(defn isSetSubset [expr ]
    (.. expr (isSetSubset )))

(defn isBVSMod [expr ]
    (.. expr (isBVSMod )))

(defn isBVShiftRightLogical [expr ]
    (.. expr (isBVShiftRightLogical )))

(defn isBVRotateLeft [expr ]
    (.. expr (isBVRotateLeft )))

(defn isConst [expr ]
    (.. expr (isConst )))

(defn isBVSRem [expr ]
    (.. expr (isBVSRem )))

(defn isImplies [expr ]
    (.. expr (isImplies )))

(defn isArrayMap [expr ]
    (.. expr (isArrayMap )))

(defn isOr [expr ]
    (.. expr (isOr )))

(defn isProofIFFOEQ [expr ]
    (.. expr (isProofIFFOEQ )))

(defn isConcat [expr ]
    (.. expr (isConcat )))

(defn isBVSLE [expr ]
    (.. expr (isBVSLE )))

(defn isProofHypothesis [expr ]
    (.. expr (isProofHypothesis )))

(defn isRatNum [expr ]
    (.. expr (isRatNum )))

(defn isRelationProject [expr ]
    (.. expr (isRelationProject )))

(defn isFalse [expr ]
    (.. expr (isFalse )))

(defn isBVUGT [expr ]
    (.. expr (isBVUGT )))

(defn isGE [expr ]
    (.. expr (isGE )))

(defn isProofElimUnusedVars [expr ]
    (.. expr (isProofElimUnusedVars )))

(defn isAsArray [expr ]
    (.. expr (isAsArray )))

(defn isIntToReal [expr ]
    (.. expr (isIntToReal )))

(defn isBVAND [expr ]
    (.. expr (isBVAND )))

(defn isBVBitZero [expr ]
    (.. expr (isBVBitZero )))

(defn getString [expr ]
    (.. expr (getString )))

(defn isBVNOT [expr ]
    (.. expr (isBVNOT )))

(defn simplify 
  ([expr ]
    (.. expr (simplify )))
  ([expr params]
    (.. expr (simplify ^Params params))))

(defn getFuncDecl [expr ]
    (.. expr (getFuncDecl )))

(defn isProofDefAxiom [expr ]
    (.. expr (isProofDefAxiom )))

(defn isLabelLit [expr ]
    (.. expr (isLabelLit )))

(defn isBVShiftRightArithmetic [expr ]
    (.. expr (isBVShiftRightArithmetic )))

(defn isRelation [expr ]
    (.. expr (isRelation )))

(defn isLE [expr ]
    (.. expr (isLE )))

(defn isBVNumeral [expr ]
    (.. expr (isBVNumeral )))

(defn isBVXOR [expr ]
    (.. expr (isBVXOR )))

(defn isProofPushQuant [expr ]
    (.. expr (isProofPushQuant )))

(defn isBVSub [expr ]
    (.. expr (isBVSub )))

(defn substituteVars [expr exprs]
    (.. expr (substituteVars ^Expr[] exprs)))

(defn isProofRewriteStar [expr ]
    (.. expr (isProofRewriteStar )))

(defn isProofIFFFalse [expr ]
    (.. expr (isProofIFFFalse )))

(defn isRelationFilter [expr ]
    (.. expr (isRelationFilter )))

(defn isRelationWiden [expr ]
    (.. expr (isRelationWiden )))

(defn isBVMul [expr ]
    (.. expr (isBVMul )))

(defn isEmptyRelation [expr ]
    (.. expr (isEmptyRelation )))

(defn isProofGoal [expr ]
    (.. expr (isProofGoal )))

(defn isRelationStore [expr ]
    (.. expr (isRelationStore )))

(defn isBVNAND [expr ]
    (.. expr (isBVNAND )))

(defn isBVReduceAND [expr ]
    (.. expr (isBVReduceAND )))

(defn isLT [expr ]
    (.. expr (isLT )))

(defn translate [expr context]
    (.. expr (translate ^Context context)))

(defn isProofAsserted [expr ]
    (.. expr (isProofAsserted )))

(defn toString [expr ]
    (.. expr (toString )))

(defn isProofSkolemize [expr ]
    (.. expr (isProofSkolemize )))

(defn isBVSGE [expr ]
    (.. expr (isBVSGE )))

(defn isProofOrElimination [expr ]
    (.. expr (isProofOrElimination )))

(defn isRelationSelect [expr ]
    (.. expr (isRelationSelect )))

(defn isProofNNFStar [expr ]
    (.. expr (isProofNNFStar )))

(defn isBVURem [expr ]
    (.. expr (isBVURem )))

(defn isBVXNOR [expr ]
    (.. expr (isBVXNOR )))

(defn isBVULE [expr ]
    (.. expr (isBVULE )))

(defn isTrue [expr ]
    (.. expr (isTrue )))

(defn isProofTransitivity [expr ]
    (.. expr (isProofTransitivity )))

(defn isDiv [expr ]
    (.. expr (isDiv )))

(defn isProofLemma [expr ]
    (.. expr (isProofLemma )))

(defn isProofApplyDef [expr ]
    (.. expr (isProofApplyDef )))

(defn isBVRotateRightExtended [expr ]
    (.. expr (isBVRotateRightExtended )))

(defn isProofReflexivity [expr ]
    (.. expr (isProofReflexivity )))

(defn isBVUGE [expr ]
    (.. expr (isBVUGE )))

(defn substitute [expr exprs exprs1]
    (.. expr (substitute exprs exprs1)))

(defn isProofModusPonens [expr ]
    (.. expr (isProofModusPonens )))

(defn isInt [expr ]
    (.. expr (isInt )))

(defn isBVRotateRight [expr ]
    (.. expr (isBVRotateRight )))

(defn isEq [expr ]
    (.. expr (isEq )))

(defn isArithmeticNumeral [expr ]
    (.. expr (isArithmeticNumeral )))

(defn isSetIntersect [expr ]
    (.. expr (isSetIntersect )))

(defn isConstantArray [expr ]
    (.. expr (isConstantArray )))

(defn isProofModusPonensOEQ [expr ]
    (.. expr (isProofModusPonensOEQ )))

(defn isRelationUnion [expr ]
    (.. expr (isRelationUnion )))

(defn isIDiv [expr ]
    (.. expr (isIDiv )))

(defn isProofCNFStar [expr ]
    (.. expr (isProofCNFStar )))

(defn isFiniteDomain [expr ]
    (.. expr (isFiniteDomain )))

(defn isRelationComplement [expr ]
    (.. expr (isRelationComplement )))

(defn isITE [expr ]
    (.. expr (isITE )))

(defn isRelationRename [expr ]
    (.. expr (isRelationRename )))

(defn isBVConcat [expr ]
    (.. expr (isBVConcat )))

(defn isXor [expr ]
    (.. expr (isXor )))

(defn isBVReduceOR [expr ]
    (.. expr (isBVReduceOR )))

(defn isRealIsInt [expr ]
    (.. expr (isRealIsInt )))

(defn getBoolValue [expr ]
    (.. expr (getBoolValue )))

(defn isProofUnitResolution [expr ]
    (.. expr (isProofUnitResolution )))

(defn isRelationNegationFilter [expr ]
    (.. expr (isRelationNegationFilter )))

(defn isProofRewrite [expr ]
    (.. expr (isProofRewrite )))

(defn isFiniteDomainLT [expr ]
    (.. expr (isFiniteDomainLT )))

(defn isIntNum [expr ]
    (.. expr (isIntNum )))

(defn isAdd [expr ]
    (.. expr (isAdd )))

(defn getIndex [expr ]
    (.. expr (getIndex )))

(defn isBVULT [expr ]
    (.. expr (isBVULT )))

(defn isBVUMinus [expr ]
    (.. expr (isBVUMinus )))

(defn isAnd [expr ]
    (.. expr (isAnd )))

(defn isProofSymmetry [expr ]
    (.. expr (isProofSymmetry )))

(defn isProofMonotonicity [expr ]
    (.. expr (isProofMonotonicity )))

(defn isBVComp [expr ]
    (.. expr (isBVComp )))

(defn isProofTrue [expr ]
    (.. expr (isProofTrue )))

(defn isBVNOR [expr ]
    (.. expr (isBVNOR )))

(defn isBVSDiv [expr ]
    (.. expr (isBVSDiv )))

(defn isString [expr ]
    (.. expr (isString )))

(defn isDefaultArray [expr ]
    (.. expr (isDefaultArray )))

(defn isAlgebraicNumber [expr ]
    (.. expr (isAlgebraicNumber )))

(defn isProofIFFTrue [expr ]
    (.. expr (isProofIFFTrue )))

(defn isUMinus [expr ]
    (.. expr (isUMinus )))

(defn isProofQuantInst [expr ]
    (.. expr (isProofQuantInst )))

(defn isIsEmptyRelation [expr ]
    (.. expr (isIsEmptyRelation )))

(defn isIntToBV [expr ]
    (.. expr (isIntToBV )))

(defn isBVXOR3 [expr ]
    (.. expr (isBVXOR3 )))

(defn isDistinct [expr ]
    (.. expr (isDistinct )))

(defn isSelect [expr ]
    (.. expr (isSelect )))

(defn isRelationalJoin [expr ]
    (.. expr (isRelationalJoin )))

(defn getNumArgs [expr ]
    (.. expr (getNumArgs )))

(defn isBVShiftLeft [expr ]
    (.. expr (isBVShiftLeft )))

(defn isProofTheoryLemma [expr ]
    (.. expr (isProofTheoryLemma )))

(defn isSetUnion [expr ]
    (.. expr (isSetUnion )))

(defn isSub [expr ]
    (.. expr (isSub )))

(defn isIff [expr ]
    (.. expr (isIff )))

(defn isBVOR [expr ]
    (.. expr (isBVOR )))

(defn isProofDefIntro [expr ]
    (.. expr (isProofDefIntro )))

(defn isProofNNFPos [expr ]
    (.. expr (isProofNNFPos )))

(defn isProofDistributivity [expr ]
    (.. expr (isProofDistributivity )))

(defn isBVUDiv [expr ]
    (.. expr (isBVUDiv )))

(defn isBVSLT [expr ]
    (.. expr (isBVSLT )))

(defn isBV [expr ]
    (.. expr (isBV )))

(defn isStore [expr ]
    (.. expr (isStore )))

(defn isOEQ [expr ]
    (.. expr (isOEQ )))

(defn isProofCommutativity [expr ]
    (.. expr (isProofCommutativity )))

(defn isModulus [expr ]
    (.. expr (isModulus )))

(defn isBVExtract [expr ]
    (.. expr (isBVExtract )))

(defn isBVToInt [expr ]
    (.. expr (isBVToInt )))

(defn isProofQuantIntro [expr ]
    (.. expr (isProofQuantIntro )))

(defn isProofNNFNeg [expr ]
    (.. expr (isProofNNFNeg )))

(defn getArgs [expr ]
    (.. expr (getArgs )))

(defn isBVSGT [expr ]
    (.. expr (isBVSGT )))