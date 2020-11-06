package lang.ast;

import lang.parser.Visitor;

public class TypeInt extends Type {
    public TypeInt(int line, int column) {
        super(line, column);
    }

    public boolean match(Type t){
        return t instanceof TypeInt;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
