package lang.ast;

public abstract class UnOp extends Exp {

    public Exp right;

    public UnOp(int line, int column, Exp right) {
        super(line, column);
        this.right = right;
    }

    public void setRight(Exp e){ right = e; }

    public Exp getRight(){ return right;}
}
