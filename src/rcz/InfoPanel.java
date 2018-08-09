package rcz;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;

public class InfoPanel extends MyPanel{
	
	int nbOfRedraw;
	int fps;
	long t0, t1;
	
	protected InfoPanel(Window w) {
		super(w, 0, 0, 128, 64);
		t0= new Date().getTime();
		nbOfRedraw=0;
	}

	public void paintComponent(Graphics g) {
		t1= new Date().getTime();
		nbOfRedraw++;
		if(t1-t0>=1000) {
			fps=(int)((double)nbOfRedraw/((double)(t1-t0)/1000));
			t0+=1000;
			nbOfRedraw=0;
		}
		
		g.setColor(Color.BLACK);
		g.drawString("fps: "+fps, 0, 10);
	}
	
}
