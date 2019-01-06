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
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, INT=20, DOUBLE=21, ID=22, WS=23, COMMENT=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "INT", "DOUBLE", "ID", "WS", "COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\5\25m\n\25\3\25\3\25"+
		"\3\25\7\25r\n\25\f\25\16\25u\13\25\5\25w\n\25\3\26\5\26z\n\26\3\26\3\26"+
		"\3\26\7\26\177\n\26\f\26\16\26\u0082\13\26\5\26\u0084\n\26\3\26\3\26\6"+
		"\26\u0088\n\26\r\26\16\26\u0089\3\27\6\27\u008d\n\27\r\27\16\27\u008e"+
		"\3\30\6\30\u0092\n\30\r\30\16\30\u0093\3\30\3\30\3\31\3\31\7\31\u009a"+
		"\n\31\f\31\16\31\u009d\13\31\3\31\3\31\3\31\3\31\3\31\2\2\32\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\7\3\2//\3\2\62;\3\2\63;\3\2c|"+
		"\5\2\13\f\17\17\"\"\u00ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7:\3"+
		"\2\2\2\t<\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21E\3\2\2\2\23G\3"+
		"\2\2\2\25I\3\2\2\2\27L\3\2\2\2\31T\3\2\2\2\33V\3\2\2\2\35X\3\2\2\2\37"+
		"Z\3\2\2\2!\\\3\2\2\2#`\3\2\2\2%g\3\2\2\2\'i\3\2\2\2)l\3\2\2\2+y\3\2\2"+
		"\2-\u008c\3\2\2\2/\u0091\3\2\2\2\61\u009b\3\2\2\2\63\64\7\61\2\2\64\4"+
		"\3\2\2\2\65\66\7G\2\2\66\67\7N\2\2\678\7U\2\289\7G\2\29\6\3\2\2\2:;\7"+
		"=\2\2;\b\3\2\2\2<=\7}\2\2=\n\3\2\2\2>?\7>\2\2?\f\3\2\2\2@A\7?\2\2A\16"+
		"\3\2\2\2BC\7K\2\2CD\7H\2\2D\20\3\2\2\2EF\7\177\2\2F\22\3\2\2\2GH\7@\2"+
		"\2H\24\3\2\2\2IJ\7<\2\2JK\7?\2\2K\26\3\2\2\2LM\7R\2\2MN\7T\2\2NO\7Q\2"+
		"\2OP\7I\2\2PQ\7T\2\2QR\7C\2\2RS\7O\2\2S\30\3\2\2\2TU\7*\2\2U\32\3\2\2"+
		"\2VW\7+\2\2W\34\3\2\2\2XY\7,\2\2Y\36\3\2\2\2Z[\7-\2\2[ \3\2\2\2\\]\7H"+
		"\2\2]^\7Q\2\2^_\7T\2\2_\"\3\2\2\2`a\7T\2\2ab\7G\2\2bc\7V\2\2cd\7W\2\2"+
		"de\7T\2\2ef\7P\2\2f$\3\2\2\2gh\7.\2\2h&\3\2\2\2ij\7/\2\2j(\3\2\2\2km\t"+
		"\2\2\2lk\3\2\2\2lm\3\2\2\2mv\3\2\2\2nw\t\3\2\2os\t\4\2\2pr\t\3\2\2qp\3"+
		"\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vn\3\2\2\2vo\3"+
		"\2\2\2w*\3\2\2\2xz\t\2\2\2yx\3\2\2\2yz\3\2\2\2z\u0083\3\2\2\2{\u0084\t"+
		"\3\2\2|\u0080\t\4\2\2}\177\t\3\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"{\3\2\2\2\u0083|\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\7\60\2\2\u0086"+
		"\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a,\3\2\2\2\u008b\u008d\t\5\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		".\3\2\2\2\u0090\u0092\t\6\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096"+
		"\b\30\2\2\u0096\60\3\2\2\2\u0097\u0098\7\61\2\2\u0098\u009a\7\61\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\61\2\2\u009f"+
		"\u00a0\7\61\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\31\2\2\u00a2\62\3\2"+
		"\2\2\r\2lsvy\u0080\u0083\u0089\u008e\u0093\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}