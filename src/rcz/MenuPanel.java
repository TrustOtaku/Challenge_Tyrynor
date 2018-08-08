package rcz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.JPanel;

import fix.Fix;


public class MenuPanel extends MyPanel{

	//private Window wd;
	private String title;
	private String[] choice;
	private int select=0;
	private int strWidth;
	/*
	public MenuPanel(Window w, String t, String[] c) {
		this.setSize(Fix.WINDOW_SIZE);
		this.setLocation(0, 0);
		title= t;
		choice= c;
		wd= w;
		wd.setActivePanel(this);
		strWidth=0;
		this.repaint();
		System.out.println("menu créé");
		this.setBackground(Color.WHITE);
	}
	/**/
	public MenuPanel(Window w, int p_X, int p_Y, int s_X, int s_Y, String t, String[] c) {
		super(w, p_X, p_Y, s_X, s_Y);
		title= t;
		choice= c;
		wd.setActivePanel(this);
		this.setBackground(Color.BLACK);
		
	}
	/**/
	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.BLACK);
		g.setFont(Fix.TITLE_FONT);
		strWidth= g.getFontMetrics(Fix.TITLE_FONT).stringWidth(title);
		g.drawString(title, (this.getWidth()-strWidth)/2, Fix.POS_Y_MENU);
		
		g.setFont(Fix.DEFAULT_FONT);
		for(int i=0; i<choice.length; i++) {
			if(i==select) {
				strWidth= g.getFontMetrics(Fix.DEFAULT_FONT).stringWidth("*"+choice[i]+"*");
				g.drawString("*"+choice[i]+"*", (int)(this.getWidth()-strWidth)/2, Fix.POS_Y_MENU+Fix.TITLE_FONT.getSize()+Fix.DEFAULT_FONT.getSize()*i);
			}
			else {
				strWidth= g.getFontMetrics(Fix.DEFAULT_FONT).stringWidth(choice[i]);
				g.drawString(choice[i], (int)(this.getWidth()-strWidth)/2, Fix.POS_Y_MENU+Fix.TITLE_FONT.getSize()+Fix.DEFAULT_FONT.getSize()*i);
			}
		}
	}
	
	public int getSelect() {
		return select;
	}
	
	public void setSelect(int s) {
		select= (s+3)%choice.length;
	}
	
	public void enterPressed() {
		switch(select) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			wd.exit();
		}
	}
	
	public void testF1() {
		System.out.println("test en cours !");
		InfoPanel test= new InfoPanel(wd);
		this.add(test);
	}
}
