package rcz.panel;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public abstract class MyPanel extends JPanel {

	protected int pX, pY;
	
	protected MyPanel(int p_X, int p_Y, int sX, int sY) {
		this.setLayout(null);
		pX=p_X;
		pY=p_Y;
		this.setSize(sX,sY);
		this.setLocation(pX, pY);
	}
	
	protected MyPanel(int p_X, int p_Y, Dimension d) {
		this(p_X ,p_Y ,d.width ,d.height);
	}
	
}
