/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

public class CmdReturn extends Cmd {
    public List<Exp> returnExp;

    public CmdReturn(int line, int column) {
        super(line, column);
        this.returnExp = new LinkedList<>();
    }

    public void appendReturnExp(Exp e){
        returnExp.add(e);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
