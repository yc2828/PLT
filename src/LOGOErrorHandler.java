public class LOGOErrorHandler {
	static LOGOIO io;
	String message;
	public LOGOErrorHandler(LOGOIO io) {
		this.io = io;
		reset();
	}

	public void reset() {
		message = null;
	}

	public boolean error() {
		return message != null;
	}

	public void set(String message) {
		this.message = message;
	}
	
	public void errorOut() {
		if (message != null)
			io.err(message);
		else
			io.err("NO ERROR");
	}
}