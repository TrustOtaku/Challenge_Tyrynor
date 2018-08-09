package rcz;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import fix.Fix;

public class PrincipalPanel extends MyPanel {

	MenuPanel main;
	InfoPanel info;
	
	public PrincipalPanel(Window w) {
		super(w, 0, 0, Fix.WINDOW_SIZE);
		this.createInfo();
		this.createMainMenu();
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 50, 50);
	}
	
	public MenuPanel getMain() {
		return main;
	}

	private void createMainMenu() {
		main= new MenuPanel(wd, 0, 0, Fix.WINDOW_SIZE.width, Fix.WINDOW_SIZE.height, Fix.MAIN_MENU_TITLE, Fix.MAIN_MENU_CHOICES);
		this.add(main);
	}
	
	private void createInfo() {
		info= new InfoPanel(wd);
		this.add(info);
	}
	
	public void switchInfoVisibility() {
		if(info.isVisible()) {
			info.setVisible(false);
		}
		else {
			info.setVisible(true);
		}
	}
}
