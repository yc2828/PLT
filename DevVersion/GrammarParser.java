// Generated from workspace\Logo++\src\Grammar.g by ANTLR 4.0
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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, Unary_operator=13, Forward=14, Back=15, Left=16, 
		Right=17, Setx=18, Sety=19, Setxy=20, Speed=21, Print=22, Clearscreen=23, 
		Origin=24, Wrap=25, Fence=26, Getx=27, Gety=28, Getxy=29, Penup=30, Pendown=31, 
		Hideturtle=32, Showturtle=33, Set=34, If=35, Else=36, LPARAN=37, RPARAN=38, 
		LBRACKET=39, RBRACKET=40, Number=41, Identifier=42, WS=43;
	public static final String[] tokenNames = {
		"<INVALID>", "'^'", "'+'", "'*'", "'<'", "'='", "'!='", "'<='", "'&&'", 
		"'||'", "'>'", "'/'", "'>='", "'-'", "Forward", "Back", "Left", "Right", 
		"Setx", "Sety", "Setxy", "Speed", "Print", "Clearscreen", "Origin", "Wrap", 
		"Fence", "Getx", "Gety", "Getxy", "Penup", "Pendown", "Hideturtle", "Showturtle", 
		"Set", "'if'", "'else'", "'('", "')'", "'['", "']'", "Number", "Identifier", 
		"WS"
	};
	public static final int
		RULE_line = 0, RULE_command_list = 1, RULE_command_noarg = 2, RULE_command_expr = 3, 
		RULE_command = 4, RULE_expression = 5, RULE_or_expression = 6, RULE_and_expression = 7, 
		RULE_equality_expression = 8, RULE_relational_expression = 9, RULE_additive_expression = 10, 
		RULE_multiplicative_expression = 11, RULE_unary_expression = 12, RULE_primary_expression = 13, 
		RULE_id = 14, RULE_assignment_expression = 15, RULE_conditional_statement = 16;
	public static final String[] ruleNames = {
		"line", "command_list", "command_noarg", "command_expr", "command", "expression", 
		"or_expression", "and_expression", "equality_expression", "relational_expression", 
		"additive_expression", "multiplicative_expression", "unary_expression", 
		"primary_expression", "id", "assignment_expression", "conditional_statement"
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
		public ExpressionContext expression;
		public Command_listContext command_list;
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
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
			setState(45);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(34); conditional_statement();
				setState(35); match(EOF);
				}
				break;
			case Unary_operator:
			case Set:
			case LPARAN:
			case Number:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); ((LineContext)_localctx).expression = expression();
				setState(38); match(EOF);
				((LineContext)_localctx).node =  ((LineContext)_localctx).expression.node; LOGOPP.io.debug("line->expr");
				}
				break;
			case Forward:
			case Back:
			case Left:
			case Right:
			case Setx:
			case Sety:
			case Setxy:
			case Speed:
			case Print:
			case Clearscreen:
			case Origin:
			case Wrap:
			case Fence:
			case Getx:
			case Gety:
			case Getxy:
			case Penup:
			case Pendown:
			case Hideturtle:
			case Showturtle:
				enterOuterAlt(_localctx, 3);
				{
				setState(41); ((LineContext)_localctx).command_list = command_list();
				setState(42); match(EOF);
				((LineContext)_localctx).node =  ((LineContext)_localctx).command_list.node; LOGOPP.io.debug("line->comdlist");
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
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); ((Command_listContext)_localctx).command_noarg = command_noarg();
				setState(48); ((Command_listContext)_localctx).l = command_list();
				((Command_listContext)_localctx).node =  new LOGOCommandNode("commandList", ((Command_listContext)_localctx).command_noarg.node, ((Command_listContext)_localctx).l.node);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); ((Command_listContext)_localctx).command_expr = command_expr();
				setState(52); ((Command_listContext)_localctx).l = command_list();
				((Command_listContext)_localctx).node =  new LOGOCommandNode("commandList",((Command_listContext)_localctx).command_expr.node, ((Command_listContext)_localctx).l.node);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55); ((Command_listContext)_localctx).command_noarg = command_noarg();
				((Command_listContext)_localctx).node =  ((Command_listContext)_localctx).command_noarg.node;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); ((Command_listContext)_localctx).command_expr = command_expr();
				((Command_listContext)_localctx).node =  ((Command_listContext)_localctx).command_expr.node;
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

	public static class Command_noargContext extends ParserRuleContext {
		public LOGONode node;
		public TerminalNode Clearscreen() { return getToken(GrammarParser.Clearscreen, 0); }
		public TerminalNode Getxy() { return getToken(GrammarParser.Getxy, 0); }
		public TerminalNode Showturtle() { return getToken(GrammarParser.Showturtle, 0); }
		public TerminalNode Hideturtle() { return getToken(GrammarParser.Hideturtle, 0); }
		public TerminalNode Pendown() { return getToken(GrammarParser.Pendown, 0); }
		public TerminalNode Getx() { return getToken(GrammarParser.Getx, 0); }
		public TerminalNode Gety() { return getToken(GrammarParser.Gety, 0); }
		public TerminalNode Origin() { return getToken(GrammarParser.Origin, 0); }
		public TerminalNode Penup() { return getToken(GrammarParser.Penup, 0); }
		public TerminalNode Wrap() { return getToken(GrammarParser.Wrap, 0); }
		public TerminalNode Fence() { return getToken(GrammarParser.Fence, 0); }
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
			setState(85);
			switch (_input.LA(1)) {
			case Getx:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(Getx);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("GETX");
				}
				break;
			case Gety:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); match(Gety);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("GETY");
				}
				break;
			case Getxy:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); match(Getxy);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("GETXY");
				}
				break;
			case Clearscreen:
				enterOuterAlt(_localctx, 4);
				{
				setState(69); match(Clearscreen);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("CLEARSCREEN");
				}
				break;
			case Origin:
				enterOuterAlt(_localctx, 5);
				{
				setState(71); match(Origin);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("ORIGIN");
				}
				break;
			case Wrap:
				enterOuterAlt(_localctx, 6);
				{
				setState(73); match(Wrap);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("WRAP");
				}
				break;
			case Fence:
				enterOuterAlt(_localctx, 7);
				{
				setState(75); match(Fence);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("FENCE");
				}
				break;
			case Penup:
				enterOuterAlt(_localctx, 8);
				{
				setState(77); match(Penup);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("PENUP");
				}
				break;
			case Pendown:
				enterOuterAlt(_localctx, 9);
				{
				setState(79); match(Pendown);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("PENDOWN");
				}
				break;
			case Showturtle:
				enterOuterAlt(_localctx, 10);
				{
				setState(81); match(Showturtle);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("SHOWTURTLE");
				}
				break;
			case Hideturtle:
				enterOuterAlt(_localctx, 11);
				{
				setState(83); match(Hideturtle);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("HIDETURTLE");
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
			setState(87); ((Command_exprContext)_localctx).command = command();
			setState(88); ((Command_exprContext)_localctx).expression = expression();
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
		public TerminalNode Right() { return getToken(GrammarParser.Right, 0); }
		public TerminalNode Speed() { return getToken(GrammarParser.Speed, 0); }
		public TerminalNode Setx() { return getToken(GrammarParser.Setx, 0); }
		public TerminalNode Sety() { return getToken(GrammarParser.Sety, 0); }
		public TerminalNode Print() { return getToken(GrammarParser.Print, 0); }
		public TerminalNode Left() { return getToken(GrammarParser.Left, 0); }
		public TerminalNode Setxy() { return getToken(GrammarParser.Setxy, 0); }
		public TerminalNode Back() { return getToken(GrammarParser.Back, 0); }
		public TerminalNode Forward() { return getToken(GrammarParser.Forward, 0); }
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
			setState(109);
			switch (_input.LA(1)) {
			case Forward:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); match(Forward);
				((CommandContext)_localctx).text =  new String("FORWARD");
				}
				break;
			case Back:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(Back);
				((CommandContext)_localctx).text =  new String("BACK");
				}
				break;
			case Left:
				enterOuterAlt(_localctx, 3);
				{
				setState(95); match(Left);
				((CommandContext)_localctx).text =  new String("LEFT");
				}
				break;
			case Right:
				enterOuterAlt(_localctx, 4);
				{
				setState(97); match(Right);
				((CommandContext)_localctx).text =  new String("RIGHT");
				}
				break;
			case Setx:
				enterOuterAlt(_localctx, 5);
				{
				setState(99); match(Setx);
				((CommandContext)_localctx).text =  new String("SETX");
				}
				break;
			case Sety:
				enterOuterAlt(_localctx, 6);
				{
				setState(101); match(Sety);
				((CommandContext)_localctx).text =  new String("SETY");
				}
				break;
			case Setxy:
				enterOuterAlt(_localctx, 7);
				{
				setState(103); match(Setxy);
				((CommandContext)_localctx).text =  new String("SETXY");
				}
				break;
			case Speed:
				enterOuterAlt(_localctx, 8);
				{
				setState(105); match(Speed);
				((CommandContext)_localctx).text =  new String("SPEED");
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 9);
				{
				setState(107); match(Print);
				((CommandContext)_localctx).text =  new String("PRINT");
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
		public Or_expressionContext or_expression;
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
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
		enterRule(_localctx, 10, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); ((ExpressionContext)_localctx).or_expression = or_expression(0);
			((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).or_expression.node; LOGOPP.io.debug("expr->or");
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

	public static class Or_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Or_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, _parentState, _p);
		Or_expressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115); and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_or_expression);
					setState(117);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(118); match(9);
					setState(119); and_expression(0);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class And_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public And_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_expressionContext _localctx = new And_expressionContext(_ctx, _parentState, _p);
		And_expressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(126); equality_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_expressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_and_expression);
					setState(128);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(129); match(8);
					setState(130); equality_expression(0);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Equality_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, _parentState, _p);
		Equality_expressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_equality_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(137); relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(139);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(140); match(5);
						setState(141); relational_expression(0);
						}
						break;

					case 2:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(142);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(143); match(6);
						setState(144); relational_expression(0);
						}
						break;
					}
					} 
				}
				setState(149);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, _parentState, _p);
		Relational_expressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_relational_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151); additive_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(153);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(154); match(4);
						setState(155); additive_expression(0);
						}
						break;

					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(156);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(157); match(10);
						setState(158); additive_expression(0);
						}
						break;

					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(159);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(160); match(12);
						setState(161); additive_expression(0);
						}
						break;

					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(162);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(163); match(7);
						setState(164); additive_expression(0);
						}
						break;
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public Additive_expressionContext n;
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
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_additive_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(171); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
			((Additive_expressionContext)_localctx).node =  ((Additive_expressionContext)_localctx).multiplicative_expression.node; LOGOPP.io.debug("add->mul " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(174);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(175); match(2);
						setState(176); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperatorNode("+", ((Additive_expressionContext)_localctx).n.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node); LOGOPP.io.debug("add->add+mul " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(179);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(180); match(Unary_operator);
						setState(181); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperatorNode("-", ((Additive_expressionContext)_localctx).n.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node); LOGOPP.io.debug("add->add-mul " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Multiplicative_expressionContext n;
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
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_multiplicative_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
			((Multiplicative_expressionContext)_localctx).node =  ((Multiplicative_expressionContext)_localctx).unary_expression.node; LOGOPP.io.debug("mul->unary " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(193);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(194); match(3);
						setState(195); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("*", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul*unary " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(198);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(199); match(11);
						setState(200); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("/", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul/unary " + _localctx.node.id);
						}
						break;

					case 3:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(203);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(204); match(1);
						setState(205); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("^", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul^unary " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public LOGONode node;
		public Primary_expressionContext primary_expression;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode Unary_operator() { return getToken(GrammarParser.Unary_operator, 0); }
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
		enterRule(_localctx, 24, RULE_unary_expression);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case Set:
			case LPARAN:
			case Number:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); ((Unary_expressionContext)_localctx).primary_expression = primary_expression();
				((Unary_expressionContext)_localctx).node =  ((Unary_expressionContext)_localctx).primary_expression.node; LOGOPP.io.debug("unary->primary " + _localctx.node.id);
				}
				break;
			case Unary_operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); match(Unary_operator);
				setState(217); ((Unary_expressionContext)_localctx).primary_expression = primary_expression();
				((Unary_expressionContext)_localctx).node =  new LOGOOperatorNode("u-", ((Unary_expressionContext)_localctx).primary_expression.node); LOGOPP.io.debug("unary->primary " + _localctx.node.id);
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public LOGONode node;
		public Token Number;
		public ExpressionContext expression;
		public Assignment_expressionContext assignment_expression;
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_primary_expression);
		try {
			setState(235);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); ((Primary_expressionContext)_localctx).Number = match(Number);
				((Primary_expressionContext)_localctx).node =  new LOGOLeaf((((Primary_expressionContext)_localctx).Number!=null?((Primary_expressionContext)_localctx).Number.getText():null)); LOGOPP.io.debug("Number " + _localctx.node.id);
				}
				break;
			case LPARAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); match(LPARAN);
				setState(225); ((Primary_expressionContext)_localctx).expression = expression();
				setState(226); match(RPARAN);
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).expression.node; LOGOPP.io.debug("parentheses");
				}
				break;
			case Set:
				enterOuterAlt(_localctx, 3);
				{
				setState(229); ((Primary_expressionContext)_localctx).assignment_expression = assignment_expression();
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).assignment_expression.node; LOGOPP.io.debug("SET");
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(232); ((Primary_expressionContext)_localctx).id = id();
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).id.node; LOGOPP.io.debug("ID");
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
		enterRule(_localctx, 28, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); ((IdContext)_localctx).Identifier = match(Identifier);
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
		public TerminalNode Set() { return getToken(GrammarParser.Set, 0); }
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
		enterRule(_localctx, 30, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(Set);
			setState(241); ((Assignment_expressionContext)_localctx).id = id();
			setState(242); ((Assignment_expressionContext)_localctx).expression = expression();
			((Assignment_expressionContext)_localctx).node =  new LOGOSetNode(((Assignment_expressionContext)_localctx).id.node.id, ((Assignment_expressionContext)_localctx).expression.node);
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public LOGONode node;
		public List<Command_listContext> command_list() {
			return getRuleContexts(Command_listContext.class);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(GrammarParser.LBRACKET); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPARAN() { return getToken(GrammarParser.LPARAN, 0); }
		public List<TerminalNode> RBRACKET() { return getTokens(GrammarParser.RBRACKET); }
		public TerminalNode Else() { return getToken(GrammarParser.Else, 0); }
		public Command_listContext command_list(int i) {
			return getRuleContext(Command_listContext.class,i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(GrammarParser.RBRACKET, i);
		}
		public TerminalNode If() { return getToken(GrammarParser.If, 0); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GrammarParser.LBRACKET, i);
		}
		public TerminalNode RPARAN() { return getToken(GrammarParser.RPARAN, 0); }
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConditional_statement(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditional_statement);
		try {
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245); match(If);
				setState(246); match(LPARAN);
				setState(247); expression();
				setState(248); match(RPARAN);
				setState(249); match(LBRACKET);
				setState(250); command_list();
				setState(251); match(RBRACKET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); match(If);
				setState(254); match(LPARAN);
				setState(255); expression();
				setState(256); match(RPARAN);
				setState(257); match(LBRACKET);
				setState(258); command_list();
				setState(259); match(RBRACKET);
				setState(260); match(Else);
				setState(261); match(LBRACKET);
				setState(262); command_list();
				setState(263); match(RBRACKET);
				}
				break;
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
		case 6: return or_expression_sempred((Or_expressionContext)_localctx, predIndex);

		case 7: return and_expression_sempred((And_expressionContext)_localctx, predIndex);

		case 8: return equality_expression_sempred((Equality_expressionContext)_localctx, predIndex);

		case 9: return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);

		case 10: return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);

		case 11: return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean additive_expression_sempred(Additive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return 3 >= _localctx._p;

		case 9: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean or_expression_sempred(Or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean equality_expression_sempred(Equality_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 2 >= _localctx._p;

		case 3: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean and_expression_sempred(And_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return 4 >= _localctx._p;

		case 11: return 3 >= _localctx._p;

		case 12: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean relational_expression_sempred(Relational_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return 4 >= _localctx._p;

		case 5: return 3 >= _localctx._p;

		case 6: return 2 >= _localctx._p;

		case 7: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3-\u010e\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\60"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0086\n\t\f\t\16\t\u0089\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u0094\n\n\f\n\16\n\u0097\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a8\n\13\f\13\16\13\u00ab"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00bb"+
		"\n\f\f\f\16\f\u00be\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d3\n\r\f\r\16\r\u00d6\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00df\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ee\n\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010c\n\22"+
		"\3\22\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\u0125\2/\3\2"+
		"\2\2\4?\3\2\2\2\6W\3\2\2\2\bY\3\2\2\2\no\3\2\2\2\fq\3\2\2\2\16t\3\2\2"+
		"\2\20\177\3\2\2\2\22\u008a\3\2\2\2\24\u0098\3\2\2\2\26\u00ac\3\2\2\2\30"+
		"\u00bf\3\2\2\2\32\u00de\3\2\2\2\34\u00ed\3\2\2\2\36\u00ef\3\2\2\2 \u00f2"+
		"\3\2\2\2\"\u010b\3\2\2\2$%\5\"\22\2%&\7\1\2\2&\60\3\2\2\2\'(\5\f\7\2("+
		")\7\1\2\2)*\b\2\1\2*\60\3\2\2\2+,\5\4\3\2,-\7\1\2\2-.\b\2\1\2.\60\3\2"+
		"\2\2/$\3\2\2\2/\'\3\2\2\2/+\3\2\2\2\60\3\3\2\2\2\61\62\5\6\4\2\62\63\5"+
		"\4\3\2\63\64\b\3\1\2\64@\3\2\2\2\65\66\5\b\5\2\66\67\5\4\3\2\678\b\3\1"+
		"\28@\3\2\2\29:\5\6\4\2:;\b\3\1\2;@\3\2\2\2<=\5\b\5\2=>\b\3\1\2>@\3\2\2"+
		"\2?\61\3\2\2\2?\65\3\2\2\2?9\3\2\2\2?<\3\2\2\2@\5\3\2\2\2AB\7\35\2\2B"+
		"X\b\4\1\2CD\7\36\2\2DX\b\4\1\2EF\7\37\2\2FX\b\4\1\2GH\7\31\2\2HX\b\4\1"+
		"\2IJ\7\32\2\2JX\b\4\1\2KL\7\33\2\2LX\b\4\1\2MN\7\34\2\2NX\b\4\1\2OP\7"+
		" \2\2PX\b\4\1\2QR\7!\2\2RX\b\4\1\2ST\7#\2\2TX\b\4\1\2UV\7\"\2\2VX\b\4"+
		"\1\2WA\3\2\2\2WC\3\2\2\2WE\3\2\2\2WG\3\2\2\2WI\3\2\2\2WK\3\2\2\2WM\3\2"+
		"\2\2WO\3\2\2\2WQ\3\2\2\2WS\3\2\2\2WU\3\2\2\2X\7\3\2\2\2YZ\5\n\6\2Z[\5"+
		"\f\7\2[\\\b\5\1\2\\\t\3\2\2\2]^\7\20\2\2^p\b\6\1\2_`\7\21\2\2`p\b\6\1"+
		"\2ab\7\22\2\2bp\b\6\1\2cd\7\23\2\2dp\b\6\1\2ef\7\24\2\2fp\b\6\1\2gh\7"+
		"\25\2\2hp\b\6\1\2ij\7\26\2\2jp\b\6\1\2kl\7\27\2\2lp\b\6\1\2mn\7\30\2\2"+
		"np\b\6\1\2o]\3\2\2\2o_\3\2\2\2oa\3\2\2\2oc\3\2\2\2oe\3\2\2\2og\3\2\2\2"+
		"oi\3\2\2\2ok\3\2\2\2om\3\2\2\2p\13\3\2\2\2qr\5\16\b\2rs\b\7\1\2s\r\3\2"+
		"\2\2tu\b\b\1\2uv\5\20\t\2v|\3\2\2\2wx\6\b\2\3xy\7\13\2\2y{\5\20\t\2zw"+
		"\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\b\t\1\2\u0080\u0081\5\22\n\2\u0081\u0087\3\2\2\2\u0082\u0083\6\t\3\3"+
		"\u0083\u0084\7\n\2\2\u0084\u0086\5\22\n\2\u0085\u0082\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\21\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\b\n\1\2\u008b\u008c\5\24\13\2\u008c\u0095\3"+
		"\2\2\2\u008d\u008e\6\n\4\3\u008e\u008f\7\7\2\2\u008f\u0094\5\24\13\2\u0090"+
		"\u0091\6\n\5\3\u0091\u0092\7\b\2\2\u0092\u0094\5\24\13\2\u0093\u008d\3"+
		"\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\23\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\b\13\1"+
		"\2\u0099\u009a\5\26\f\2\u009a\u00a9\3\2\2\2\u009b\u009c\6\13\6\3\u009c"+
		"\u009d\7\6\2\2\u009d\u00a8\5\26\f\2\u009e\u009f\6\13\7\3\u009f\u00a0\7"+
		"\f\2\2\u00a0\u00a8\5\26\f\2\u00a1\u00a2\6\13\b\3\u00a2\u00a3\7\16\2\2"+
		"\u00a3\u00a8\5\26\f\2\u00a4\u00a5\6\13\t\3\u00a5\u00a6\7\t\2\2\u00a6\u00a8"+
		"\5\26\f\2\u00a7\u009b\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a1\3\2\2\2"+
		"\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\25\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\f\1\2\u00ad"+
		"\u00ae\5\30\r\2\u00ae\u00af\b\f\1\2\u00af\u00bc\3\2\2\2\u00b0\u00b1\6"+
		"\f\n\3\u00b1\u00b2\7\4\2\2\u00b2\u00b3\5\30\r\2\u00b3\u00b4\b\f\1\2\u00b4"+
		"\u00bb\3\2\2\2\u00b5\u00b6\6\f\13\3\u00b6\u00b7\7\17\2\2\u00b7\u00b8\5"+
		"\30\r\2\u00b8\u00b9\b\f\1\2\u00b9\u00bb\3\2\2\2\u00ba\u00b0\3\2\2\2\u00ba"+
		"\u00b5\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\27\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\r\1\2\u00c0\u00c1"+
		"\5\32\16\2\u00c1\u00c2\b\r\1\2\u00c2\u00d4\3\2\2\2\u00c3\u00c4\6\r\f\3"+
		"\u00c4\u00c5\7\5\2\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\b\r\1\2\u00c7\u00d3"+
		"\3\2\2\2\u00c8\u00c9\6\r\r\3\u00c9\u00ca\7\r\2\2\u00ca\u00cb\5\32\16\2"+
		"\u00cb\u00cc\b\r\1\2\u00cc\u00d3\3\2\2\2\u00cd\u00ce\6\r\16\3\u00ce\u00cf"+
		"\7\3\2\2\u00cf\u00d0\5\32\16\2\u00d0\u00d1\b\r\1\2\u00d1\u00d3\3\2\2\2"+
		"\u00d2\u00c3\3\2\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\31\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\5\34\17\2\u00d8\u00d9\b\16\1\2\u00d9\u00df"+
		"\3\2\2\2\u00da\u00db\7\17\2\2\u00db\u00dc\5\34\17\2\u00dc\u00dd\b\16\1"+
		"\2\u00dd\u00df\3\2\2\2\u00de\u00d7\3\2\2\2\u00de\u00da\3\2\2\2\u00df\33"+
		"\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1\u00ee\b\17\1\2\u00e2\u00e3\7\'\2\2\u00e3"+
		"\u00e4\5\f\7\2\u00e4\u00e5\7(\2\2\u00e5\u00e6\b\17\1\2\u00e6\u00ee\3\2"+
		"\2\2\u00e7\u00e8\5 \21\2\u00e8\u00e9\b\17\1\2\u00e9\u00ee\3\2\2\2\u00ea"+
		"\u00eb\5\36\20\2\u00eb\u00ec\b\17\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e0"+
		"\3\2\2\2\u00ed\u00e2\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee"+
		"\35\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f1\b\20\1\2\u00f1\37\3\2\2\2\u00f2"+
		"\u00f3\7$\2\2\u00f3\u00f4\5\36\20\2\u00f4\u00f5\5\f\7\2\u00f5\u00f6\b"+
		"\21\1\2\u00f6!\3\2\2\2\u00f7\u00f8\7%\2\2\u00f8\u00f9\7\'\2\2\u00f9\u00fa"+
		"\5\f\7\2\u00fa\u00fb\7(\2\2\u00fb\u00fc\7)\2\2\u00fc\u00fd\5\4\3\2\u00fd"+
		"\u00fe\7*\2\2\u00fe\u010c\3\2\2\2\u00ff\u0100\7%\2\2\u0100\u0101\7\'\2"+
		"\2\u0101\u0102\5\f\7\2\u0102\u0103\7(\2\2\u0103\u0104\7)\2\2\u0104\u0105"+
		"\5\4\3\2\u0105\u0106\7*\2\2\u0106\u0107\7&\2\2\u0107\u0108\7)\2\2\u0108"+
		"\u0109\5\4\3\2\u0109\u010a\7*\2\2\u010a\u010c\3\2\2\2\u010b\u00f7\3\2"+
		"\2\2\u010b\u00ff\3\2\2\2\u010c#\3\2\2\2\23/?Wo|\u0087\u0093\u0095\u00a7"+
		"\u00a9\u00ba\u00bc\u00d2\u00d4\u00de\u00ed\u010b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}