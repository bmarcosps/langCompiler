/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
package lang.ast;


import org.antlr.v4.runtime.misc.Pair;

import java.util.LinkedList;
import java.util.List;

public class Param extends Node {
    public String paramId;
    public Type paramType;

    public Param(int line, int column, String paramId, Type paramType) {
        super(line, column);
        this.paramId = paramId;
        this.paramType = paramType;
    }

}



