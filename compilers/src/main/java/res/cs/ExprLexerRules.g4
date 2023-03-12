lexer grammar ExprLexerRules;

ID: [a-zA-Z]+;
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
CLEAR: 'clear';
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
