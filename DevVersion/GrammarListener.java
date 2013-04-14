// Generated from Grammar.g by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GrammarListener extends ParseTreeListener {
	void enterExpression(GrammarParser.ExpressionContext ctx);
	void exitExpression(GrammarParser.ExpressionContext ctx);

	void enterAssignment_expression(GrammarParser.Assignment_expressionContext ctx);
	void exitAssignment_expression(GrammarParser.Assignment_expressionContext ctx);

	void enterLine(GrammarParser.LineContext ctx);
	void exitLine(GrammarParser.LineContext ctx);

	void enterMultiplicative_expression(GrammarParser.Multiplicative_expressionContext ctx);
	void exitMultiplicative_expression(GrammarParser.Multiplicative_expressionContext ctx);

	void enterCommand_list(GrammarParser.Command_listContext ctx);
	void exitCommand_list(GrammarParser.Command_listContext ctx);

	void enterId(GrammarParser.IdContext ctx);
	void exitId(GrammarParser.IdContext ctx);

	void enterAdditive_expression(GrammarParser.Additive_expressionContext ctx);
	void exitAdditive_expression(GrammarParser.Additive_expressionContext ctx);

	void enterUnary_operator(GrammarParser.Unary_operatorContext ctx);
	void exitUnary_operator(GrammarParser.Unary_operatorContext ctx);

	void enterPrimary_expression(GrammarParser.Primary_expressionContext ctx);
	void exitPrimary_expression(GrammarParser.Primary_expressionContext ctx);

	void enterUnary_expression(GrammarParser.Unary_expressionContext ctx);
	void exitUnary_expression(GrammarParser.Unary_expressionContext ctx);

	void enterCommand(GrammarParser.CommandContext ctx);
	void exitCommand(GrammarParser.CommandContext ctx);

	void enterCommand_noarg(GrammarParser.Command_noargContext ctx);
	void exitCommand_noarg(GrammarParser.Command_noargContext ctx);

	void enterCommand_expr(GrammarParser.Command_exprContext ctx);
	void exitCommand_expr(GrammarParser.Command_exprContext ctx);
}