import java.awt.*;
import java.awt.geom.AffineTransform;

import javax.swing.*;

public class LOGOCanvas extends JComponent {
	final static public int DEFAULT_WIDTH = 500;
	final static public int DEFAULT_HEIGHT = 500;
	
	public LOGOTurtle turtle;
	// 04-05-13 update:
	public boolean wrap;
	public int[][] bitmap;
	// ........................
	

	public LOGOCanvas(String str) {
		turtle = new LOGOTurtle((double)DEFAULT_WIDTH / 2, (double)DEFAULT_HEIGHT / 2);
		if (str != null)
			title = str;
	}
	
	public void paint(Graphics g) {
		turtle.paint(g, this);
		for (LOGOCommand cmd : turtle.getCommand()) {
			cmd.draw(g, turtle);
		}
		
	}
	
	private String title = "untitled canvas";
}
