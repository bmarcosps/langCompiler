/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

public class Params extends Node {
    List<Param> paramList;

    public Params(int line, int column ) {
        super(line, column);
        this.paramList = new LinkedList<>();
    }

    public void appendParam(Param p) {
        this.paramList.add(p);
    }

    public List<Param> getParamList() {
        return paramList;
    }

    @Override
    public void accept(Visitor v) {
        //v.visit(this);
    }
}