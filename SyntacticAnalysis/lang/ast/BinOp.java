/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class BinOp extends Exp {

    public Exp left;
    public Exp right;

    public BinOp(int line, int column, Exp left, Exp right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    public void setLeft(Exp e){  left = e; }
    public void setRight(Exp e){ right = e; }

    public Exp getLeft(){ return left;}
    public Exp getRight(){ return right;}


}
