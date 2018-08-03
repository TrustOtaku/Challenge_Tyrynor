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
	private Font defFont= new Font("Dialog", Font.PLAIN,12);
	private Font titleFont= new Font("TimesRoman", Font.ITALIC,16);
	
	public MenuPanel(String t, String[] c) {
		this.setPreferredSize(Fix.WINDOW_SIZE);
		title= t;
		choice= c;
		
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		
		this.setFont(titleFont);
		g.drawString(title, this.getWidth()/2, 50);
		
		this.setFont(defFont);
		for(int i=0; i<choice.length; i++) {
			g.drawString((i==select)?"*"+choice[i]+"*":choice[i], this.getWidth()/2, 75+15*i);
		}
	}
}
