package lang.visitor;

import lang.ast.*;
public abstract  class  Visitor {
    public abstract void visit(Prog p);

    public abstract void visit(Data d);

    public abstract void visit(Param p);

    public abstract void visit(Func f);

    public abstract void visit(TypeArray t);
    public abstract void visit(TypeData t);
    public abstract void visit(TypeInt t);
    public abstract void visit(TypeFloat t);
    public abstract void visit(TypeChar t);
    public abstract void visit(TypeBool t);


    /*
    public abstract void visit(TyInt t);
    public abstract void visit(TyFloat t);
    public abstract void visit(TyBool t);
    public abstract void visit(TyArr t);
    */


    public abstract void visit(CmdList e);
    public abstract void visit(CmdIf e); //if and ifelse
    public abstract void visit(CmdIterate e);
    public abstract void visit(CmdRead e);
    public abstract void visit(CmdPrint e);
    public abstract void visit(CmdReturn e);
    public abstract void visit(CmdAssign e);
    public abstract void visit(CmdFunctionCall e);

    public abstract void visit(OpAnd e);
    public abstract void visit(OpLess e);
    public abstract void visit(OpEq e);
    public abstract void visit(OpNotEq e);

    public abstract void visit(OpSum e);
    public abstract void visit(OpSub e);
    public abstract void visit(OpMul e);
    public abstract void visit(OpDiv e);
    public abstract void visit(OpMod e);

    public abstract void visit(OpNot e);
    public abstract void visit(OpMin e);


    public abstract void visit(ExpNew e);
    public abstract void visit(ExpFunctionCall e);

    //vars
    public abstract void visit(LvalueID e);

    public abstract void visit(LvalueSelect e);
    public abstract void visit(LvalueArray e);

    public abstract void visit(LiteralBool e);
    public abstract void visit(LiteralChar e);
    public abstract void visit(LiteralFloat e);
    public abstract void visit(LiteralInt e);
    public abstract void visit(LiteralNull e);



/*
    public abstract void visit(True e);
    public abstract void visit(False e);
    public abstract void visit(NInt e);
    public abstract void visit(NFloat e);
    public abstract void visit(Var e);
*/


}
