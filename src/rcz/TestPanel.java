package rcz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class TestPanel extends MyPanel {

	protected TestPanel(Window w, int p_X, int p_Y, int s_X, int s_Y) {
		super(w, p_X, p_Y, s_X, s_Y);
		// TODO Auto-generated constructor stub
	}
	
	protected TestPanel(Window w, int p_X, int p_Y, Dimension d) {
		super(w, p_X, p_Y, d);
		// TODO Auto-generated constructor stub
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 500);
	}
}
