package rcz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
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
		//this.setFont(new Font("Dialog", Font.PLAIN,32));
		this.setFont(Fix.TITLE_FONT);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		
		
		g.drawString(title, this.getWidth()/2, 50);
		for(int i=0; i<choice.length; i++) {
			g.drawString((i==select)?"*"+choice[i]+"*":choice[i], this.getWidth()/2, 75+15*i);
		}
	}
}
