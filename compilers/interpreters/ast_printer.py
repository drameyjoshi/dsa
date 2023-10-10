from visitor import Visitor
from plox_token import Token
from expr import Expr

from typing import List, Any

class ASTPrinter(Visitor):
    def __init__():
        pass

    def _transform(rv: str, part: Any) -> str:
        if isinstance(part, Token):
            return part._lexeme
        elif isinstance(part, Expr):
            pass
        else:
            return __str__(part)

    def _parenthesize_2(name: str, *parts) -> str:
        rv = "(" + name
        for p in parts:
            if isinstance(p, Token):
                rv += p._lexeme
            elif isinstance(p, Expr):
                rv += p.accept(self)
            else:
                rv += __str__(p)

        rv += ")"

        return rv
        
    def visit_assign_expr(self, assign_expr: Assign) -> str:
        return _parenthesize_2('=', assign_expr.name, assign_expr.value)

    def visit_binary_expr(self) -> str:
        pass

    def visit_call(self) -> str:
        pass

    def visit_getter(self) -> str:
        pass

    def visit_groupring(self) -> str:
        pass

    def visit_literal(self) -> str:
        pass

    def visit_logical(self) -> str:
        pass

    def visit_setter(self) -> str:
        pass

    def visit_super(self) -> str:
        pass

    def visit_this(self) -> str:
        pass

    def visit_unary(self) -> str:
        pass

    def visit_variable(self) -> str:
        pass


