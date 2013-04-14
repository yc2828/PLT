import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LOGOTurtle{
	public static final double SPEED_ITR_MAX = 100000.;
	public static final double INIT_ANGLE = -90;
	private double xPos = 0;
	private double yPos = 0;
	private double angle = INIT_ANGLE;
	
	// 04-05-13 update:
	private double speed = 5.;
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
	public boolean getPenDown() {return penDown;}
	public double getSpeed() {return speed;}
	public void setXPos(double x) {xPos = x;}
	public void setYPos(double y) {yPos = y;}
	public void setAngle(double a) {angle = a;}
	public void setPenDown(boolean p) {penDown = p;}
	public void setSpeed(double s) {speed = s;}

	public int colorValue() {
		return color[0]|color[1]<<8|color[2]<<16;
	}
	public void paint(Graphics g, LOGOCanvas canvas) {
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
