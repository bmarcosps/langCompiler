/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;


import lang.visitor.Visitor;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Param param = (Param) o;
        return paramId.equals(param.paramId) &&
                paramType.equals(param.paramType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramId, paramType);
    }
}



