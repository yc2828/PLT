import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LOGOTurtle{
	private double xPos = 0;
	private double yPos = 0;
	private double angle = -90;
	
	// 04-05-13 update:
	private double speed;
	private boolean penDown = true;
	//......................(TODO: color penSize)
	private int[] color = new int[] {0, 0, 0}; //{R,G,B}
	
	LOGOTurtle() {
	}
	
	LOGOTurtle(double x, double y) {
		xPos = x;
		yPos = y;
	}
	public double getXPos() {return xPos;}
	public double getYPos() {return yPos;}
	public double getAngle() {return angle;}
	public void setXPos(double x) {xPos = x;}
	public void setYpos(double y) {yPos = y;}
	public void setAngle(double a) {angle = a;}
	
	public int colorValue() {
		return int color[0]|color[1]<<8|color[2]<<16;
	}
	public void paint(Graphics g, LOGOCanvas canvas) {
		if (!penDown)
				return;
		Graphics2D g2 = (Graphics2D) g;
		AffineTransform saveAt = g2.getTransform();
		AffineTransform at = AffineTransform.getTranslateInstance(xPos, yPos);
		at.rotate(Math.toRadians(angle + 90));
		g2.setTransform(at);
		g2.setComposite(AlphaComposite.SrcAtop.derive(0.2f));//transparent
		ImageIcon turtleImg = new ImageIcon("logo_turtle.png");
		g2.drawImage(turtleImg.getImage(), -turtleImg.getIconWidth() / 2, -turtleImg.getIconHeight() / 2,
				turtleImg.getIconWidth(), turtleImg.getIconHeight(), canvas);
		g2.setTransform(saveAt);
	}
}

/*class TurtleStatus {
	public double xPos;
	public double yPos;
	public double angle;
	public TurtleStatus(double x, double y, double a) {
		xPos = x;
		yPos = y;
		angle = a;
	}
}*/
