grammar Expr;
import ExprLexerRules;

prog: stat+;

stat: expr NEWLINE				# printExpr
    | ID ASSIGN expr NEWLINE	# assign
    | NEWLINE					# blank
    ;

expr: expr EXPONENT expr		# exponentiation
    | PLUS expr					# unaryPlus
    | MINUS expr				# unaryMinus
    | expr op=(MUL | DIV) expr		# mulDiv
    | expr op=(PLUS | MINUS) expr	# addSub
    | NUMBER					# number
    | ID						# identifier
    | LPAREN expr RPAREN		# parens
    ;

