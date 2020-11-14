package lang.ast;

import lang.visitor.Visitor;

public class OpSub  extends BinOp {
    public OpSub(int line, int column, Exp left, Exp right) {
        super(line, column, left, right);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
