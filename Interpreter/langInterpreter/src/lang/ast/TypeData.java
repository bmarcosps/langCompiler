package lang.ast;

import lang.parser.Visitor;

public class TypeData extends Type {
    public String typeString;

    public TypeData(int line, int column, String typeString) {
        super(line, column);
        this.typeString = typeString;
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

