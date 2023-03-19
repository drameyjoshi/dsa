package res.cs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.v4.runtime.Token;

public class PrettyPrinter {
    // There are a large number of constants defined in the class SqlBaseLexer. The
    // largest of them is 346.
    // This it the number of distinct token types recognised by this Lexer.
    private static final int NUM_TOKEN_TYPES = 346;

    // A token is either a keyword or not. These constants indicate tokens that are
    // *not* keywords. The rhs of this statement is generated by the shell scripts
    // under src/main/bash from the files SqlBaseLexer.java that is generated by
    // Antlr4 tool and the SqlBaseLexer.g4 which has the definitions of all
    // lexemes recognised by the grammar.
    private static final int[] NON_KEYWORD_TYPES = { 1, 2, 3, 4, 5, 6, 7, 308, 309, 310, 311, 312, 313, 314, 315, 316,
            318, 319, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339,
            340, 341, 342, 343, 344, 345, 346 };

    private static final Logger logger = Logger.getLogger(PrettyPrinter.class.getName());

    private boolean[] keywordFlags;

    private int indentLevel = 0;

    private int tabWidth;

    private String tab;

    private StringBuilder sb;

    private boolean uppercaseKeyword;

    private boolean functionCall;

    private boolean previousWS;

    public PrettyPrinter() {
        keywordFlags = new boolean[NUM_TOKEN_TYPES];
        Arrays.fill(keywordFlags, true);
        for (int i = 0; i < NON_KEYWORD_TYPES.length; i++) {
            keywordFlags[NON_KEYWORD_TYPES[i] - 1] = false;
        }

        setTabWidth(4);
        this.uppercaseKeyword = false;
        sb = new StringBuilder();

        functionCall = false;
        previousWS = false;
    }

    private void addNewLine() {
        sb.append("\n");
        previousWS = true;
    }

    private void addString(String s) {
        logger.log(Level.FINE, () -> String.format("Appending %s", s));
        sb.append(s);
        previousWS = false;
    }

    public String buildFormattedStatement(final List<? extends Token> tokens) {
        Token prev = null;

        for (Token t : tokens) {
            if (isKeyword(Optional.of(t))) {
                formatKeyword(t, prev);
            } else if (t.getType() == SqlBaseLexer.COMMA) {
                formatComma(t);
            } else if (t.getType() == SqlBaseLexer.WS) {
                formatWS();
            } else if (t.getType() == SqlBaseLexer.LEFT_PAREN) {
                formatLParen(t, prev);
            } else if (t.getType() == SqlBaseLexer.RIGHT_PAREN) {
                formatRParen(t);
            } else if (isBinaryOperator(t)) {
                formatBinaryOp(t);
            } else {
                addString(t.getText());
            }

            if (t.getType() != SqlBaseLexer.WS) {
                prev = t;
            } else {
                previousWS = true;
            }
        }

        addNewLine();
        return sb.toString();

    }

    private void formatBinaryOp(Token t) {
        addString(t.getText());
        addString(" ");
        previousWS = true;
    }

    private void formatComma(Token t) {
        addString(t.getText());
        addNewLine();
        indent();
    }

