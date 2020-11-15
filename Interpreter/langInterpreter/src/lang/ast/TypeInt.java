package lang.ast;

import lang.visitor.Visitor;

public class TypeInt extends Type {
    public TypeInt(int line, int column) {
        super(line, column);
    }

    public boolean match(Type t){
        return t instanceof TypeInt;
    }
    @Override
    public String toString() {
        return "Int";
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
