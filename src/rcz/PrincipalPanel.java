package rcz;

import javax.swing.JPanel;
import java.awt.Color;

import fix.Fix;

public class PrincipalPanel extends JPanel {

	Window wd;
	JPanel p1, p2;
	
	public PrincipalPanel(Window w) {
		this.setPreferredSize(Fix.WINDOW_SIZE);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		wd=w;
		//this.displayMainMenu();
		this.test();
	}
	
	public void displayMainMenu() {
		MenuPanel menu= new MenuPanel(wd, Fix.MAIN_MENU_TITLE, Fix.MAIN_MENU_CHOICES);
		this.add(menu);
	}
	
	public void test() {
		p1= new MyPanel(0,0,50,50,Color.BLUE);
		p2= new MyPanel(25,25,50,50,Color.RED);
		this.add(p1);
		this.add(p2);
		
	}
}
