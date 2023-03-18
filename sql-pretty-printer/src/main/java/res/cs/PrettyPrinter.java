package res.cs;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.v4.runtime.Token;

public class PrettyPrinter {
    public PrettyPrinter() {
        keywordFlags = new boolean[NUM_TOKEN_TYPES];
        Arrays.fill(keywordFlags, true);
        for (int i = 0; i < NON_KEYWORD_TYPES.length; i++) {
            keywordFlags[NON_KEYWORD_TYPES[i] - 1] = false;
        }

        setTabWidth(4);
        this.uppercaseKeyword = false;        
        sb = new StringBuilder();
    }

    public int getTabWidth() {        
        return tabWidth;
    }

    public void setTabWidth(int tabWidth) {
        this.tabWidth = tabWidth;
        StringBuilder tabs = new StringBuilder();
        
        for (int i = 0; i < tabWidth; i++) {
            tabs.append(" ");
        }
        tab = tabs.toString();
    }

    public boolean isUppercaseKeyword() {
        return uppercaseKeyword;
    }

    public void setUppercaseKeyword(boolean uppercaseKeyword) {
        this.uppercaseKeyword = uppercaseKeyword;
    }

    public String buildFormattedStatement(final List<? extends Token> tokens) {
        for (Token t : tokens) {
            if (isKeyword(t)) {
                formatKeyword(t);
            } else {
                if (t.getType() == SqlBaseLexer.COMMA) {
                    addString(t.getText());              
                    addNewLine();
                    indent();
                } else if (t.getType() == SqlBaseLexer.WS) {
                    addString(" ");                    
                } else if (t.getType() == SqlBaseLexer.LEFT_PAREN) {
                    addString(t.getText());
                    addNewLine();
                    indentLevel++;                    
                } else if (t.getType() == SqlBaseLexer.RIGHT_PAREN) {
                    addNewLine();
                    indentLevel -= 2;
                    indent();
                    addString(t.getText());
                } else {                    
                    addString(t.getText());
                }
            }
        }

        return sb.toString();
    }

    public void showTokens(final List<? extends Token> tokens) {
        for (Token token : tokens) {
            String tokenClass = keywordFlags[token.getType()] ? "Keyword" : "Non-keyword";
            logger.log(Level.INFO, () -> String.format("Type: %s, Class: %s, text: %s", token.getType(), tokenClass, token.getText()));
        }
    }
    
    private void formatKeyword(Token token) {        
        if (token.getType() == SqlBaseLexer.SELECT) {
            indent();
            addString(getAppropriateCase(token));
            addNewLine();
            indentLevel++;
            indent();
        } else if (token.getType() == SqlBaseLexer.FROM) {
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
        } else {
            addString(getAppropriateCase(token));
        }
    }
    
    private String getAppropriateCase(Token token) {
        return uppercaseKeyword ? token.getText().toUpperCase() : token.getText().toLowerCase();
    }

    private boolean isKeyword(Token token) {
        return keywordFlags[token.getType()];
    }

    private void indent() {
        for (int i = 0; i < indentLevel; i++) {
            sb.append(tab);
        }
    }
    
    private void addString(String s) {
        logger.log(Level.FINE, () -> String.format("Appending %s", s));
        sb.append(s);
    }
    
    private void addNewLine() {
        sb.append("\n");
    }
    
    private boolean[] keywordFlags;
    private int indentLevel = 0;
    private int tabWidth;
    private String tab;
    private StringBuilder sb;
    private boolean uppercaseKeyword;

    // There are a large number of constants defined in the class SqlBaseLexer. The largest of them is 346.
    // This it the number of distinct token types recognised by this Lexer.
    private static final int NUM_TOKEN_TYPES = 346;
    // A token is either a keyword or not. These constants indicate tokens that are *not* keywords. The rhs of
    // this statement is generated by the shell scripts under src/main/bash from the files SqlBaseLexer.java that
    // is generated by Antlr4 tool and the SqlBaseLexer.g4 which has the definitions of all lexemes recognised
    // by the grammar.
    private static final int[] NON_KEYWORD_TYPES = { 1, 2, 3, 4, 5, 6, 7, 308, 309, 310, 311, 312, 313, 314, 315, 316,
            318, 319, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339,
            340, 341, 342, 343, 344, 345, 346 };
    private static final Logger logger = Logger.getLogger(PrettyPrinter.class.getName());
}