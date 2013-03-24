// Generated from Commands.g by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, Number=4, WS=5;
	public static final String[] tokenNames = {
		"<INVALID>", "'RT'", "'FD'", "'LT'", "Number", "WS"
	};
	public static final int
		RULE_cmds = 0, RULE_arg = 1;
	public static final String[] ruleNames = {
		"cmds", "arg"
	};

	@Override
	public String getGrammarFileName() { return "Commands.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommandsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CmdsContext extends ParserRuleContext {
		public LOGOCommand cmd;
		public ArgContext a;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public CmdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterCmds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitCmds(this);
		}
	}

	public final CmdsContext cmds() throws RecognitionException {
		CmdsContext _localctx = new CmdsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmds);
		try {
			setState(16);
			switch (_input.LA(1)) {
			case 2:
				enterOuterAlt(_localctx, 1);
				{
				setState(4); match(2);
				setState(5); ((CmdsContext)_localctx).a = arg();
				((CmdsContext)_localctx).cmd =  new LOGOFD(); _localctx.cmd.reset(); _localctx.cmd.addArg(((CmdsContext)_localctx).a.value);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(8); match(3);
				setState(9); ((CmdsContext)_localctx).a = arg();
				((CmdsContext)_localctx).cmd =  new LOGOLT(); _localctx.cmd.reset(); _localctx.cmd.addArg(((CmdsContext)_localctx).a.value);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 3);
				{
				setState(12); match(1);
				setState(13); ((CmdsContext)_localctx).a = arg();
				((CmdsContext)_localctx).cmd =  new LOGOLT(); _localctx.cmd.reset(); _localctx.cmd.addArg(-((CmdsContext)_localctx).a.value);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public double value;
		public Token n;
		public TerminalNode Number() { return getToken(CommandsParser.Number, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); ((ArgContext)_localctx).n = match(Number);
			((ArgContext)_localctx).value =  Double.parseDouble((((ArgContext)_localctx).n!=null?((ArgContext)_localctx).n.getText():null));
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

	public static final String _serializedATN =
		"\2\3\7\30\4\2\t\2\4\3\t\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\23\n\2\3\3\3\3\3\3\3\3\2\4\2\4\2\2\27\2\22\3\2\2\2\4\24\3\2\2"+
		"\2\6\7\7\4\2\2\7\b\5\4\3\2\b\t\b\2\1\2\t\23\3\2\2\2\n\13\7\5\2\2\13\f"+
		"\5\4\3\2\f\r\b\2\1\2\r\23\3\2\2\2\16\17\7\3\2\2\17\20\5\4\3\2\20\21\b"+
		"\2\1\2\21\23\3\2\2\2\22\6\3\2\2\2\22\n\3\2\2\2\22\16\3\2\2\2\23\3\3\2"+
		"\2\2\24\25\7\6\2\2\25\26\b\3\1\2\26\5\3\2\2\2\3\22";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}