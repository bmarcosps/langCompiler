/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class TypeBtype extends Type {
    public String typeString;

    public TypeBtype(int line, int column, String typeString) {
        super(line, column);
        this.typeString = typeString;
    }
}
