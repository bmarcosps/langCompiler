/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;


public class RexpLess extends Rexp  {
    public Aexp left;
    public Aexp right;

    public RexpLess(int line, int column, Aexp left, Aexp right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    public void setLeft(Aexp e){  left = e; }
    public void setRight(Aexp e){ right = e; }

    public Exp getLeft(){ return left;}
    public Exp getRight(){ return right;}


}
