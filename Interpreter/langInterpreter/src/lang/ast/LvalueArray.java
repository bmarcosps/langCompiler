/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.parser.Visitor;

public class LvalueArray extends Lvalue {

    public Lvalue val;
    public Exp selectorExp;

    public LvalueArray(int line, int column, Lvalue val, Exp selectorExp) {
        super(line, column);
        this.val = val;
        this.selectorExp = selectorExp;
    }

    public LvalueArray(int line, int column, Exp selectorExp) {
        super(line, column);
        this.selectorExp = selectorExp;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}