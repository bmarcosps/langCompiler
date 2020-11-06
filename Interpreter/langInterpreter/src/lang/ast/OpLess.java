package lang.ast;

import lang.parser.Visitor;

public class OpLess extends BinOp {
    public OpLess(int line, int column, Exp left, Exp right) {
        super(line, column, left, right);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
