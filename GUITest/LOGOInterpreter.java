import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;


public class LOGOInterpreter {
	public void runOneLine(String str, LOGOTurtle turtle) {
		ANTLRInputStream input = new ANTLRInputStream(str);
		CommandsLexer lexer = new CommandsLexer(input);
		CommonTokenStream tkStream = new CommonTokenStream(lexer);
		CommandsParser parser = new CommandsParser(tkStream);
		turtle.addCommand(parser.cmds().cmd);
	}
}
