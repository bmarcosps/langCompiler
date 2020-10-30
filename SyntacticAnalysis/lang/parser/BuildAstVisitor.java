/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/

package lang.parser;

import lang.ast.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;

public class BuildAstVisitor extends LangParserBaseVisitor<SuperNode> {
    @Override
    public SuperNode visitProg(LangParser.ProgContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Prog progNode = new Prog(line, column);
        //List<SuperNode> resultList = new LinkedList<>();

        SuperNode result = this.defaultResult();
        int n = ctx.getChildCount();
        for(int i = 0; i < n && this.shouldVisitNextChild(ctx, result); ++i) {
            ParseTree c = ctx.getChild(i);
            SuperNode childResult = c.accept(this);
            progNode.appendDataFunc((Node) this.aggregateResult(result, childResult));
        }

        //return new Prog(line, column, resultList);

        return progNode; //super.visitProg(ctx);
    }

    @Override
    public SuperNode visitData(LangParser.DataContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Data dataNode = new Data(line, column, ctx.ID.getText());


        SuperNode result = this.defaultResult();
        int n = ctx.decl().size();
        for(int i = 0; i < n && this.shouldVisitNextChild(ctx, result); ++i) {
            ParseTree c = ctx.decl(i);
            SuperNode childResult = c.accept(this);
            dataNode.appendDecl((Decl) this.aggregateResult(result, childResult));
        }

        //return super.visitData(ctx);
        return dataNode;
    }

    @Override
    public SuperNode visitDecl(LangParser.DeclContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Type t = (Type) ctx.type().accept(this);
        /* TODO: VERIFICAR ESSE ID MALDITO*/
        Decl declNode = new Decl(line, column, ctx.ID().getText(), t);

        //eturn super.visitDecl(ctx);
        return declNode;
    }

    @Override
    public SuperNode visitFunc(LangParser.FuncContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Func funcNode = new Func(line, column, ctx.ID().getText());
        Params prms = null;
        if(ctx.params()!= null) {
            prms = (Params) ctx.params().accept(this);
            funcNode.setParams(prms.getParamList());
        }


        SuperNode result = this.defaultResult();
        int n = ctx.type().size();
        for(int i = 0; i < n && this.shouldVisitNextChild(ctx, result); ++i) {
            ParseTree c = ctx.type(i);
            SuperNode childResult = c.accept(this);
            funcNode.appendReturn((Type) this.aggregateResult(result, childResult));
        }

        result = this.defaultResult();
        n = ctx.cmd().size();
        for(int i = 0; i < n && this.shouldVisitNextChild(ctx, result); ++i) {
            ParseTree c = ctx.cmd(i);
            SuperNode childResult = c.accept(this);
            funcNode.appendCmd((Cmd) this.aggregateResult(result, childResult));
        }

        //return super.visitFunc(ctx);
        return funcNode;
    }

    @Override
    public SuperNode visitParams(LangParser.ParamsContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Params paramsNode = new Params(line, column);

        SuperNode result = this.defaultResult();
        int n = ctx.param().size();
        for(int i = 0; i < n && this.shouldVisitNextChild(ctx, result); ++i) {
            ParseTree c = ctx.param(i);
            SuperNode childResult = c.accept(this);
            paramsNode.appendParam((Param) this.aggregateResult(result, childResult));
        }

        //return super.visitParams(ctx);
        return paramsNode;
    }

    @Override
    public SuperNode visitParam(LangParser.ParamContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();


        Type t = (Type) ctx.type().accept(this);
        Param paramNode = new Param(line, column,ctx.ID().getText(), t);
        //return super.visitParam(ctx);

        return paramNode;
    }

    @Override
    public SuperNode visitTypeArray(LangParser.TypeArrayContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Type t;
        TypeArray typeArrayNode;

        t = (Type) ctx.type().accept(this);

        if(t instanceof TypeArray)
            typeArrayNode = new TypeArray(line, column, ((TypeArray) t).btype,
                    ((TypeArray) t).arrayBrackets+"[]" ,
                    ((TypeArray) t).numBrackets + 1);
        else
            typeArrayNode = new TypeArray(line, column, ((TypeBtype) t), "", 0);


        //return super.visitTypeArray(ctx);
        return typeArrayNode;
    }

    @Override
    public SuperNode visitTypeBtype(LangParser.TypeBtypeContext ctx) {
        return super.visitTypeBtype(ctx);
    }

