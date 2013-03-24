import java.awt.Graphics;


public class LOGOLT extends LOGOCommand {
	public LOGOLT() {
		
	}
	public LOGOLT(double distance) {
		args.add(distance);
	}
	public void move(LOGOTurtle turtle) {
		turtle.setAngle(turtle.getAngle() - args.get(0));
	}
	public void draw(Graphics g, LOGOTurtle turtle) {
		
	}
}
