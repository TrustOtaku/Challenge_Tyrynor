package rcz;

import java.awt.Color;
import java.awt.Graphics;

import fix.Fix;

public class PrincipalPanel extends MyPanel {

	MenuPanel menu;
	InfoPanel info;
	TestPanel test;
	
	public PrincipalPanel(Window w) {
		super(w, 0, 0, Fix.WINDOW_SIZE);
		this.createInfo();
		this.createMenu();
	}
	
	public void paintComponent(Graphics g) {
	}
	
	public MenuPanel getMenu() {
		return menu;
	}

	private void createMenu() {
		menu= new MenuPanel(wd, 0, 0, Fix.WINDOW_SIZE.width, Fix.WINDOW_SIZE.height, 'm');
		this.add(menu);
	}
	
	private void createInfo() {
		info= new InfoPanel(wd);
		this.add(info);
	}
	
	public void switchInfoVisibility() {
		info.setVisible(!info.isVisible());
	}
}
