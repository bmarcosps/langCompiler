/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class LvalueArray extends Lvalue {

    public Lvalue val;
    public Exp selectorExp;

    public LvalueArray(int line, int column, Lvalue val, Exp selectorExp) {
        super(line, column);
        this.val = val;
        this.selectorExp = selectorExp;
    }
}
