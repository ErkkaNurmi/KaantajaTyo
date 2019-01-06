// Generated from .\OurLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OurLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INT=20, DOUBLE=21, ID=22, WS=23, COMMENT=24;
	public static final int
		RULE_program = 0, RULE_paramList = 1, RULE_code = 2, RULE_statement = 3, 
		RULE_condition = 4, RULE_value = 5, RULE_simpleValue = 6;
	public static final String[] ruleNames = {
		"program", "paramList", "code", "statement", "condition", "value", "simpleValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'('", "')'", "'{'", "'}'", "','", "'IF'", "'ELSE'", 
		"':='", "';'", "'FOR'", "'RETURN'", "'='", "'<'", "'>'", "'*'", "'/'", 
		"'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "INT", "DOUBLE", "ID", 
		"WS", "COMMENT"
	};
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
	public String getGrammarFileName() { return "OurLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OurLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OurLanguageParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			match(ID);
			setState(16);
			match(T__1);
			setState(17);
			paramList();
			setState(18);
			match(T__2);
			setState(19);
			match(T__3);
			setState(20);
			code();
			setState(21);
			match(T__4);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(OurLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OurLanguageParser.ID, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(23);
			match(ID);
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				match(T__5);
				setState(25);
				match(ID);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
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

	public static class CodeContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode ID() { return getToken(OurLanguageParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(T__6);
				setState(36);
				match(T__1);
				setState(37);
				condition();
				setState(38);
				match(T__2);
				setState(39);
				match(T__3);
				setState(40);
				code();
				setState(41);
				match(T__4);
				{
				setState(42);
				match(T__7);
				setState(43);
				match(T__3);
				setState(44);
				code();
				setState(45);
				match(T__4);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(ID);
				setState(48);
				match(T__8);
				setState(49);
				value();
				setState(50);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(T__10);
				setState(53);
				match(T__1);
				setState(54);
				value();
				setState(55);
				match(T__2);
				setState(56);
				match(T__3);
				setState(57);
				code();
				setState(58);
				match(T__4);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(T__11);
				{
				setState(61);
				match(T__1);
				setState(62);
				value();
				setState(63);
				match(T__2);
				}
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				value();
				setState(68);
				match(T__12);
				setState(69);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				value();
				setState(72);
				match(T__13);
				setState(73);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				value();
				setState(76);
				match(T__14);
				setState(77);
				value();
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

	public static class ValueContext extends ParserRuleContext {
		public List<SimpleValueContext> simpleValue() {
			return getRuleContexts(SimpleValueContext.class);
		}
		public SimpleValueContext simpleValue(int i) {
			return getRuleContext(SimpleValueContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				simpleValue(0);
				setState(82);
				match(T__15);
				setState(83);
				simpleValue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				simpleValue(0);
				setState(86);
				match(T__16);
				setState(87);
				simpleValue(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				simpleValue(0);
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

	public static class SimpleValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(OurLanguageParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(OurLanguageParser.DOUBLE, 0); }
		public List<SimpleValueContext> simpleValue() {
			return getRuleContexts(SimpleValueContext.class);
		}
		public SimpleValueContext simpleValue(int i) {
			return getRuleContext(SimpleValueContext.class,i);
		}
		public SimpleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).enterSimpleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurLanguageListener ) ((OurLanguageListener)listener).exitSimpleValue(this);
		}
	}

	public final SimpleValueContext simpleValue() throws RecognitionException {
		return simpleValue(0);
	}

	private SimpleValueContext simpleValue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleValueContext _localctx = new SimpleValueContext(_ctx, _parentState);
		SimpleValueContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_simpleValue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(93);
				match(INT);
				}
				break;
			case DOUBLE:
				{
				setState(94);
				match(DOUBLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleValue);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						match(T__17);
						setState(99);
						simpleValue(5);
						}
						break;
					case 2:
						{
						_localctx = new SimpleValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleValue);
						setState(100);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(101);
						match(T__18);
						setState(102);
						simpleValue(4);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return simpleValue_sempred((SimpleValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleValue_sempred(SimpleValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\6\3\35\n\3\r\3\16\3\36\3\4\6\4\"\n\4\r\4\16\4#\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\5\bb\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"j\n\b\f\b\16\bm\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2\2\2s\2\20\3\2\2\2\4"+
		"\31\3\2\2\2\6!\3\2\2\2\bC\3\2\2\2\nQ\3\2\2\2\f\\\3\2\2\2\16a\3\2\2\2\20"+
		"\21\7\3\2\2\21\22\7\30\2\2\22\23\7\4\2\2\23\24\5\4\3\2\24\25\7\5\2\2\25"+
		"\26\7\6\2\2\26\27\5\6\4\2\27\30\7\7\2\2\30\3\3\2\2\2\31\34\7\30\2\2\32"+
		"\33\7\b\2\2\33\35\7\30\2\2\34\32\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36"+
		"\37\3\2\2\2\37\5\3\2\2\2 \"\5\b\5\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3"+
		"\2\2\2$\7\3\2\2\2%&\7\t\2\2&\'\7\4\2\2\'(\5\n\6\2()\7\5\2\2)*\7\6\2\2"+
		"*+\5\6\4\2+,\7\7\2\2,-\7\n\2\2-.\7\6\2\2./\5\6\4\2/\60\7\7\2\2\60D\3\2"+
		"\2\2\61\62\7\30\2\2\62\63\7\13\2\2\63\64\5\f\7\2\64\65\7\f\2\2\65D\3\2"+
		"\2\2\66\67\7\r\2\2\678\7\4\2\289\5\f\7\29:\7\5\2\2:;\7\6\2\2;<\5\6\4\2"+
		"<=\7\7\2\2=D\3\2\2\2>?\7\16\2\2?@\7\4\2\2@A\5\f\7\2AB\7\5\2\2BD\3\2\2"+
		"\2C%\3\2\2\2C\61\3\2\2\2C\66\3\2\2\2C>\3\2\2\2D\t\3\2\2\2EF\5\f\7\2FG"+
		"\7\17\2\2GH\5\f\7\2HR\3\2\2\2IJ\5\f\7\2JK\7\20\2\2KL\5\f\7\2LR\3\2\2\2"+
		"MN\5\f\7\2NO\7\21\2\2OP\5\f\7\2PR\3\2\2\2QE\3\2\2\2QI\3\2\2\2QM\3\2\2"+
		"\2R\13\3\2\2\2ST\5\16\b\2TU\7\22\2\2UV\5\16\b\2V]\3\2\2\2WX\5\16\b\2X"+
		"Y\7\23\2\2YZ\5\16\b\2Z]\3\2\2\2[]\5\16\b\2\\S\3\2\2\2\\W\3\2\2\2\\[\3"+
		"\2\2\2]\r\3\2\2\2^_\b\b\1\2_b\7\26\2\2`b\7\27\2\2a^\3\2\2\2a`\3\2\2\2"+
		"bk\3\2\2\2cd\f\6\2\2de\7\24\2\2ej\5\16\b\7fg\f\5\2\2gh\7\25\2\2hj\5\16"+
		"\b\6ic\3\2\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mk\3"+
		"\2\2\2\n\36#CQ\\aik";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}