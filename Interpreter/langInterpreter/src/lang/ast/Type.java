/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public abstract class Type extends Node {
    //public String btype;
    /* Alterar para salvar só a sequencia de [] */
    //public Node type;

    public Type(int line, int column) {
        super(line, column);
    }

    public abstract boolean match(Type t);
}
