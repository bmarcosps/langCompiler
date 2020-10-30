/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class RexpNotEq extends Rexp  {
    public Rexp left;
    public Aexp right;

    public RexpNotEq(int line, int column, Rexp left, Aexp right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    public void setLeft(Rexp e){  left = e; }
    public void setRight(Aexp e){ right = e; }

    public Exp getLeft(){ return left;}
    public Exp getRight(){ return right;}


}
