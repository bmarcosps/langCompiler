package lang.type;

public class STyNull extends SType {

    private static STyNull st = new STyNull();

    private STyNull(){
    }

    public static STyNull newSTyNull(){ return st; }

    public boolean match(SType v){
        return (v instanceof STyErr) ||(v instanceof STyNull);
    }

    public String toString(){
        return "Null";
    }

}
