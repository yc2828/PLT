// Generated from Grammar.g by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__40=1, T__39=2, T__38=3, T__37=4, T__36=5, T__35=6, T__34=7, T__33=8, 
		T__32=9, T__31=10, T__30=11, T__29=12, T__28=13, T__27=14, T__26=15, T__25=16, 
		T__24=17, T__23=18, T__22=19, T__21=20, T__20=21, T__19=22, T__18=23, 
		T__17=24, T__16=25, T__15=26, T__14=27, T__13=28, T__12=29, T__11=30, 
		T__10=31, T__9=32, T__8=33, T__7=34, T__6=35, T__5=36, T__4=37, T__3=38, 
		T__2=39, T__1=40, T__0=41, Number=42, Identifier=43, WS=44;
	public static final String[] tokenNames = {
		"<INVALID>", "'HT'", "'WRAP'", "'PD'", "'SETY '", "'LEFT '", "'HIDE_TURTLE'", 
		"'-'", "'*'", "'('", "'PU'", "'FD '", "'PEN_UP'", "'FORWARD '", "'BACK '", 
		"'GPS'", "'GETX'", "'SPEED '", "'SETX '", "'PRINT '", "'SET'", "'^'", 
		"'ST'", "'SETXY '", "')'", "'HOME'", "'FENCE'", "'+'", "'BK '", "'TELEPORT '", 
		"'GETXY'", "'Forward '", "'SHOW_TURTLE'", "'ORIGIN'", "'CS'", "'PEN_DOWN'", 
		"'LT '", "'/'", "'CLEARSCREEN'", "'RT '", "'GETY'", "'RIGHT '", "Number", 
		"Identifier", "WS"
	};
	public static final int
		RULE_line = 0, RULE_command_list = 1, RULE_command_noarg = 2, RULE_command_expr = 3, 
		RULE_command = 4, RULE_forward = 5, RULE_back = 6, RULE_left = 7, RULE_right = 8, 
		RULE_setx = 9, RULE_sety = 10, RULE_setxy = 11, RULE_getx = 12, RULE_gety = 13, 
		RULE_getxy = 14, RULE_speed = 15, RULE_print = 16, RULE_clearscreen = 17, 
		RULE_origin = 18, RULE_showturtle = 19, RULE_hideturtle = 20, RULE_wrap = 21, 
		RULE_fence = 22, RULE_penup = 23, RULE_pendown = 24, RULE_expression = 25, 
		RULE_primary_expression = 26, RULE_unary_expression = 27, RULE_unary_operator = 28, 
		RULE_multiplicative_expression = 29, RULE_additive_expression = 30, RULE_id = 31, 
		RULE_assignment_expression = 32;
	public static final String[] ruleNames = {
		"line", "command_list", "command_noarg", "command_expr", "command", "forward", 
		"back", "left", "right", "setx", "sety", "setxy", "getx", "gety", "getxy", 
		"speed", "print", "clearscreen", "origin", "showturtle", "hideturtle", 
		"wrap", "fence", "penup", "pendown", "expression", "primary_expression", 
		"unary_expression", "unary_operator", "multiplicative_expression", "additive_expression", 
		"id", "assignment_expression"
	};

	@Override
	public String getGrammarFileName() { return "Grammar.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LineContext extends ParserRuleContext {
		public LOGONode node;
		public Command_listContext command_list;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_line);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case EOF:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 22:
			case 23:
			case 25:
			case 26:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 38:
			case 39:
			case 40:
			case 41:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); ((LineContext)_localctx).command_list = command_list();
				setState(67); match(EOF);
				((LineContext)_localctx).node =  ((LineContext)_localctx).command_list.node;
				}
				break;
			case 7:
			case 9:
			case 20:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); ((LineContext)_localctx).expression = expression();
				setState(71); match(EOF);
				((LineContext)_localctx).node =  ((LineContext)_localctx).expression.node;
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

	public static class Command_listContext extends ParserRuleContext {
		public LOGONode node;
		public Command_noargContext command_noarg;
		public Command_listContext l;
		public Command_exprContext command_expr;
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public Command_exprContext command_expr() {
			return getRuleContext(Command_exprContext.class,0);
		}
		public Command_noargContext command_noarg() {
			return getRuleContext(Command_noargContext.class,0);
		}
		public Command_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCommand_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCommand_list(this);
		}
	}

	public final Command_listContext command_list() throws RecognitionException {
		Command_listContext _localctx = new Command_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command_list);
		try {
			setState(85);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 3:
			case 6:
			case 10:
			case 12:
			case 15:
			case 16:
			case 22:
			case 25:
			case 26:
			case 30:
			case 32:
			case 33:
			case 34:
			case 35:
			case 38:
			case 40:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); ((Command_listContext)_localctx).command_noarg = command_noarg();
				setState(77); ((Command_listContext)_localctx).l = command_list();
				((Command_listContext)_localctx).node =  new LOGOCommandNode("commandList", ((Command_listContext)_localctx).command_noarg.node, ((Command_listContext)_localctx).l.node);
				}
				break;
			case 4:
			case 5:
			case 11:
			case 13:
			case 14:
			case 17:
			case 18:
			case 23:
			case 28:
			case 29:
			case 31:
			case 36:
			case 39:
			case 41:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); ((Command_listContext)_localctx).command_expr = command_expr();
				setState(81); ((Command_listContext)_localctx).l = command_list();
				((Command_listContext)_localctx).node =  new LOGOCommandNode("commandList",((Command_listContext)_localctx).command_expr.node, ((Command_listContext)_localctx).l.node);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				((Command_listContext)_localctx).node =  null;
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

	public static class Command_noargContext extends ParserRuleContext {
		public LOGONode node;
		public GetxContext getx;
		public GetyContext gety;
		public GetxyContext getxy;
		public ClearscreenContext clearscreen;
		public OriginContext origin;
		public ShowturtleContext showturtle;
		public HideturtleContext hideturtle;
		public WrapContext wrap;
		public FenceContext fence;
		public PenupContext penup;
		public PendownContext pendown;
		public FenceContext fence() {
			return getRuleContext(FenceContext.class,0);
		}
		public WrapContext wrap() {
			return getRuleContext(WrapContext.class,0);
		}
		public GetxyContext getxy() {
			return getRuleContext(GetxyContext.class,0);
		}
		public PendownContext pendown() {
			return getRuleContext(PendownContext.class,0);
		}
		public PenupContext penup() {
			return getRuleContext(PenupContext.class,0);
		}
		public HideturtleContext hideturtle() {
			return getRuleContext(HideturtleContext.class,0);
		}
		public OriginContext origin() {
			return getRuleContext(OriginContext.class,0);
		}
		public GetyContext gety() {
			return getRuleContext(GetyContext.class,0);
		}
		public ClearscreenContext clearscreen() {
			return getRuleContext(ClearscreenContext.class,0);
		}
		public GetxContext getx() {
			return getRuleContext(GetxContext.class,0);
		}
		public ShowturtleContext showturtle() {
			return getRuleContext(ShowturtleContext.class,0);
		}
		public Command_noargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_noarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCommand_noarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCommand_noarg(this);
		}
	}

	public final Command_noargContext command_noarg() throws RecognitionException {
		Command_noargContext _localctx = new Command_noargContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command_noarg);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case 16:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); ((Command_noargContext)_localctx).getx = getx();
				((Command_noargContext)_localctx).node =   new LOGOCommandNode(((Command_noargContext)_localctx).getx.text);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); ((Command_noargContext)_localctx).gety = gety();
				((Command_noargContext)_localctx).node =   new LOGOCommandNode(((Command_noargContext)_localctx).gety.text);
				}
				break;
			case 15:
			case 30:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); ((Command_noargContext)_localctx).getxy = getxy();
				((Command_noargContext)_localctx).node =   new LOGOCommandNode(((Command_noargContext)_localctx).getxy.text);
				}
				break;
			case 34:
			case 38:
				enterOuterAlt(_localctx, 4);
				{
				setState(96); ((Command_noargContext)_localctx).clearscreen = clearscreen();
				((Command_noargContext)_localctx).node =   new LOGOCommandNode(((Command_noargContext)_localctx).clearscreen.text);
				}
				break;
			case 25:
			case 33:
				enterOuterAlt(_localctx, 5);
				{
				setState(99); ((Command_noargContext)_localctx).origin = origin();
				((Command_noargContext)_localctx).node =   new LOGOCommandNode(((Command_noargContext)_localctx).origin.text);
				}
				break;
			case 22:
			case 32:
				enterOuterAlt(_localctx, 6);
				{
				setState(102); ((Command_noargContext)_localctx).showturtle = showturtle();
				((Command_noargContext)_localctx).node =   new LOGOCommandNode(((Command_noargContext)_localctx).showturtle.text);
				}
				break;
			case 1:
			case 6:
				enterOuterAlt(_localctx, 7);
				{
				setState(105); ((Command_noargContext)_localctx).hideturtle = hideturtle();
				((Command_noargContext)_localctx).node =   new LOGOCommandNode(((Command_noargContext)_localctx).hideturtle.text);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 8);
				{
				setState(108); ((Command_noargContext)_localctx).wrap = wrap();
				((Command_noargContext)_localctx).node =   new LOGOCommandNode(((Command_noargContext)_localctx).wrap.text);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 9);
				{
				setState(111); ((Command_noargContext)_localctx).fence = fence();
				((Command_noargContext)_localctx).node =   new LOGOCommandNode(((Command_noargContext)_localctx).fence.text);
				}
				break;
			case 10:
			case 12:
				enterOuterAlt(_localctx, 10);
				{
				setState(114); ((Command_noargContext)_localctx).penup = penup();
				((Command_noargContext)_localctx).node =   new LOGOCommandNode(((Command_noargContext)_localctx).penup.text);
				}
				break;
			case 3:
			case 35:
				enterOuterAlt(_localctx, 11);
				{
				setState(117); ((Command_noargContext)_localctx).pendown = pendown();
				((Command_noargContext)_localctx).node =   new LOGOCommandNode(((Command_noargContext)_localctx).pendown.text);
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

	public static class Command_exprContext extends ParserRuleContext {
		public LOGONode node;
		public CommandContext command;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Command_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCommand_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCommand_expr(this);
		}
	}

	public final Command_exprContext command_expr() throws RecognitionException {
		Command_exprContext _localctx = new Command_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); ((Command_exprContext)_localctx).command = command();
			setState(123); ((Command_exprContext)_localctx).expression = expression();
			((Command_exprContext)_localctx).node =  new LOGOCommandNode(((Command_exprContext)_localctx).command.text, ((Command_exprContext)_localctx).expression.node);
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

	public static class CommandContext extends ParserRuleContext {
		public String text;
		public ForwardContext forward;
		public BackContext back;
		public LeftContext left;
		public RightContext right;
		public SpeedContext speed;
		public SetxContext setx;
		public SetyContext sety;
		public SetxyContext setxy;
		public SetxyContext setxy() {
			return getRuleContext(SetxyContext.class,0);
		}
		public SpeedContext speed() {
			return getRuleContext(SpeedContext.class,0);
		}
		public ForwardContext forward() {
			return getRuleContext(ForwardContext.class,0);
		}
		public BackContext back() {
			return getRuleContext(BackContext.class,0);
		}
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public SetxContext setx() {
			return getRuleContext(SetxContext.class,0);
		}
		public SetyContext sety() {
			return getRuleContext(SetyContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		try {
			setState(150);
			switch (_input.LA(1)) {
			case 11:
			case 13:
			case 31:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); ((CommandContext)_localctx).forward = forward();
				((CommandContext)_localctx).text =  ((CommandContext)_localctx).forward.text;
				}
				break;
			case 14:
			case 28:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); ((CommandContext)_localctx).back = back();
				((CommandContext)_localctx).text =  ((CommandContext)_localctx).back.text;
				}
				break;
			case 5:
			case 36:
				enterOuterAlt(_localctx, 3);
				{
				setState(132); ((CommandContext)_localctx).left = left();
				((CommandContext)_localctx).text =  ((CommandContext)_localctx).left.text;
				}
				break;
			case 39:
			case 41:
				enterOuterAlt(_localctx, 4);
				{
				setState(135); ((CommandContext)_localctx).right = right();
				((CommandContext)_localctx).text =  ((CommandContext)_localctx).right.text;
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 5);
				{
				setState(138); ((CommandContext)_localctx).speed = speed();
				((CommandContext)_localctx).text =  ((CommandContext)_localctx).speed.text;
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 6);
				{
				setState(141); ((CommandContext)_localctx).setx = setx();
				((CommandContext)_localctx).text =  ((CommandContext)_localctx).setx.text;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 7);
				{
				setState(144); ((CommandContext)_localctx).sety = sety();
				((CommandContext)_localctx).text =  ((CommandContext)_localctx).sety.text;
				}
				break;
			case 23:
			case 29:
				enterOuterAlt(_localctx, 8);
				{
				setState(147); ((CommandContext)_localctx).setxy = setxy();
				((CommandContext)_localctx).text =  ((CommandContext)_localctx).setxy.text;
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

	public static class ForwardContext extends ParserRuleContext {
		public String text;
		public Token c;
		public ForwardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forward; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForward(this);
		}
	}

	public final ForwardContext forward() throws RecognitionException {
		ForwardContext _localctx = new ForwardContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forward);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); ((ForwardContext)_localctx).c = match(13);
				((ForwardContext)_localctx).text =   new String("FORWARD");
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); ((ForwardContext)_localctx).c = match(11);
				((ForwardContext)_localctx).text =   new String("FORWARD");
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); ((ForwardContext)_localctx).c = match(31);
				((ForwardContext)_localctx).text =  new String("FORWARD");
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

	public static class BackContext extends ParserRuleContext {
		public String text;
		public Token c;
		public BackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBack(this);
		}
	}

	public final BackContext back() throws RecognitionException {
		BackContext _localctx = new BackContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_back);
		try {
			setState(164);
			switch (_input.LA(1)) {
			case 14:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); ((BackContext)_localctx).c = match(14);
				((BackContext)_localctx).text =   new String("BACK");
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 2);
				{
				setState(162); ((BackContext)_localctx).c = match(28);
				((BackContext)_localctx).text =   new String("BACK");
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

	public static class LeftContext extends ParserRuleContext {
		public String text;
		public Token c;
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLeft(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_left);
		try {
			setState(170);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(166); ((LeftContext)_localctx).c = match(5);
				((LeftContext)_localctx).text =  new String("LEFT");
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 2);
				{
				setState(168); ((LeftContext)_localctx).c = match(36);
				((LeftContext)_localctx).text =  new String("LEFT");
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

	public static class RightContext extends ParserRuleContext {
		public String text;
		public Token c;
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRight(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_right);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case 41:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); ((RightContext)_localctx).c = match(41);
				((RightContext)_localctx).text =  new String("RIGHT");
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); ((RightContext)_localctx).c = match(39);
				((RightContext)_localctx).text =  new String("RIGHT");
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

	public static class SetxContext extends ParserRuleContext {
		public String text;
		public Token c;
		public SetxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSetx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSetx(this);
		}
	}

	public final SetxContext setx() throws RecognitionException {
		SetxContext _localctx = new SetxContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); ((SetxContext)_localctx).c = match(18);
			((SetxContext)_localctx).text =   ((SetxContext)_localctx).c.getText();
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

	public static class SetyContext extends ParserRuleContext {
		public String text;
		public Token c;
		public SetyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sety; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSety(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSety(this);
		}
	}

	public final SetyContext sety() throws RecognitionException {
		SetyContext _localctx = new SetyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sety);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); ((SetyContext)_localctx).c = match(4);
			((SetyContext)_localctx).text =   ((SetyContext)_localctx).c.getText();
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

	public static class SetxyContext extends ParserRuleContext {
		public String text;
		public Token c;
		public SetxyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setxy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSetxy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSetxy(this);
		}
	}

	public final SetxyContext setxy() throws RecognitionException {
		SetxyContext _localctx = new SetxyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setxy);
		try {
			setState(188);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); ((SetxyContext)_localctx).c = match(23);
				((SetxyContext)_localctx).text =   ((SetxyContext)_localctx).c.getText();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); ((SetxyContext)_localctx).c = match(29);
				((SetxyContext)_localctx).text =   ((SetxyContext)_localctx).c.getText();
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

	public static class GetxContext extends ParserRuleContext {
		public String text;
		public Token c;
		public GetxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGetx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGetx(this);
		}
	}

	public final GetxContext getx() throws RecognitionException {
		GetxContext _localctx = new GetxContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_getx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); ((GetxContext)_localctx).c = match(16);
			((GetxContext)_localctx).text =   ((GetxContext)_localctx).c.getText();
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

	public static class GetyContext extends ParserRuleContext {
		public String text;
		public Token c;
		public GetyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gety; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGety(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGety(this);
		}
	}

	public final GetyContext gety() throws RecognitionException {
		GetyContext _localctx = new GetyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_gety);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); ((GetyContext)_localctx).c = match(40);
			((GetyContext)_localctx).text =   ((GetyContext)_localctx).c.getText();
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

	public static class GetxyContext extends ParserRuleContext {
		public String text;
		public Token c;
		public GetxyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getxy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGetxy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGetxy(this);
		}
	}

	public final GetxyContext getxy() throws RecognitionException {
		GetxyContext _localctx = new GetxyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_getxy);
		try {
			setState(200);
			switch (_input.LA(1)) {
			case 30:
				enterOuterAlt(_localctx, 1);
				{
				setState(196); ((GetxyContext)_localctx).c = match(30);
				((GetxyContext)_localctx).text =   ((GetxyContext)_localctx).c.getText();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); ((GetxyContext)_localctx).c = match(15);
				((GetxyContext)_localctx).text =   ((GetxyContext)_localctx).c.getText();
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

	public static class SpeedContext extends ParserRuleContext {
		public String text;
		public Token c;
		public SpeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSpeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSpeed(this);
		}
	}

	public final SpeedContext speed() throws RecognitionException {
		SpeedContext _localctx = new SpeedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); ((SpeedContext)_localctx).c = match(17);
			((SpeedContext)_localctx).text =   ((SpeedContext)_localctx).c.getText();
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

	public static class PrintContext extends ParserRuleContext {
		public String text;
		public Token c;
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); ((PrintContext)_localctx).c = match(19);
			((PrintContext)_localctx).text =   ((PrintContext)_localctx).c.getText();
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

	public static class ClearscreenContext extends ParserRuleContext {
		public String text;
		public Token c;
		public ClearscreenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearscreen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterClearscreen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitClearscreen(this);
		}
	}

	public final ClearscreenContext clearscreen() throws RecognitionException {
		ClearscreenContext _localctx = new ClearscreenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_clearscreen);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case 38:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); ((ClearscreenContext)_localctx).c = match(38);
				((ClearscreenContext)_localctx).text =  new String("CLEARSCREEN");
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); ((ClearscreenContext)_localctx).c = match(34);
				((ClearscreenContext)_localctx).text =  new String("CLEARSCREEN");
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

	public static class OriginContext extends ParserRuleContext {
		public String text;
		public Token c;
		public OriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOrigin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOrigin(this);
		}
	}

	public final OriginContext origin() throws RecognitionException {
		OriginContext _localctx = new OriginContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_origin);
		try {
			setState(218);
			switch (_input.LA(1)) {
			case 33:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); ((OriginContext)_localctx).c = match(33);
				((OriginContext)_localctx).text =   ((OriginContext)_localctx).c.getText();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); ((OriginContext)_localctx).c = match(25);
				((OriginContext)_localctx).text =   ((OriginContext)_localctx).c.getText();
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

	public static class ShowturtleContext extends ParserRuleContext {
		public String text;
		public Token c;
		public ShowturtleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showturtle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterShowturtle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitShowturtle(this);
		}
	}

	public final ShowturtleContext showturtle() throws RecognitionException {
		ShowturtleContext _localctx = new ShowturtleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_showturtle);
		try {
			setState(224);
			switch (_input.LA(1)) {
			case 32:
				enterOuterAlt(_localctx, 1);
				{
				setState(220); ((ShowturtleContext)_localctx).c = match(32);
				((ShowturtleContext)_localctx).text =   ((ShowturtleContext)_localctx).c.getText();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); ((ShowturtleContext)_localctx).c = match(22);
				((ShowturtleContext)_localctx).text =   ((ShowturtleContext)_localctx).c.getText();
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

	public static class HideturtleContext extends ParserRuleContext {
		public String text;
		public Token c;
		public HideturtleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hideturtle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterHideturtle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitHideturtle(this);
		}
	}

	public final HideturtleContext hideturtle() throws RecognitionException {
		HideturtleContext _localctx = new HideturtleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hideturtle);
		try {
			setState(230);
			switch (_input.LA(1)) {
			case 6:
				enterOuterAlt(_localctx, 1);
				{
				setState(226); ((HideturtleContext)_localctx).c = match(6);
				((HideturtleContext)_localctx).text =   ((HideturtleContext)_localctx).c.getText();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 2);
				{
				setState(228); ((HideturtleContext)_localctx).c = match(1);
				((HideturtleContext)_localctx).text =   ((HideturtleContext)_localctx).c.getText();
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

	public static class WrapContext extends ParserRuleContext {
		public String text;
		public Token c;
		public WrapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWrap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWrap(this);
		}
	}

	public final WrapContext wrap() throws RecognitionException {
		WrapContext _localctx = new WrapContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_wrap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); ((WrapContext)_localctx).c = match(2);
			((WrapContext)_localctx).text =   ((WrapContext)_localctx).c.getText();
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

	public static class FenceContext extends ParserRuleContext {
		public String text;
		public Token c;
		public FenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFence(this);
		}
	}

	public final FenceContext fence() throws RecognitionException {
		FenceContext _localctx = new FenceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); ((FenceContext)_localctx).c = match(26);
			((FenceContext)_localctx).text =   ((FenceContext)_localctx).c.getText();
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

	public static class PenupContext extends ParserRuleContext {
		public String text;
		public Token c;
		public PenupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPenup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPenup(this);
		}
	}

	public final PenupContext penup() throws RecognitionException {
		PenupContext _localctx = new PenupContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_penup);
		try {
			setState(242);
			switch (_input.LA(1)) {
			case 12:
				enterOuterAlt(_localctx, 1);
				{
				setState(238); ((PenupContext)_localctx).c = match(12);
				((PenupContext)_localctx).text =   ((PenupContext)_localctx).c.getText();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); ((PenupContext)_localctx).c = match(10);
				((PenupContext)_localctx).text =   ((PenupContext)_localctx).c.getText();
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

	public static class PendownContext extends ParserRuleContext {
		public String text;
		public Token c;
		public PendownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pendown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPendown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPendown(this);
		}
	}

	public final PendownContext pendown() throws RecognitionException {
		PendownContext _localctx = new PendownContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pendown);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case 35:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); ((PendownContext)_localctx).c = match(35);
				((PendownContext)_localctx).text =   ((PendownContext)_localctx).c.getText();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(246); ((PendownContext)_localctx).c = match(3);
				((PendownContext)_localctx).text =   ((PendownContext)_localctx).c.getText();
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

	public static class ExpressionContext extends ParserRuleContext {
		public LOGONode node;
		public Additive_expressionContext additive_expression;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); ((ExpressionContext)_localctx).additive_expression = additive_expression(0);
			((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).additive_expression.node;
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public LOGONode node;
		public Token Number;
		public ExpressionContext expression;
		public Assignment_expressionContext assignment_expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Number() { return getToken(GrammarParser.Number, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primary_expression);
		try {
			setState(263);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(253); ((Primary_expressionContext)_localctx).Number = match(Number);
				((Primary_expressionContext)_localctx).node =  new LOGOLeaf((((Primary_expressionContext)_localctx).Number!=null?((Primary_expressionContext)_localctx).Number.getText():null));
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 2);
				{
				setState(255); match(9);
				setState(256); ((Primary_expressionContext)_localctx).expression = expression();
				setState(257); match(24);
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).expression.node;
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 3);
				{
				setState(260); ((Primary_expressionContext)_localctx).assignment_expression = assignment_expression();
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).assignment_expression.node;
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public LOGONode node;
		public Primary_expressionContext primary_expression;
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unary_expression);
		try {
			setState(272);
			switch (_input.LA(1)) {
			case 9:
			case 20:
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); ((Unary_expressionContext)_localctx).primary_expression = primary_expression();
				((Unary_expressionContext)_localctx).node =  ((Unary_expressionContext)_localctx).primary_expression.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); unary_operator();
				setState(269); ((Unary_expressionContext)_localctx).primary_expression = primary_expression();
				((Unary_expressionContext)_localctx).node =  new LOGOOperator("u-", ((Unary_expressionContext)_localctx).primary_expression.node);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(7);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Unary_expressionContext unary_expression;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, _parentState, _p);
		Multiplicative_expressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, RULE_multiplicative_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(277); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
			((Multiplicative_expressionContext)_localctx).node =  ((Multiplicative_expressionContext)_localctx).unary_expression.node;
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(280);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(281); match(8);
						setState(282); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperator("*", _localctx.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node);
						}
						break;

					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(285);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(286); match(37);
						setState(287); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperator("/", _localctx.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node);
						}
						break;

					case 3:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(290);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(291); match(21);
						setState(292); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperator("^", _localctx.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node);
						}
						break;
					}
					} 
				}
				setState(299);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Multiplicative_expressionContext multiplicative_expression;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Additive_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, _parentState, _p);
		Additive_expressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, RULE_additive_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(301); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
			((Additive_expressionContext)_localctx).node =  ((Additive_expressionContext)_localctx).multiplicative_expression.node;
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(314);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(304);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(305); match(27);
						setState(306); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperator("+", _localctx.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node);
						}
						break;

					case 2:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(309);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(310); match(7);
						setState(311); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperator("-", _localctx.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node);
						}
						break;
					}
					} 
				}
				setState(318);
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

	public static class IdContext extends ParserRuleContext {
		public LOGONode node;
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(GrammarParser.Identifier, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); ((IdContext)_localctx).Identifier = match(Identifier);
			((IdContext)_localctx).node =  new LOGOLeaf((((IdContext)_localctx).Identifier!=null?((IdContext)_localctx).Identifier.getText():null));
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public LOGONode node;
		public IdContext id;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(20);
			setState(323); ((Assignment_expressionContext)_localctx).id = id();
			setState(324); ((Assignment_expressionContext)_localctx).expression = expression();
			((Assignment_expressionContext)_localctx).node =  new LOGOOperator("set", ((Assignment_expressionContext)_localctx).id.node, ((Assignment_expressionContext)_localctx).expression.node);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29: return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);

		case 30: return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean additive_expression_sempred(Additive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 2 >= _localctx._p;

		case 4: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 3 >= _localctx._p;

		case 1: return 2 >= _localctx._p;

		case 2: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3.\u014a\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2M\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3X\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4{\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u0099\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a1"+
		"\n\7\3\b\3\b\3\b\3\b\5\b\u00a7\n\b\3\t\3\t\3\t\3\t\5\t\u00ad\n\t\3\n\3"+
		"\n\3\n\3\n\5\n\u00b3\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5"+
		"\r\u00bf\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00cb"+
		"\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00d7\n\23"+
		"\3\24\3\24\3\24\3\24\5\24\u00dd\n\24\3\25\3\25\3\25\3\25\5\25\u00e3\n"+
		"\25\3\26\3\26\3\26\3\26\5\26\u00e9\n\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\5\31\u00f5\n\31\3\32\3\32\3\32\3\32\5\32\u00fb\n"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u010a\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0113\n\35\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u012a\n\37\f\37\16\37\u012d\13\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u013d\n \f \16 \u0140\13"+
		" \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\2#\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@B\2\2\u0151\2L\3\2\2\2\4W\3\2\2\2\6z\3"+
		"\2\2\2\b|\3\2\2\2\n\u0098\3\2\2\2\f\u00a0\3\2\2\2\16\u00a6\3\2\2\2\20"+
		"\u00ac\3\2\2\2\22\u00b2\3\2\2\2\24\u00b4\3\2\2\2\26\u00b7\3\2\2\2\30\u00be"+
		"\3\2\2\2\32\u00c0\3\2\2\2\34\u00c3\3\2\2\2\36\u00ca\3\2\2\2 \u00cc\3\2"+
		"\2\2\"\u00cf\3\2\2\2$\u00d6\3\2\2\2&\u00dc\3\2\2\2(\u00e2\3\2\2\2*\u00e8"+
		"\3\2\2\2,\u00ea\3\2\2\2.\u00ed\3\2\2\2\60\u00f4\3\2\2\2\62\u00fa\3\2\2"+
		"\2\64\u00fc\3\2\2\2\66\u0109\3\2\2\28\u0112\3\2\2\2:\u0114\3\2\2\2<\u0116"+
		"\3\2\2\2>\u012e\3\2\2\2@\u0141\3\2\2\2B\u0144\3\2\2\2DE\5\4\3\2EF\7\1"+
		"\2\2FG\b\2\1\2GM\3\2\2\2HI\5\64\33\2IJ\7\1\2\2JK\b\2\1\2KM\3\2\2\2LD\3"+
		"\2\2\2LH\3\2\2\2M\3\3\2\2\2NO\5\6\4\2OP\5\4\3\2PQ\b\3\1\2QX\3\2\2\2RS"+
		"\5\b\5\2ST\5\4\3\2TU\b\3\1\2UX\3\2\2\2VX\b\3\1\2WN\3\2\2\2WR\3\2\2\2W"+
		"V\3\2\2\2X\5\3\2\2\2YZ\5\32\16\2Z[\b\4\1\2[{\3\2\2\2\\]\5\34\17\2]^\b"+
		"\4\1\2^{\3\2\2\2_`\5\36\20\2`a\b\4\1\2a{\3\2\2\2bc\5$\23\2cd\b\4\1\2d"+
		"{\3\2\2\2ef\5&\24\2fg\b\4\1\2g{\3\2\2\2hi\5(\25\2ij\b\4\1\2j{\3\2\2\2"+
		"kl\5*\26\2lm\b\4\1\2m{\3\2\2\2no\5,\27\2op\b\4\1\2p{\3\2\2\2qr\5.\30\2"+
		"rs\b\4\1\2s{\3\2\2\2tu\5\60\31\2uv\b\4\1\2v{\3\2\2\2wx\5\62\32\2xy\b\4"+
		"\1\2y{\3\2\2\2zY\3\2\2\2z\\\3\2\2\2z_\3\2\2\2zb\3\2\2\2ze\3\2\2\2zh\3"+
		"\2\2\2zk\3\2\2\2zn\3\2\2\2zq\3\2\2\2zt\3\2\2\2zw\3\2\2\2{\7\3\2\2\2|}"+
		"\5\n\6\2}~\5\64\33\2~\177\b\5\1\2\177\t\3\2\2\2\u0080\u0081\5\f\7\2\u0081"+
		"\u0082\b\6\1\2\u0082\u0099\3\2\2\2\u0083\u0084\5\16\b\2\u0084\u0085\b"+
		"\6\1\2\u0085\u0099\3\2\2\2\u0086\u0087\5\20\t\2\u0087\u0088\b\6\1\2\u0088"+
		"\u0099\3\2\2\2\u0089\u008a\5\22\n\2\u008a\u008b\b\6\1\2\u008b\u0099\3"+
		"\2\2\2\u008c\u008d\5 \21\2\u008d\u008e\b\6\1\2\u008e\u0099\3\2\2\2\u008f"+
		"\u0090\5\24\13\2\u0090\u0091\b\6\1\2\u0091\u0099\3\2\2\2\u0092\u0093\5"+
		"\26\f\2\u0093\u0094\b\6\1\2\u0094\u0099\3\2\2\2\u0095\u0096\5\30\r\2\u0096"+
		"\u0097\b\6\1\2\u0097\u0099\3\2\2\2\u0098\u0080\3\2\2\2\u0098\u0083\3\2"+
		"\2\2\u0098\u0086\3\2\2\2\u0098\u0089\3\2\2\2\u0098\u008c\3\2\2\2\u0098"+
		"\u008f\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0095\3\2\2\2\u0099\13\3\2\2"+
		"\2\u009a\u009b\7\17\2\2\u009b\u00a1\b\7\1\2\u009c\u009d\7\r\2\2\u009d"+
		"\u00a1\b\7\1\2\u009e\u009f\7!\2\2\u009f\u00a1\b\7\1\2\u00a0\u009a\3\2"+
		"\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a3"+
		"\7\20\2\2\u00a3\u00a7\b\b\1\2\u00a4\u00a5\7\36\2\2\u00a5\u00a7\b\b\1\2"+
		"\u00a6\u00a2\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00a9"+
		"\7\7\2\2\u00a9\u00ad\b\t\1\2\u00aa\u00ab\7&\2\2\u00ab\u00ad\b\t\1\2\u00ac"+
		"\u00a8\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\21\3\2\2\2\u00ae\u00af\7+\2\2"+
		"\u00af\u00b3\b\n\1\2\u00b0\u00b1\7)\2\2\u00b1\u00b3\b\n\1\2\u00b2\u00ae"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\23\3\2\2\2\u00b4\u00b5\7\24\2\2\u00b5"+
		"\u00b6\b\13\1\2\u00b6\25\3\2\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00b9\b\f\1"+
		"\2\u00b9\27\3\2\2\2\u00ba\u00bb\7\31\2\2\u00bb\u00bf\b\r\1\2\u00bc\u00bd"+
		"\7\37\2\2\u00bd\u00bf\b\r\1\2\u00be\u00ba\3\2\2\2\u00be\u00bc\3\2\2\2"+
		"\u00bf\31\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c2\b\16\1\2\u00c2\33\3"+
		"\2\2\2\u00c3\u00c4\7*\2\2\u00c4\u00c5\b\17\1\2\u00c5\35\3\2\2\2\u00c6"+
		"\u00c7\7 \2\2\u00c7\u00cb\b\20\1\2\u00c8\u00c9\7\21\2\2\u00c9\u00cb\b"+
		"\20\1\2\u00ca\u00c6\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\37\3\2\2\2\u00cc"+
		"\u00cd\7\23\2\2\u00cd\u00ce\b\21\1\2\u00ce!\3\2\2\2\u00cf\u00d0\7\25\2"+
		"\2\u00d0\u00d1\b\22\1\2\u00d1#\3\2\2\2\u00d2\u00d3\7(\2\2\u00d3\u00d7"+
		"\b\23\1\2\u00d4\u00d5\7$\2\2\u00d5\u00d7\b\23\1\2\u00d6\u00d2\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d7%\3\2\2\2\u00d8\u00d9\7#\2\2\u00d9\u00dd\b\24"+
		"\1\2\u00da\u00db\7\33\2\2\u00db\u00dd\b\24\1\2\u00dc\u00d8\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\'\3\2\2\2\u00de\u00df\7\"\2\2\u00df\u00e3\b\25\1"+
		"\2\u00e0\u00e1\7\30\2\2\u00e1\u00e3\b\25\1\2\u00e2\u00de\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3)\3\2\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e9\b\26\1\2"+
		"\u00e6\u00e7\7\3\2\2\u00e7\u00e9\b\26\1\2\u00e8\u00e4\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9+\3\2\2\2\u00ea\u00eb\7\4\2\2\u00eb\u00ec\b\27\1\2\u00ec"+
		"-\3\2\2\2\u00ed\u00ee\7\34\2\2\u00ee\u00ef\b\30\1\2\u00ef/\3\2\2\2\u00f0"+
		"\u00f1\7\16\2\2\u00f1\u00f5\b\31\1\2\u00f2\u00f3\7\f\2\2\u00f3\u00f5\b"+
		"\31\1\2\u00f4\u00f0\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\61\3\2\2\2\u00f6"+
		"\u00f7\7%\2\2\u00f7\u00fb\b\32\1\2\u00f8\u00f9\7\5\2\2\u00f9\u00fb\b\32"+
		"\1\2\u00fa\u00f6\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\63\3\2\2\2\u00fc\u00fd"+
		"\5> \2\u00fd\u00fe\b\33\1\2\u00fe\65\3\2\2\2\u00ff\u0100\7,\2\2\u0100"+
		"\u010a\b\34\1\2\u0101\u0102\7\13\2\2\u0102\u0103\5\64\33\2\u0103\u0104"+
		"\7\32\2\2\u0104\u0105\b\34\1\2\u0105\u010a\3\2\2\2\u0106\u0107\5B\"\2"+
		"\u0107\u0108\b\34\1\2\u0108\u010a\3\2\2\2\u0109\u00ff\3\2\2\2\u0109\u0101"+
		"\3\2\2\2\u0109\u0106\3\2\2\2\u010a\67\3\2\2\2\u010b\u010c\5\66\34\2\u010c"+
		"\u010d\b\35\1\2\u010d\u0113\3\2\2\2\u010e\u010f\5:\36\2\u010f\u0110\5"+
		"\66\34\2\u0110\u0111\b\35\1\2\u0111\u0113\3\2\2\2\u0112\u010b\3\2\2\2"+
		"\u0112\u010e\3\2\2\2\u01139\3\2\2\2\u0114\u0115\7\t\2\2\u0115;\3\2\2\2"+
		"\u0116\u0117\b\37\1\2\u0117\u0118\58\35\2\u0118\u0119\b\37\1\2\u0119\u012b"+
		"\3\2\2\2\u011a\u011b\6\37\2\3\u011b\u011c\7\n\2\2\u011c\u011d\58\35\2"+
		"\u011d\u011e\b\37\1\2\u011e\u012a\3\2\2\2\u011f\u0120\6\37\3\3\u0120\u0121"+
		"\7\'\2\2\u0121\u0122\58\35\2\u0122\u0123\b\37\1\2\u0123\u012a\3\2\2\2"+
		"\u0124\u0125\6\37\4\3\u0125\u0126\7\27\2\2\u0126\u0127\58\35\2\u0127\u0128"+
		"\b\37\1\2\u0128\u012a\3\2\2\2\u0129\u011a\3\2\2\2\u0129\u011f\3\2\2\2"+
		"\u0129\u0124\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c=\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\b \1\2\u012f\u0130"+
		"\5<\37\2\u0130\u0131\b \1\2\u0131\u013e\3\2\2\2\u0132\u0133\6 \5\3\u0133"+
		"\u0134\7\35\2\2\u0134\u0135\5<\37\2\u0135\u0136\b \1\2\u0136\u013d\3\2"+
		"\2\2\u0137\u0138\6 \6\3\u0138\u0139\7\t\2\2\u0139\u013a\5<\37\2\u013a"+
		"\u013b\b \1\2\u013b\u013d\3\2\2\2\u013c\u0132\3\2\2\2\u013c\u0137\3\2"+
		"\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"?\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7-\2\2\u0142\u0143\b!\1\2\u0143"+
		"A\3\2\2\2\u0144\u0145\7\26\2\2\u0145\u0146\5@!\2\u0146\u0147\5\64\33\2"+
		"\u0147\u0148\b\"\1\2\u0148C\3\2\2\2\30LWz\u0098\u00a0\u00a6\u00ac\u00b2"+
		"\u00be\u00ca\u00d6\u00dc\u00e2\u00e8\u00f4\u00fa\u0109\u0112\u0129\u012b"+
		"\u013c\u013e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}