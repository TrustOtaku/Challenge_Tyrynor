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
	private int strWidth;//longueur en pixels d une str
	private int totalWidth;//longueur totale en pixels du menu
	private int totalHeight;//hauteur totale en pixels du menu
	private boolean needSizeCalculation;
	
	public MenuPanel(Window w, int p_X, int p_Y, int s_X, int s_Y, String t, String[] c) {
		super(w, p_X, p_Y, s_X, s_Y);
		title= t;
		choice= c;
		select= 0;
		needSizeCalculation=true;
	}
	
	public void paintComponent(Graphics g) {
		if(needSizeCalculation) {
			//totalWidth calcul
			totalWidth= g.getFontMetrics(Fix.TITLE_FONT).stringWidth(title);
			System.out.println(totalWidth);
			for(int i=0; i<choice.length; i++) {
				strWidth= g.getFontMetrics(Fix.DEFAULT_FONT).stringWidth(choice[i]);
				totalWidth= (totalWidth>strWidth)?totalWidth:strWidth;
				System.out.println(totalWidth);
			}
			totalWidth+=100;
			//totalHeight calcul
			
			
			
			//calcul terminé
			needSizeCalculation=false;
		}
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.BLACK);
		g.setFont(Fix.TITLE_FONT);
		strWidth= g.getFontMetrics(Fix.TITLE_FONT).stringWidth(title);
		g.drawString(title, (this.getWidth()-strWidth)/2, Fix.POS_Y_MENU);
		
		g.setFont(Fix.DEFAULT_FONT);
		for(int i=0; i<choice.length; i++) {
			strWidth= g.getFontMetrics(Fix.DEFAULT_FONT).stringWidth(choice[i]);
			g.drawString(choice[i], (int)(this.getWidth()-strWidth)/2, Fix.POS_Y_MENU+Fix.TITLE_FONT.getSize()+Fix.DEFAULT_FONT.getSize()*i);
			if(i==select) {
				g.drawString("*", (int)(this.getWidth()-strWidth)/2-Fix.TAILLE_ASTERISQUE, Fix.POS_Y_MENU+Fix.TITLE_FONT.getSize()+Fix.DEFAULT_FONT.getSize()*i);
				g.drawString("*", (int)(this.getWidth()+strWidth)/2, Fix.POS_Y_MENU+Fix.TITLE_FONT.getSize()+Fix.DEFAULT_FONT.getSize()*i);
			}
		}
		
		g.drawRect((this.getWidth()-totalWidth)/2, Fix.POS_Y_MENU-50, totalWidth, 500);
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
