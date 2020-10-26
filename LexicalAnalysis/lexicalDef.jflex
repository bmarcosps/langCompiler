/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
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


/*Macros para as expressões regulares*/
ALPHA=[A-Za-z]
DIGIT=[0-9]
LITERAL_BOOL=(true|false)


//TYPE_IDENTIFIER=[A-Z]({ALPHA}|{DIGIT}|"_")*

IDENTIFIER={ALPHA}({ALPHA}|{DIGIT}|"_")*

NEWLINE=(\r|\n|\r\n)
WHITESPACE=[ \t\b]

SPECIAL_CHAR=\\(r|n|t|b|\'|\"|\\)

LITERAL_INT={DIGIT}{DIGIT}*
LITERAL_FLOAT={DIGIT}*\.{DIGIT}+
LITERAL_CHAR=\'({SPECIAL_CHAR}|[^\'\"\\])\'
LITERAL_NULL=null

MULTINE_COMMENT_CONTENT=([^\-]|\-+([^\-\}]))+
MULTINE_COMMENT_END=\-+\}


%state LINE_COMMENT

%state MULTILNE_COMMENT

%%

<YYINITIAL>{
    /* Símbolos */
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
    ">"             { return symbol (TOKEN_TYPE.GREATER); } 
    "!="            { return symbol (TOKEN_TYPE.NOTEQ); } 

    /* Palavras reservadas */
    "if"             { return symbol (TOKEN_TYPE.IF);}
    "else"           { return symbol (TOKEN_TYPE.ELSE);}
    "data"           { return symbol (TOKEN_TYPE.DATA);}
    "iterate"        { return symbol (TOKEN_TYPE.ITERATE);}
    "read"           { return symbol (TOKEN_TYPE.READ);}
    "print"          { return symbol (TOKEN_TYPE.PRINT);}
    "return"         { return symbol (TOKEN_TYPE.RETURN);}
    "new"            { return symbol (TOKEN_TYPE.NEW);}

    "Int"         { return symbol (TOKEN_TYPE.TYPE_INT);}
    "Char"        { return symbol (TOKEN_TYPE.TYPE_CHAR);}
    "Bool"        { return symbol (TOKEN_TYPE.TYPE_BOOL);}
    "Float"       { return symbol (TOKEN_TYPE.TYPE_FLOAT);}

    {LITERAL_NULL}              { return symbol (TOKEN_TYPE.LITERAL_NULL);}
    {LITERAL_BOOL}              { return symbol (TOKEN_TYPE.LITERAL_BOOL, Boolean.parseBoolean(yytext())); }

    /* Tipos e identificadores*/
    //{TYPE_IDENTIFIER}   { return symbol (TOKEN_TYPE.TYPE_CUSTOM); } 
    {IDENTIFIER}        { return symbol (TOKEN_TYPE.ID); } 

    /* Literais */
    {LITERAL_INT}           { return symbol (TOKEN_TYPE.LITERAL_INT, Integer.parseInt(yytext())); } 
    {LITERAL_FLOAT}             { return symbol (TOKEN_TYPE.LITERAL_FLOAT, Float.parseFloat(yytext())); } 
    {LITERAL_CHAR}              { return symbol (TOKEN_TYPE.LITERAL_CHAR, yytext()); }
    
    /* Comentários */
    "--"        {yybegin(LINE_COMMENT);}
    "{-"        {yybegin(MULTILNE_COMMENT);}

    {NEWLINE}|{WHITESPACE} { }
}

<LINE_COMMENT>{
    {NEWLINE}           {yybegin(YYINITIAL);}
    [^\n\r]+            {   } 
}



<MULTILNE_COMMENT>{
    {MULTINE_COMMENT_END}          {yybegin(YYINITIAL);}
    {MULTINE_COMMENT_CONTENT}      {   }

}

[^]                 { throw new RuntimeException("Illegal character <"+yytext()+">"); }
