/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;


import lang.visitor.Visitor;

public class Param extends Node {
    public String paramId;
    public Type paramType;

    public Param(int line, int column, String paramId, Type paramType) {
        super(line, column);
        this.paramId = paramId;
        this.paramType = paramType;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}



