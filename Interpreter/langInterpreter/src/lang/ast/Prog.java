/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

public class Prog extends Node {
    private List<Data> datas;
    private List<Func> funcs;

    public Prog(int line, int column) {
        super(line, column);
        this.datas = new LinkedList<>();
        this.funcs = new LinkedList<>();
    }

    public void appendData(Data dataNode){
        datas.add(dataNode);
    }
    public void appendFunc(Func funcNode){
        funcs.add(funcNode);
    }

    public List<Data> getDatas() {
        return datas;
    }

    public List<Func> getFuncs() {
        return funcs;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
