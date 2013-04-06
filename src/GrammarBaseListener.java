// Generated from Grammar.g by ANTLR 4.0

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class GrammarBaseListener implements GrammarListener {
	@Override public void enterId(GrammarParser.IdContext ctx) { }
	@Override public void exitId(GrammarParser.IdContext ctx) { }

	@Override public void enterExpression(GrammarParser.ExpressionContext ctx) { }
	@Override public void exitExpression(GrammarParser.ExpressionContext ctx) { }

	@Override public void enterAdditive_expression(GrammarParser.Additive_expressionContext ctx) { }
	@Override public void exitAdditive_expression(GrammarParser.Additive_expressionContext ctx) { }

	@Override public void enterUnary_operator(GrammarParser.Unary_operatorContext ctx) { }
	@Override public void exitUnary_operator(GrammarParser.Unary_operatorContext ctx) { }

	@Override public void enterPrimary_expression(GrammarParser.Primary_expressionContext ctx) { }
	@Override public void exitPrimary_expression(GrammarParser.Primary_expressionContext ctx) { }

	@Override public void enterAssignment_expression(GrammarParser.Assignment_expressionContext ctx) { }
	@Override public void exitAssignment_expression(GrammarParser.Assignment_expressionContext ctx) { }

	@Override public void enterUnary_expression(GrammarParser.Unary_expressionContext ctx) { }
	@Override public void exitUnary_expression(GrammarParser.Unary_expressionContext ctx) { }

	@Override public void enterMultiplicative_expression(GrammarParser.Multiplicative_expressionContext ctx) { }
	@Override public void exitMultiplicative_expression(GrammarParser.Multiplicative_expressionContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}