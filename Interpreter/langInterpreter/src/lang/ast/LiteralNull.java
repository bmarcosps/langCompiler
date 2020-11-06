package lang.ast;

import lang.parser.Visitor;

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
