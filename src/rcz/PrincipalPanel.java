package rcz;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

import fix.Fix;

public class PrincipalPanel extends JPanel {

	Window wd;
	JPanel p1, p2;
	
	public PrincipalPanel(Window w) {
		this.setSize(Fix.WINDOW_SIZE);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		wd=w;
		this.displayMainMenu();
		//p1= new TestPanel(wd, 0, 0, Fix.WINDOW_SIZE);
		this.repaint();
	}
	
	public void displayMainMenu() {
		MenuPanel menu= new MenuPanel(wd, 0, 0, Fix.WINDOW_SIZE.width, Fix.WINDOW_SIZE.height, Fix.MAIN_MENU_TITLE, Fix.MAIN_MENU_CHOICES);
		//MenuPanel menu= new MenuPanel(wd, Fix.MAIN_MENU_TITLE, Fix.MAIN_MENU_CHOICES);
		this.add(menu);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 50, 50);
	}
}
