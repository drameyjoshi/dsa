from abc import abstractmethod
from abc_visitor import ABCVisitor
from abc_expr import ABCExpr
from abc_stmt import ABCStmt
from typing import Any


class Visitor(ABCVisitor):
    def __init__(self) -> None:
        pass

    @abstractmethod
    def visit_assign_expr(self, assign: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_binary_expr(self, binary: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_call(self, call: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_getter(self, getter: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_grouping(self, grouping: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_literal(self, literal: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_logical(self, logical: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_setter(self, setter: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_super(self, super: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_this(self, this: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_unary(self, unary: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_variable(self, variable: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_expression_statement(self, expr_stmt: ABCStmt) -> Any:
        pass

    @abstractmethod
    def visit_print_statement(self, print_stmt: ABCStmt) -> Any:
        pass
    