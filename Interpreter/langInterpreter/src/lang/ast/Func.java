/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

public class Func extends Node {
    public String funcId;
    public List<Param> paramList;
    public List<Type> returnTypeList;
    public List<Cmd> functionCmds;

    public Func(int line, int column,String funcId) {
        super(line, column);
        this.funcId = funcId;
        this.functionCmds = new LinkedList<>();
        this.returnTypeList = new LinkedList<>();
        this.paramList = new LinkedList<>();
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

}
