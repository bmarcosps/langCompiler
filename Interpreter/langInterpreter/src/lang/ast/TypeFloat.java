package lang.ast;

import lang.parser.Visitor;

public class TypeFloat extends Type {
    public TypeFloat(int line, int column) {
        super(line, column);
    }

    public boolean match(Type t){
        return t instanceof TypeFloat;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}