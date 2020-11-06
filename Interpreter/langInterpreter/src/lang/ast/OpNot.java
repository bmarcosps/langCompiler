package lang.ast;

import lang.parser.Visitor;

public class OpNot extends UnOp  {
    public OpNot(int line, int column, Exp right) {
        super(line, column, right);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
