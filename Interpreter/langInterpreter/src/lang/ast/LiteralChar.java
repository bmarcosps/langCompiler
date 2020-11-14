package lang.ast;

import lang.visitor.Visitor;

public class LiteralChar extends Exp {

    private char val;

    public LiteralChar(int line, int column, char i) {
        super(line, column);
        val = i;
    }

    public char getValue(){ return val;}

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}