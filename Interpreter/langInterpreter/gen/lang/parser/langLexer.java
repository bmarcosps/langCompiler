// Generated from C:/Users/bruno/IdeaProjects/langInterpreter/src\LangLexer.g4 by ANTLR 4.8
package lang.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_ROUND=1, CLOSE_ROUND=2, OPEN_SQUARE=3, CLOSE_SQUARE=4, OPEN_CURLY=5, 
		CLOSE_CURLY=6, SEMI_COLON=7, COMMA=8, COLON=9, COLONCOLON=10, DOT=11, 
		PLUS=12, MINUS=13, MULT=14, DIV=15, MOD=16, AND=17, NOT=18, EQ=19, EQEQ=20, 
		LESS=21, GREATER=22, NOTEQ=23, IF=24, ELSE=25, DATA=26, ITERATE=27, READ=28, 
		PRINT=29, RETURN=30, NEW=31, TYPE_INT=32, TYPE_CHAR=33, TYPE_BOOL=34, 
		TYPE_FLOAT=35, LITERAL_NULL=36, TRUE=37, FALSE=38, ID=39, LITERAL_INT=40, 
		LITERAL_FLOAT=41, LITERAL_CHAR=42, LITERAL_BOOL=43, NEWLINE=44, WHITESPACE=45, 
		LINE_COMMENT=46, MULTILNE_COMMENT=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "ALPHA", "OPEN_ROUND", "CLOSE_ROUND", "OPEN_SQUARE", "CLOSE_SQUARE", 
			"OPEN_CURLY", "CLOSE_CURLY", "SEMI_COLON", "COMMA", "COLON", "COLONCOLON", 
			"DOT", "PLUS", "MINUS", "MULT", "DIV", "MOD", "AND", "NOT", "EQ", "EQEQ", 
			"LESS", "GREATER", "NOTEQ", "IF", "ELSE", "DATA", "ITERATE", "READ", 
			"PRINT", "RETURN", "NEW", "TYPE_INT", "TYPE_CHAR", "TYPE_BOOL", "TYPE_FLOAT", 
			"LITERAL_NULL", "TRUE", "FALSE", "ID", "LITERAL_INT", "LITERAL_FLOAT", 
			"LITERAL_CHAR", "LITERAL_BOOL", "NEWLINE", "WHITESPACE", "LINE_COMMENT", 
			"MULTILNE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "','", "':'", 
			"'::'", "'.'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'!'", "'='", 
			"'=='", "'<'", "'>'", "'!='", "'if'", "'else'", "'data'", "'iterate'", 
			"'read'", "'print'", "'return'", "'new'", "'Int'", "'Char'", "'Bool'", 
			"'Float'", "'null'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_ROUND", "CLOSE_ROUND", "OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_CURLY", 
			"CLOSE_CURLY", "SEMI_COLON", "COMMA", "COLON", "COLONCOLON", "DOT", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "AND", "NOT", "EQ", "EQEQ", "LESS", "GREATER", 
			"NOTEQ", "IF", "ELSE", "DATA", "ITERATE", "READ", "PRINT", "RETURN", 
			"NEW", "TYPE_INT", "TYPE_CHAR", "TYPE_BOOL", "TYPE_FLOAT", "LITERAL_NULL", 
			"TRUE", "FALSE", "ID", "LITERAL_INT", "LITERAL_FLOAT", "LITERAL_CHAR", 
			"LITERAL_BOOL", "NEWLINE", "WHITESPACE", "LINE_COMMENT", "MULTILNE_COMMENT"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LangLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u013b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\7*\u00ef\n*\f*\16"+
		"*\u00f2\13*\3+\3+\7+\u00f6\n+\f+\16+\u00f9\13+\3,\7,\u00fc\n,\f,\16,\u00ff"+
		"\13,\3,\3,\6,\u0103\n,\r,\16,\u0104\3-\3-\3-\3-\5-\u010b\n-\3-\3-\3.\3"+
		".\5.\u0111\n.\3/\3/\5/\u0115\n/\3/\5/\u0118\n/\3/\3/\3\60\6\60\u011d\n"+
		"\60\r\60\16\60\u011e\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0127\n\61\f\61"+
		"\16\61\u012a\13\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0132\n\62\f\62"+
		"\16\62\u0135\13\62\3\62\3\62\3\62\3\62\3\62\3\u0133\2\63\3\2\5\2\7\3\t"+
		"\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22"+
		"\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G"+
		"#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61\3\2\b\3\2\62;\4\2C\\c|\5\2$$))^^\t"+
		"\2$$))^^ddppttvv\4\2\13\13\"\"\4\2\f\f\17\17\2\u0145\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i"+
		"\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23"+
		"u\3\2\2\2\25w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33~\3\2\2\2\35\u0080\3\2"+
		"\2\2\37\u0082\3\2\2\2!\u0084\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u008a"+
		"\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0094\3\2\2\2\61"+
		"\u0096\3\2\2\2\63\u0098\3\2\2\2\65\u009b\3\2\2\2\67\u009e\3\2\2\29\u00a3"+
		"\3\2\2\2;\u00a8\3\2\2\2=\u00b0\3\2\2\2?\u00b5\3\2\2\2A\u00bb\3\2\2\2C"+
		"\u00c2\3\2\2\2E\u00c6\3\2\2\2G\u00ca\3\2\2\2I\u00cf\3\2\2\2K\u00d4\3\2"+
		"\2\2M\u00da\3\2\2\2O\u00df\3\2\2\2Q\u00e4\3\2\2\2S\u00ea\3\2\2\2U\u00f3"+
		"\3\2\2\2W\u00fd\3\2\2\2Y\u0106\3\2\2\2[\u0110\3\2\2\2]\u0117\3\2\2\2_"+
		"\u011c\3\2\2\2a\u0122\3\2\2\2c\u012d\3\2\2\2ef\t\2\2\2f\4\3\2\2\2gh\t"+
		"\3\2\2h\6\3\2\2\2ij\7*\2\2j\b\3\2\2\2kl\7+\2\2l\n\3\2\2\2mn\7]\2\2n\f"+
		"\3\2\2\2op\7_\2\2p\16\3\2\2\2qr\7}\2\2r\20\3\2\2\2st\7\177\2\2t\22\3\2"+
		"\2\2uv\7=\2\2v\24\3\2\2\2wx\7.\2\2x\26\3\2\2\2yz\7<\2\2z\30\3\2\2\2{|"+
		"\7<\2\2|}\7<\2\2}\32\3\2\2\2~\177\7\60\2\2\177\34\3\2\2\2\u0080\u0081"+
		"\7-\2\2\u0081\36\3\2\2\2\u0082\u0083\7/\2\2\u0083 \3\2\2\2\u0084\u0085"+
		"\7,\2\2\u0085\"\3\2\2\2\u0086\u0087\7\61\2\2\u0087$\3\2\2\2\u0088\u0089"+
		"\7\'\2\2\u0089&\3\2\2\2\u008a\u008b\7(\2\2\u008b\u008c\7(\2\2\u008c(\3"+
		"\2\2\2\u008d\u008e\7#\2\2\u008e*\3\2\2\2\u008f\u0090\7?\2\2\u0090,\3\2"+
		"\2\2\u0091\u0092\7?\2\2\u0092\u0093\7?\2\2\u0093.\3\2\2\2\u0094\u0095"+
		"\7>\2\2\u0095\60\3\2\2\2\u0096\u0097\7@\2\2\u0097\62\3\2\2\2\u0098\u0099"+
		"\7#\2\2\u0099\u009a\7?\2\2\u009a\64\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7h\2\2\u009d\66\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1"+
		"\7u\2\2\u00a1\u00a2\7g\2\2\u00a28\3\2\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5"+
		"\7c\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7c\2\2\u00a7:\3\2\2\2\u00a8\u00a9"+
		"\7k\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7g\2\2\u00af<\3\2\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7f\2\2"+
		"\u00b4>\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7k\2"+
		"\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba@\3\2\2\2\u00bb\u00bc\7"+
		"t\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0"+
		"\7t\2\2\u00c0\u00c1\7p\2\2\u00c1B\3\2\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7y\2\2\u00c5D\3\2\2\2\u00c6\u00c7\7K\2\2\u00c7\u00c8"+
		"\7p\2\2\u00c8\u00c9\7v\2\2\u00c9F\3\2\2\2\u00ca\u00cb\7E\2\2\u00cb\u00cc"+
		"\7j\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7t\2\2\u00ceH\3\2\2\2\u00cf\u00d0"+
		"\7D\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7n\2\2\u00d3"+
		"J\3\2\2\2\u00d4\u00d5\7H\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7q\2\2\u00d7"+
		"\u00d8\7c\2\2\u00d8\u00d9\7v\2\2\u00d9L\3\2\2\2\u00da\u00db\7p\2\2\u00db"+
		"\u00dc\7w\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7n\2\2\u00deN\3\2\2\2\u00df"+
		"\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7g\2\2"+
		"\u00e3P\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7n\2"+
		"\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9R\3\2\2\2\u00ea\u00f0\5"+
		"\5\3\2\u00eb\u00ef\5\5\3\2\u00ec\u00ef\5\3\2\2\u00ed\u00ef\7a\2\2\u00ee"+
		"\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1T\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f3\u00f7\5\3\2\2\u00f4\u00f6\5\3\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8V\3\2\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5\3\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0102\7\60\2\2\u0101\u0103\5\3\2\2\u0102\u0101\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"X\3\2\2\2\u0106\u010a\7)\2\2\u0107\u010b\n\4\2\2\u0108\u0109\7^\2\2\u0109"+
		"\u010b\t\5\2\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\7)\2\2\u010dZ\3\2\2\2\u010e\u0111\5O(\2\u010f\u0111\5"+
		"Q)\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\\\3\2\2\2\u0112\u0114"+
		"\7\17\2\2\u0113\u0115\7\f\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2"+
		"\u0115\u0118\3\2\2\2\u0116\u0118\7\f\2\2\u0117\u0112\3\2\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b/\2\2\u011a^\3\2\2\2\u011b\u011d"+
		"\t\6\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b\60\2\2\u0121`\3\2\2\2"+
		"\u0122\u0123\7/\2\2\u0123\u0124\7/\2\2\u0124\u0128\3\2\2\2\u0125\u0127"+
		"\n\7\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\b\61"+
		"\2\2\u012cb\3\2\2\2\u012d\u012e\7}\2\2\u012e\u012f\7/\2\2\u012f\u0133"+
		"\3\2\2\2\u0130\u0132\13\2\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0136\u0137\7/\2\2\u0137\u0138\7\177\2\2\u0138\u0139\3\2\2\2"+
		"\u0139\u013a\b\62\2\2\u013ad\3\2\2\2\17\2\u00ee\u00f0\u00f7\u00fd\u0104"+
		"\u010a\u0110\u0114\u0117\u011e\u0128\u0133\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}