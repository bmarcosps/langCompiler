/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.parser.Visitor;

import java.util.LinkedList;
import java.util.List;

public class LvalueID extends Lvalue {
    public String id;
    public List<Lvalue> selectors;

    public LvalueID(int line, int column, String id) {
        super(line, column);
        this.id = id;
        this.selectors = new LinkedList<>();
    }

    public void appendSelector(Lvalue s){
        selectors.add(s);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }



}
