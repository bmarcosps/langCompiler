/*
    Bruno Marcos Pinheiro da Silva
    201565552AC

    Seany Caroliny Oliveira Silva
    201665566C
*/
package lang.type;

public class STyChar extends SType {

    private static STyChar st = new STyChar();

    private STyChar(){
    }

    public static STyChar newSTyChar(){ return st; }

    public boolean match(SType v){
        return (v instanceof STyErr) || (v instanceof STyChar);
    }

    public String toString(){
        return "Char";
    }


}
