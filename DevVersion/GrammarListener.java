// Generated from workspace\Logo++\src\Grammar.g by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GrammarListener extends ParseTreeListener {
	void enterExpression(GrammarParser.ExpressionContext ctx);
	void exitExpression(GrammarParser.ExpressionContext ctx);

	void enterOr_expression(GrammarParser.Or_expressionContext ctx);
	void exitOr_expression(GrammarParser.Or_expressionContext ctx);

	void enterAssignment_expression(GrammarParser.Assignment_expressionContext ctx);
	void exitAssignment_expression(GrammarParser.Assignment_expressionContext ctx);

	void enterLine(GrammarParser.LineContext ctx);
	void exitLine(GrammarParser.LineContext ctx);

	void enterMultiplicative_expression(GrammarParser.Multiplicative_expressionContext ctx);
	void exitMultiplicative_expression(GrammarParser.Multiplicative_expressionContext ctx);

	void enterRelational_expression(GrammarParser.Relational_expressionContext ctx);
	void exitRelational_expression(GrammarParser.Relational_expressionContext ctx);

	void enterId(GrammarParser.IdContext ctx);
	void exitId(GrammarParser.IdContext ctx);

	void enterCommand_list(GrammarParser.Command_listContext ctx);
	void exitCommand_list(GrammarParser.Command_listContext ctx);

	void enterAdditive_expression(GrammarParser.Additive_expressionContext ctx);
	void exitAdditive_expression(GrammarParser.Additive_expressionContext ctx);

	void enterEquality_expression(GrammarParser.Equality_expressionContext ctx);
	void exitEquality_expression(GrammarParser.Equality_expressionContext ctx);

	void enterPrimary_expression(GrammarParser.Primary_expressionContext ctx);
	void exitPrimary_expression(GrammarParser.Primary_expressionContext ctx);

	void enterAnd_expression(GrammarParser.And_expressionContext ctx);
	void exitAnd_expression(GrammarParser.And_expressionContext ctx);

	void enterUnary_expression(GrammarParser.Unary_expressionContext ctx);
	void exitUnary_expression(GrammarParser.Unary_expressionContext ctx);

	void enterConditional_statement(GrammarParser.Conditional_statementContext ctx);
	void exitConditional_statement(GrammarParser.Conditional_statementContext ctx);

	void enterCommand(GrammarParser.CommandContext ctx);
	void exitCommand(GrammarParser.CommandContext ctx);

	void enterCommand_noarg(GrammarParser.Command_noargContext ctx);
	void exitCommand_noarg(GrammarParser.Command_noargContext ctx);

	void enterCommand_expr(GrammarParser.Command_exprContext ctx);
	void exitCommand_expr(GrammarParser.Command_exprContext ctx);
}