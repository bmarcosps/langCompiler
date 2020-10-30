/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class CmdAssign extends Cmd {
    /** TODO: change to lvalue*/
    public Lvalue lval;
    public Exp valExp;

    public CmdAssign(int line, int column, Lvalue lval, Exp valExp) {
        super(line, column);
        this.lval = lval;
        this.valExp = valExp;
    }
}
