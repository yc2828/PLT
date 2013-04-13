// Generated from Grammar.g by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GrammarListener extends ParseTreeListener {
	void enterExpression(GrammarParser.ExpressionContext ctx);
	void exitExpression(GrammarParser.ExpressionContext ctx);

	void enterSetxy(GrammarParser.SetxyContext ctx);
	void exitSetxy(GrammarParser.SetxyContext ctx);

	void enterAssignment_expression(GrammarParser.Assignment_expressionContext ctx);
	void exitAssignment_expression(GrammarParser.Assignment_expressionContext ctx);

	void enterLine(GrammarParser.LineContext ctx);
	void exitLine(GrammarParser.LineContext ctx);

	void enterMultiplicative_expression(GrammarParser.Multiplicative_expressionContext ctx);
	void exitMultiplicative_expression(GrammarParser.Multiplicative_expressionContext ctx);

	void enterId(GrammarParser.IdContext ctx);
	void exitId(GrammarParser.IdContext ctx);

	void enterCommand_list(GrammarParser.Command_listContext ctx);
	void exitCommand_list(GrammarParser.Command_listContext ctx);

	void enterGetxy(GrammarParser.GetxyContext ctx);
	void exitGetxy(GrammarParser.GetxyContext ctx);

	void enterForward(GrammarParser.ForwardContext ctx);
	void exitForward(GrammarParser.ForwardContext ctx);

	void enterHideturtle(GrammarParser.HideturtleContext ctx);
	void exitHideturtle(GrammarParser.HideturtleContext ctx);

	void enterUnary_expression(GrammarParser.Unary_expressionContext ctx);
	void exitUnary_expression(GrammarParser.Unary_expressionContext ctx);

	void enterCommand(GrammarParser.CommandContext ctx);
	void exitCommand(GrammarParser.CommandContext ctx);

	void enterLeft(GrammarParser.LeftContext ctx);
	void exitLeft(GrammarParser.LeftContext ctx);

	void enterGety(GrammarParser.GetyContext ctx);
	void exitGety(GrammarParser.GetyContext ctx);

	void enterGetx(GrammarParser.GetxContext ctx);
	void exitGetx(GrammarParser.GetxContext ctx);

	void enterRight(GrammarParser.RightContext ctx);
	void exitRight(GrammarParser.RightContext ctx);

	void enterShowturtle(GrammarParser.ShowturtleContext ctx);
	void exitShowturtle(GrammarParser.ShowturtleContext ctx);

	void enterSetx(GrammarParser.SetxContext ctx);
	void exitSetx(GrammarParser.SetxContext ctx);

	void enterSety(GrammarParser.SetyContext ctx);
	void exitSety(GrammarParser.SetyContext ctx);

	void enterCommand_expr(GrammarParser.Command_exprContext ctx);
	void exitCommand_expr(GrammarParser.Command_exprContext ctx);

	void enterCommand_noarg(GrammarParser.Command_noargContext ctx);
	void exitCommand_noarg(GrammarParser.Command_noargContext ctx);

	void enterWrap(GrammarParser.WrapContext ctx);
	void exitWrap(GrammarParser.WrapContext ctx);

	void enterPendown(GrammarParser.PendownContext ctx);
	void exitPendown(GrammarParser.PendownContext ctx);

	void enterSpeed(GrammarParser.SpeedContext ctx);
	void exitSpeed(GrammarParser.SpeedContext ctx);

	void enterOrigin(GrammarParser.OriginContext ctx);
	void exitOrigin(GrammarParser.OriginContext ctx);

	void enterBack(GrammarParser.BackContext ctx);
	void exitBack(GrammarParser.BackContext ctx);

	void enterPrint(GrammarParser.PrintContext ctx);
	void exitPrint(GrammarParser.PrintContext ctx);

	void enterFence(GrammarParser.FenceContext ctx);
	void exitFence(GrammarParser.FenceContext ctx);

	void enterAdditive_expression(GrammarParser.Additive_expressionContext ctx);
	void exitAdditive_expression(GrammarParser.Additive_expressionContext ctx);

	void enterUnary_operator(GrammarParser.Unary_operatorContext ctx);
	void exitUnary_operator(GrammarParser.Unary_operatorContext ctx);

	void enterPrimary_expression(GrammarParser.Primary_expressionContext ctx);
	void exitPrimary_expression(GrammarParser.Primary_expressionContext ctx);

	void enterPenup(GrammarParser.PenupContext ctx);
	void exitPenup(GrammarParser.PenupContext ctx);

	void enterClearscreen(GrammarParser.ClearscreenContext ctx);
	void exitClearscreen(GrammarParser.ClearscreenContext ctx);
}