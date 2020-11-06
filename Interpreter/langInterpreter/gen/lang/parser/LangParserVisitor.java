// Generated from C:/Users/bruno/IdeaProjects/langInterpreter/src\LangParser.g4 by ANTLR 4.8
package lang.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(LangParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(LangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(LangParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(LangParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeArray}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(LangParser.TypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBtype}
	 * labeled alternative in {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBtype(LangParser.TypeBtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBtype(LangParser.BtypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmdList}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdList(LangParser.CmdListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmdIf}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(LangParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmdIfElse}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIfElse(LangParser.CmdIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmdIterate}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIterate(LangParser.CmdIterateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmdRead}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRead(LangParser.CmdReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmdPrint}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPrint(LangParser.CmdPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmdReturn}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdReturn(LangParser.CmdReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmdAssign}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAssign(LangParser.CmdAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmdFunctionCall}
	 * labeled alternative in {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFunctionCall(LangParser.CmdFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAnd(LangParser.ExpAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expRexp}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRexp(LangParser.ExpRexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNotEq}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNotEq(LangParser.ExpNotEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expEqEq}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpEqEq(LangParser.ExpEqEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rexpAexp}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRexpAexp(LangParser.RexpAexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLess}
	 * labeled alternative in {@link LangParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLess(LangParser.ExpLessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aexpMexp}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpMexp(LangParser.AexpMexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expSub}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpSub(LangParser.ExpSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPlus}
	 * labeled alternative in {@link LangParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPlus(LangParser.ExpPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMult}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMult(LangParser.ExpMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mexpSexp}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMexpSexp(LangParser.MexpSexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expDiv}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDiv(LangParser.ExpDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMod}
	 * labeled alternative in {@link LangParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMod(LangParser.ExpModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sexpPexp}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSexpPexp(LangParser.SexpPexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNot}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNot(LangParser.ExpNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMinus}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMinus(LangParser.ExpMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalTrue}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralTrue(LangParser.LiteralTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalFalse}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralFalse(LangParser.LiteralFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalNull}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralNull(LangParser.LiteralNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralInt(LangParser.LiteralIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalFloat}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralFloat(LangParser.LiteralFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalChar}
	 * labeled alternative in {@link LangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralChar(LangParser.LiteralCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pexpLvalue}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexpLvalue(LangParser.PexpLvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expParenthesis}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParenthesis(LangParser.ExpParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNew}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNew(LangParser.ExpNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFunctionCall}
	 * labeled alternative in {@link LangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFunctionCall(LangParser.ExpFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lvalueSelect}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueSelect(LangParser.LvalueSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lvalueArray}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueArray(LangParser.LvalueArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lvalueId}
	 * labeled alternative in {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueId(LangParser.LvalueIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExps(LangParser.ExpsContext ctx);
}