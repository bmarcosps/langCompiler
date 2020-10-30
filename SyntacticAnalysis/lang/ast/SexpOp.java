/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

// + - literais
public class SexpOp extends Sexp {
    public Sexp sexpNode;
    public String op;

    public SexpOp(int line, int column, Sexp sexpNode, String op) {
        super(line, column);
        this.sexpNode = sexpNode;
        this.op = op;
    }

    public void setSexpNode(Sexp e){ sexpNode = e; }

    public Exp getSexpNode(){ return sexpNode;}
}
