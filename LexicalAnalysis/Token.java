/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/

public class Token {
    public int l, c;
    public TOKEN_TYPE t; 
    public String lexeme; 
    public Object info;
    
    public Token(TOKEN_TYPE t, String lex, int l, int c){
        this.t      = t; 
        this.lexeme = lex; 
        this.info   = null; 
        this.l      = l; 
        this.c      = c;
    }
    
    public Token(TOKEN_TYPE t, Object o, int l, int c){
        this.t     = t;
        this.lexeme = ""; 
        this.info   = o; 
        this.l      = l; 
        this.c      = c;
    }
    
    @Override public String toString(){
        return "[("+l+","+ c+ ") \"" + lexeme + "\" : <" + (info == null ?"" : info.toString()) + ">"+ "\" : <" + t.toString() + ">]";
    }

    public String printTokenFormat(){
        switch(t){
            case ID :
            case LITERAL_INT :
            case LITERAL_CHAR :
            case LITERAL_BOOL :
            case LITERAL_FLOAT :
            case LITERAL_NULL :
                return t.toString() + ": "+(info != null ? info.toString():lexeme);
            case IF :
            case ELSE :
            case DATA :
            case ITERATE :
            case READ :
            case PRINT :
            case RETURN :
            case NEW :
            case TYPE_INT :
            case TYPE_CHAR :
            case TYPE_BOOL :
            case TYPE_FLOAT :
            case TYPE_CUSTOM :
                return t.toString();
            case EQ :
            case EQEQ :
            case LESS :
            case GREATER :
            case NOTEQ :
            case PLUS :
            case MINUS :
            case MULT :
            case DIV :
            case MOD :
            case AND :
            case NOT :
            case OPEN_ROUND :
            case CLOSE_ROUND :
            case OPEN_SQUARE :
            case CLOSE_SQUARE :
            case OPEN_CURLY :
            case CLOSE_CURLY :
            case SEMI_COLON :
            case COLON :
            case COLONCOLON :
            case COMMA :
            case DOT :
                return (info != null ? info.toString():lexeme);
            default:
                return "INVALID TOKEN";
        }
    }


}