from abc import abstractmethod

from expr import (
    Assign,
    Binary,
    Call,
    Getter,
    Grouping,
    Literal,
    Logical,
    Setter,
    Super,
    This,
    Unary,
    Variable)


class Visitor:
    def __init__(self):
        pass

    @abstractmethod
    def visit_assign_expr(self, assign: Assign):
        pass

    @abstractmethod
    def visit_binary_expr(self, binary: Binary):
        pass

    @abstractmethod
    def visit_call(self, call: Call):
        pass

    @abstractmethod
    def visit_getter(self, getter: Getter):
        pass

    @abstractmethod
    def visit_grouping(self, grouping: Grouping):
        pass

    @abstractmethod
    def visit_literal(self, literal: Literal):
        pass

    @abstractmethod
    def visit_logical(self, logical: Logical):
        pass

    @abstractmethod
    def visit_setter(self, setter: Setter):
        pass

    @abstractmethod
    def visit_super(self, super: Super):
        pass

    @abstractmethod
    def visit_this(self, this: This):
        pass

    @abstractmethod
    def visit_unary(self, unary: Unary):
        pass

    @abstractmethod
    def visit_variable(self, variable: Variable):
        pass
