grammar Expr;
import ExprLexerRules;

prog: stat+;

stat: expr NEWLINE
    | ID ASSIGN expr NEWLINE
    | NEWLINE
    ;

expr: expr EXPONENT expr
    | PLUS expr
    | MINUS expr
    | expr (MUL | DIV) expr
    | expr (PLUS | MINUS) expr
    | NUMBER
    | ID
    | LPAREN expr RPAREN
    ;