    @Override
    public SuperNode visitBtype(LangParser.BtypeContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        //if(!ctx.children.isEmpty())
        TerminalNode typeNode = (TerminalNode) ctx.getChild(0);
        TypeBtype tb = new TypeBtype(line, column, typeNode.getSymbol().getText());

        //return super.visitBtype(ctx);
        return tb;
    }

    @Override
    public SuperNode visitCmdList(LangParser.CmdListContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        CmdList cmdListNode = new CmdList(line, column);
        //List<SuperNode> resultList = new LinkedList<>();


        SuperNode result = this.defaultResult();
        int n = ctx.getChildCount();
        for(int i = 0; i < n && this.shouldVisitNextChild(ctx, result); ++i) {
            ParseTree c = ctx.getChild(i);
            SuperNode childResult = c.accept(this);
            cmdListNode.appendCmdList((Cmd) this.aggregateResult(result, childResult));
        }

        //return new Prog(line, column, resultList);
        return cmdListNode; //super.visitProg(ctx);
    }

    @Override
    public SuperNode visitCmdIf(LangParser.CmdIfContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Exp e = (Exp) ctx.exp().accept(this);
        Cmd c = (Cmd) ctx.cmd().accept(this);

        CmdIf cmdIf = new CmdIf(line, column, e, c);
        return cmdIf;
        //return super.visitCmdIf(ctx);
    }

    @Override
    public SuperNode visitCmdIfElse(LangParser.CmdIfElseContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Exp e = (Exp) ctx.exp().accept(this);
        Cmd cIf = (Cmd) ctx.cmd(0).accept(this);
        Cmd cElse = (Cmd) ctx.cmd(1).accept(this);

        CmdIf cmdIf = new CmdIf(line, column, e, cIf, cElse);
        return cmdIf;
        //return super.visitCmdIfElse(ctx);
    }

    @Override
    public SuperNode visitCmdIterate(LangParser.CmdIterateContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Exp e = (Exp) ctx.exp().accept(this);
        Cmd c = (Cmd) ctx.cmd().accept(this);

        CmdIterate cmdIter = new CmdIterate(line, column, e, c);
        return cmdIter;
        //return super.visitCmdIterate(ctx);
    }

    @Override
    public SuperNode visitCmdRead(LangParser.CmdReadContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Lvalue l = (Lvalue) ctx.lvalue().accept(this);

        CmdRead cmdRead = new CmdRead(line, column, l);
        return cmdRead;
        //return super.visitCmdRead(ctx);
    }

    @Override
    public SuperNode visitCmdPrint(LangParser.CmdPrintContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Exp e = (Exp) ctx.exp().accept(this);

        CmdPrint cmdPrint = new CmdPrint(line, column, e);
        return cmdPrint;

        //return super.visitCmdPrint(ctx);
    }

    @Override
    public SuperNode visitCmdReturn(LangParser.CmdReturnContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        //Exp e = (Exp) ctx.exp().accept(this);
        CmdReturn cmdReturn = new CmdReturn(line, column);

        SuperNode result = this.defaultResult();
        int n = ctx.exp().size();
        for(int i = 0; i < n && this.shouldVisitNextChild(ctx, result); ++i) {
            ParseTree c = ctx.exp(i);
            SuperNode childResult = c.accept(this);
            cmdReturn.appendReturnExp((Exp) this.aggregateResult(result, childResult));
        }

        return cmdReturn;
        //return super.visitCmdReturn(ctx);
    }

    @Override
    public SuperNode visitCmdAssign(LangParser.CmdAssignContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Exp e = (Exp) ctx.exp().accept(this);
        Lvalue l = (Lvalue) ctx.lvalue().accept(this);
        CmdAssign cmdAssign = new CmdAssign(line, column, l, e);

        return cmdAssign;
        //return super.visitCmdAssign(ctx);
    }

    @Override
    public SuperNode visitCmdFunctionCall(LangParser.CmdFunctionCallContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        CmdFunctionCall funcNode = new CmdFunctionCall(line, column, ctx.ID().getText());

        if(ctx.exps() != null){
            Exps exps = (Exps) ctx.exps().accept(this);
            funcNode.setExps(exps.getExpList());
        }


        SuperNode result = this.defaultResult();
        int n = ctx.lvalue().size();
        for(int i = 0; i < n && this.shouldVisitNextChild(ctx, result); ++i) {
            ParseTree c = ctx.lvalue(i);
            SuperNode childResult = c.accept(this);
            funcNode.appendLvalue((Lvalue) this.aggregateResult(result, childResult));
        }

        return funcNode;

        //return super.visitCmdFunctionCall(ctx);
    }

