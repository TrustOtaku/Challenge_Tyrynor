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
		Window.getInstance().setActivePanel(this);
		//this.setFont(new Font("Dialog", Font.PLAIN,32));
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		
		g.setFont(Fix.TITLE_FONT);
		g.drawString(title, this.getWidth()/2, Fix.POS_Y_MENU);
		
		g.setFont(Fix.DEFAULT_FONT);
		for(int i=0; i<choice.length; i++) {
			g.drawString((i==select)?"*"+choice[i]+"*":choice[i], this.getWidth()/2, Fix.POS_Y_MENU+Fix.TITLE_FONT.getSize()+Fix.DEFAULT_FONT.getSize()*i);
		}
	}
	
	public int getSelect() {
		return select;
	}
	
	public void moveSelect(int n) {
		select= (n+3)%choice.length;
	}
	
	public void enterPressed() {
		switch(select) {
		case 0:
			
			break;
		case 1:
			break;
		case 2:
			Window.getInstance().exit();
		}
	}
}
