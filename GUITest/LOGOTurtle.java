import java.util.*;
import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class LOGOTurtle{
	private double xPos = 0;
	private double yPos = 0;
	private double angle = -90;
	private ArrayList<LOGOCommand> commandList = new ArrayList<LOGOCommand>();
	private ArrayList<TurtleStatus> history = new ArrayList<TurtleStatus>();
	
	LOGOTurtle() {
		addHistory();
	}
	
	LOGOTurtle(double x, double y) {
		xPos = x;
		yPos = y;
		addHistory();
	}
	public double getXPos() {return xPos;}
	public double getYPos() {return yPos;}
	public double getAngle() {return angle;}
	public void setXPos(double x) {xPos = x;}
	public void setYpos(double y) {yPos = y;}
	public void setAngle(double a) {angle = a;}
	
	/*public void turnLeft(double degree) {
		double radius = degree * Math.PI / 180;
		double newXDir = Math.cos(radius) * xDir + Math.sin(radius) * yDir;
		double newYDir = -Math.sin(radius) * xDir + Math.cos(radius) * yDir;
		xDir = newXDir;
		yDir = newYDir;
	}*/
	
	/*public void turnRight(double degree) {
		turnLeft(-degree);
	}*/
	
	public void addCommand(LOGOCommand cmd) {
		if (cmd != null) {
			commandList.add(cmd);
			cmd.move(this);
			addHistory();
		}
	}
	
	public ArrayList<LOGOCommand> getCommand() {
		return commandList;
	}
	
	private void addHistory() {
		TurtleStatus status = new TurtleStatus(xPos, yPos, angle);
		history.add(status);
	}
	
	public void paint(Graphics g, LOGOCanvas canvas) {
		Graphics2D g2 = (Graphics2D) g;
		AffineTransform saveAt = g2.getTransform();
		AffineTransform at = AffineTransform.getTranslateInstance(xPos, yPos);
		at.rotate(Math.toRadians(angle + 90));
		g2.setTransform(at);
		ImageIcon turtleImg = new ImageIcon("logo_turtle.png");
		g2.drawImage(turtleImg.getImage(), -turtleImg.getIconWidth() / 2, -turtleImg.getIconHeight() / 2,
				turtleImg.getIconWidth(), turtleImg.getIconHeight(), canvas);
		g2.setTransform(saveAt);
	}
}

class TurtleStatus {
	public double xPos;
	public double yPos;
	public double angle;
	public TurtleStatus(double x, double y, double a) {
		xPos = x;
		yPos = y;
		angle = a;
	}
}
