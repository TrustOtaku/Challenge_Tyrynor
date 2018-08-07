package rcz;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class MyPanel extends JPanel {

	Color c;
	int sX, sY, pX, pY;
	
	public MyPanel(int p_X, int p_Y, int s_X, int s_Y, Color color) {
		sX=s_X;
		sY=s_Y;
		pX=p_X;
		pY=p_Y;
		c=color;
		this.setLayout(null);
		this.setSize(sX,sY);
		this.setLocation(pX, pY);
		this.setBackground(c);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(c);
		g.fillRect(0, 0, sX, sY);
	}
}
