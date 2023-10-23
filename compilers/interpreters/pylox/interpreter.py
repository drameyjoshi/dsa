"""
A class that executes the Abstract Syntax Tree.
"""
import logging
from typing import Any
from abc_stmt import ABCStmt
import visitor

from expr import Binary, Literal, Grouping, Expr, Unary
from overrides import override
from token_types import TokenType
from abc_expr import ABCExpr


class Interpreter(visitor.Visitor):
    def __init__(self) -> None:
        self._log = logging.getLogger('Interpreter')

    def interpret(self, expr: Expr) -> str:
        value = self._evaluate(expr)
        return str(value)

    @override
    def visit_literal(self, literal: ABCExpr):
        assert isinstance(literal, Literal)

        return literal.value

    @override
    def visit_grouping(self, grouping: ABCExpr):
        assert isinstance(grouping, Grouping)

        return self._evaluate(grouping.expression)

    @override
    def visit_unary(self, unary: ABCExpr):
        assert isinstance(unary, Unary)

        if unary.operator._ttype == TokenType.MINUS:
            right = self._evaluate(unary.right)
            return -right
        elif unary.operator._ttype == TokenType.BANG:
            right = self._evaluate_truth_value(unary.right)
            return not right

        return None

    @override
    def visit_binary_expr(self, binary: ABCExpr):
        """
        Function calls are expensive in Python and this function is likely
        to be called frequently.
        """
        assert isinstance(binary, Binary)

        left = self._evaluate(binary.left)
        right = self._evaluate(binary.right)
        left_num = isinstance(left, float)
        right_num = isinstance(right, float)
        left_str = isinstance(left, str)
        right_str = isinstance(right, str)
        return_value = None

        if binary.operator._ttype == TokenType.PLUS:
            if left_num and right_num or left_str and right_str:
                return_value = left + right
            elif left_num and right_str:
                return_value = str(left) + right
            elif left_str and right_num:
                return_value = left + str(right)
            else:
                self._log.error('Incompatible operands to + operator.')
        elif binary.operator._ttype == TokenType.MINUS:
            if left_num and right_num:
                return_value = left - right
            else:
                self._log.error('Incompatible operands to - operator.')
        elif binary.operator._ttype == TokenType.STAR:
            if left_num and right_num:
                return_value = left * right
            elif left_str and right_num:
                n = int(right)
                if n >= 0:
                    return n * left_str
            elif left_num and right_str:
                n = int(left)
                if n >= 0:
                    return n * right_str
            else:
                self._log.error('Incompatible operands to * operator.')
        elif binary.operator._ttype == TokenType.SLASH:
            if left_num and right_num:
                return_value = left / right
            else:
                self._log.error('Incompatible operands to - operator.')
        elif binary.operator._ttype == TokenType.GT:
            if left_num and right_num or left_str and right_str:
                return left > right
            else:
                self._log.error('Incompatible operands to > operator.')
        elif binary.operator._ttype == TokenType.GTE:
            if left_num and right_num or left_str and right_str:
                return left >= right
            else:
                self._log.error('Incompatible operands to > operator.')
        elif binary.operator._ttype == TokenType.LT:
            if left_num and right_num or left_str and right_str:
                return left < right
            else:
                self._log.error('Incompatible operands to > operator.')
        elif binary.operator._ttype == TokenType.LTE:
            if left_num and right_num or left_str and right_str:
                return left <= right
            else:
                self._log.error('Incompatible operands to > operator.')
        elif binary.operator._ttype == TokenType.EQ_EQ:
            if left_num and right_num or left_str and right_str:
                return left == right
            else:
                self._log.error('Incompatible operands to > operator.')
        elif binary.operator._ttype == TokenType.BANG_EQ:
            if left_num and right_num or left_str and right_str:
                return left != right
            else:
                self._log.error('Incompatible operands to > operator.')

        return return_value

    @override
    def visit_assign_expr(self, assign: ABCExpr):
        return super().visit_assign_expr(assign)

    @override
    def visit_call(self, call: ABCExpr):
        return super().visit_call(call)

    @override
    def visit_logical(self, logical: ABCExpr):
        return super().visit_logical(logical)

    @override
    def visit_getter(self, getter: ABCExpr):
        return super().visit_getter(getter)

    @override
    def visit_setter(self, setter: ABCExpr):
        return super().visit_setter(setter)

    @override
    def visit_super(self, super: ABCExpr):
        return super().visit_super(super)

    @override
    def visit_this(self, this: ABCExpr):
        return super().visit_this(this)

    @override
    def visit_variable(self, variable: ABCExpr):
        return super().visit_variable(variable)

    @override
    def visit_expression_statement(self, expr_stmt: ABCStmt) -> Any:
        self._evaluate(expr_stmt._expression)
        return None
    
    @override
    def visit_print_statement(self, print_stmt: ABCStmt) -> Any:
        value = self._evaluate(print_stmt._expression)
        print(str(value))
        return None
    
    def _evaluate(self, expression: Expr):
        return expression.accept(self)

    def _evaluate_truth_value(self, expression: Expr):
        return_value = True

        if isinstance(expression, Literal):
            if expression.value is None:
                return_value = False
            elif isinstance(expression.value, bool):
                return expression.value
            elif isinstance(expression.value, float):
                return expression.value == 0
            elif isinstance(expression.value, str):
                return len(expression.value) == 0

        return return_value
