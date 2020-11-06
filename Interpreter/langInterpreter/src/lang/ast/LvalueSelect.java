/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.parser.Visitor;

public class LvalueSelect extends Lvalue {
    public Lvalue val;
    public String selectorID;

    public LvalueSelect(int line, int column, Lvalue val, String selectorID) {
        super(line, column);
        this.val = val;
        this.selectorID = selectorID;
    }

    public LvalueSelect(int line, int column, String selectorID) {
        super(line, column);
        this.selectorID = selectorID;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
