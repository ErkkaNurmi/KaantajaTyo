// Generated from OurLanguage.g4 by ANTLR 4.7.1
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
		"':='", "';'", "'FOR'", "'RETURN'", "'='", "'<'", "'>'", "'+'", "'-'", 
		"'*'", "'/'"
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
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(23);
				match(ID);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(24);
					match(T__5);
					setState(25);
					match(ID);
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(37); 
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(T__6);
				setState(40);
				match(T__1);
				setState(41);
				condition();
				setState(42);
				match(T__2);
				setState(43);
				match(T__3);
				setState(44);
				code();
				setState(45);
				match(T__4);
				{
				setState(46);
				match(T__7);
				setState(47);
				match(T__3);
				setState(48);
				code();
				setState(49);
				match(T__4);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(ID);
				setState(52);
				match(T__8);
				setState(53);
				value(0);
				setState(54);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(T__10);
				setState(57);
				match(T__1);
				setState(58);
				value(0);
				setState(59);
				match(T__2);
				setState(60);
				match(T__3);
				setState(61);
				code();
				setState(62);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(T__11);
				{
				setState(65);
				match(T__1);
				setState(66);
				value(0);
				setState(67);
				match(T__2);
				}
				setState(69);
				match(T__9);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				match(T__11);
				{
				setState(72);
				match(T__1);
				setState(73);
				match(T__2);
				}
				setState(75);
				match(T__9);
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
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				value(0);
				setState(79);
				match(T__12);
				setState(80);
				value(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				value(0);
				setState(83);
				match(T__13);
				setState(84);
				value(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				value(0);
				setState(87);
				match(T__14);
				setState(88);
				value(0);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_value, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(93);
				simpleValue(0);
				setState(94);
				match(T__15);
				setState(95);
				simpleValue(0);
				}
				break;
			case 2:
				{
				setState(97);
				simpleValue(0);
				setState(98);
				match(T__16);
				setState(99);
				simpleValue(0);
				}
				break;
			case 3:
				{
				setState(101);
				simpleValue(0);
				}
				break;
			case 4:
				{
				setState(102);
				match(T__1);
				setState(103);
				value(0);
				setState(104);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						match(T__15);
						setState(110);
						value(5);
						}
						break;
					case 2:
						{
						_localctx = new ValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(112);
						match(T__16);
						setState(113);
						value(4);
						}
						break;
					}
					} 
				}
				setState(118);
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

	public static class SimpleValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(OurLanguageParser.ID, 0); }
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
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(120);
				match(T__1);
				setState(121);
				value(0);
				setState(122);
				match(T__2);
				}
				break;
			case ID:
				{
				setState(124);
				match(ID);
				}
				break;
			case INT:
				{
				setState(125);
				match(INT);
				}
				break;
			case DOUBLE:
				{
				setState(126);
				match(DOUBLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleValue);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
						match(T__17);
						setState(131);
						simpleValue(7);
						}
						break;
					case 2:
						{
						_localctx = new SimpleValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleValue);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						match(T__18);
						setState(134);
						simpleValue(6);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		case 5:
			return value_sempred((ValueContext)_localctx, predIndex);
		case 6:
			return simpleValue_sempred((SimpleValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean simpleValue_sempred(SimpleValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u008f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\5\3#\n\3\3\4"+
		"\6\4&\n\4\r\4\16\4\'\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7m\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7u\n\7\f\7\16\7x\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\b\2\4\f\16\t\2\4\6\b\n\f\16\2\2\2"+
		"\u009a\2\20\3\2\2\2\4\"\3\2\2\2\6%\3\2\2\2\bN\3\2\2\2\n\\\3\2\2\2\fl\3"+
		"\2\2\2\16\u0081\3\2\2\2\20\21\7\3\2\2\21\22\7\30\2\2\22\23\7\4\2\2\23"+
		"\24\5\4\3\2\24\25\7\5\2\2\25\26\7\6\2\2\26\27\5\6\4\2\27\30\7\7\2\2\30"+
		"\3\3\2\2\2\31\36\7\30\2\2\32\33\7\b\2\2\33\35\7\30\2\2\34\32\3\2\2\2\35"+
		" \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37#\3\2\2\2 \36\3\2\2\2!#\3\2\2"+
		"\2\"\31\3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$&\5\b\5\2%$\3\2\2\2&\'\3\2\2\2\'"+
		"%\3\2\2\2\'(\3\2\2\2(\7\3\2\2\2)*\7\t\2\2*+\7\4\2\2+,\5\n\6\2,-\7\5\2"+
		"\2-.\7\6\2\2./\5\6\4\2/\60\7\7\2\2\60\61\7\n\2\2\61\62\7\6\2\2\62\63\5"+
		"\6\4\2\63\64\7\7\2\2\64O\3\2\2\2\65\66\7\30\2\2\66\67\7\13\2\2\678\5\f"+
		"\7\289\7\f\2\29O\3\2\2\2:;\7\r\2\2;<\7\4\2\2<=\5\f\7\2=>\7\5\2\2>?\7\6"+
		"\2\2?@\5\6\4\2@A\7\7\2\2AO\3\2\2\2BC\7\16\2\2CD\7\4\2\2DE\5\f\7\2EF\7"+
		"\5\2\2FG\3\2\2\2GH\7\f\2\2HO\3\2\2\2IJ\7\16\2\2JK\7\4\2\2KL\7\5\2\2LM"+
		"\3\2\2\2MO\7\f\2\2N)\3\2\2\2N\65\3\2\2\2N:\3\2\2\2NB\3\2\2\2NI\3\2\2\2"+
		"O\t\3\2\2\2PQ\5\f\7\2QR\7\17\2\2RS\5\f\7\2S]\3\2\2\2TU\5\f\7\2UV\7\20"+
		"\2\2VW\5\f\7\2W]\3\2\2\2XY\5\f\7\2YZ\7\21\2\2Z[\5\f\7\2[]\3\2\2\2\\P\3"+
		"\2\2\2\\T\3\2\2\2\\X\3\2\2\2]\13\3\2\2\2^_\b\7\1\2_`\5\16\b\2`a\7\22\2"+
		"\2ab\5\16\b\2bm\3\2\2\2cd\5\16\b\2de\7\23\2\2ef\5\16\b\2fm\3\2\2\2gm\5"+
		"\16\b\2hi\7\4\2\2ij\5\f\7\2jk\7\5\2\2km\3\2\2\2l^\3\2\2\2lc\3\2\2\2lg"+
		"\3\2\2\2lh\3\2\2\2mv\3\2\2\2no\f\6\2\2op\7\22\2\2pu\5\f\7\7qr\f\5\2\2"+
		"rs\7\23\2\2su\5\f\7\6tn\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2w\r\3\2\2\2xv\3\2\2\2yz\b\b\1\2z{\7\4\2\2{|\5\f\7\2|}\7\5\2\2}\u0082"+
		"\3\2\2\2~\u0082\7\30\2\2\177\u0082\7\26\2\2\u0080\u0082\7\27\2\2\u0081"+
		"y\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u008b"+
		"\3\2\2\2\u0083\u0084\f\b\2\2\u0084\u0085\7\24\2\2\u0085\u008a\5\16\b\t"+
		"\u0086\u0087\f\7\2\2\u0087\u0088\7\25\2\2\u0088\u008a\5\16\b\b\u0089\u0083"+
		"\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\17\3\2\2\2\u008d\u008b\3\2\2\2\r\36\"\'N\\ltv\u0081"+
		"\u0089\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}