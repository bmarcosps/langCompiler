/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public class CmdIf extends Cmd {

    public Exp testExp;
    public Cmd thenNode;
    public Cmd elseNode;


    public CmdIf(int line, int column, Exp testExp, Cmd thenNode, Cmd elseNode) {
        super(line, column);
        this.testExp = testExp;
        this.thenNode = thenNode;
        this.elseNode = elseNode;
    }

    public CmdIf(int line, int column, Exp testExp, Cmd thenNode) {
        super(line, column);
        this.testExp = testExp;
        this.thenNode = thenNode;
    }

/*
    public String toString(){
        String s = teste.toString();
        String sthn =  thn.toString();
        String sels =  els != null ? " : " + els.toString(): "" ;
        s += " ? [" + sthn + sels + "]";
        return  s.replace('\n', '\0');
    }
*/
    /*
    public int interpret(HashMap<String,Integer> m){
        int n =  teste.interpret(m);
        if(n != 0){
            return thn.interpret(m);
        }else if(els !=null){
            return els.interpret(m);
        }
        return n;
    }
    */
}
