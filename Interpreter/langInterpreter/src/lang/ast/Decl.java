/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.visitor.Visitor;

public class Decl extends Node{
    public String id;
    public Type type;

    public Decl(int line, int column, String id, Type type) {
        super(line, column);
        this.id = id;
        this.type = type;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
