// Generated from C:/Users/bruno/IdeaProjects/langInterpreter/src\LangParser.g4 by ANTLR 4.8
package lang.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(LangParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(LangParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(LangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(LangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(LangParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(LangParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LangParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LangParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(LangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(LangParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeArray}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(LangParser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeArray}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(LangParser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBtype}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBtype(LangParser.TypeBtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBtype}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBtype(LangParser.TypeBtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBtype(LangParser.BtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBtype(LangParser.BtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdList}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdList(LangParser.CmdListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdList}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdList(LangParser.CmdListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdIf}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(LangParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdIf}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(LangParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdIfElse}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdIfElse(LangParser.CmdIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdIfElse}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdIfElse(LangParser.CmdIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdIterate}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdIterate(LangParser.CmdIterateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdIterate}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdIterate(LangParser.CmdIterateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdRead}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(LangParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdRead}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(LangParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdPrint}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdPrint(LangParser.CmdPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdPrint}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdPrint(LangParser.CmdPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdReturn}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdReturn(LangParser.CmdReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdReturn}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdReturn(LangParser.CmdReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdAssign}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdAssign(LangParser.CmdAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdAssign}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdAssign(LangParser.CmdAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdFunctionCall}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmdFunctionCall(LangParser.CmdFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdFunctionCall}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmdFunctionCall(LangParser.CmdFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpAnd(LangParser.ExpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpAnd(LangParser.ExpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expRexp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpRexp(LangParser.ExpRexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expRexp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpRexp(LangParser.ExpRexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNotEq}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterExpNotEq(LangParser.ExpNotEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNotEq}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitExpNotEq(LangParser.ExpNotEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expEqEq}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterExpEqEq(LangParser.ExpEqEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expEqEq}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitExpEqEq(LangParser.ExpEqEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rexpAexp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterRexpAexp(LangParser.RexpAexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rexpAexp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitRexpAexp(LangParser.RexpAexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expLess}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterExpLess(LangParser.ExpLessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expLess}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitExpLess(LangParser.ExpLessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aexpMexp}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterAexpMexp(LangParser.AexpMexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aexpMexp}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitAexpMexp(LangParser.AexpMexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expSub}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterExpSub(LangParser.ExpSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expSub}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitExpSub(LangParser.ExpSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPlus}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterExpPlus(LangParser.ExpPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPlus}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitExpPlus(LangParser.ExpPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMult}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterExpMult(LangParser.ExpMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMult}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitExpMult(LangParser.ExpMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mexpSexp}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterMexpSexp(LangParser.MexpSexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mexpSexp}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitMexpSexp(LangParser.MexpSexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expDiv}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterExpDiv(LangParser.ExpDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expDiv}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitExpDiv(LangParser.ExpDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMod}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterExpMod(LangParser.ExpModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMod}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitExpMod(LangParser.ExpModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sexpPexp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterSexpPexp(LangParser.SexpPexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sexpPexp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitSexpPexp(LangParser.SexpPexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNot}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterExpNot(LangParser.ExpNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNot}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitExpNot(LangParser.ExpNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMinus}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterExpMinus(LangParser.ExpMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMinus}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitExpMinus(LangParser.ExpMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalTrue}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTrue(LangParser.LiteralTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalTrue}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTrue(LangParser.LiteralTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalFalse}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterLiteralFalse(LangParser.LiteralFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalFalse}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitLiteralFalse(LangParser.LiteralFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalNull}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterLiteralNull(LangParser.LiteralNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalNull}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitLiteralNull(LangParser.LiteralNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterLiteralInt(LangParser.LiteralIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitLiteralInt(LangParser.LiteralIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalFloat}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterLiteralFloat(LangParser.LiteralFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalFloat}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitLiteralFloat(LangParser.LiteralFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalChar}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterLiteralChar(LangParser.LiteralCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalChar}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitLiteralChar(LangParser.LiteralCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pexpLvalue}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterPexpLvalue(LangParser.PexpLvalueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pexpLvalue}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitPexpLvalue(LangParser.PexpLvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expParenthesis}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterExpParenthesis(LangParser.ExpParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expParenthesis}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitExpParenthesis(LangParser.ExpParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNew}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterExpNew(LangParser.ExpNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNew}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitExpNew(LangParser.ExpNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFunctionCall}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterExpFunctionCall(LangParser.ExpFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFunctionCall}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitExpFunctionCall(LangParser.ExpFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lvalueSelect}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalueSelect(LangParser.LvalueSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lvalueSelect}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalueSelect(LangParser.LvalueSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lvalueArray}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalueArray(LangParser.LvalueArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lvalueArray}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalueArray(LangParser.LvalueArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lvalueId}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalueId(LangParser.LvalueIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lvalueId}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalueId(LangParser.LvalueIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterExps(LangParser.ExpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitExps(LangParser.ExpsContext ctx);
}