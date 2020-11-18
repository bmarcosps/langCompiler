/*
    Bruno Marcos Pinheiro da Silva
    201565552AC

    Seany Caroliny Oliveira Silva
    201665566C
*/
package lang.type;

public class STyFloat extends SType {

    private static STyFloat st = new STyFloat();

    private STyFloat(){
    }

    public static STyFloat newSTyFloat(){ return st; }

    public boolean match(SType v){
        return (v instanceof STyErr) || (v instanceof STyFloat);
    }

    public String toString(){
        return "Float";
    }


}
