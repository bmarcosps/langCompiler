// Generated from C:/Users/bruno/IdeaProjects/langInterpreter/src\LangParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_data = 1, RULE_decl = 2, RULE_func = 3, RULE_params = 4, 
		RULE_param = 5, RULE_type = 6, RULE_btype = 7, RULE_cmd = 8, RULE_exp = 9, 
		RULE_rexp = 10, RULE_aexp = 11, RULE_mexp = 12, RULE_sexp = 13, RULE_pexp = 14, 
		RULE_lvalue = 15, RULE_exps = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "data", "decl", "func", "params", "param", "type", "btype", "cmd", 
			"exp", "rexp", "aexp", "mexp", "sexp", "pexp", "lvalue", "exps"
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

	@Override
	public String getGrammarFileName() { return "LangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA) {
				{
				{
				setState(34);
				data();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(40);
				func();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode DATA() { return getToken(LangParser.DATA, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(LangParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(LangParser.CLOSE_CURLY, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(DATA);
			setState(47);
			((DataContext)_localctx).ID = match(ID);
			setState(48);
			match(OPEN_CURLY);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(49);
				decl();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(CLOSE_CURLY);
			 if(!Character.isUpperCase((((DataContext)_localctx).ID!=null?((DataContext)_localctx).ID.getText():null).charAt(0))) throw new ParseCancellationException("Id types must start with Uppercase");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode COLONCOLON() { return getToken(LangParser.COLONCOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(LangParser.SEMI_COLON, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(59);
			match(COLONCOLON);
			setState(60);
			type(0);
			setState(61);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode OPEN_ROUND() { return getToken(LangParser.OPEN_ROUND, 0); }
		public TerminalNode CLOSE_ROUND() { return getToken(LangParser.CLOSE_ROUND, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(LangParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(LangParser.CLOSE_CURLY, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LangParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ID);
			setState(64);
			match(OPEN_ROUND);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(65);
				params();
				}
			}

			setState(68);
			match(CLOSE_ROUND);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(69);
				match(COLON);
				setState(70);
				type(0);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(71);
					match(COMMA);
					setState(72);
					type(0);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(80);
			match(OPEN_CURLY);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_CURLY) | (1L << IF) | (1L << ITERATE) | (1L << READ) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(81);
				cmd();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			param();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(90);
				match(COMMA);
				setState(91);
				param();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode COLONCOLON() { return getToken(LangParser.COLONCOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ID);
			setState(98);
			match(COLONCOLON);
			setState(99);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeArrayContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_SQUARE() { return getToken(LangParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(LangParser.CLOSE_SQUARE, 0); }
		public TypeArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitTypeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeBtypeContext extends TypeContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public TypeBtypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterTypeBtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitTypeBtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitTypeBtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TypeBtypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(102);
			btype();
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeArrayContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(104);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(105);
					match(OPEN_SQUARE);
					setState(106);
					match(CLOSE_SQUARE);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BtypeContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode TYPE_INT() { return getToken(LangParser.TYPE_INT, 0); }
		public TerminalNode TYPE_CHAR() { return getToken(LangParser.TYPE_CHAR, 0); }
		public TerminalNode TYPE_BOOL() { return getToken(LangParser.TYPE_BOOL, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(LangParser.TYPE_FLOAT, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public BtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterBtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitBtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitBtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_btype);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(TYPE_INT);
				}
				break;
			case TYPE_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(TYPE_CHAR);
				}
				break;
			case TYPE_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(TYPE_BOOL);
				}
				break;
			case TYPE_FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(TYPE_FLOAT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				((BtypeContext)_localctx).ID = match(ID);
				 if(!Character.isUpperCase((((BtypeContext)_localctx).ID!=null?((BtypeContext)_localctx).ID.getText():null).charAt(0))) throw new ParseCancellationException("Id types must start with Uppercase");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	 
		public CmdContext() { }
		public void copyFrom(CmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmdIfContext extends CmdContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode OPEN_ROUND() { return getToken(LangParser.OPEN_ROUND, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_ROUND() { return getToken(LangParser.CLOSE_ROUND, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdIfContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitCmdIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmdIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdReadContext extends CmdContext {
		public TerminalNode READ() { return getToken(LangParser.READ, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(LangParser.SEMI_COLON, 0); }
		public CmdReadContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitCmdRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmdRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdAssignContext extends CmdContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(LangParser.SEMI_COLON, 0); }
		public CmdAssignContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterCmdAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitCmdAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmdAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdReturnContext extends CmdContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(LangParser.SEMI_COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public CmdReturnContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterCmdReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitCmdReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmdReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdFunctionCallContext extends CmdContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode OPEN_ROUND() { return getToken(LangParser.OPEN_ROUND, 0); }
		public TerminalNode CLOSE_ROUND() { return getToken(LangParser.CLOSE_ROUND, 0); }
		public TerminalNode SEMI_COLON() { return getToken(LangParser.SEMI_COLON, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode LESS() { return getToken(LangParser.LESS, 0); }
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(LangParser.GREATER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public CmdFunctionCallContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterCmdFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitCmdFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmdFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdListContext extends CmdContext {
		public TerminalNode OPEN_CURLY() { return getToken(LangParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(LangParser.CLOSE_CURLY, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdListContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterCmdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitCmdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmdList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdIfElseContext extends CmdContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode OPEN_ROUND() { return getToken(LangParser.OPEN_ROUND, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_ROUND() { return getToken(LangParser.CLOSE_ROUND, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public CmdIfElseContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterCmdIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitCmdIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmdIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdIterateContext extends CmdContext {
		public TerminalNode ITERATE() { return getToken(LangParser.ITERATE, 0); }
		public TerminalNode OPEN_ROUND() { return getToken(LangParser.OPEN_ROUND, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_ROUND() { return getToken(LangParser.CLOSE_ROUND, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdIterateContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterCmdIterate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitCmdIterate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmdIterate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdPrintContext extends CmdContext {
		public TerminalNode PRINT() { return getToken(LangParser.PRINT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(LangParser.SEMI_COLON, 0); }
		public CmdPrintContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterCmdPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitCmdPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmdPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new CmdListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(OPEN_CURLY);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_CURLY) | (1L << IF) | (1L << ITERATE) | (1L << READ) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
					{
					{
					setState(121);
					cmd();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(CLOSE_CURLY);
				}
				break;
			case 2:
				_localctx = new CmdIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(IF);
				setState(129);
				match(OPEN_ROUND);
				setState(130);
				exp(0);
				setState(131);
				match(CLOSE_ROUND);
				setState(132);
				cmd();
				}
				break;
			case 3:
				_localctx = new CmdIfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(IF);
				setState(135);
				match(OPEN_ROUND);
				setState(136);
				exp(0);
				setState(137);
				match(CLOSE_ROUND);
				setState(138);
				cmd();
				setState(139);
				match(ELSE);
				setState(140);
				cmd();
				}
				break;
			case 4:
				_localctx = new CmdIterateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(ITERATE);
				setState(143);
				match(OPEN_ROUND);
				setState(144);
				exp(0);
				setState(145);
				match(CLOSE_ROUND);
				setState(146);
				cmd();
				}
				break;
			case 5:
				_localctx = new CmdReadContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(READ);
				setState(149);
				lvalue(0);
				setState(150);
				match(SEMI_COLON);
				}
				break;
			case 6:
				_localctx = new CmdPrintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(PRINT);
				setState(153);
				exp(0);
				setState(154);
				match(SEMI_COLON);
				}
				break;
			case 7:
				_localctx = new CmdReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				match(RETURN);
				setState(157);
				exp(0);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(158);
					match(COMMA);
					setState(159);
					exp(0);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(SEMI_COLON);
				}
				break;
			case 8:
				_localctx = new CmdAssignContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				lvalue(0);
				setState(168);
				match(EQ);
				setState(169);
				exp(0);
				setState(170);
				match(SEMI_COLON);
				}
				break;
			case 9:
				_localctx = new CmdFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(172);
				match(ID);
				setState(173);
				match(OPEN_ROUND);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_ROUND) | (1L << MINUS) | (1L << NOT) | (1L << NEW) | (1L << LITERAL_NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << LITERAL_INT) | (1L << LITERAL_FLOAT) | (1L << LITERAL_CHAR))) != 0)) {
					{
					setState(174);
					exps();
					}
				}

				setState(177);
				match(CLOSE_ROUND);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS) {
					{
					setState(178);
					match(LESS);
					setState(179);
					lvalue(0);
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(180);
						match(COMMA);
						setState(181);
						lvalue(0);
						}
						}
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(187);
					match(GREATER);
					}
				}

				setState(191);
				match(SEMI_COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpAndContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(LangParser.AND, 0); }
		public ExpAndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpRexpContext extends ExpContext {
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public ExpRexpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpRexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpRexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpRexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpRexpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(195);
			rexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpAndContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(197);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(198);
					match(AND);
					setState(199);
					exp(2);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RexpContext extends ParserRuleContext {
		public RexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexp; }
	 
		public RexpContext() { }
		public void copyFrom(RexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpNotEqContext extends RexpContext {
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public TerminalNode NOTEQ() { return getToken(LangParser.NOTEQ, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public ExpNotEqContext(RexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpNotEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpNotEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpNotEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpEqEqContext extends RexpContext {
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public TerminalNode EQEQ() { return getToken(LangParser.EQEQ, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public ExpEqEqContext(RexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpEqEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpEqEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpEqEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RexpAexpContext extends RexpContext {
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public RexpAexpContext(RexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterRexpAexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitRexpAexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitRexpAexp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpLessContext extends RexpContext {
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public TerminalNode LESS() { return getToken(LangParser.LESS, 0); }
		public ExpLessContext(RexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RexpContext rexp() throws RecognitionException {
		return rexp(0);
	}

	private RexpContext rexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RexpContext _localctx = new RexpContext(_ctx, _parentState);
		RexpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_rexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new RexpAexpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(206);
				aexp(0);
				}
				break;
			case 2:
				{
				_localctx = new ExpLessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				aexp(0);
				setState(208);
				match(LESS);
				setState(209);
				aexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpEqEqContext(new RexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(213);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(214);
						match(EQEQ);
						setState(215);
						aexp(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpNotEqContext(new RexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(216);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(217);
						match(NOTEQ);
						setState(218);
						aexp(0);
						}
						break;
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AexpContext extends ParserRuleContext {
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
	 
		public AexpContext() { }
		public void copyFrom(AexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AexpMexpContext extends AexpContext {
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public AexpMexpContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterAexpMexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitAexpMexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitAexpMexp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpSubContext extends AexpContext {
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public ExpSubContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpPlusContext extends AexpContext {
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public ExpPlusContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexpContext aexp() throws RecognitionException {
		return aexp(0);
	}

	private AexpContext aexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexpContext _localctx = new AexpContext(_ctx, _parentState);
		AexpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_aexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AexpMexpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(225);
			mexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpPlusContext(new AexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(227);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(228);
						match(PLUS);
						setState(229);
						mexp(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpSubContext(new AexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(230);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(231);
						match(MINUS);
						setState(232);
						mexp(0);
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MexpContext extends ParserRuleContext {
		public MexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mexp; }
	 
		public MexpContext() { }
		public void copyFrom(MexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpMultContext extends MexpContext {
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LangParser.MULT, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public ExpMultContext(MexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MexpSexpContext extends MexpContext {
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public MexpSexpContext(MexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterMexpSexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitMexpSexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitMexpSexp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpDivContext extends MexpContext {
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public ExpDivContext(MexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpModContext extends MexpContext {
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public TerminalNode MOD() { return getToken(LangParser.MOD, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public ExpModContext(MexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MexpContext mexp() throws RecognitionException {
		return mexp(0);
	}

	private MexpContext mexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MexpContext _localctx = new MexpContext(_ctx, _parentState);
		MexpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_mexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MexpSexpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(239);
			sexp();
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpMultContext(new MexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(241);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(242);
						match(MULT);
						setState(243);
						sexp();
						}
						break;
					case 2:
						{
						_localctx = new ExpDivContext(new MexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(244);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(245);
						match(DIV);
						setState(246);
						sexp();
						}
						break;
					case 3:
						{
						_localctx = new ExpModContext(new MexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(247);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(248);
						match(MOD);
						setState(249);
						sexp();
						}
						break;
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SexpContext extends ParserRuleContext {
		public SexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexp; }
	 
		public SexpContext() { }
		public void copyFrom(SexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralNullContext extends SexpContext {
		public TerminalNode LITERAL_NULL() { return getToken(LangParser.LITERAL_NULL, 0); }
		public LiteralNullContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLiteralNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLiteralNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLiteralNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SexpPexpContext extends SexpContext {
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
		}
		public SexpPexpContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterSexpPexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitSexpPexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitSexpPexp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralTrueContext extends SexpContext {
		public TerminalNode TRUE() { return getToken(LangParser.TRUE, 0); }
		public LiteralTrueContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLiteralTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLiteralTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLiteralTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralCharContext extends SexpContext {
		public TerminalNode LITERAL_CHAR() { return getToken(LangParser.LITERAL_CHAR, 0); }
		public LiteralCharContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLiteralChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLiteralChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLiteralChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralFalseContext extends SexpContext {
		public TerminalNode FALSE() { return getToken(LangParser.FALSE, 0); }
		public LiteralFalseContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLiteralFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLiteralFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLiteralFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpMinusContext extends SexpContext {
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public ExpMinusContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralIntContext extends SexpContext {
		public TerminalNode LITERAL_INT() { return getToken(LangParser.LITERAL_INT, 0); }
		public LiteralIntContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLiteralInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLiteralInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLiteralInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralFloatContext extends SexpContext {
		public TerminalNode LITERAL_FLOAT() { return getToken(LangParser.LITERAL_FLOAT, 0); }
		public LiteralFloatContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLiteralFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLiteralFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLiteralFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpNotContext extends SexpContext {
		public TerminalNode NOT() { return getToken(LangParser.NOT, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public ExpNotContext(SexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexpContext sexp() throws RecognitionException {
		SexpContext _localctx = new SexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sexp);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_ROUND:
			case NEW:
			case ID:
				_localctx = new SexpPexpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				pexp();
				}
				break;
			case NOT:
				_localctx = new ExpNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(NOT);
				setState(257);
				sexp();
				}
				break;
			case MINUS:
				_localctx = new ExpMinusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(MINUS);
				setState(259);
				sexp();
				}
				break;
			case TRUE:
				_localctx = new LiteralTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new LiteralFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				match(FALSE);
				}
				break;
			case LITERAL_NULL:
				_localctx = new LiteralNullContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				match(LITERAL_NULL);
				}
				break;
			case LITERAL_INT:
				_localctx = new LiteralIntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(263);
				match(LITERAL_INT);
				}
				break;
			case LITERAL_FLOAT:
				_localctx = new LiteralFloatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(264);
				match(LITERAL_FLOAT);
				}
				break;
			case LITERAL_CHAR:
				_localctx = new LiteralCharContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(265);
				match(LITERAL_CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PexpContext extends ParserRuleContext {
		public PexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pexp; }
	 
		public PexpContext() { }
		public void copyFrom(PexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpParenthesisContext extends PexpContext {
		public TerminalNode OPEN_ROUND() { return getToken(LangParser.OPEN_ROUND, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_ROUND() { return getToken(LangParser.CLOSE_ROUND, 0); }
		public ExpParenthesisContext(PexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpFunctionCallContext extends PexpContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode OPEN_ROUND() { return getToken(LangParser.OPEN_ROUND, 0); }
		public TerminalNode CLOSE_ROUND() { return getToken(LangParser.CLOSE_ROUND, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(LangParser.OPEN_SQUARE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(LangParser.CLOSE_SQUARE, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public ExpFunctionCallContext(PexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PexpLvalueContext extends PexpContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public PexpLvalueContext(PexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterPexpLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitPexpLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitPexpLvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpNewContext extends PexpContext {
		public TerminalNode NEW() { return getToken(LangParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_SQUARE() { return getToken(LangParser.OPEN_SQUARE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(LangParser.CLOSE_SQUARE, 0); }
		public ExpNewContext(PexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PexpContext pexp() throws RecognitionException {
		PexpContext _localctx = new PexpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pexp);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new PexpLvalueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				lvalue(0);
				}
				break;
			case 2:
				_localctx = new ExpParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(OPEN_ROUND);
				setState(270);
				exp(0);
				setState(271);
				match(CLOSE_ROUND);
				}
				break;
			case 3:
				_localctx = new ExpNewContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(NEW);
				setState(274);
				type(0);
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(275);
					match(OPEN_SQUARE);
					setState(276);
					exp(0);
					setState(277);
					match(CLOSE_SQUARE);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ExpFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(ID);
				setState(282);
				match(OPEN_ROUND);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_ROUND) | (1L << MINUS) | (1L << NOT) | (1L << NEW) | (1L << LITERAL_NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << LITERAL_INT) | (1L << LITERAL_FLOAT) | (1L << LITERAL_CHAR))) != 0)) {
					{
					setState(283);
					exps();
					}
				}

				setState(286);
				match(CLOSE_ROUND);
				setState(287);
				match(OPEN_SQUARE);
				setState(288);
				exp(0);
				setState(289);
				match(CLOSE_SQUARE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	 
		public LvalueContext() { }
		public void copyFrom(LvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LvalueSelectContext extends LvalueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LangParser.DOT, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public LvalueSelectContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLvalueSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLvalueSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLvalueSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LvalueArrayContext extends LvalueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode OPEN_SQUARE() { return getToken(LangParser.OPEN_SQUARE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(LangParser.CLOSE_SQUARE, 0); }
		public LvalueArrayContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLvalueArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLvalueArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLvalueArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LvalueIdContext extends LvalueContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public LvalueIdContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLvalueId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLvalueId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLvalueId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LvalueIdContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(294);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueArrayContext(new LvalueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(296);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(297);
						match(OPEN_SQUARE);
						setState(298);
						exp(0);
						setState(299);
						match(CLOSE_SQUARE);
						}
						break;
					case 2:
						{
						_localctx = new LvalueSelectContext(new LvalueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(301);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(302);
						match(DOT);
						setState(303);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			exp(0);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(310);
				match(COMMA);
				setState(311);
				exp(0);
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 9:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 10:
			return rexp_sempred((RexpContext)_localctx, predIndex);
		case 11:
			return aexp_sempred((AexpContext)_localctx, predIndex);
		case 12:
			return mexp_sempred((MexpContext)_localctx, predIndex);
		case 15:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean rexp_sempred(RexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean aexp_sempred(AexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mexp_sempred(MexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0140\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3\3"+
		"\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\5\5E\n\5\3\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\5\5Q\n\5\3\5\3"+
		"\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\ty\n\t\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a3\n\n"+
		"\f\n\16\n\u00a6\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b2"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b9\n\n\f\n\16\n\u00bc\13\n\3\n\3\n\5\n"+
		"\u00c0\n\n\3\n\5\n\u00c3\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00cb"+
		"\n\13\f\13\16\13\u00ce\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d6\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00de\n\f\f\f\16\f\u00e1\13\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u00ec\n\r\f\r\16\r\u00ef\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00fd\n\16\f\16\16"+
		"\16\u0100\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u010d\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u011a\n\20\3\20\3\20\3\20\5\20\u011f\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0126\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u0133\n\21\f\21\16\21\u0136\13\21\3\22\3\22\3\22\7\22\u013b"+
		"\n\22\f\22\16\22\u013e\13\22\3\22\2\b\16\24\26\30\32 \23\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"\2\2\2\u0161\2\'\3\2\2\2\4\60\3\2\2\2\6<\3"+
		"\2\2\2\bA\3\2\2\2\n[\3\2\2\2\fc\3\2\2\2\16g\3\2\2\2\20x\3\2\2\2\22\u00c2"+
		"\3\2\2\2\24\u00c4\3\2\2\2\26\u00d5\3\2\2\2\30\u00e2\3\2\2\2\32\u00f0\3"+
		"\2\2\2\34\u010c\3\2\2\2\36\u0125\3\2\2\2 \u0127\3\2\2\2\"\u0137\3\2\2"+
		"\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(-\3\2\2\2)\'\3"+
		"\2\2\2*,\5\b\5\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/-"+
		"\3\2\2\2\60\61\7\34\2\2\61\62\7)\2\2\62\66\7\7\2\2\63\65\5\6\4\2\64\63"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2"+
		"\29:\7\b\2\2:;\b\3\1\2;\5\3\2\2\2<=\7)\2\2=>\7\f\2\2>?\5\16\b\2?@\7\t"+
		"\2\2@\7\3\2\2\2AB\7)\2\2BD\7\3\2\2CE\5\n\6\2DC\3\2\2\2DE\3\2\2\2EF\3\2"+
		"\2\2FP\7\4\2\2GH\7\13\2\2HM\5\16\b\2IJ\7\n\2\2JL\5\16\b\2KI\3\2\2\2LO"+
		"\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PG\3\2\2\2PQ\3\2\2\2Q"+
		"R\3\2\2\2RV\7\7\2\2SU\5\22\n\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2"+
		"WY\3\2\2\2XV\3\2\2\2YZ\7\b\2\2Z\t\3\2\2\2[`\5\f\7\2\\]\7\n\2\2]_\5\f\7"+
		"\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\13\3\2\2\2b`\3\2\2\2cd\7"+
		")\2\2de\7\f\2\2ef\5\16\b\2f\r\3\2\2\2gh\b\b\1\2hi\5\20\t\2io\3\2\2\2j"+
		"k\f\4\2\2kl\7\5\2\2ln\7\6\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"p\17\3\2\2\2qo\3\2\2\2ry\7\"\2\2sy\7#\2\2ty\7$\2\2uy\7%\2\2vw\7)\2\2w"+
		"y\b\t\1\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2y\21\3\2\2"+
		"\2z~\7\7\2\2{}\5\22\n\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u00c3\7\b\2\2\u0082\u0083\7"+
		"\32\2\2\u0083\u0084\7\3\2\2\u0084\u0085\5\24\13\2\u0085\u0086\7\4\2\2"+
		"\u0086\u0087\5\22\n\2\u0087\u00c3\3\2\2\2\u0088\u0089\7\32\2\2\u0089\u008a"+
		"\7\3\2\2\u008a\u008b\5\24\13\2\u008b\u008c\7\4\2\2\u008c\u008d\5\22\n"+
		"\2\u008d\u008e\7\33\2\2\u008e\u008f\5\22\n\2\u008f\u00c3\3\2\2\2\u0090"+
		"\u0091\7\35\2\2\u0091\u0092\7\3\2\2\u0092\u0093\5\24\13\2\u0093\u0094"+
		"\7\4\2\2\u0094\u0095\5\22\n\2\u0095\u00c3\3\2\2\2\u0096\u0097\7\36\2\2"+
		"\u0097\u0098\5 \21\2\u0098\u0099\7\t\2\2\u0099\u00c3\3\2\2\2\u009a\u009b"+
		"\7\37\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\t\2\2\u009d\u00c3\3\2\2"+
		"\2\u009e\u009f\7 \2\2\u009f\u00a4\5\24\13\2\u00a0\u00a1\7\n\2\2\u00a1"+
		"\u00a3\5\24\13\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\7\t\2\2\u00a8\u00c3\3\2\2\2\u00a9\u00aa\5 \21\2\u00aa\u00ab\7\25"+
		"\2\2\u00ab\u00ac\5\24\13\2\u00ac\u00ad\7\t\2\2\u00ad\u00c3\3\2\2\2\u00ae"+
		"\u00af\7)\2\2\u00af\u00b1\7\3\2\2\u00b0\u00b2\5\"\22\2\u00b1\u00b0\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00bf\7\4\2\2\u00b4"+
		"\u00b5\7\27\2\2\u00b5\u00ba\5 \21\2\u00b6\u00b7\7\n\2\2\u00b7\u00b9\5"+
		" \21\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\30"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b4\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\7\t\2\2\u00c2z\3\2\2\2\u00c2\u0082\3\2\2\2"+
		"\u00c2\u0088\3\2\2\2\u00c2\u0090\3\2\2\2\u00c2\u0096\3\2\2\2\u00c2\u009a"+
		"\3\2\2\2\u00c2\u009e\3\2\2\2\u00c2\u00a9\3\2\2\2\u00c2\u00ae\3\2\2\2\u00c3"+
		"\23\3\2\2\2\u00c4\u00c5\b\13\1\2\u00c5\u00c6\5\26\f\2\u00c6\u00cc\3\2"+
		"\2\2\u00c7\u00c8\f\3\2\2\u00c8\u00c9\7\23\2\2\u00c9\u00cb\5\24\13\4\u00ca"+
		"\u00c7\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\25\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b\f\1\2\u00d0\u00d6"+
		"\5\30\r\2\u00d1\u00d2\5\30\r\2\u00d2\u00d3\7\27\2\2\u00d3\u00d4\5\30\r"+
		"\2\u00d4\u00d6\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\u00df"+
		"\3\2\2\2\u00d7\u00d8\f\4\2\2\u00d8\u00d9\7\26\2\2\u00d9\u00de\5\30\r\2"+
		"\u00da\u00db\f\3\2\2\u00db\u00dc\7\31\2\2\u00dc\u00de\5\30\r\2\u00dd\u00d7"+
		"\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\27\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\b\r\1"+
		"\2\u00e3\u00e4\5\32\16\2\u00e4\u00ed\3\2\2\2\u00e5\u00e6\f\4\2\2\u00e6"+
		"\u00e7\7\16\2\2\u00e7\u00ec\5\32\16\2\u00e8\u00e9\f\3\2\2\u00e9\u00ea"+
		"\7\17\2\2\u00ea\u00ec\5\32\16\2\u00eb\u00e5\3\2\2\2\u00eb\u00e8\3\2\2"+
		"\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\31"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\b\16\1\2\u00f1\u00f2\5\34\17"+
		"\2\u00f2\u00fe\3\2\2\2\u00f3\u00f4\f\5\2\2\u00f4\u00f5\7\20\2\2\u00f5"+
		"\u00fd\5\34\17\2\u00f6\u00f7\f\4\2\2\u00f7\u00f8\7\21\2\2\u00f8\u00fd"+
		"\5\34\17\2\u00f9\u00fa\f\3\2\2\u00fa\u00fb\7\22\2\2\u00fb\u00fd\5\34\17"+
		"\2\u00fc\u00f3\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\33\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u010d\5\36\20\2\u0102\u0103\7\24\2\2\u0103\u010d"+
		"\5\34\17\2\u0104\u0105\7\17\2\2\u0105\u010d\5\34\17\2\u0106\u010d\7\'"+
		"\2\2\u0107\u010d\7(\2\2\u0108\u010d\7&\2\2\u0109\u010d\7*\2\2\u010a\u010d"+
		"\7+\2\2\u010b\u010d\7,\2\2\u010c\u0101\3\2\2\2\u010c\u0102\3\2\2\2\u010c"+
		"\u0104\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2"+
		"\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\35\3\2\2\2\u010e\u0126\5 \21\2\u010f\u0110\7\3\2\2\u0110\u0111\5\24\13"+
		"\2\u0111\u0112\7\4\2\2\u0112\u0126\3\2\2\2\u0113\u0114\7!\2\2\u0114\u0119"+
		"\5\16\b\2\u0115\u0116\7\5\2\2\u0116\u0117\5\24\13\2\u0117\u0118\7\6\2"+
		"\2\u0118\u011a\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0126"+
		"\3\2\2\2\u011b\u011c\7)\2\2\u011c\u011e\7\3\2\2\u011d\u011f\5\"\22\2\u011e"+
		"\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\4"+
		"\2\2\u0121\u0122\7\5\2\2\u0122\u0123\5\24\13\2\u0123\u0124\7\6\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u010e\3\2\2\2\u0125\u010f\3\2\2\2\u0125\u0113\3\2"+
		"\2\2\u0125\u011b\3\2\2\2\u0126\37\3\2\2\2\u0127\u0128\b\21\1\2\u0128\u0129"+
		"\7)\2\2\u0129\u0134\3\2\2\2\u012a\u012b\f\4\2\2\u012b\u012c\7\5\2\2\u012c"+
		"\u012d\5\24\13\2\u012d\u012e\7\6\2\2\u012e\u0133\3\2\2\2\u012f\u0130\f"+
		"\3\2\2\u0130\u0131\7\r\2\2\u0131\u0133\7)\2\2\u0132\u012a\3\2\2\2\u0132"+
		"\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135!\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013c\5\24\13\2\u0138\u0139"+
		"\7\n\2\2\u0139\u013b\5\24\13\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d#\3\2\2\2\u013e\u013c\3"+
		"\2\2\2!\'-\66DMPV`ox~\u00a4\u00b1\u00ba\u00bf\u00c2\u00cc\u00d5\u00dd"+
		"\u00df\u00eb\u00ed\u00fc\u00fe\u010c\u0119\u011e\u0125\u0132\u0134\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}