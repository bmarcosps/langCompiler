/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class SexpLiteral extends Sexp {
    public Object literal;

    public SexpLiteral(int line, int column, Object literal) {
        super(line, column);
        this.literal = literal;
    }
}
