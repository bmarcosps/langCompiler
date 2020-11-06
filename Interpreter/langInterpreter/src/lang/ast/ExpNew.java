/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.parser.Visitor;

public class ExpNew extends Exp {
    public Type newType;
    public Exp newExp;

    public ExpNew(int line, int column, Type newType, Exp newExp) {
        super(line, column);
        this.newType = newType;
        this.newExp = newExp;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }


}
