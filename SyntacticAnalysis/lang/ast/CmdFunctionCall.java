/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import java.util.LinkedList;
import java.util.List;

public class CmdFunctionCall extends Cmd {
    public String funcId;
    public List<Exp> exps;
    /** TODO: change to lvalue */
    public List<Lvalue> lvals;

    public CmdFunctionCall(int line, int column, String funcId) {
        super(line, column);
        this.exps = new LinkedList<>();
        this.lvals = new LinkedList<>();

        this.funcId = funcId;
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
}
