package lang.type;

public class STyData extends SType {
    private SType ty[];

    public STyData(SType t[]){
        ty = t;
    }

    public SType[] getTypes(){ return ty; }

    public boolean match(SType v){
        boolean r = false;
        if(  v instanceof STyData ){
            if(((STyData)v).getTypes().length == ty.length ){
                r = true;
                for(int i = 0; i< ty.length; i++ ){
                    r = r && ty[i].match( ((STyData)v).getTypes()[i] );
                }
            }
        }
        return r;
    }

    public String toString(){
        String s = "";
        if(ty.length > 0){
            s = ty[0].toString();
            for(int i =1; i < ty.length; i++){
                s += "->" + ty[i].toString();
            }
        }
        return s;
    }
}








