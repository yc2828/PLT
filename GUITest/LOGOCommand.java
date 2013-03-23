import java.util.*;
import java.awt.*;

public class LOGOCommand {
	protected ArrayList<Double> args = new ArrayList<Double>();
	
	public void move(LOGOTurtle turtle) {}
	public void draw(Graphics g, LOGOTurtle turtle) {}
	public void reset() {args.clear();}
	public void addArg(double arg) {args.add(arg);}
}
