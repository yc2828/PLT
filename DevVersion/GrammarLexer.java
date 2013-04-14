// Generated from Grammar.g by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, Forward=9, 
		Back=10, Left=11, Right=12, Clearscreen=13, Origin=14, Getx=15, Gety=16, 
		Getxy=17, Number=18, Identifier=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'SET'", "'^'", "')'", "'+'", "'-'", "'*'", "'('", "'/'", "Forward", "Back", 
		"Left", "Right", "Clearscreen", "Origin", "Getx", "Gety", "Getxy", "Number", 
		"Identifier", "WS"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "Forward", 
		"Back", "Left", "Right", "Clearscreen", "Origin", "Getx", "Gety", "Getxy", 
		"Number", "Identifier", "WS"
	};


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\26\u00ec\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nQ"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13`\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fo\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0080"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009a\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b0\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00ba\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00c4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00d3\n\22\3\23\6\23\u00d6\n\23\r\23\16\23\u00d7\3\23"+
		"\3\23\6\23\u00dc\n\23\r\23\16\23\u00dd\5\23\u00e0\n\23\3\24\3\24\7\24"+
		"\u00e4\n\24\f\24\16\24\u00e7\13\24\3\25\3\25\3\25\3\25\2\26\3\3\1\5\4"+
		"\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\2\3\2\5\5C\\a"+
		"ac|\4\62;C|\5\13\f\17\17\"\"\u0100\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\3+\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67"+
		"\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23P\3\2\2\2\25_\3\2\2\2\27n\3\2\2\2\31"+
		"\177\3\2\2\2\33\u0099\3\2\2\2\35\u00af\3\2\2\2\37\u00b9\3\2\2\2!\u00c3"+
		"\3\2\2\2#\u00d2\3\2\2\2%\u00d5\3\2\2\2\'\u00e1\3\2\2\2)\u00e8\3\2\2\2"+
		"+,\7U\2\2,-\7G\2\2-.\7V\2\2.\4\3\2\2\2/\60\7`\2\2\60\6\3\2\2\2\61\62\7"+
		"+\2\2\62\b\3\2\2\2\63\64\7-\2\2\64\n\3\2\2\2\65\66\7/\2\2\66\f\3\2\2\2"+
		"\678\7,\2\28\16\3\2\2\29:\7*\2\2:\20\3\2\2\2;<\7\61\2\2<\22\3\2\2\2=>"+
		"\7H\2\2>?\7q\2\2?@\7t\2\2@A\7y\2\2AB\7c\2\2BC\7t\2\2CD\7f\2\2DQ\7\"\2"+
		"\2EF\7H\2\2FG\7Q\2\2GH\7T\2\2HI\7Y\2\2IJ\7C\2\2JK\7T\2\2KL\7F\2\2LQ\7"+
		"\"\2\2MN\7H\2\2NO\7F\2\2OQ\7\"\2\2P=\3\2\2\2PE\3\2\2\2PM\3\2\2\2Q\24\3"+
		"\2\2\2RS\7D\2\2ST\7c\2\2TU\7e\2\2UV\7m\2\2V`\7\"\2\2WX\7D\2\2XY\7C\2\2"+
		"YZ\7E\2\2Z[\7M\2\2[`\7\"\2\2\\]\7D\2\2]^\7M\2\2^`\7\"\2\2_R\3\2\2\2_W"+
		"\3\2\2\2_\\\3\2\2\2`\26\3\2\2\2ab\7N\2\2bc\7g\2\2cd\7h\2\2de\7v\2\2eo"+
		"\7\"\2\2fg\7N\2\2gh\7G\2\2hi\7H\2\2ij\7V\2\2jo\7\"\2\2kl\7N\2\2lm\7V\2"+
		"\2mo\7\"\2\2na\3\2\2\2nf\3\2\2\2nk\3\2\2\2o\30\3\2\2\2pq\7T\2\2qr\7k\2"+
		"\2rs\7i\2\2st\7j\2\2tu\7v\2\2u\u0080\7\"\2\2vw\7T\2\2wx\7K\2\2xy\7I\2"+
		"\2yz\7J\2\2z{\7V\2\2{\u0080\7\"\2\2|}\7T\2\2}~\7V\2\2~\u0080\7\"\2\2\177"+
		"p\3\2\2\2\177v\3\2\2\2\177|\3\2\2\2\u0080\32\3\2\2\2\u0081\u0082\7E\2"+
		"\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2\u0085\u0086"+
		"\7t\2\2\u0086\u0087\7u\2\2\u0087\u0088\7e\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7g\2\2\u008b\u009a\7p\2\2\u008c\u008d\7E\2\2"+
		"\u008d\u008e\7N\2\2\u008e\u008f\7G\2\2\u008f\u0090\7C\2\2\u0090\u0091"+
		"\7T\2\2\u0091\u0092\7U\2\2\u0092\u0093\7E\2\2\u0093\u0094\7T\2\2\u0094"+
		"\u0095\7G\2\2\u0095\u0096\7G\2\2\u0096\u009a\7P\2\2\u0097\u0098\7E\2\2"+
		"\u0098\u009a\7U\2\2\u0099\u0081\3\2\2\2\u0099\u008c\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\34\3\2\2\2\u009b\u009c\7Q\2\2\u009c\u009d\7t\2\2\u009d"+
		"\u009e\7k\2\2\u009e\u009f\7i\2\2\u009f\u00a0\7k\2\2\u00a0\u00b0\7p\2\2"+
		"\u00a1\u00a2\7Q\2\2\u00a2\u00a3\7T\2\2\u00a3\u00a4\7K\2\2\u00a4\u00a5"+
		"\7I\2\2\u00a5\u00a6\7K\2\2\u00a6\u00b0\7P\2\2\u00a7\u00a8\7J\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7o\2\2\u00aa\u00b0\7g\2\2\u00ab\u00ac\7J\2\2"+
		"\u00ac\u00ad\7Q\2\2\u00ad\u00ae\7O\2\2\u00ae\u00b0\7G\2\2\u00af\u009b"+
		"\3\2\2\2\u00af\u00a1\3\2\2\2\u00af\u00a7\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0"+
		"\36\3\2\2\2\u00b1\u00b2\7I\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7v\2\2\u00b4"+
		"\u00ba\7z\2\2\u00b5\u00b6\7I\2\2\u00b6\u00b7\7G\2\2\u00b7\u00b8\7V\2\2"+
		"\u00b8\u00ba\7Z\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba \3\2"+
		"\2\2\u00bb\u00bc\7I\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7v\2\2\u00be\u00c4"+
		"\7{\2\2\u00bf\u00c0\7I\2\2\u00c0\u00c1\7G\2\2\u00c1\u00c2\7V\2\2\u00c2"+
		"\u00c4\7[\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\"\3\2\2\2"+
		"\u00c5\u00c6\7I\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9"+
		"\7z\2\2\u00c9\u00d3\7{\2\2\u00ca\u00cb\7I\2\2\u00cb\u00cc\7G\2\2\u00cc"+
		"\u00cd\7V\2\2\u00cd\u00ce\7Z\2\2\u00ce\u00d3\7[\2\2\u00cf\u00d0\7I\2\2"+
		"\u00d0\u00d1\7R\2\2\u00d1\u00d3\7U\2\2\u00d2\u00c5\3\2\2\2\u00d2\u00ca"+
		"\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3$\3\2\2\2\u00d4\u00d6\4\62;\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00df\3\2\2\2\u00d9\u00db\7\60\2\2\u00da\u00dc\4\62;\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e0\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"&\3\2\2\2\u00e1\u00e5\t\2\2\2\u00e2\u00e4\t\3\2\2\u00e3\u00e2\3\2\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6(\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\t\4\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\b\25\2\2\u00eb*\3\2\2\2\20\2P_n\177\u0099\u00af\u00b9\u00c3\u00d2"+
		"\u00d7\u00dd\u00df\u00e5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}