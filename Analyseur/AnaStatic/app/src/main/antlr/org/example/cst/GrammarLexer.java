// Generated from Grammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INT=4, BOOL=5, ELSE=6, PRINT=7, NUM=8, TRUE=9, 
		FALSE=10, LPAR=11, RPAR=12, LBRACKET=13, RBRACKET=14, LCBRACKET=15, RCBRACKET=16, 
		COMMA=17, DOT=18, SEMICOLON=19, ADD=20, SUBTRACT=21, MULTIPLY=22, DIVIDE=23, 
		GREATER=24, GREATER_EQUAL=25, LESS=26, LESS_EQUAL=27, EQUAL=28, DIFFERENT=29, 
		RETURN=30, ASSIGN=31, AND=32, OR=33, COMMENT=34, NEWLINE=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "INT", "BOOL", "ELSE", "PRINT", "DIGIT", "NUM", 
			"TRUE", "FALSE", "LPAR", "RPAR", "LBRACKET", "RBRACKET", "LCBRACKET", 
			"RCBRACKET", "COMMA", "DOT", "SEMICOLON", "ADD", "SUBTRACT", "MULTIPLY", 
			"DIVIDE", "GREATER", "GREATER_EQUAL", "LESS", "LESS_EQUAL", "EQUAL", 
			"DIFFERENT", "RETURN", "ASSIGN", "AND", "OR", "LETTER", "COMMENT", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'if'", "'while'", "'int'", "'bool'", "'else'", "'print'", 
			null, "'true'", "'false'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"','", "'.'", "';'", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", 
			"'<='", "'=='", "'!='", "'return'", "'='", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INT", "BOOL", "ELSE", "PRINT", "NUM", "TRUE", 
			"FALSE", "LPAR", "RPAR", "LBRACKET", "RBRACKET", "LCBRACKET", "RCBRACKET", 
			"COMMA", "DOT", "SEMICOLON", "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", 
			"GREATER", "GREATER_EQUAL", "LESS", "LESS_EQUAL", "EQUAL", "DIFFERENT", 
			"RETURN", "ASSIGN", "AND", "OR", "COMMENT", "NEWLINE", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\u0004\u0000$\u00ed\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004\bw\b\b\u000b\b\f\b"+
		"x\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0005#\u00c6"+
		"\b#\n#\f#\u00c9\t#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u00d1"+
		"\b#\n#\f#\u00d4\t#\u0001#\u0003#\u00d7\b#\u0001#\u0003#\u00da\b#\u0003"+
		"#\u00dc\b#\u0001#\u0001#\u0001$\u0003$\u00e1\b$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0004%\u00e8\b%\u000b%\f%\u00e9\u0001%\u0001%\u0002\u00c7\u00d2"+
		"\u0000&\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\u0000\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019\f"+
		"\u001b\r\u001d\u000e\u001f\u000f!\u0010#\u0011%\u0012\'\u0013)\u0014+"+
		"\u0015-\u0016/\u00171\u00183\u00195\u001a7\u001b9\u001c;\u001d=\u001e"+
		"?\u001fA C!E\u0000G\"I#K$\u0001\u0000\u0004\u0001\u000009\u0002\u0000"+
		"AZaz\u0001\u0001\n\n\u0002\u0000\t\t  \u00f1\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0001M\u0001\u0000\u0000\u0000\u0003V\u0001\u0000\u0000\u0000\u0005Y"+
		"\u0001\u0000\u0000\u0000\u0007_\u0001\u0000\u0000\u0000\tc\u0001\u0000"+
		"\u0000\u0000\u000bh\u0001\u0000\u0000\u0000\rm\u0001\u0000\u0000\u0000"+
		"\u000fs\u0001\u0000\u0000\u0000\u0011v\u0001\u0000\u0000\u0000\u0013z"+
		"\u0001\u0000\u0000\u0000\u0015\u007f\u0001\u0000\u0000\u0000\u0017\u0085"+
		"\u0001\u0000\u0000\u0000\u0019\u0087\u0001\u0000\u0000\u0000\u001b\u0089"+
		"\u0001\u0000\u0000\u0000\u001d\u008b\u0001\u0000\u0000\u0000\u001f\u008d"+
		"\u0001\u0000\u0000\u0000!\u008f\u0001\u0000\u0000\u0000#\u0091\u0001\u0000"+
		"\u0000\u0000%\u0093\u0001\u0000\u0000\u0000\'\u0095\u0001\u0000\u0000"+
		"\u0000)\u0097\u0001\u0000\u0000\u0000+\u0099\u0001\u0000\u0000\u0000-"+
		"\u009b\u0001\u0000\u0000\u0000/\u009d\u0001\u0000\u0000\u00001\u009f\u0001"+
		"\u0000\u0000\u00003\u00a1\u0001\u0000\u0000\u00005\u00a4\u0001\u0000\u0000"+
		"\u00007\u00a6\u0001\u0000\u0000\u00009\u00a9\u0001\u0000\u0000\u0000;"+
		"\u00ac\u0001\u0000\u0000\u0000=\u00af\u0001\u0000\u0000\u0000?\u00b6\u0001"+
		"\u0000\u0000\u0000A\u00b8\u0001\u0000\u0000\u0000C\u00bc\u0001\u0000\u0000"+
		"\u0000E\u00bf\u0001\u0000\u0000\u0000G\u00db\u0001\u0000\u0000\u0000I"+
		"\u00e0\u0001\u0000\u0000\u0000K\u00e7\u0001\u0000\u0000\u0000MN\u0005"+
		"f\u0000\u0000NO\u0005u\u0000\u0000OP\u0005n\u0000\u0000PQ\u0005c\u0000"+
		"\u0000QR\u0005t\u0000\u0000RS\u0005i\u0000\u0000ST\u0005o\u0000\u0000"+
		"TU\u0005n\u0000\u0000U\u0002\u0001\u0000\u0000\u0000VW\u0005i\u0000\u0000"+
		"WX\u0005f\u0000\u0000X\u0004\u0001\u0000\u0000\u0000YZ\u0005w\u0000\u0000"+
		"Z[\u0005h\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005l\u0000\u0000]^\u0005"+
		"e\u0000\u0000^\u0006\u0001\u0000\u0000\u0000_`\u0005i\u0000\u0000`a\u0005"+
		"n\u0000\u0000ab\u0005t\u0000\u0000b\b\u0001\u0000\u0000\u0000cd\u0005"+
		"b\u0000\u0000de\u0005o\u0000\u0000ef\u0005o\u0000\u0000fg\u0005l\u0000"+
		"\u0000g\n\u0001\u0000\u0000\u0000hi\u0005e\u0000\u0000ij\u0005l\u0000"+
		"\u0000jk\u0005s\u0000\u0000kl\u0005e\u0000\u0000l\f\u0001\u0000\u0000"+
		"\u0000mn\u0005p\u0000\u0000no\u0005r\u0000\u0000op\u0005i\u0000\u0000"+
		"pq\u0005n\u0000\u0000qr\u0005t\u0000\u0000r\u000e\u0001\u0000\u0000\u0000"+
		"st\u0007\u0000\u0000\u0000t\u0010\u0001\u0000\u0000\u0000uw\u0003\u000f"+
		"\u0007\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0012\u0001\u0000\u0000"+
		"\u0000z{\u0005t\u0000\u0000{|\u0005r\u0000\u0000|}\u0005u\u0000\u0000"+
		"}~\u0005e\u0000\u0000~\u0014\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"f\u0000\u0000\u0080\u0081\u0005a\u0000\u0000\u0081\u0082\u0005l\u0000"+
		"\u0000\u0082\u0083\u0005s\u0000\u0000\u0083\u0084\u0005e\u0000\u0000\u0084"+
		"\u0016\u0001\u0000\u0000\u0000\u0085\u0086\u0005(\u0000\u0000\u0086\u0018"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005)\u0000\u0000\u0088\u001a\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005[\u0000\u0000\u008a\u001c\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005]\u0000\u0000\u008c\u001e\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005{\u0000\u0000\u008e \u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005}\u0000\u0000\u0090\"\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005,\u0000\u0000\u0092$\u0001\u0000\u0000\u0000\u0093\u0094\u0005."+
		"\u0000\u0000\u0094&\u0001\u0000\u0000\u0000\u0095\u0096\u0005;\u0000\u0000"+
		"\u0096(\u0001\u0000\u0000\u0000\u0097\u0098\u0005+\u0000\u0000\u0098*"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005-\u0000\u0000\u009a,\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005*\u0000\u0000\u009c.\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005/\u0000\u0000\u009e0\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005>\u0000\u0000\u00a02\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005>"+
		"\u0000\u0000\u00a2\u00a3\u0005=\u0000\u0000\u00a34\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005<\u0000\u0000\u00a56\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005<\u0000\u0000\u00a7\u00a8\u0005=\u0000\u0000\u00a88\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005=\u0000\u0000\u00aa\u00ab\u0005=\u0000\u0000"+
		"\u00ab:\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005!\u0000\u0000\u00ad\u00ae"+
		"\u0005=\u0000\u0000\u00ae<\u0001\u0000\u0000\u0000\u00af\u00b0\u0005r"+
		"\u0000\u0000\u00b0\u00b1\u0005e\u0000\u0000\u00b1\u00b2\u0005t\u0000\u0000"+
		"\u00b2\u00b3\u0005u\u0000\u0000\u00b3\u00b4\u0005r\u0000\u0000\u00b4\u00b5"+
		"\u0005n\u0000\u0000\u00b5>\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005="+
		"\u0000\u0000\u00b7@\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005a\u0000\u0000"+
		"\u00b9\u00ba\u0005n\u0000\u0000\u00ba\u00bb\u0005d\u0000\u0000\u00bbB"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005o\u0000\u0000\u00bd\u00be\u0005"+
		"r\u0000\u0000\u00beD\u0001\u0000\u0000\u0000\u00bf\u00c0\u0007\u0001\u0000"+
		"\u0000\u00c0F\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005/\u0000\u0000\u00c2"+
		"\u00c3\u0005*\u0000\u0000\u00c3\u00c7\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\t\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005*\u0000\u0000\u00cb\u00dc\u0005/\u0000"+
		"\u0000\u00cc\u00cd\u0005/\u0000\u0000\u00cd\u00ce\u0005/\u0000\u0000\u00ce"+
		"\u00d2\u0001\u0000\u0000\u0000\u00cf\u00d1\t\u0000\u0000\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d7"+
		"\u0005\r\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00da\u0007"+
		"\u0002\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dc\u0001"+
		"\u0000\u0000\u0000\u00db\u00c1\u0001\u0000\u0000\u0000\u00db\u00cc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0006"+
		"#\u0000\u0000\u00deH\u0001\u0000\u0000\u0000\u00df\u00e1\u0005\r\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\n\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0006$\u0000\u0000\u00e5"+
		"J\u0001\u0000\u0000\u0000\u00e6\u00e8\u0007\u0003\u0000\u0000\u00e7\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0006%\u0000\u0000\u00ecL\u0001\u0000"+
		"\u0000\u0000\t\u0000x\u00c7\u00d2\u00d6\u00d9\u00db\u00e0\u00e9\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}