import java.awt.*;
import javax.swing.*;

public class LOGOPP extends JFrame {
	public static void main(String[] args) {
		LOGOPP logoPP = new LOGOPP();
		logoPP.run();
		return;
	}
	
	static LOGOIO io = new LOGOIO();
	static LOGOErrorHandler errorhandler = new LOGOErrorHandler(io);
	static LOGOCanvas canvas = new LOGOCanvas("LOGO++");
	static LOGOInterpreter interpreter = new LOGOInterpreter();
	
	public LOGOPP() {
		add("Center", canvas);
		setSize(canvas.DEFAULT_WIDTH,canvas.DEFAULT_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		repaint();
	}
	
	public void run () {
		String str = new String("init");
		while (!str.equals("exit") && !errorhandler.error()) {
			str = io.in();
			execute(str);
			canvas.repaint();
		}
		if (errorhandler.error())
			errorhandler.errorOut();
		io.out("END");
	}

	public void execute(String str) {
		errorhandler.reset();
		try {
			interpreter.runOneLine(str, canvas.turtle);
		}
		catch (Exception e) {
			errorhandler.set(e);
		}
	}
}
