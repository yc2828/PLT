import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;

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
		height = h;
		width = w;
		turtle = new LOGOTurtle((double)w / 2, (double)h / 2);
		if (str != null)
			title = str;
		bitmap = new int[height][width];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				bitmap[i][j] = 255|255<<8|255<<16;
	}

	public void paintPoint(int x, int y) {
		bitmap[height-y][x] = turtle.colorValue();
	}

	public void paint(Graphics g) {
		bmpGenerator.saveBMP(title+".bmp",bitmap);
		try {
			File imageFile = new File(title+".bmp");
			Image image = ImageIO.read(imageFile);
			ImageIcon icon = new ImageIcon(image);
			Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(icon.getImage(), 0,0, width, height, this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		turtle.paint(g, this);
	}
	
	private String title = "untitled canvas";
}
