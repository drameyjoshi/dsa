grammar Expr;

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

ID: [a-zA-Z_]+;
NUMBER: INT | REAL;
DIGIT: [0-9];
INT: [0-9]+;
REAL: [0-9]+'.'DIGIT* | '.'DIGIT+;
ASSIGN: '=';
LPAREN: '(';
RPAREN: ')';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
EXPONENT: '^';
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;

