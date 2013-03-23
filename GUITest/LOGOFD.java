import java.util.ArrayList;
import java.awt.*;

public class LOGOFD extends LOGOCommand{
	private double startX;
	private double startY;
	private double endX;
	private double endY;
	
	public LOGOFD() {
		
	}
	public LOGOFD(double distance) {
		args.add(distance);
	}
	public void move(LOGOTurtle turtle) {
		startX = turtle.getXPos();
		startY = turtle.getYPos();
		endX = startX + args.get(0) * Math.cos(Math.toRadians(turtle.getAngle()));
		endY = startY + args.get(0) * Math.sin(Math.toRadians(turtle.getAngle()));
		turtle.setXPos(endX);
		turtle.setYpos(endY);
	}
	public void draw(Graphics g, LOGOTurtle tur) {
		g.drawLine((int)startX, (int)startY, (int)endX, (int)endY);
	}
}
