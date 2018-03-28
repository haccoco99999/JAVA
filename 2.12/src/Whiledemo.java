import java.awt.Graphics;
import javax.swing.JApplet;
public class Whiledemo extends JApplet {
	public void paint(Graphics g) {
		super .paint(g);
		int counter = 1;
		while (counter <= 10) {
			g.drawLine(10,10,250,counter*10);
			++counter;
		}
	}

}
