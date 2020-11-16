package lang.type;

import java.util.HashMap;

public class STyData extends SType {
    private String id;
    private HashMap<String,SType> ty;

    public STyData(String id, HashMap<String,SType> ty){
        this.id = id;
        this.ty = ty;
    }

    public HashMap<String,SType> getTypes(){ return ty; }

    public String getId() {
        return id;
    }

    public boolean match(SType v){
        boolean r = false;
        if(  v instanceof STyData ){

            if(((STyData)v).getTypes().size() == ty.size() && ((STyData)v).getId().equals(this.id)){
                r = true;
                for (HashMap.Entry<String,SType> pair : ty.entrySet()) {
                    r = r && pair.getValue().match( ((STyData)v).getTypes().get(pair.getKey()));
                }
            }
        }
        return r;
    }

    public String toString(){
        String s = id + " ";
        if(ty.size() > 0){
            for (HashMap.Entry<String,SType> pair : ty.entrySet()) {
                s += pair.getKey() + " " + pair.getValue().toString() + "; ";
            }
        }
        return s;
    }


   /*
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
    */
}








