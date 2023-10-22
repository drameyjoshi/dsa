"""
A class that executes the Abstract Syntax Tree.
"""

from visitor import Visitor
from expr import Binary, Literal, Grouping, Expr, Unary
from overrides import override
from token_types import TokenType


class Interpreter(Visitor):
    @override
    def visit_literal(self, literal: Literal):
        return literal.value

    @override
    def visit_grouping(self, grouping: Grouping):
        return self._evaluate(grouping.expression)

    @override
    def visit_unary(self, unary: Unary):
        if unary.operator == TokenType.MINUS:
            right = self._evaluate(unary.right)
            return -right
        elif unary.operator == TokenType.BANG:
            right = self._evaluate_truth_value(unary.right)
            return not right

        return None

    @override
    def visit_binary_expr(self, binary: Binary):
        left = self._evaluate(binary.left)
        right = self._evaluate(binary.right)
        return_value = None

        if binary.operator == TokenType.PLUS:
            if isinstance(left, float) or isinstance(left, str):
                if isinstance(right, float) or isinstance(right, str):
                    return_value = left + right

        if isinstance(left, float) and isinstance(right, float):
            if binary.operator == TokenType.MINUS:
                return_value = left - right
            elif binary.operator == TokenType.STAR:
                return_value = left * right
            elif binary.operator == TokenType.SLASH:
                return_value = left / right

        if isinstance(left, float) and isinstance(right, str):
            n = int(left)
            if n >= 0:
                return_value = int(left) * right

        if isinstance(left, str) and isinstance(right, float):
            n = int(right)
            if n >= 0:
                return_value = left * int(right)

        # To do: add remaining operators.

        return return_value

    def _evaluate(self, expression: Expr):
        return expression.accept(self)

    def _evaluate_truth_value(self, expression: Expr):
        return_value = True

        if isinstance(expression, Literal):
            if expression.value == None:
                return_value = False
            elif isinstance(expression.value, bool):
                return expression.value
            elif isinstance(expression.value, float):
                return expression.value == 0
            elif isinstance(expression.value, str):
                return len(expression.value) == 0

        return return_value
