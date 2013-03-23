import java.awt.*;
import javax.swing.*;

public class GUITest extends JFrame {
	public static void main(String[] args) {
		GUITest test = new GUITest();
		LOGOInterpreter interpreter = new LOGOInterpreter();
		String str;
		LOGOIO io = new LOGOIO();
		str = io.in();
		io.out(str);
		while (!str.equals("end")) {
			interpreter.runOneLine(str, canvas.turtle);
			canvas.repaint();
			str = io.in();
		}		
	}
	
	static LOGOCanvas canvas = new LOGOCanvas("test");
	
	public GUITest() {
		add("Center", canvas);
		setSize(canvas.DEFAULT_WIDTH,canvas.DEFAULT_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		repaint();
	}
}
