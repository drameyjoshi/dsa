from abc import (
    abstractmethod
)
from typing import List, Union, Any

from plox_token import Token
from overrides import override
from abc_expr import ABCExpr

import visitor


class Expr(ABCExpr):
    @abstractmethod
    def accept(self, visitor: visitor.Visitor) -> Any:
        pass


class Assign(Expr):
    def __init__(self, name: Token, value: Expr) -> None:
        self.name = name
        self.value = value

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_assign_expr(self)


class Binary(Expr):
    def __init__(self, left: Expr, operator: Token, right: Expr):
        self.left = left
        self.operator = operator
        self.right = right

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_binary_expr(self)


class Call(Expr):
    def __init__(self, callee: Expr, paren: Token, args: List[Expr]):
        self.callee = callee
        self.paren = paren
        self.args = args

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_call(self)


class Getter(Expr):
    def __init__(self, from_object: Expr, name: Token):
        self.from_object = from_object
        self.name = name

    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_getter(self)


class Grouping(Expr):
    def __init__(self, expression: Expr):
        self.expression = expression

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_grouping(self)


class Literal(Expr):
    def __init__(self, value: Union[str, float, bool]):
        self.value = value

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_literal(self)


class Logical(Expr):
    def __init__(self, left: Expr, operator: Token, right: Expr):
        self.left = left
        self.operator = operator
        self.right = right

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_logical(self)


class Setter(Expr):
    def __init__(self, to_object: Expr, name: Token, value: Expr):
        self.to_object = to_object
        self.name = name
        self.value = value

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_setter(self)


class Super(Expr):
    def __init__(self, keyword: Token, method: Token):
        self.keyword = keyword
        self.method = method

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_super(self)


class This(Expr):
    def __init__(self, keyword: Token):
        self.keyword = keyword

    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_this(self)


class Unary(Expr):
    def __init__(self, operator: Token, right: Expr):
        self.operator = operator
        self.right = right

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_unary(self)


class Variable(Expr):
    def __init__(self, name: Token):
        self.name = name

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_variable(self)


Expr.register(Assign)
Expr.register(Binary)
Expr.register(Call)
Expr.register(Getter)
Expr.register(Grouping)
Expr.register(Literal)
Expr.register(Setter)
Expr.register(Super)
Expr.register(This)
Expr.register(Unary)
