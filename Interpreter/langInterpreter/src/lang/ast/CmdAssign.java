/*
    Bruno Marcos Pinheiro da Silva
    201565552AC

    Seany Caroliny Oliveira Silva
    201665566C
*/
package lang.ast;

import lang.visitor.Visitor;

public class CmdAssign extends Cmd {
    private LvalueID lval;
    private Exp valExp;

    public CmdAssign(int line, int column, LvalueID lval, Exp valExp) {
        super(line, column);
        this.setLval(lval);
        this.setValExp(valExp);
    }

    public LvalueID getLval() {
        return lval;
    }

    public void setLval(LvalueID lval) {
        this.lval = lval;
    }

    public Exp getValExp() {
        return valExp;
    }

    public void setValExp(Exp valExp) {
        this.valExp = valExp;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
