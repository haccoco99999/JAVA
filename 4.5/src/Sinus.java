import java.awt.*;
import java.awt.Graphics;
import java.applet.Applet;
public class Sinus extends Applet{
	int w,h;
	static Frame f =new Frame("Sine figure");
	public void init() {
		f.resize(720,300);
		w=f.getWidth();
		h=f.getHeight();
		//repaint
		public void paint(Graphics g) {
			int i,x,y,x1,y1,w1,h1;
			double z;
			g.setColor(Color.red);
			g.drawLine(0, h/2, w, h/2);
			g.drawLine(w/2, 0, w/2, h);
			g.setColor(Color.blue);
			x=0; y=h/2;
			w1=w/2;
			h1=h/2;
			for (i=-w1; i<w1; i++) {
				// đổi 1 số thực ra số radian
				z= (Math.abs(i)%360)/180.0*Math.PI;
				if(i<0) z=-z;
				x1=x+1;
				// kết quả của hàm sin(z) là double nên phải chuyển về int để vẽ theo tọa độ
				y1 = h1- (int)(Math.sin(z)*50);
				g.drawLine(x, y, x1, y1);
				x=x1; y=y1;
			}
			g.setColor(Color.black);
			g.drawString("-2*PI", 0, h1+15);
			g.drawString("2*PI", w-25, h1-10);
			g.drawString("0", w1+5, h1+15);
			x= (int) (Math.sin(Math.PI/2)*50);
			g.drawString("+1-", w1-15, h1-x);
			g.drawString("-1-", w1-15, h1+x);
		}
		public static void main(String[] args) {
			Sinus s = new Sinus();
			s.init();
			f.resize(730, 300);
			f.add("Center",s);
			f.show();
		}
	}

}
