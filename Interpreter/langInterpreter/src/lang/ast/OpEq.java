package lang.ast;

import lang.visitor.Visitor;

public class OpEq extends BinOp {
    public OpEq(int line, int column, Exp left, Exp right) {
        super(line, column, left, right);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
