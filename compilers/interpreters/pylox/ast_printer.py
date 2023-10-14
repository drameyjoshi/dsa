from visitor import Visitor
from plox_token import Token
from expr import (Expr, Assign, Binary, Call, Grouping,
                  Getter, Literal, Logical, Setter, Super, This, Unary, Variable)
from token_types import TokenType

from typing import List, Any


class ASTPrinter(Visitor):
    def __init__(self, expr: Expr):
        self.expr = expr

    def print(self):
        print(self.expr.accept(self))

    def _transform(self, rv: str, part: Any) -> str:
        if isinstance(part, Token):
            return part._lexeme
        elif isinstance(part, Expr):
            pass
        else:
            return part.repr()

    def _parenthesize_2(self, name: str, *parts) -> str:
        rv = "(" + name
        for p in parts:
            if isinstance(p, Token):
                rv += p._lexeme
            elif isinstance(p, Expr):
                rv += p.accept(self)
            else:
                rv += p.repr()

        rv += ")"

        return rv

    def _parenthesize(self, name: str, *parts) -> str:
        rv = "(" + name
        for p in parts:
            rv += ' '
            rv += p.accept(self)

        rv += ')'

        return rv

    def visit_assign_expr(self, assign_expr: Assign) -> str:
        return self._parenthesize_2('=', assign_expr.name, assign_expr.value)

    def visit_binary_expr(self, binary_expr: Binary) -> str:
        return self._parenthesize(binary_expr.operator._lexeme, binary_expr.left, binary_expr.right)

    def visit_call(self, call_expr: Call) -> str:
        return self._parenthesize('call', call_expr.callee, call_expr.args)

    def visit_getter(self, get_expr: Getter) -> str:
        return self._parenthesize('.', get_expr.from_object, get_expr.name._lexeme)

    def visit_grouping(self, grouping_expr: Grouping) -> str:
        return self._parenthesize('group', grouping_expr.expression)

    def visit_literal(self, literal_expr: Literal) -> str:
        if literal_expr.value is None:
            return 'nil'
        else:
            return str(literal_expr.value)

    def visit_logical(self, logical_expr: Logical) -> str:
        return self._parenthesize(logical_expr.operator._lexeme, logical_expr.left, logical_expr.right)

    def visit_setter(self, setter_expr: Setter) -> str:
        return self._parenthesize(setter_expr.to_object, setter_expr.name._lexeme, setter_expr.value)

    def visit_super(self, super_expr: Super) -> str:
        return self._parenthesize('super', super_expr.method)

    def visit_this(self, this_expr: This) -> str:
        return 'this'

    def visit_unary(self, unary_expr: Unary) -> str:
        return self._parenthesize(unary_expr.operator._lexeme, unary_expr.right)

    def visit_variable(self, variable: Variable) -> str:
        return self._parenthesize(variable.name)

    
    
def main():
    expr = Binary(Unary(Token(TokenType.MINUS, '-', None, 1), Literal('256')),
                    Token(TokenType.STAR, '*', None, 1),
                    Grouping(Literal(42.60)))
    ast_printer = ASTPrinter(expr)
    ast_printer.print()


if __name__ == '__main__':
    main()
