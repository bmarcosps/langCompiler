/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.visitor.Visitor;

public class CmdIterate extends Cmd {
    public Exp testExp;
    public Cmd itrCmd;

    public CmdIterate(int line, int column, Exp testExp, Cmd itrCmd) {
        super(line, column);
        this.testExp = testExp;
        this.itrCmd = itrCmd;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
