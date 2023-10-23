from abc import abstractmethod
from abc_visitor import ABCVisitor
from abc_expr import ABCExpr
from typing import Any

import expr

class Visitor(ABCVisitor):
    def __init__(self):
        pass

    @abstractmethod
    def visit_assign_expr(self, assign: ABCExpr) -> Any:
        pass

    @abstractmethod
    def visit_binary_expr(self, binary: ABCExpr):
        pass

    @abstractmethod
    def visit_call(self, call: ABCExpr):
        pass

    @abstractmethod
    def visit_getter(self, getter: ABCExpr):
        pass

    @abstractmethod
    def visit_grouping(self, grouping: ABCExpr):
        pass

    @abstractmethod
    def visit_literal(self, literal: ABCExpr):
        pass

    @abstractmethod
    def visit_logical(self, logical: ABCExpr):
        pass

    @abstractmethod
    def visit_setter(self, setter: ABCExpr):
        pass

    @abstractmethod
    def visit_super(self, super: ABCExpr):
        pass

    @abstractmethod
    def visit_this(self, this: ABCExpr):
        pass

    @abstractmethod
    def visit_unary(self, unary: ABCExpr):
        pass

    @abstractmethod
    def visit_variable(self, variable: ABCExpr):
        pass