    @Override
    public SuperNode visitExpAnd(LangParser.ExpAndContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Exp left = (Exp) ctx.exp(0).accept(this);
        Exp right = (Exp) ctx.exp(1).accept(this);
        ExpAnd andNode = new ExpAnd(line, column, left, right);
        return andNode;

        //return super.visitExpAnd(ctx);
    }

    @Override
    public SuperNode visitExpRexp(LangParser.ExpRexpContext ctx) {

        return super.visitExpRexp(ctx);
    }

    @Override
    public SuperNode visitExpNotEq(LangParser.ExpNotEqContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Rexp left = (Rexp) ctx.rexp().accept(this);
        Aexp right = (Aexp) ctx.aexp().accept(this);
        RexpNotEq notEqNode = new RexpNotEq(line, column, left, right);
        return notEqNode;

        //return super.visitExpNotEq(ctx);
    }

    @Override
    public SuperNode visitExpEqEq(LangParser.ExpEqEqContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Rexp left = (Rexp) ctx.rexp().accept(this);
        Aexp right = (Aexp) ctx.aexp().accept(this);
        RexpEq eqNode = new RexpEq(line, column, left, right);
        return eqNode;

        //return super.visitExpEqEq(ctx);
    }

    @Override
    public SuperNode visitRexpAexp(LangParser.RexpAexpContext ctx) {
        return super.visitRexpAexp(ctx);
    }

    @Override
    public SuperNode visitExpLess(LangParser.ExpLessContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Aexp left = (Aexp) ctx.aexp(0).accept(this);
        Aexp right = (Aexp) ctx.aexp(1).accept(this);
        RexpLess lessNode = new RexpLess(line, column, left, right);
        return lessNode;
        //return super.visitExpLess(ctx);
    }

    @Override
    public SuperNode visitAexpMexp(LangParser.AexpMexpContext ctx) {
        return super.visitAexpMexp(ctx);
    }

    @Override
    public SuperNode visitExpSub(LangParser.ExpSubContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Aexp left = (Aexp) ctx.aexp().accept(this);
        Mexp right = (Mexp) ctx.mexp().accept(this);
        AexpOp opNode = new AexpOp(line, column, left, right, "-");
        return opNode;

        //return super.visitExpSub(ctx);
    }

    @Override
    public SuperNode visitExpPlus(LangParser.ExpPlusContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Aexp left = (Aexp) ctx.aexp().accept(this);
        Mexp right = (Mexp) ctx.mexp().accept(this);
        AexpOp opNode = new AexpOp(line, column, left, right, "+");
        return opNode;
        //return super.visitExpPlus(ctx);
    }

    @Override
    public SuperNode visitMexpSexp(LangParser.MexpSexpContext ctx) {
        return super.visitMexpSexp(ctx);
    }

    @Override
    public SuperNode visitExpMult(LangParser.ExpMultContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Mexp left = (Mexp) ctx.mexp().accept(this);
        Sexp right = (Sexp) ctx.sexp().accept(this);

        MexpOp opNode = new MexpOp(line, column, left, right, "*");
        return opNode;

        //return super.visitExpMult(ctx);
    }



    @Override
    public SuperNode visitExpDiv(LangParser.ExpDivContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Mexp left = (Mexp) ctx.mexp().accept(this);
        Sexp right = (Sexp) ctx.sexp().accept(this);

        MexpOp opNode = new MexpOp(line, column, left, right, "/");
        return opNode;

        //return super.visitExpDiv(ctx);
    }

    @Override
    public SuperNode visitExpMod(LangParser.ExpModContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Mexp left = (Mexp) ctx.mexp().accept(this);
        Sexp right = (Sexp) ctx.sexp().accept(this);

        MexpOp opNode = new MexpOp(line, column, left, right, "%");
        return opNode;

        //return super.visitExpMod(ctx);
    }

    @Override
    public SuperNode visitSexpPexp(LangParser.SexpPexpContext ctx) {
        return super.visitSexpPexp(ctx);
    }

    @Override
    public SuperNode visitExpNot(LangParser.ExpNotContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Sexp node = (Sexp) ctx.sexp().accept(this);

        SexpOp opNode = new SexpOp(line, column, node, "!");
        return opNode;
        //return super.visitExpNot(ctx);
    }

    @Override
    public SuperNode visitExpMinus(LangParser.ExpMinusContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Sexp node = (Sexp) ctx.sexp().accept(this);

        SexpOp opNode = new SexpOp(line, column, node, "-");
        return opNode;

        //return super.visitExpMinus(ctx);
    }

