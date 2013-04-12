public class LOGOCommandNode extends LOGONode {
	public LOGOCommandNode(String id) {
		super(id);
		System.out.format("new command node no arg");
	}
	public LOGOCommandNode(String id, LOGONode... args) {
		super(id, args);
		System.out.format("new command node with arg");
	}
	public Object run(LOGOErrorHandler e) {
		int commandID = findCommand(id);	//commandID is the number of arguments taken
		if (commandID < 0) {
				LOGOPP.io.err("invalid command");
				return null;
		}
		if (commandID == 0) {
				//do void command (id)
				System.out.format("command received: %s with 0 arguments", id);
		}
		else if (commandID == 1) {
			//do void command (id, children[0])
			System.out.format("command received: %s with 1 arguments: %s", id, children[0]);
		}
		
		return null;
	}
	
	private static String[][] CommandList = {
		{"HOME", "CLEARSCREEN", "GETX", "GETY", "GETXY",
			"SHOWTURTLE", "HIDETURTLE", "WRAP", "FENCE", "PENUP", "PENDOWN"},
		{"FORWARDD", "BACK", "LEFT", "RIGHT", "SPEED", "SETX", "SETY", "SETXY"}
	};
	
	private int findCommand(String id) {
		for (int i = 0; i < CommandList.length; i++) {
			for (int j = 0; j < CommandList[i].length; j++) {
			if (id.equals(CommandList[i][j]))
				return i;
			}
		}	
		return -1;
	}
	
}
