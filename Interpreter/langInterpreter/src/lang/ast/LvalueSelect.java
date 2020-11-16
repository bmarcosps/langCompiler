/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.visitor.Visitor;

public class LvalueSelect extends Lvalue {
    public String selectorID;

    public LvalueSelect(int line, int column, String selectorID) {
        super(line, column);
        this.selectorID = selectorID;
    }

    @Override
    public String toString() {
        return "." + selectorID;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
