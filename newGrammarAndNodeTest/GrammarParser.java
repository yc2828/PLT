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
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, Forward=9, 
		Back=10, Left=11, Right=12, Clearscreen=13, Origin=14, Getx=15, Gety=16, 
		Getxy=17, Number=18, Identifier=19, WS=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'SET'", "'^'", "')'", "'+'", "'-'", "'*'", "'('", "'/'", 
		"Forward", "Back", "Left", "Right", "Clearscreen", "Origin", "Getx", "Gety", 
		"Getxy", "Number", "Identifier", "WS"
	};
	public static final int
		RULE_line = 0, RULE_command_list = 1, RULE_command_noarg = 2, RULE_command_expr = 3, 
		RULE_command = 4, RULE_expression = 5, RULE_primary_expression = 6, RULE_unary_expression = 7, 
		RULE_unary_operator = 8, RULE_multiplicative_expression = 9, RULE_additive_expression = 10, 
		RULE_id = 11, RULE_assignment_expression = 12;
	public static final String[] ruleNames = {
		"line", "command_list", "command_noarg", "command_expr", "command", "expression", 
		"primary_expression", "unary_expression", "unary_operator", "multiplicative_expression", 
		"additive_expression", "id", "assignment_expression"
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
			setState(34);
			switch (_input.LA(1)) {
			case EOF:
			case Forward:
			case Back:
			case Left:
			case Right:
			case Clearscreen:
			case Origin:
			case Getx:
			case Gety:
			case Getxy:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); ((LineContext)_localctx).command_list = command_list();
				setState(27); match(EOF);
				((LineContext)_localctx).node =  ((LineContext)_localctx).command_list.node;
				}
				break;
			case 1:
			case 5:
			case 7:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(30); ((LineContext)_localctx).expression = expression();
				setState(31); match(EOF);
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
			setState(45);
			switch (_input.LA(1)) {
			case Clearscreen:
			case Origin:
			case Getx:
			case Gety:
			case Getxy:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); ((Command_listContext)_localctx).command_noarg = command_noarg();
				setState(37); ((Command_listContext)_localctx).l = command_list();
				((Command_listContext)_localctx).node =  new LOGOCommandNode("commandList", ((Command_listContext)_localctx).command_noarg.node, ((Command_listContext)_localctx).l.node);
				}
				break;
			case Forward:
			case Back:
			case Left:
			case Right:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); ((Command_listContext)_localctx).command_expr = command_expr();
				setState(41); ((Command_listContext)_localctx).l = command_list();
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
		public TerminalNode Clearscreen() { return getToken(GrammarParser.Clearscreen, 0); }
		public TerminalNode Getxy() { return getToken(GrammarParser.Getxy, 0); }
		public TerminalNode Getx() { return getToken(GrammarParser.Getx, 0); }
		public TerminalNode Gety() { return getToken(GrammarParser.Gety, 0); }
		public TerminalNode Origin() { return getToken(GrammarParser.Origin, 0); }
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
			setState(57);
			switch (_input.LA(1)) {
			case Getx:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); match(Getx);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("GETX");
				}
				break;
			case Gety:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(Gety);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("GETY");
				}
				break;
			case Getxy:
				enterOuterAlt(_localctx, 3);
				{
				setState(51); match(Getxy);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("GETXY");
				}
				break;
			case Clearscreen:
				enterOuterAlt(_localctx, 4);
				{
				setState(53); match(Clearscreen);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("CLEARSCREEN");
				}
				break;
			case Origin:
				enterOuterAlt(_localctx, 5);
				{
				setState(55); match(Origin);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("ORIGIN");
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
			setState(59); ((Command_exprContext)_localctx).command = command();
			setState(60); ((Command_exprContext)_localctx).expression = expression();
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
		public TerminalNode Left() { return getToken(GrammarParser.Left, 0); }
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
			setState(71);
			switch (_input.LA(1)) {
			case Forward:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(Forward);
				((CommandContext)_localctx).text =  new String("FORWARD");
				}
				break;
			case Back:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); match(Back);
				((CommandContext)_localctx).text =  new String("BACK");
				}
				break;
			case Left:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); match(Left);
				((CommandContext)_localctx).text =  new String("LEFT");
				}
				break;
			case Right:
				enterOuterAlt(_localctx, 4);
				{
				setState(69); match(Right);
				((CommandContext)_localctx).text =  new String("RIGHT");
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
		enterRule(_localctx, 10, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); ((ExpressionContext)_localctx).additive_expression = additive_expression(0);
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
		enterRule(_localctx, 12, RULE_primary_expression);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); ((Primary_expressionContext)_localctx).Number = match(Number);
				((Primary_expressionContext)_localctx).node =  new LOGOLeaf((((Primary_expressionContext)_localctx).Number!=null?((Primary_expressionContext)_localctx).Number.getText():null));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); match(7);
				setState(79); ((Primary_expressionContext)_localctx).expression = expression();
				setState(80); match(3);
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).expression.node;
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 3);
				{
				setState(83); ((Primary_expressionContext)_localctx).assignment_expression = assignment_expression();
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
		enterRule(_localctx, 14, RULE_unary_expression);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case 1:
			case 7:
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); ((Unary_expressionContext)_localctx).primary_expression = primary_expression();
				((Unary_expressionContext)_localctx).node =  ((Unary_expressionContext)_localctx).primary_expression.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); unary_operator();
				setState(92); ((Unary_expressionContext)_localctx).primary_expression = primary_expression();
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
		enterRule(_localctx, 16, RULE_unary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(5);
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
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_multiplicative_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(100); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
			((Multiplicative_expressionContext)_localctx).node =  ((Multiplicative_expressionContext)_localctx).unary_expression.node;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(103);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(104); match(6);
						setState(105); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperator("*", _localctx.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node);
						}
						break;

					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(108);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(109); match(8);
						setState(110); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperator("/", _localctx.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node);
						}
						break;

					case 3:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(113);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(114); match(2);
						setState(115); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperator("^", _localctx.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node);
						}
						break;
					}
					} 
				}
				setState(122);
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
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_additive_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(124); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
			((Additive_expressionContext)_localctx).node =  ((Additive_expressionContext)_localctx).multiplicative_expression.node;
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(127);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(128); match(4);
						setState(129); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperator("+", _localctx.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node);
						}
						break;

					case 2:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(132);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(133); match(5);
						setState(134); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperator("-", _localctx.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node);
						}
						break;
					}
					} 
				}
				setState(141);
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
		enterRule(_localctx, 22, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); ((IdContext)_localctx).Identifier = match(Identifier);
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
		enterRule(_localctx, 24, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(1);
			setState(146); ((Assignment_expressionContext)_localctx).id = id();
			setState(147); ((Assignment_expressionContext)_localctx).expression = expression();
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
		case 9: return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);

		case 10: return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);
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
		"\2\3\26\u0099\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2%\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13y\n\13\f\13\16\13|\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f"+
		"\u008f\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\2\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\2\u009d\2$\3\2\2\2\4/\3\2\2\2\6;\3\2\2\2\b=\3"+
		"\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16X\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24e\3"+
		"\2\2\2\26}\3\2\2\2\30\u0090\3\2\2\2\32\u0093\3\2\2\2\34\35\5\4\3\2\35"+
		"\36\7\1\2\2\36\37\b\2\1\2\37%\3\2\2\2 !\5\f\7\2!\"\7\1\2\2\"#\b\2\1\2"+
		"#%\3\2\2\2$\34\3\2\2\2$ \3\2\2\2%\3\3\2\2\2&\'\5\6\4\2\'(\5\4\3\2()\b"+
		"\3\1\2)\60\3\2\2\2*+\5\b\5\2+,\5\4\3\2,-\b\3\1\2-\60\3\2\2\2.\60\b\3\1"+
		"\2/&\3\2\2\2/*\3\2\2\2/.\3\2\2\2\60\5\3\2\2\2\61\62\7\21\2\2\62<\b\4\1"+
		"\2\63\64\7\22\2\2\64<\b\4\1\2\65\66\7\23\2\2\66<\b\4\1\2\678\7\17\2\2"+
		"8<\b\4\1\29:\7\20\2\2:<\b\4\1\2;\61\3\2\2\2;\63\3\2\2\2;\65\3\2\2\2;\67"+
		"\3\2\2\2;9\3\2\2\2<\7\3\2\2\2=>\5\n\6\2>?\5\f\7\2?@\b\5\1\2@\t\3\2\2\2"+
		"AB\7\13\2\2BJ\b\6\1\2CD\7\f\2\2DJ\b\6\1\2EF\7\r\2\2FJ\b\6\1\2GH\7\16\2"+
		"\2HJ\b\6\1\2IA\3\2\2\2IC\3\2\2\2IE\3\2\2\2IG\3\2\2\2J\13\3\2\2\2KL\5\26"+
		"\f\2LM\b\7\1\2M\r\3\2\2\2NO\7\24\2\2OY\b\b\1\2PQ\7\t\2\2QR\5\f\7\2RS\7"+
		"\5\2\2ST\b\b\1\2TY\3\2\2\2UV\5\32\16\2VW\b\b\1\2WY\3\2\2\2XN\3\2\2\2X"+
		"P\3\2\2\2XU\3\2\2\2Y\17\3\2\2\2Z[\5\16\b\2[\\\b\t\1\2\\b\3\2\2\2]^\5\22"+
		"\n\2^_\5\16\b\2_`\b\t\1\2`b\3\2\2\2aZ\3\2\2\2a]\3\2\2\2b\21\3\2\2\2cd"+
		"\7\7\2\2d\23\3\2\2\2ef\b\13\1\2fg\5\20\t\2gh\b\13\1\2hz\3\2\2\2ij\6\13"+
		"\2\3jk\7\b\2\2kl\5\20\t\2lm\b\13\1\2my\3\2\2\2no\6\13\3\3op\7\n\2\2pq"+
		"\5\20\t\2qr\b\13\1\2ry\3\2\2\2st\6\13\4\3tu\7\4\2\2uv\5\20\t\2vw\b\13"+
		"\1\2wy\3\2\2\2xi\3\2\2\2xn\3\2\2\2xs\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2"+
		"\2\2{\25\3\2\2\2|z\3\2\2\2}~\b\f\1\2~\177\5\24\13\2\177\u0080\b\f\1\2"+
		"\u0080\u008d\3\2\2\2\u0081\u0082\6\f\5\3\u0082\u0083\7\6\2\2\u0083\u0084"+
		"\5\24\13\2\u0084\u0085\b\f\1\2\u0085\u008c\3\2\2\2\u0086\u0087\6\f\6\3"+
		"\u0087\u0088\7\7\2\2\u0088\u0089\5\24\13\2\u0089\u008a\b\f\1\2\u008a\u008c"+
		"\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0086\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\27\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u0090\u0091\7\25\2\2\u0091\u0092\b\r\1\2\u0092\31\3\2\2\2\u0093\u0094"+
		"\7\3\2\2\u0094\u0095\5\30\r\2\u0095\u0096\5\f\7\2\u0096\u0097\b\16\1\2"+
		"\u0097\33\3\2\2\2\f$/;IXaxz\u008b\u008d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}