    private void formatKeyword(Token token, Token prev) {
        if (token.getType() == SqlBaseLexer.SELECT) {
            if (prev != null && prev.getType() != SqlBaseLexer.LEFT_PAREN) {
                indent();
            }
            addString(getAppropriateCase(token));
            addNewLine();
            indentLevel++;
            indent();
        } else if (token.getType() == SqlBaseLexer.FROM || token.getType() == SqlBaseLexer.HAVING
                || token.getType() == SqlBaseLexer.WHERE) {
            addNewLine();
            --indentLevel;
            indent();
            addString(getAppropriateCase(token));
            addNewLine();
            ++indentLevel;
            indent();
        } else if (token.getType() == SqlBaseLexer.JOIN) {
            addString(getAppropriateCase(token));
            addNewLine();
            indent();
        } else if (token.getType() == SqlBaseLexer.UNION) {
            addNewLine();
            --indentLevel;
            indent();
            addString(getAppropriateCase(token));
            addNewLine();
        } else if (token.getType() == SqlBaseLexer.GROUP) {
            addNewLine();
            --indentLevel;
            indent();
            addString(getAppropriateCase(token));
        } else if (token.getType() == SqlBaseLexer.BY) {
            addString(getAppropriateCase(token));
            addNewLine();
            ++indentLevel;
            indent();
        } else if (token.getType() == SqlBaseLexer.CASE) {
            addString(getAppropriateCase(token));
            addNewLine();
            indentLevel++;
            indent();
        } else if (token.getType() == SqlBaseLexer.END) {
            addNewLine();
            indentLevel--;
            indent();
            addString(getAppropriateCase(token));
        } else {
            addString(getAppropriateCase(token));
        }
    }

    private void formatLParen(Token t, Token prev) {
        addString(t.getText());
        if (isKeyword(Optional.of(prev))) {
            addNewLine();
            indentLevel++;
            indent();
        } else {
            functionCall = true;
            previousWS = false;
        }
    }

    private void formatRParen(Token t) {
        if (!functionCall) {
            addNewLine();
            indentLevel -= 2;
            indent();
        }

        addString(t.getText());
        if (!functionCall) {
            addNewLine();
        } else {
            previousWS = false;
        }

        functionCall = false;
    }

    private void formatWS() {
        if (!previousWS) {
            addString(" ");
        }
        previousWS = true;
    }

    private String getAppropriateCase(Token token) {
        return uppercaseKeyword ? token.getText().toUpperCase() : token.getText().toLowerCase();
    }

    public int getTabWidth() {
        return tabWidth;
    }

    private void indent() {
        for (int i = 0; i < indentLevel; i++) {
            sb.append(tab);
        }
        previousWS = true;
    }

    private boolean isBinaryOperator(Token t) {
        return t.getType() == SqlBaseLexer.EQ || t.getType() == SqlBaseLexer.NEQ || t.getType() == SqlBaseLexer.PLUS
                || t.getType() == SqlBaseLexer.MINUS || t.getType() == SqlBaseLexer.ASTERISK
                || t.getType() == SqlBaseLexer.SLASH || t.getType() == SqlBaseLexer.PIPE
                || t.getType() == SqlBaseLexer.CONCAT_PIPE;
    }

    private boolean isIdentifier(Optional<Token> t) {
        if (t.isPresent()) {
            return t.get().getType() == SqlBaseLexer.IDENTIFIER
                    || t.get().getType() == SqlBaseLexer.BACKQUOTED_IDENTIFIER;
        } else {
            return false;
        }
    }

    private boolean isKeyword(Optional<Token> token) {
        boolean result = false;

        if (token.isPresent()) {
            int ttype = token.get().getType();
            if (ttype < 346) {
                result = keywordFlags[ttype];
            }
        }

        return result;
    }

    public boolean isUppercaseKeyword() {
        return uppercaseKeyword;
    }

    public void setTabWidth(int tabWidth) {
        this.tabWidth = tabWidth;
        StringBuilder tabs = new StringBuilder();

        for (int i = 0; i < tabWidth; i++) {
            tabs.append(" ");
        }
        tab = tabs.toString();
    }

    public void setUppercaseKeyword(boolean uppercaseKeyword) {
        this.uppercaseKeyword = uppercaseKeyword;
    }

    public void showTokens(final List<? extends Token> tokens) {
        for (Token token : tokens) {
            String tokenClass = isKeyword(Optional.of(token)) ? "Keyword" : "Non-keyword";
            logger.log(Level.INFO,
                    () -> String.format("Type: %s, Class: %s, text: %s", token.getType(), tokenClass, token.getText()));
        }
    }
}
