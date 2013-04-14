import java.awt.*;
import javax.swing.*;
import java.util.*;

public class LOGOPP extends JFrame {
	public static void main(String[] args) {
		LOGOPP logoPP = new LOGOPP();
		logoPP.run();
		return;
	}
	
	static LOGOIO io = new LOGOIO();
	static LOGOSymbolTable symboltable = new LOGOSymbolTable();
	static LOGOErrorHandler errorhandler = new LOGOErrorHandler(io);
	static LOGOCanvas canvas = new LOGOCanvas("LOGO++", 800, 600);
	static LOGOInterpreter interpreter = new LOGOInterpreter();
	static LOGOBasic basic = new LOGOBasic();

	// 04-05-13 update:
	static HashMap<String, Object> variableTable = new HashMap<String, Object>();
	//TODO:static HashMap<String, LOGOFunc> functionTable = new HashMap<String, LOGOFunc>();
			
	public LOGOPP() {
		add("Center", canvas);
		setSize(canvas.getWidth() ,canvas.getHeight());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		repaint();
	}
	
	public void run () {
		String str = new String("init");
		while (!str.equals("exit")) {
			str = io.in();
			execute(str);
			canvas.repaint();
			if (errorhandler.error())
				errorhandler.errorOut();
		}
		io.out("END");
	}

	public void execute(String str) {
		errorhandler.reset();
		try {
			io.debug("parse");
			LOGONode root = interpreter.parse(str);
			io.debug("run");
			root.run();
		}
		catch (Exception e) {
			errorhandler.set(e.toString());
		}
	}
}
