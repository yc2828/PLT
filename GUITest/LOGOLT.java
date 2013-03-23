import java.awt.Graphics;


public class LOGOLT extends LOGOCommand {
	public LOGOLT() {
		
	}
	public LOGOLT(double dis) {
		args.add(dis);
	}
	public void move(LOGOTurtle turtle) {
		turtle.setAngle(turtle.getAngle() - args.get(0));
	}
	public void draw(Graphics g, LOGOTurtle turtle) {
		
	}
}
