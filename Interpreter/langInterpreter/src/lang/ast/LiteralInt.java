package lang.ast;

import lang.visitor.Visitor;

public class LiteralInt extends Exp {

    private int val;

    public LiteralInt(int line, int column, int i) {
        super(line, column);
        val = i;
    }

    public int getValue(){ return val;}

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}