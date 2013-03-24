// Generated from Commands.g by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, Number=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'RT'", "'FD'", "'LT'", "Number", "WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "Number", "WS"
	};


	public CommandsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Commands.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\7%\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\6\5\30\n\5\r\5\16\5\31\3\5\3\5\6\5\36\n\5\r\5\16"+
		"\5\37\5\5\"\n\5\3\6\3\6\2\7\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\3\2\3\5\13"+
		"\f\17\17\"\"\'\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\3\r\3\2\2\2\5\20\3\2\2\2\7\23\3\2\2\2\t\27\3\2\2\2\13#\3\2\2\2"+
		"\r\16\7T\2\2\16\17\7V\2\2\17\4\3\2\2\2\20\21\7H\2\2\21\22\7F\2\2\22\6"+
		"\3\2\2\2\23\24\7N\2\2\24\25\7V\2\2\25\b\3\2\2\2\26\30\4\62;\2\27\26\3"+
		"\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32!\3\2\2\2\33\35\7\60"+
		"\2\2\34\36\4\62;\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2"+
		"\2 \"\3\2\2\2!\33\3\2\2\2!\"\3\2\2\2\"\n\3\2\2\2#$\t\2\2\2$\f\3\2\2\2"+
		"\6\2\31\37!";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}