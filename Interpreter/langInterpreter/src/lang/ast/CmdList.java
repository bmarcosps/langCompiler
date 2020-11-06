/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.parser.Visitor;

import java.util.LinkedList;
import java.util.List;

public class CmdList extends Cmd {
    public List<Cmd> cmdList;

    public CmdList(int line, int column) {
        super(line, column);
        this.cmdList = new LinkedList<>();
    }

    public void appendCmdList(Cmd cmd) {
        this.cmdList.add(cmd);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
