/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class LvalueID extends Lvalue {
    String id;

    public LvalueID(int line, int column, String id) {
        super(line, column);
        this.id = id;
    }

}
