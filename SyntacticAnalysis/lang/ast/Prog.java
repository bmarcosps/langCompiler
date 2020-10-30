/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import java.util.LinkedList;
import java.util.List;

public class Prog extends Node {
    List<Node> dataFunc;

    public Prog(int line, int column) {
        super(line, column);
        this.dataFunc = new LinkedList<>();
    }

    public Prog(int line, int column, List<Node> dataFunc) {
        super(line, column);
        this.dataFunc = new LinkedList<>();
        this.dataFunc = dataFunc;
    }

    public void appendDataFunc(Node dataFuncNode){
        dataFunc.add(dataFuncNode);
    }
}
