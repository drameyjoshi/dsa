from token_types import TokenType

class Token:
    def __init__(self,
                 ttype: TokenType,
                 lexeme: str,
                 literal: str,
                 line: int):
        self._ttype = ttype
        self._lexeme = lexeme
        self._literal = literal
        self._line = line

    def __str__(self) -> str:
        return f"{self._ttype} {self._lexeme} {self._literal} {self._line}"