    @Override
    public SuperNode visitLiteralTrue(LangParser.LiteralTrueContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        SexpLiteral litNode = new SexpLiteral(line, column, Boolean.valueOf(ctx.TRUE().getText()));
        return litNode;

        //return super.visitLiteralTrue(ctx);
    }

    @Override
    public SuperNode visitLiteralFalse(LangParser.LiteralFalseContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        SexpLiteral litNode = new SexpLiteral(line, column, Boolean.valueOf(ctx.FALSE().getText()));
        return litNode;
        //return super.visitLiteralFalse(ctx);
    }

    @Override
    public SuperNode visitLiteralNull(LangParser.LiteralNullContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        SexpLiteral litNode = new SexpLiteral(line, column, null);
        return litNode;
        //return super.visitLiteralNull(ctx);
    }

    @Override
    public SuperNode visitLiteralInt(LangParser.LiteralIntContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        SexpLiteral litNode = new SexpLiteral(line, column, Integer.valueOf(ctx.LITERAL_INT().getText()));
        return litNode;

        //return super.visitLiteralInt(ctx);
    }

    @Override
    public SuperNode visitLiteralFloat(LangParser.LiteralFloatContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        SexpLiteral litNode = new SexpLiteral(line, column, Float.valueOf(ctx.LITERAL_FLOAT().getText()));
        return litNode;
        //return super.visitLiteralFloat(ctx);
    }

    @Override
    public SuperNode visitLiteralChar(LangParser.LiteralCharContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        SexpLiteral litNode = new SexpLiteral(line, column, ctx.LITERAL_CHAR().getText());
        return litNode;
        //return super.visitLiteralChar(ctx);
    }

    @Override
    public SuperNode visitPexpLvalue(LangParser.PexpLvalueContext ctx) {
        return super.visitPexpLvalue(ctx);
    }

    @Override
    public SuperNode visitExpParenthesis(LangParser.ExpParenthesisContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Exp e = (Exp) ctx.exp().accept(this);
        PexpParenthesis node = new PexpParenthesis(line, column, e);
        return node;
        //return super.visitExpParenthesis(ctx);
    }

    @Override
    public SuperNode visitExpNew(LangParser.ExpNewContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Type t = (Type)  ctx.type().accept(this);
        Exp e = null;
        if(ctx.exp()!= null) {
            e = (Exp) ctx.exp().accept(this);
        }
        PexpNew node = new PexpNew(line, column, t, e);
        return node;
        //return super.visitExpNew(ctx);
    }

    @Override
    public SuperNode visitExpFunctionCall(LangParser.ExpFunctionCallContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Exp e = (Exp) ctx.exp().accept(this);
        PexpFunctionCall node = new PexpFunctionCall(line, column, ctx.ID().getText(), e);

        if(ctx.exps() != null) {
            Exps exps = (Exps) ctx.exps().accept(this);
            node.setArgExps(exps.getExpList());
        }

        return node;
        //return super.visitExpFunctionCall(ctx);
    }

    @Override
    public SuperNode visitLvalueSelect(LangParser.LvalueSelectContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        Lvalue l = (Lvalue) ctx.lvalue().accept(this);

        LvalueSelect node = new LvalueSelect(line, column, l, ctx.ID().getText());

        return node;
        //return super.visitLvalueSelect(ctx);
    }

    @Override
    public SuperNode visitLvalueArray(LangParser.LvalueArrayContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Lvalue l = (Lvalue) ctx.lvalue().accept(this);
        Exp e = (Exp) ctx.exp().accept(this);
        LvalueArray node = new LvalueArray(line, column, l, e);

        return node;
        //return super.visitLvalueArray(ctx);
    }

    @Override
    public SuperNode visitLvalueId(LangParser.LvalueIdContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        LvalueID node = new LvalueID(line, column, ctx.ID().getText());
        return node;
        //return super.visitLvalueId(ctx);
    }

    @Override
    public SuperNode visitExps(LangParser.ExpsContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        Exps node = new Exps(line, column);
        //List<SuperNode> resultList = new LinkedList<>();


        SuperNode result = this.defaultResult();
        int n = ctx.exp().size();
        for(int i = 0; i < n && this.shouldVisitNextChild(ctx, result); ++i) {
            ParseTree c = ctx.exp(i);
            SuperNode childResult = c.accept(this);
            node.appendExp((Exp) this.aggregateResult(result, childResult));
        }
        return node;
        //return super.visitExps(ctx);
    }
}
