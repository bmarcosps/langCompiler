/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.parser.Visitor;

import java.util.LinkedList;
import java.util.List;

public class Prog extends Node {
    private List<Node> dataFunc;
    private List<Data> datas;
    private List<Func> funcs;

    public Prog(int line, int column) {
        super(line, column);
        this.dataFunc = new LinkedList<>();
        this.datas = new LinkedList<>();
        this.funcs = new LinkedList<>();
    }

    public Prog(int line, int column, List<Node> dataFunc) {
        super(line, column);
        this.dataFunc = new LinkedList<>();
        this.dataFunc = dataFunc;
    }

    public void appendDataFunc(Node dataFuncNode){
        dataFunc.add(dataFuncNode);
    }
    public void appendData(Data dataNode){
        datas.add(dataNode);
    }
    public void appendFunc(Func funcNode){
        funcs.add(funcNode);
    }

    public List<Node> getDataFunc() {
        return dataFunc;
    }

    public void setDataFunc(List<Node> dataFunc) {
        this.dataFunc = dataFunc;
    }

    public List<Data> getDatas() {
        return datas;
    }

    public void setDatas(List<Data> datas) {
        this.datas = datas;
    }

    public List<Func> getFuncs() {
        return funcs;
    }

    public void setFuncs(List<Func> funcs) {
        this.funcs = funcs;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
