import java.awt.*;
import java.awt.geom.AffineTransform;

import javax.swing.*;

public class LOGOCanvas extends JComponent {
	final static public int DEFAULT_WIDTH = 500;
	final static public int DEFAULT_HEIGHT = 500;
		
	public LOGOTurtle turtle;
	public boolean wrap;
	public int[][] bitmap;
	private static BMP bmpGenerator = new BMP();
	private int width;
	private int height;	

	public LOGOCanvas(String str) {
		init(str, DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}

	public LOGOCanvas(String str, int w, int h) {
		init(str, w, h);
	}

	private void init(String str, int w, int h) {
		turtle = new LOGOTurtle((double)w / 2, (double)h / 2);
		if (str != null)
			title = str;
		bitmap = new int[height][width];
		for (int i = 0; i < w; i++)
			for (int j = 0; j < h; j++)
				bitmap[i][j] = turtle.colorValue();
	}

	public void paintPoint(int x, int y) {
		bitmap[height-y][x] = turtle.colorValue();
	}

	public void paint(Graphics g) {
		bmpGenerator.saveBMP(title+".bmp",bitMap);
		try {
			File imageFile = new File(title+".bmp");
			Image image = ImageIO.read(imageFile);
			ImageIcon icon = new ImageIcon(image);
			Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(icon.getImage(), 0,0, width, height, this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private String title = "untitled canvas";
}
