from visitor import Visitor
from plox_token import Token
from abc_expr import ABCExpr
from token_types import TokenType

from typing import Any
from overrides import override


class ASTPrinter(Visitor):
    def __init__(self, expr: ABCExpr) -> None:
        self.expr = expr

    def print(self):
        if self.expr is not None:
            print(self.expr.accept(self))

    def _transform(self, rv: str, part: Any) -> str:
        if isinstance(part, Token):
            return part._lexeme
        elif isinstance(part, ABCExpr):
            pass
        else:
            return part.repr()

    def _parenthesize_2(self, name: str, *parts) -> str:
        rv = "(" + name
        for p in parts:
            if isinstance(p, Token):
                rv += p._lexeme
            elif isinstance(p, ABCExpr):
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

    # @abstractmethod
    # def visit_assign_expr(self, assign: ABCExpr):
    #    pass

    @override
    def visit_assign_expr(self, assign: ABCExpr):
        return self._parenthesize_2('=', assign.name, assign.value)

    @override
    def visit_binary_expr(self, binary: ABCExpr) -> str:
        return self._parenthesize(
            binary.operator._lexeme, binary.left, binary.right)

    @override
    def visit_call(self, call: ABCExpr) -> str:
        return self._parenthesize('call', call.callee, call.args)

    @override
    def visit_getter(self, getter: ABCExpr) -> str:
        return self._parenthesize('.', get.from_object, get.name._lexeme)

    @override
    def visit_grouping(self, grouping: ABCExpr) -> str:
        return self._parenthesize('group', grouping.expression)

    @override
    def visit_literal(self, literal: ABCExpr) -> str:
        if literal.value is None:
            return 'nil'
        else:
            return str(literal.value)

    @override
    def visit_logical(self, logical: ABCExpr) -> str:
        return self._parenthesize(
            logical.operator._lexeme, logical.left, logical.right)

    @override
    def visit_setter(self, setter: ABCExpr) -> str:
        return self._parenthesize(
            setter.to_object, setter.name._lexeme, setter.value)

    @override
    def visit_super(self, super: ABCExpr) -> str:
        return self._parenthesize('super', super.method)

    @override
    def visit_this(self, this: ABCExpr) -> str:
        return 'this'

    @override
    def visit_unary(self, unary: ABCExpr) -> str:
        return self._parenthesize(unary.operator._lexeme, unary.right)

    @override
    def visit_variable(self, variable: ABCExpr) -> str:
        return self._parenthesize(variable.name)


def main():
    expr = Binary(Unary(Token(TokenType.MINUS, '-', None, 1), Literal('256')),
                  Token(TokenType.STAR, '*', None, 1),
                  Grouping(Literal(42.60)))
    ast_printer = ASTPrinter(expr)
    ast_printer.print()


if __name__ == '__main__':
    main()
