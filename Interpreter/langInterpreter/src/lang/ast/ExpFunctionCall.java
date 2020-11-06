/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.parser.Visitor;

import java.util.LinkedList;
import java.util.List;

public class ExpFunctionCall extends Exp {
    public String funcId;
    public List<Exp> argExps;
    public Exp selectorExp;

    public ExpFunctionCall(int line, int column, String funcId, List<Exp> argExps, Exp selectorExp) {
        super(line, column);
        this.funcId = funcId;
        this.argExps = argExps;
        this.selectorExp = selectorExp;
    }

    public ExpFunctionCall(int line, int column, String funcId, Exp selectorExp) {
        super(line, column);
        this.funcId = funcId;
        this.argExps = new LinkedList<>();
        this.selectorExp = selectorExp;
    }

    public void setArgExps(List<Exp> argExps) {
        this.argExps = argExps;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
