from abc import abstractmethod
from typing import Any, List
from abc_stmt import ABCStmt
from overrides import override
from plox_token import Token

import visitor
import expr


class Stmt(ABCStmt):
    @abstractmethod
    def accept(self, visitor: visitor.Visitor) -> Any:
        pass


class Block(Stmt):
    def __init__(self, statements: List[Stmt]) -> None:
        self._statements = statements

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_block_statement(self)

class Expression(Stmt):
    def __init__(self, expression: expr.Expr) -> None:
        self._expression = expression

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_expression_statement(self)
    
class Function(Stmt):
    def __init__(self,
                 name: Token,
                 params: List[Token],
                 body: List[Stmt]) -> None:
        self._name = name
        self._params = params
        self._body = body

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_function_statement(self)


class Class(Stmt):
    def __init__(self,
                 name: Token,
                 superclass: expr.Variable,
                 methods: List[Function]) -> None:
        self._name = name
        self._superclass = superclass
        self._methods = methods

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_class_statement(self)


class If(Stmt):
    def __init__(self,
                 condition: expr.Expr,
                 then_block: Block,
                 else_block: Block) -> None:
        self._condition = condition
        self._then = then_block
        self._else = else_block

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_if_statement(self)


class Print(Stmt):
    def __init__(self, expression: expr.Expr) -> None:
        self._expression = expression

    @override
    def accept(self, visitor: visitor.Visitor) -> Any:
        return visitor.visit_print_statement(self)


class Return(Stmt):
    def __init__(self, keyword: Token, value: expr.Expr) -> None:
        self._keyword = keyword
        self._value = value

    @override
    def accept(self, visitor: visitor.Visitor):
        return visitor.visit_return_statement(self)


class Var(Stmt):
    def __init__(self, name: Token, initialiser: expr.Expr) -> None:
        self._name = name
        self._initialiser = initialiser

    @override
    def accept(self, visitor: visitor.Visitor):
        return visitor.visit_var_statement(self)


class While(Stmt):
    def __init__(self,
                 condition: expr.Expr,
                 then_block: Block) -> None:

    @override
    def accept(self, visitor: visitor.Visitor):
        return visitor.visit_while_statement(self)

Stmt.register(Block)
Stmt.register(Expression)
Stmt.register(Function)
Stmt.register(Class)
Stmt.register(If)
Stmt.register(Print)
Stmt.register(Return)
Stmt.register(Var)
Stmt.register(While)
