/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class CmdRead extends Cmd {
    /** TODO: change to lvalue*/
    public Lvalue lval;

    public CmdRead(int line, int column, Lvalue lval) {
        super(line, column);
        this.lval = lval;
    }

}
