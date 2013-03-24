
public class LOGOErrorHandler {
	static LOGOIO io;
	Exception e;
	String message;
	public LOGOErrorHandler(LOGOIO io) {
		this.io = io;
		reset();
	}

	public void reset() {
		e = null;
		message = null;
	}

	public boolean error() {
		return e != null;
	}

	public void set(Exception e) {
		this.e = e;
		message = e.toString();
	}
	
	public void set(Exception e, String message) {
		this.e = e;
		this.message = message;
	}
	
	public void errorOut() {
		if (message != null)
			io.err(message);
		else
			io.err("NO ERROR");
	}
}