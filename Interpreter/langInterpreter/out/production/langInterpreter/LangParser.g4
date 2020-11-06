/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/
parser grammar LangParser;

options {
    tokenVocab = LangLexer;
}

@header {
    package lang.parser;
}

prog :
    data* func* ;
data :
    DATA ID OPEN_CURLY (decl)* CLOSE_CURLY { if(!Character.isUpperCase($ID.text.charAt(0))) throw new ParseCancellationException("Id types must start with Uppercase");}
    ;
decl :
    ID COLONCOLON type SEMI_COLON ;
func :
    ID OPEN_ROUND params? CLOSE_ROUND (COLON type (COMMA type)*)? OPEN_CURLY (cmd)* CLOSE_CURLY ;
params :
   param (COMMA param)*
   ;
param :
    ID COLONCOLON type
    ;
type :
    type OPEN_SQUARE CLOSE_SQUARE #typeArray
    | btype #typeBtype
    ;
btype :
    TYPE_INT #typeInt
    | TYPE_CHAR #typeChar
    | TYPE_BOOL #typeBool
    | TYPE_FLOAT #typeFloat
    | ID { if(!Character.isUpperCase($ID.text.charAt(0))) throw new ParseCancellationException("Id types must start with Uppercase");} #typeData ;
cmd :
    OPEN_CURLY (cmd)* CLOSE_CURLY #cmdList
    | IF OPEN_ROUND exp CLOSE_ROUND cmd #cmdIf
    | IF OPEN_ROUND exp CLOSE_ROUND cmd ELSE cmd #cmdIfElse
    | ITERATE OPEN_ROUND exp CLOSE_ROUND cmd #cmdIterate
    | READ lvalue SEMI_COLON #cmdRead
    | PRINT exp SEMI_COLON #cmdPrint
    | RETURN exp (COMMA exp)* SEMI_COLON #cmdReturn
    | lvalue EQ exp SEMI_COLON #cmdAssign
    | ID OPEN_ROUND (exps)? CLOSE_ROUND (LESS lvalue (COMMA lvalue)* GREATER)? SEMI_COLON  #cmdFunctionCall
    ;

exp :
    rexp #expRexp
    | exp AND exp #expAnd
    ;
rexp :
    aexp #rexpAexp
    | aexp LESS aexp #expLess
    | rexp EQEQ aexp #expEqEq
    | rexp NOTEQ aexp #expNotEq
    ;
aexp :
    mexp #aexpMexp
    | aexp PLUS mexp #expPlus
    | aexp MINUS mexp #expSub
    ;
mexp :
    sexp #mexpSexp
    | mexp MULT sexp #expMult
    | mexp DIV sexp #expDiv
    | mexp MOD sexp #expMod
    ;
sexp :
    pexp #sexpPexp
    | <assoc=right> NOT sexp #expNot
    | <assoc=right> MINUS sexp #expMinus
    | TRUE #literalTrue
    | FALSE #literalFalse
    | LITERAL_NULL #literalNull
    | LITERAL_INT #literalInt
    | LITERAL_FLOAT #literalFloat
    | LITERAL_CHAR #literalChar
    ;
pexp :
    lvalue #pexpLvalue
    | OPEN_ROUND exp CLOSE_ROUND #expParenthesis
    | NEW type (OPEN_SQUARE exp CLOSE_SQUARE)? #expNew
    | ID OPEN_ROUND exps? CLOSE_ROUND OPEN_SQUARE exp CLOSE_SQUARE #expFunctionCall
    ;
lvalue :
    ID #lvalueId
    | lvalue OPEN_SQUARE exp CLOSE_SQUARE #lvalueArray
    | lvalue DOT ID #lvalueSelect
    ;
exps :
    exp (COMMA exp )* ;