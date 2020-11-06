package lang.ast;

import lang.parser.Visitor;

public class OpAnd extends BinOp{
    public OpAnd(int line, int column, Exp left, Exp right) {
        super(line, column, left, right);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
