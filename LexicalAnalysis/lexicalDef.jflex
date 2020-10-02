%%

%unicode
%line 
%column 
%class LexicalAnalyser
%function nextToken 
%type Token


%{
    private int num_tokens;

    public int numTokens(){
        return num_tokens;
    }

    private Token symbol(TOKEN_TYPE t) {
        num_tokens++;
        return new Token(t, yytext(), yyline+1, yycolumn+1);
    }

    private Token symbol(TOKEN_TYPE t, Object value) {
        num_tokens++;
        return new Token(t, value, yyline+1, yycolumn+1);
    }
%}

%init{
    num_tokens = 0;
%init}


/* Agora vamos definir algumas macros */
ALPHA=[A-Za-z]
DIGIT=[0-9]
BOOLEAN=true|false

TYPE_IDENTIFIER=[A-Z]({ALPHA}|{DIGIT}|"_")*

IDENTIFIER={ALPHA}({ALPHA}|{DIGIT}|"_")*

NEWLINE=\r|\n|\r\n
WHITESPACE=[ \t\b]

SPECIAL_CHAR=\\r|\\n|\\t|\\b|\\'|\\\"| |\\\\

INTEGER={DIGIT}{DIGIT}*
FLOAT={DIGIT}*\.{DIGIT}+

CHAR=\'[{ALPHA}|{DIGIT}|{SPECIAL_CHAR}]\'

BOOL=true|false

//IMPLEMENTAR: COMENTÁRIO DE LINHA --
//              COMENTÁRIO DE MÚLTIPLAS LINHAS
%%

<YYINITIAL>{

    "("             { return symbol (TOKEN_TYPE.OPEN_ROUND); } 
    ")"             { return symbol (TOKEN_TYPE.CLOSE_ROUND); } 
    "["             { return symbol (TOKEN_TYPE.OPEN_SQUARE); } 
    "]"             { return symbol (TOKEN_TYPE.CLOSE_SQUARE); } 
    "{"             { return symbol (TOKEN_TYPE.OPEN_CURLY); } 
    "}"             { return symbol (TOKEN_TYPE.CLOSE_CURLY); } 

    ";"             { return symbol (TOKEN_TYPE.SEMI_COLON);}
    ","             { return symbol (TOKEN_TYPE.COMMA);}
    ":"             { return symbol (TOKEN_TYPE.COLON);}
    "::"            { return symbol (TOKEN_TYPE.COLONCOLON);}
    "."             { return symbol (TOKEN_TYPE.DOT);}

    "+"             { return symbol (TOKEN_TYPE.PLUS); } 
    "-"             { return symbol (TOKEN_TYPE.MINUS); } 
    "*"             { return symbol (TOKEN_TYPE.MULT); } 
    "/"             { return symbol (TOKEN_TYPE.DIV); } 
    "%"             { return symbol (TOKEN_TYPE.MOD); } 
    "&&"            { return symbol (TOKEN_TYPE.AND); } 
    "!"             { return symbol (TOKEN_TYPE.NOT); } 

    "="             { return symbol (TOKEN_TYPE.EQ); } 
    "=="            { return symbol (TOKEN_TYPE.EQEQ); } 
    "<"             { return symbol (TOKEN_TYPE.LESS); } 
    "!="            { return symbol (TOKEN_TYPE.NOTEQ); } 

    "if"             { return symbol (TOKEN_TYPE.IF);}
    "then"           { return symbol (TOKEN_TYPE.THEN);}
    "else"           { return symbol (TOKEN_TYPE.ELSE);}
    "data"           { return symbol (TOKEN_TYPE.DATA);}
    "iterate"        { return symbol (TOKEN_TYPE.ITERATE);}
    "read"           { return symbol (TOKEN_TYPE.READ);}
    "print"          { return symbol (TOKEN_TYPE.PRINT);}
    "return"         { return symbol (TOKEN_TYPE.RETURN);}

    "Int"         { return symbol (TOKEN_TYPE.TYPE_INT);}
    "Char"        { return symbol (TOKEN_TYPE.TYPE_CHAR);}
    "Bool"        { return symbol (TOKEN_TYPE.TYPE_BOOL);}
    "Float"       { return symbol (TOKEN_TYPE.TYPE_FLOAT);}

    {TYPE_IDENTIFIER}   { return symbol (TOKEN_TYPE.TYPE_CUSTOM); } 

    "null"              { return symbol (TOKEN_TYPE.LITERAL_NULL);}

    {IDENTIFIER}        { return symbol (TOKEN_TYPE.ID); } 
    {INTEGER}           { return symbol (TOKEN_TYPE.LITERAL_INT, Integer.parseInt(yytext())); } 
    {FLOAT}             { return symbol (TOKEN_TYPE.LITERAL_FLOAT, Float.parseFloat(yytext())); } 
    {CHAR}              { return symbol (TOKEN_TYPE.LITERAL_CHAR); }
    {BOOL}              { return symbol (TOKEN_TYPE.LITERAL_BOOL, Boolean.parseBoolean(yytext())); }

    {NEWLINE}|{WHITESPACE} { }
}

[^]                 { throw new RuntimeException("Illegal character <"+yytext()+">"); }
