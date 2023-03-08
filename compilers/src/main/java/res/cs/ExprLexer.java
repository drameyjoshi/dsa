// Generated from Expr.g4 by ANTLR 4.12.0
package res.cs;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, NUMBER=2, DIGIT=3, INT=4, REAL=5, ASSIGN=6, LPAREN=7, RPAREN=8, 
		PLUS=9, MINUS=10, MUL=11, DIV=12, EXPONENT=13, NEWLINE=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "NUMBER", "DIGIT", "INT", "REAL", "ASSIGN", "LPAREN", "RPAREN", 
			"PLUS", "MINUS", "MUL", "DIV", "EXPONENT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'='", "'('", "')'", "'+'", "'-'", 
			"'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "NUMBER", "DIGIT", "INT", "REAL", "ASSIGN", "LPAREN", "RPAREN", 
			"PLUS", "MINUS", "MUL", "DIV", "EXPONENT", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000f_\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\'\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003"+
		",\b\u0003\u000b\u0003\f\u0003-\u0001\u0004\u0004\u00041\b\u0004\u000b"+
		"\u0004\f\u00042\u0001\u0004\u0001\u0004\u0005\u00047\b\u0004\n\u0004\f"+
		"\u0004:\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004>\b\u0004\u000b\u0004"+
		"\f\u0004?\u0003\u0004B\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0003\rU\b\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0004\u000eZ\b\u000e\u000b\u000e\f\u000e"+
		"[\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0003"+
		"\u0002\u0000AZaz\u0001\u000009\u0002\u0000\t\t  g\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0001 \u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u0005("+
		"\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\tA\u0001\u0000"+
		"\u0000\u0000\u000bC\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000"+
		"\u000fG\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000\u0013K"+
		"\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017O\u0001\u0000"+
		"\u0000\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bT\u0001\u0000\u0000\u0000"+
		"\u001dY\u0001\u0000\u0000\u0000\u001f!\u0007\u0000\u0000\u0000 \u001f"+
		"\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$\'\u0003"+
		"\u0007\u0003\u0000%\'\u0003\t\u0004\u0000&$\u0001\u0000\u0000\u0000&%"+
		"\u0001\u0000\u0000\u0000\'\u0004\u0001\u0000\u0000\u0000()\u0007\u0001"+
		"\u0000\u0000)\u0006\u0001\u0000\u0000\u0000*,\u0007\u0001\u0000\u0000"+
		"+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.\b\u0001\u0000\u0000\u0000/1\u0007\u0001"+
		"\u0000\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"48\u0005.\u0000\u000057\u0003\u0005\u0002\u000065\u0001\u0000\u0000\u0000"+
		"7:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009B\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;=\u0005.\u0000"+
		"\u0000<>\u0003\u0005\u0002\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001"+
		"\u0000\u0000\u0000A0\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000"+
		"B\n\u0001\u0000\u0000\u0000CD\u0005=\u0000\u0000D\f\u0001\u0000\u0000"+
		"\u0000EF\u0005(\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005)\u0000"+
		"\u0000H\u0010\u0001\u0000\u0000\u0000IJ\u0005+\u0000\u0000J\u0012\u0001"+
		"\u0000\u0000\u0000KL\u0005-\u0000\u0000L\u0014\u0001\u0000\u0000\u0000"+
		"MN\u0005*\u0000\u0000N\u0016\u0001\u0000\u0000\u0000OP\u0005/\u0000\u0000"+
		"P\u0018\u0001\u0000\u0000\u0000QR\u0005^\u0000\u0000R\u001a\u0001\u0000"+
		"\u0000\u0000SU\u0005\r\u0000\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005\n\u0000\u0000W\u001c\u0001"+
		"\u0000\u0000\u0000XZ\u0007\u0002\u0000\u0000YX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u0006\u000e\u0000\u0000^\u001e\u0001"+
		"\u0000\u0000\u0000\n\u0000\"&-28?AT[\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}