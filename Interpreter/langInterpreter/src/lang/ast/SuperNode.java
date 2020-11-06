/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;

public abstract class SuperNode implements Visitable {
   
   // The line and column of the node in the input text
   
    public abstract int getLine();
    public abstract int getColumn();
}


