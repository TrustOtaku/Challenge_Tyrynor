package rcz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.JPanel;

import fix.Fix;


public class MenuPanel extends MyPanel{

	private String title;//En-tete du menu
	private String[] choice;//liste des choix possibles
	private int select;//choix sur lequel on est positionné
	private boolean needSizeCalculation;
	
	private int strWidth;//longueur en pixels d une str
	
	private int totalWidth;//longueur totale en pixels du menu
	private int totalHeight;//hauteur totale en pixels du menu
	private int lineHeight;//interligne en pixels
	private int titleSpacing;
	private int posXMenu;
	private int posYTitle;
	private int posYChoices;
	private int selectWidth;
	
	public MenuPanel(Window w, int p_X, int p_Y, int s_X, int s_Y, String t, String[] c) {
		super(w, p_X, p_Y, s_X, s_Y);
		title= t;
		choice= c;
		select= 0;
		needSizeCalculation=true;
	}
	
	public void paintComponent(Graphics g) {
		if(needSizeCalculation)
			this.displaySizeCalculation(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.BLACK);
		g.setFont(Fix.TITLE_FONT);
		strWidth= g.getFontMetrics(Fix.TITLE_FONT).stringWidth(title);
		g.drawString(title, (this.getWidth()-strWidth)/2, posYTitle);
		
		g.setFont(Fix.DEFAULT_FONT);
		for(int i=0; i<choice.length; i++) {
			strWidth= g.getFontMetrics(Fix.DEFAULT_FONT).stringWidth(choice[i]);
			//g.drawString(choice[i], (int)(this.getWidth()-strWidth)/2, Fix.POS_Y_MENU+Fix.TITLE_FONT.getSize()+Fix.DEFAULT_FONT.getSize()*i);
			g.drawString(choice[i], (int)((this.getWidth()-strWidth)/2), posYChoices+i*lineHeight);
			if(i==select) {
				g.drawString(">", posXMenu+10, posYChoices+i*lineHeight);
				g.drawString("<", posXMenu+totalWidth-selectWidth-10, posYChoices+i*lineHeight);
			}
		}
		
		g.drawRect(posXMenu, posYTitle-g.getFontMetrics(Fix.TITLE_FONT).getHeight(), totalWidth, totalHeight+g.getFontMetrics(Fix.TITLE_FONT).getHeight());
		g.setColor(Color.RED);
		g.fillRect(0, this.getHeight()-100, 10, 10);
	}
	
	private void displaySizeCalculation(Graphics g) {
		//totalWidth
		totalWidth= g.getFontMetrics(Fix.TITLE_FONT).stringWidth(title);
		System.out.println(totalWidth);
		for(int i=0; i<choice.length; i++) {
			strWidth= g.getFontMetrics(Fix.DEFAULT_FONT).stringWidth(choice[i]);
			totalWidth= (totalWidth>strWidth)?totalWidth:strWidth;
		}
		totalWidth+= 100;
		
		//lineHeight
		lineHeight= g.getFontMetrics(Fix.DEFAULT_FONT).getHeight();
		
		//titleSpacing
		titleSpacing= g.getFontMetrics(Fix.TITLE_FONT).getHeight();
		
		//totalHeight
		totalHeight= g.getFontMetrics(Fix.TITLE_FONT).getHeight();
		totalHeight+= choice.length*lineHeight;
		
		//posXMenu
		posXMenu= (this.getWidth()-totalWidth)/2;
		
		//posYTitle
		posYTitle= (this.getHeight()-totalHeight)/2;
		
		//PosYChoices
		posYChoices= posYTitle+titleSpacing;
		
		//selectWidth
		selectWidth= g.getFontMetrics(Fix.DEFAULT_FONT).stringWidth(">");
		
		//calcul terminé
		needSizeCalculation=false;
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
	}
}
