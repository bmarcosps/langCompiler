/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

import java.util.LinkedList;
import java.util.List;

public class Data extends Node {

    public String id;
    public List<Decl> decls;

    public Data(int line, int column, String id) {
        super(line, column);
        this.id = id;
        this.decls = new LinkedList<>();
    }

    public Data(int line, int column, String id, List<Decl> decls) {
        super(line, column);
        this.id = id;
        this.decls = new LinkedList<>();
        this.decls = decls;
    }

    public void appendDecl(Decl decl){
        decls.add(decl);
    }

}
