package lang.ast;

import lang.visitor.Visitor;

public class TypeData extends Type {
    public String typeString;

    public TypeData(int line, int column, String typeString) {
        super(line, column);
        this.typeString = typeString;
    }
    @Override
    public String toString() {
        return "Data";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public boolean match(Type t){
        return t instanceof TypeData;
    }
}

