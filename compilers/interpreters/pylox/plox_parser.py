"""
A parser for Lox code.
"""

from typing import List 

from plox_token import Token
from expr import Expr, Binary, Unary, Literal, Grouping
from token_types import TokenType

import error_handler

class Parser:
    def __init__(self, tokens: List[Token]) -> None:
        self._tokens = tokens
        self._current = 0
        self._is_error = False

    def _expression(self):
        return self._equality()
    
    def _equality(self) -> Expr:
        expr = self._comparison()

        while self._match([TokenType.EQ_EQ, TokenType.BANG_EQ]):
            operator = self._previous()
            right = self._comparision()
            expr = Binary(expr, operator, right)

        return expr

    def _comparision(self) -> Expr:
        expr = self._term()

        while self._match([TokenType.GT, TokenType.GTE, TokenType.LT, TokenType.LTE]):
            operator = self._previous()
            right = self._term()
            expr = Binary(expr, operator, right)

        return expr
    
    def _term(self) -> Expr:
        expr = self._factor()

        while self._match([TokenType.PLUS, TokenType.MINUS]):
            operator = self._previous()
            right = self._factor()
            expr = Binary(expr, operator, right)

        return expr
    
    def _factor(self) -> Expr:
        expr = self._unary()

        while self._match([TokenType.STAR, TokenType.SLASH]):
            operator = self._previous()
            right = self._unary()
            expr = Binary(expr, operator, right)

        return expr

    def _unary(self) -> Expr:
        if self._match([TokenType.MINUS, TokenType.BANG]):
            operator = self._previous()
            right = self._unary()
            return Unary(operator, right)

        return self._primary()

    def _primary(self) -> Expr:
        if self._match([TokenType.FALSE]):
            return Literal(False)
        
        if self._match([TokenType.TRUE]):
            return Literal(True)
        
        if self._match([TokenType.NIL]):
            return Literal(None)
        
        if self._match([TokenType.NUMBER, TokenType.STRING]):
            return Literal(self._previous()._literal)
        
        if self._match([TokenType.LPAREN]):
            expr = self._expression()
            if self._match([TokenType.RPAREN]):
                self._advance()
                return Grouping(expr)
            else:
                error_handler.report(self._tokens[self._current]._line, 
                                     '', 
                                     self._tokens[self._current]._lexeme, 
                                     "Expecting ')' after expression.")
                self._is_error = True
                # To do: check if this is the best return value.
                return None

    def _match(self, some_tokens: List[Token]) -> bool:
        for t in some_tokens:
            if self._check(t):
                self._advance()
                return True
            
        return False
    
    def _check(self, token: Token) -> bool:
        if self._is_at_end():
            return False
        else:
            return self._peek().type == token._ttype
        
    def _advance(self):
        if not self._is_at_end():
            current += 1

        return self._previous()
    
    def _is_at_end(self) -> bool:
        return self._peek()._ttype == TokenType.EOF
    
    def _peek(self) -> Token:
        return self._tokens[self._current]
    
    def _previous(self) -> Token:
        return self._tokens[self._current - 1]
