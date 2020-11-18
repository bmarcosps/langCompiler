/*
    Bruno Marcos Pinheiro da Silva
    201565552AC

    Seany Caroliny Oliveira Silva
    201665566C
*/
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

    @Override
    public String toString(){
        String s = id;// + " ";
        /*if(ty.size() > 0){
            for (HashMap.Entry<String,SType> pair : ty.entrySet()) {
                s += pair.getKey() + " " + pair.getValue().toString() + "; ";
            }
        }*/
        return s;
    }

}








