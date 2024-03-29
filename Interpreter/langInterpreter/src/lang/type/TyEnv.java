/*
    Bruno Marcos Pinheiro da Silva
    201565552AC

    Seany Caroliny Oliveira Silva
    201665566C
*/
package lang.type;

import java.util.Set;
import java.util.TreeMap;

public class TyEnv<A> {

    private TreeMap<String,A> typeEnv;


    public TyEnv(){
        typeEnv = new TreeMap<String,A>();
    }

    public void set(String id, A t){
        typeEnv.put(id,t);
    }

    public A get(String id){
        return typeEnv.get(id);
    }

    public boolean elem(String k){
        return typeEnv.containsKey(k);
    }


    public void printTable(){
        System.out.println(toString());
    }

    public String toString(){
        String s = "";
        Object[] x = (typeEnv.keySet().toArray());
        for(int i =0; i < x.length; i++){
            s += ((String)x[i]) + " : " + (typeEnv.get(x[i])).toString() + "\n";
        }
        return s;
    }

    public Set<String> getKeys() {return typeEnv.keySet();}


}
