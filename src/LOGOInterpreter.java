import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;


public class LOGOInterpreter {
	public LOGONode parse(String str) {
		ANTLRInputStream input = new ANTLRInputStream(str);
		GrammarLexer lexer = new GrammarLexer(input);
		CommonTokenStream tkStream = new CommonTokenStream(lexer);
		GrammarParser parser = new GrammarParser(tkStream);
		return parser.expression().node;
	}
}
