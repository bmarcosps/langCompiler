package lang.ast;

import lang.parser.Visitor;

public class TypeBool extends Type {
    public TypeBool(int line, int column) {
        super(line, column);
    }

    public boolean match(Type t){
        return t instanceof TypeBool;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}