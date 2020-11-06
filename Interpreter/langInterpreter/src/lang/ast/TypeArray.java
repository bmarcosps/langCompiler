/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import lang.parser.Visitor;

public class TypeArray extends Type {
    private Type argType;

    public TypeArray(int line, int column, Type t){
        super(line, column);
        argType = t;
    }

    public Type getTyArg(){
        return argType;
    }

    public boolean match(Type t){
        if(t instanceof TypeArray){
            return argType.match(((TypeArray)t).getTyArg());
        }
        return false;
    }

    public void accept(Visitor v){ v.visit(this);}
}
