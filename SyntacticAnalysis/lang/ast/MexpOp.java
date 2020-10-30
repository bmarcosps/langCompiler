/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;
// * / %
public class MexpOp extends Mexp {
    public Mexp left;
    public Sexp right;
    public String op;

    public MexpOp(int line, int column, Mexp left, Sexp right, String op) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.op = op;
    }

    public void setLeft(Mexp e){  left = e; }
    public void setRight(Sexp e){ right = e; }

    public Exp getLeft(){ return left;}
    public Exp getRight(){ return right;}
}
