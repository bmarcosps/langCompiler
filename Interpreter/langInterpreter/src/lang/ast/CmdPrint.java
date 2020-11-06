/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.parser.Visitor;

public class CmdPrint extends Cmd {
    public Exp printExp;

    public CmdPrint(int line, int column, Exp printExp) {
        super(line, column);
        this.printExp = printExp;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
