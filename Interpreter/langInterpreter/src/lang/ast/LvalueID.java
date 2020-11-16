/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.visitor.Visitor;

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
    public String toString() {
        String str = id;
        for(Lvalue v: selectors){
            str += v.toString();
        }
        return str;

    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }



}
