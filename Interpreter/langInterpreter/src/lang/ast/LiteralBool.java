package lang.ast;

import lang.parser.Visitor;

public class LiteralBool  extends Exp {

    private boolean val;

    public LiteralBool(int line, int column, boolean i) {
        super(line, column);
        val = i;
    }

    public boolean getValue(){ return val;}

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}