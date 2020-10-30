/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class PexpNew extends Pexp {
    public Type newType;
    public Exp newExp;

    public PexpNew(int line, int column, Type newType, Exp newExp) {
        super(line, column);
        this.newType = newType;
        this.newExp = newExp;
    }




}
