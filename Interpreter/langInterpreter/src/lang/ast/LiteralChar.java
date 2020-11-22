package lang.ast;

import lang.visitor.Visitor;

public class LiteralChar extends Exp {

    private String val;
    private boolean escaped;

    public LiteralChar(int line, int column, String i, boolean escaped) {
        super(line, column);
        val = i;
        this.escaped = escaped;
    }

    public char[] getValue(){
        if(escaped){
            char[] aux =  val.toCharArray();
            return aux;
        } else {
            return val.toCharArray();
        }

    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}