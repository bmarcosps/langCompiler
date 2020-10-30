/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import org.antlr.v4.runtime.misc.Pair;

import java.util.LinkedList;
import java.util.List;

public class Exps extends Exp {
    List<Exp> expList;

    public Exps(int line, int column ) {
        super(line, column);
        this.expList = new LinkedList<>();
    }

    public void appendExp(Exp p) {
        this.expList.add(p);
    }

    public List<Exp> getExpList() {
        return expList;
    }
}