lexer grammar XMLLexer;

// Default mode
OPEN : '<'                              -> pushMode(INSIDE) ;
COMMENT : '<!--' .*? '-->'              -> skip ;
EntityRef : '&' [a-z]+ ';' ;
TEXT : ~('<'|'&')+ ;

// Outside mode
mode INSIDE;
CLOSE : '>'                             -> popMode ;
SLASH_CLOSE : '/>'                      -> popMode ;
EQUALS : '=' ;
STRING : '"' .*? '"' ;
SlashName : '/' Name ;
Name : ALPHA (ALPHA|DIGIT)* ;
S : [ \t\r\n]                           -> skip ;

fragment
ALPHA : [a-zA-Z] ;

fragment
DIGIT : [0-9] ;

