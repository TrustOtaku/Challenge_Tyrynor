package rcz;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class MyPanel extends JPanel {

	protected int sX, sY, pX, pY;
	protected Window wd;
	
	protected MyPanel(Window w ,int p_X, int p_Y, int s_X, int s_Y) {
		this.setLayout(null);
		wd=w;
		sX=s_X;
		sY=s_Y;
		pX=p_X;
		pY=p_Y;
		this.setSize(sX,sY);
		this.setLocation(pX, pY);
	}
	
	protected MyPanel(Window w, int p_X, int p_Y, Dimension d) {
		this(w ,p_X ,p_Y ,d.width ,d.height);
	}
}
