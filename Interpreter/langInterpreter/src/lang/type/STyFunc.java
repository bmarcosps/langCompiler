/*
    Bruno Marcos Pinheiro da Silva
    201565552AC

    Seany Caroliny Oliveira Silva
    201665566C
*/

package lang.type;

public class STyFunc extends SType {

    private SType tyParams[];
    private SType tyReturns[];

    public STyFunc(SType tparam[], SType treturn[]){
        tyParams = tparam;
        tyReturns = treturn;
    }


    public SType[] getTypesParams(){ return tyParams; }
    public SType[] getTypesReturns(){ return tyReturns; }

    public boolean match(SType v){
        boolean r = false;
        if( v instanceof STyFunc ){
            if(((STyFunc)v).getTypesParams().length == tyParams.length ){
                r = true;
                for(int i = 0; i< tyParams.length; i++ ){
                    r = r && tyParams[i].match( ((STyFunc)v).getTypesParams()[i] );
                }
            }
            if(((STyFunc)v).getTypesReturns().length == tyReturns.length ){
                for(int i = 0; i< tyReturns.length; i++ ){
                    r = r && tyReturns[i].match( ((STyFunc)v).getTypesReturns()[i] );
                }
            } else {
                r = false;
            }
        }
        return r;
    }

    public String toString(){
        String s = "";
        if(tyParams.length > 0){
            s = tyParams[0].toString();
            for(int i = 1; i < tyParams.length; i++){
                s += "->" + tyParams[i].toString();
            }
        }
        s+= " || ";
        if(tyReturns.length > 0){
            for(int i = 0; i < tyReturns.length; i++){
                s += "->" + tyReturns[i].toString();
            }
        }
        return s;
    }


}
