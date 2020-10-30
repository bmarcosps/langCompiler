/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class PexpParenthesis extends Pexp {
    public Exp expPar;

    public PexpParenthesis(int line, int column, Exp expPar) {
        super(line, column);
        this.expPar = expPar;
    }
}
