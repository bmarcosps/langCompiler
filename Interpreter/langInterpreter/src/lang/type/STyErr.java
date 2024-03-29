/*
    Bruno Marcos Pinheiro da Silva
    201565552AC

    Seany Caroliny Oliveira Silva
    201665566C
*/

package lang.type;

public class STyErr extends SType {

    private static STyErr st = new STyErr();;

    private STyErr(){
    }

    public static STyErr newSTyErr(){ return st; }

    public boolean match(SType v){
        return true;
    }

    public String toString(){
        return "TyError";
    }
}
