package rcz;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import fix.Fix;

public class MenuPanel extends JPanel{

	private String title;
	private String[] choice;
	private int select=0;
	
	public MenuPanel(String t, String[] c) {
		this.setPreferredSize(Fix.WINDOW_SIZE);
		title= t;
		choice= c;
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.BLACK);
		g.drawString(title, this.getWidth()/2, 50);
		for(int i=0; i<choice.length; i++) {
			g.drawString((i==select)?"*"+choice[i]+"*":choice[i], this.getWidth()/2, 75+15*i);
		}
	}
}
