/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.parser.Visitor;

public class CmdRead extends Cmd {
    public LvalueID lval;

    public CmdRead(int line, int column, LvalueID lval) {
        super(line, column);
        this.lval = lval;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
