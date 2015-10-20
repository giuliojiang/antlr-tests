grammar LabeledExpr ;

import Lex ;

init: stat+ ;

stat: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;

expr: expr op=('*'|'/') expr
    | expr op=('+'|'-') expr
    | INT
    | ID
    | '(' expr ')'
    ;