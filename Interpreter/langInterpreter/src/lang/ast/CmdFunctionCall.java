/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

public class CmdFunctionCall extends Cmd {
    public String funcId;
    public String funcIdTypes;
    public List<Exp> exps;
    public List<Lvalue> lvals;

    public CmdFunctionCall(int line, int column, String funcId) {
        super(line, column);
        this.exps = new LinkedList<>();
        this.lvals = new LinkedList<>();

        this.funcId = funcId;
        this.funcIdTypes = "";
        //this.exps = exps;
        //this.lvals = lvals;
    }

    public void appendExps(Exp e){
        exps.add(e);
    }

    public void appendLvalue(Lvalue l){
        lvals.add(l);
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public void setExps(List<Exp> exps) {
        this.exps = exps;
    }

    public void setLvals(List<Lvalue> lvals) {
        this.lvals = lvals;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
