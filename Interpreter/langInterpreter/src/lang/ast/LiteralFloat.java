package lang.ast;

import lang.parser.Visitor;

public class LiteralFloat extends Exp {

    private float val;

    public LiteralFloat(int line, int column, float i) {
        super(line, column);
        val = i;
    }

    public float getValue(){ return val;}

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}