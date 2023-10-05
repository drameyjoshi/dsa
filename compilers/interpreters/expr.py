from abc import {
    ABC,
    abstractmethod
}
from typing import List, Union

from visitor import Visitor
from plox_token import Token

class Expr(ABC):
    @abstractmethod
    def accept(self, visitor: Visitor) -> Expr:
        pass

class Assign(Expr):
    __init__(self, name: Token, value: Expr):
        self.name = name
        self.value = value

    def accept(self, visitor: Visitor) -> Expr:
        return visitor.visit_assign_expr(self)

class Binary(Expr):
    __init__(self, left: Expr, operator: Token, left: Expr):
        self.left = left
        self.operator = operator
        self.right = right

    def accept(self, visitor: Visitor) -> Expr:
        return visitor.visit_binary_expr(self)

class Call(Expr):
    __init__(self, callee: Expr, paren: Token, args: List[Expr]):
        self.callee = callee
        self.paren = paren
        self.args = args

    def accept(self, visitor: Visitor) -> Expr:
        return visitor.visit_call(self)

class Getter(Expr):
    __init__(self, from_object: Expr, name: Token):
        self.from_object = from_object
        self.name = name

    def accept(self, visitor: Visitor) -> Expr:
        return visitor.visit_getter(self)

class Grouping(Expr):
    __init__(self, expression: Expr):
        self.expression = expression

    def accept(self, visitor: Visitor) -> Expr:
        visitor.visit_groupring(self)

class Literal(Expr):
    __init__(self, value Union[str, float]):
        self.value = value

    def accept(self, visitor: Visitor) -> Expr:
        visitor.visit_literal(self)

class Logical(Expr):
    __init__(self, left: Expr, operator: Token, right: Expr):
        self.left = left
        self.operator = operator
        self.right = right

    def accept(self, visitor: Visitor) -> Expr:
        visitor.visit_logical(self)

class Setter(Expr):
    __init__(self, to_object: Expr, name: Token, value: Expr):
        self.to_object = to_object
        self.name = name
        self.value = value

    def accept(self, visitor: Visitor) -> Expr:
        visitor.visit_setter(self)

class Super(Expr):
    __init__(self, keyword: Token, method: Token):
        self.keyword = keyword
        self.method = method

    def accept(self, visitor: Visitor) -> Expr:
        visitor.visit_super(self)

class This(Expr):
    __init__(self, keyword: Token):
        self.keyword = keyword

    def accept(self, visitor: Visitor) -> Expr:
        visitor.visit_this(self)

class Unary(Expr):
    __init__(self, operator: Token, right: Expr):
        self.operator = operator
        self.right = right

    def accept(self, visitor: Visitor) -> Expr:
        visitor.visit_unary(self)

class Variable(Expr):
    __init__(self, name: Token):
        self.name = name

    def accept(self, visitor: Visitor) -> Expr:
        visitor.visit_variable(self)


        
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
Expr.register(Visitor)
