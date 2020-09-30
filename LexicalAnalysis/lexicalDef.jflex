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
IDENTIFIER={ALPHA}({ALPHA}|{DIGIT}|"_")*
NEWLINE= \r|\n|\r\n
WHITESPACE={NEWLINE}|[\ \t\b\f]


INTEGER=[\+\-]?{DIGIT}{DIGIT}*
FLOAT=[-+]?{DIGIT}*\.?{DIGIT}+([eE][\+\-]?{DIGIT}+)?
CHAR=\'[{ALPHA}{DIGIT}{WHITESPACE}]\'
LOGIC=true|false
NULL=null




%%

<YYINITIAL>{

}

[^]                 { throw new RuntimeException("Illegal character <"+yytext()+">"); }
