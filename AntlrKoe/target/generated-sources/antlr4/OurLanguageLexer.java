// Generated from OurLanguage.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OurLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, ID=16, WS=17, COMMENT=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ID", "WS", "COMMENT"
	};


	public OurLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OurLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\6\21Y\n\21\r\21\16\21Z\3\22\6\22^\n\22\r\22\16\22"+
		"_\3\22\3\22\3\23\3\23\7\23f\n\23\f\23\16\23i\13\23\3\23\3\23\3\23\3\23"+
		"\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\3\2\4\3\2c|\5\2\13\f\17\17\"\"q\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\3\'\3\2\2\2\5,\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r"+
		"\64\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25>\3\2\2\2\27F\3\2"+
		"\2\2\31H\3\2\2\2\33J\3\2\2\2\35N\3\2\2\2\37U\3\2\2\2!X\3\2\2\2#]\3\2\2"+
		"\2%g\3\2\2\2\'(\7G\2\2()\7N\2\2)*\7U\2\2*+\7G\2\2+\4\3\2\2\2,-\7=\2\2"+
		"-\6\3\2\2\2./\7}\2\2/\b\3\2\2\2\60\61\7>\2\2\61\n\3\2\2\2\62\63\7?\2\2"+
		"\63\f\3\2\2\2\64\65\7K\2\2\65\66\7H\2\2\66\16\3\2\2\2\678\7\177\2\28\20"+
		"\3\2\2\29:\7@\2\2:\22\3\2\2\2;<\7<\2\2<=\7?\2\2=\24\3\2\2\2>?\7R\2\2?"+
		"@\7T\2\2@A\7Q\2\2AB\7I\2\2BC\7T\2\2CD\7C\2\2DE\7O\2\2E\26\3\2\2\2FG\7"+
		"*\2\2G\30\3\2\2\2HI\7+\2\2I\32\3\2\2\2JK\7H\2\2KL\7Q\2\2LM\7T\2\2M\34"+
		"\3\2\2\2NO\7T\2\2OP\7G\2\2PQ\7V\2\2QR\7W\2\2RS\7T\2\2ST\7P\2\2T\36\3\2"+
		"\2\2UV\7.\2\2V \3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2"+
		"\2\2[\"\3\2\2\2\\^\t\3\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a"+
		"\3\2\2\2ab\b\22\2\2b$\3\2\2\2cd\7\61\2\2df\7\61\2\2ec\3\2\2\2fi\3\2\2"+
		"\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\61\2\2kl\7\61\2\2lm\3\2"+
		"\2\2mn\b\23\2\2n&\3\2\2\2\6\2Z_g\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}