/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class TypeArray extends Type {
    public TypeBtype btype;
    public int numBrackets;
    public String arrayBrackets;

    public TypeArray(int line, int column, TypeBtype btype, String arrayBrackets, int numBrackets) {
        super(line, column);
        this.btype = btype;
        this.arrayBrackets = arrayBrackets;
        this.numBrackets = numBrackets;
    }
}
