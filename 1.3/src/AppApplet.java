import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.Jframe;
  import java.applet.Applet;
  public class AppApplet extends Applet {
     public void init() {
    	 resize (200,160);
     }
     public void paint(Graphics g) {
    	 g.drawString("Xin chao cac ban!", 60, 25);
     }
     public static void main(String args[]) {
    	 AppApplet h = new AppApplet ();
    	 h.init ();
    	 JFrame f = new Jframe("Chuong trinh lai AppApplet");
    	 f.resize(200,160);
    	 f.add("Center",h);
    	 f.show();
     }
}
