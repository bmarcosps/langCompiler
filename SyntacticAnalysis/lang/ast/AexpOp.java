/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

// + -
public class AexpOp extends Aexp  {
    public Aexp left;
    public Mexp right;
    public String op;

    public AexpOp(int line, int column, Aexp left, Mexp right, String op) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.op = op;
    }

    public void setLeft(Aexp e){  left = e; }
    public void setRight(Mexp e){ right = e; }

    public Exp getLeft(){ return left;}
    public Exp getRight(){ return right;}


}
