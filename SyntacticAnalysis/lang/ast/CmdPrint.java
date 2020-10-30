/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class CmdPrint extends Cmd {
    public Exp printExp;

    public CmdPrint(int line, int column, Exp printExp) {
        super(line, column);
        this.printExp = printExp;
    }
}
