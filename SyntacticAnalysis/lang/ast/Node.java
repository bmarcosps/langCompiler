/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class Node extends SuperNode {
    int line, column;

    public Node(int line, int column){
        this.line = line;
        this.column = column;
    }
    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}

