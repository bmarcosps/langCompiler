package lang.ast;

import lang.visitor.Visitor;

public class OpSum  extends BinOp {
    public OpSum(int line, int column, Exp left, Exp right) {
        super(line, column, left, right);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
