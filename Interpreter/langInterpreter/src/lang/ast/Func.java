/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Func extends Node {
    public String funcId;
    public String funcIdTypes;
    public List<Param> paramList;
    public List<Type> returnTypeList;
    public List<Cmd> functionCmds;

    public Func(int line, int column,String funcId) {
        super(line, column);
        this.funcId = funcId;
        this.functionCmds = new LinkedList<>();
        this.returnTypeList = new LinkedList<>();
        this.paramList = new LinkedList<>();
        this.funcIdTypes = "";
    }

    public void setParams(List<Param> p){
        paramList = p;
    }

    public void appendParam(Param p){
        paramList.add(p);
    }

    public void appendReturn(Type t){
        returnTypeList.add(t);
    }

    public void appendCmd(Cmd c){
        functionCmds.add(c);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Func)) return false;
        Func func = (Func) o;
        return funcId.equals(func.funcId) &&
                paramList.equals(func.paramList) &&
                returnTypeList.equals(func.returnTypeList) &&
                functionCmds.equals(func.functionCmds);
    }

    @Override
    public int hashCode() {
        String types = "";
        for(Param p: paramList){
            types += p.paramType.toString();
        }
        //paramList.toArray()
        return Objects.hash(funcId, types);
    }
}
