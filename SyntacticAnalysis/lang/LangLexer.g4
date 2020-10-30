/*
    Bruno Marcos Pinheiro da Silva
    201565552AC
*/

lexer grammar LangLexer;

@header {
    package lang.parser;
}

fragment DIGIT : [0-9] ;
fragment ALPHA : [A-Za-z] ;

OPEN_ROUND : '(' ;
CLOSE_ROUND : ')' ;
OPEN_SQUARE : '[' ;
CLOSE_SQUARE : ']' ;
OPEN_CURLY : '{';
CLOSE_CURLY : '}' ;

SEMI_COLON : ';' ;
COMMA : ','  ;
COLON : ':' ;
COLONCOLON : '::';
DOT : '.' ;

PLUS : '+' ;
MINUS : '-'  ;
MULT : '*';
DIV : '/' ;
MOD : '%';
AND : '&&';
NOT : '!';

EQ : '=';
EQEQ : '==';
LESS : '<';
GREATER : '>';
NOTEQ : '!=';

/* Palavras reservadas */
IF : 'if';
ELSE : 'else';
DATA : 'data';
ITERATE : 'iterate';
READ : 'read';
PRINT : 'print';
RETURN : 'return';
NEW : 'new';

TYPE_INT : 'Int';
TYPE_CHAR : 'Char';
TYPE_BOOL : 'Bool';
TYPE_FLOAT : 'Float';

LITERAL_NULL : 'null' ;

TRUE : 'true' ;
FALSE : 'false' ;


//{TYPE_IDENTIFIER}
ID : ALPHA ( ALPHA | DIGIT |'_')* ;

/* Literais */
LITERAL_INT :  DIGIT DIGIT* ;
LITERAL_FLOAT : (DIGIT)* '.' (DIGIT)+;

LITERAL_CHAR : '\'' (~['"\\] | '\\' ( 'r' | 'n' | 't' | 'b' | '\'' | '"' | '\\' )) '\'' ;

LITERAL_BOOL : TRUE | FALSE ;

NEWLINE: ('\r' '\n'? | '\n') -> skip;
WHITESPACE: [ \t]+ -> skip;

/* Comentários */
LINE_COMMENT : '--' ~ [\r\n]* -> skip;
MULTILNE_COMMENT : '{-' .*? '-}' -> skip;



