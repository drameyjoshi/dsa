"""
A lexical analyser for Lox code.
"""
import re

from typing import List

import error_handler
from token_types import TokenType
from plox_token import Token


class Scanner:
    """
    A class to scan the source code and perform lexical analysis.
    """
    match_number = re.compile(
        '-?\\ *[0-9]+\\.?[0-9]*(?:[Ee]\\ *[-+]?\\ *[0-9]+)?')

    def __init__(self, source: str) -> None:
        self._source = source
        self._tokens = []
        self._start = 0
        self._current = 0
        self._line = 1
        self._keys = {}
        self._keys["and"] = TokenType.AND
        self._keys["class"] = TokenType.CLASS
        self._keys["else"] = TokenType.ELSE
        self._keys["false"] = TokenType.FALSE
        self._keys["fun"] = TokenType.FUN
        self._keys["for"] = TokenType.FOR
        self._keys["if"] = TokenType.IF
        self._keys["nil"] = TokenType.NIL
        self._keys["or"] = TokenType.OR
        self._keys["print"] = TokenType.PRINT
        self._keys["return"] = TokenType.RETURN
        self._keys["super"] = TokenType.SUPER
        self._keys["this"] = TokenType.THIS
        self._keys["true"] = TokenType.TRUE
        self._keys["var"] = TokenType.VAR
        self._keys["while"] = TokenType.WHILE
        self._keys["eof"] = TokenType.EOF

    def next_command(self, source: str) -> None:
        """
        Sets the next command of the scanner.

        When the scanner is used in the REPL, each time the user gives a
        new command it is supplied to the scanner using this method.

        Parameters: source - a line of source code.
        Return: Nothing.
        """
        self._source = source
        self._tokens = []
        self._start = 0
        self._current = 0
        self._line = 1

    def scan_tokens(self) -> List[str]:
        """
        Scans the source code and returns a list of tokens.

        Parameters: None
        Return: A list of (string representation of) tokens.
        """
        while not self._is_at_end():
            self._start = self._current
            self._scan_token()

        self._tokens.append(Token(TokenType.EOF, "", None, self._line))

        return self._tokens

    def _is_at_end(self) -> bool:
        return self._current >= len(self._source)

    def _scan_token(self) -> None:
        char = self._advance()

        match char:
            case "(": self._add_token(TokenType.LPAREN)
            case ")": self._add_token(TokenType.RPAREN)
            case "{": self._add_token(TokenType.LBRACE)
            case "}": self._add_token(TokenType.RBRACE)
            case ",": self._add_token(TokenType.COMMA)
            case ".": self._add_token(TokenType.DOT)
            case "+": self._add_token(TokenType.PLUS)
            case "-": self._add_token(TokenType.MINUS)
            case "*": self._add_token(TokenType.STAR)
            case ";": self._add_token(TokenType.SEMICOLON)
            case "!": self._match_bang()
            case "=": self._match_eq()
            case "<": self._match_lt()
            case ">": self._match_gt()
            case "/": self._match_slash()
            case " ": pass
            case "\r": pass
            case "\t": pass
            case "\n": self._line += 1
            case "'": self._match_string()
            case '"': self._match_string()
            case _: self._match_default()

    def _match_default(self) -> None:
        word = self._grab_next_word()
        self._classify_word(word)

    def _grab_next_word(self) -> None:
        def _is_word_or_num(char: str) -> bool:
            result = False

            if char.isalnum() or char in ".-_":
                result = True

            return result

        while _is_word_or_num(self._peek()):
            self._advance()

        word = self._source[self._start: self._current]

        return word

    def _classify_word(self, word: str) -> None:
        if re.fullmatch(Scanner.match_number, word) is not None:
            num = float(word)
            self._add_token(TokenType.NUMBER, num)
        else:
            if word.isidentifier():
                if word in self._keys:
                    ttype = self._keys[word]
                else:
                    ttype = TokenType.IDENTIFIER

                self._add_token(ttype)
            else:
                error_handler.report(self._line,
                                     word,
                                     "Invalid identifier.")

    def _match_bang(self) -> None:
        if self._is_next_char("="):
            self._add_token(TokenType.BANG_EQ)
        else:
            self._add_token(TokenType.BANG)

    def _match_eq(self) -> None:
        if self._is_next_char("="):
            self._add_token(TokenType.EQ_EQ)
        else:
            self._add_token(TokenType.EQ)

    def _match_gt(self) -> None:
        if self._is_next_char("="):
            self._add_token(TokenType.GTE)
        else:
            self._add_token(TokenType.GT)

    def _match_lt(self) -> None:
        if self._is_next_char("="):
            self._add_token(TokenType.LTE)
        else:
            self._add_token(TokenType.LT)

    def _match_slash(self) -> None:
        if self._is_next_char("/"):
            while self._peek() != "\n" and not self._is_at_end():
                self._advance()
        else:
            self._add_token(TokenType.SLASH)

    def _match_string(self) -> None:
        while self._peek() != '"' and not self._is_at_end():
            if self._peek() == "\n":
                self._line += 1

            self._advance()

        if self._is_at_end():
            error_handler.report(self._line, "", "Unterminated string")
            return

        self._advance()
        strval = self._source[(self._start + 1): (self._current - 1)]
        self._add_token(TokenType.STRING, strval)

    def _peek(self) -> str:
        ret_val = "\0"
        if not self._is_at_end():
            ret_val = self._source[self._current]

        return ret_val

    def _peek_next(self) -> str:
        ret_val = "\0"
        if self._current + 1 < len(self._source):
            ret_val = self._source[self._current + 1]

        return ret_val

    def _advance(self) -> str:
        char = self._source[self._current]
        self._current += 1
        return char

    def _add_token(self, ttype: TokenType, literal: str = None):
        text = self._source[self._start: self._current]
        self._tokens.append(Token(ttype, text, literal, self._line))

    def _is_next_char(self, expected: str) -> bool:
        if self._is_at_end() or self._source[self._current] != expected:
            return False

        self._current += 1
        return True
