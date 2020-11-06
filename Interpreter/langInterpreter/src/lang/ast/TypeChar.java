package lang.ast;

import lang.parser.Visitor;

public class TypeChar extends Type {
    public TypeChar(int line, int column) {
        super(line, column);
    }

    public boolean match(Type t){
        return t instanceof TypeChar;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
