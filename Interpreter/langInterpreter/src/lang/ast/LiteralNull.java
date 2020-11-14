package lang.ast;

import lang.visitor.Visitor;

public class LiteralNull extends Exp {

    public LiteralNull(int line, int column) {
        super(line, column);
    }

    public Object getValue(){ return null;}

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
