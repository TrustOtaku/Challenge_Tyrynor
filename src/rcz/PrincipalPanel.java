package rcz;

import java.awt.Color;
import java.awt.Graphics;

import fix.Fix;

public class PrincipalPanel extends MyPanel {

	MenuPanel main;
	InfoPanel info;
	TestPanel test;
	
	public PrincipalPanel(Window w) {
		super(w, 0, 0, Fix.WINDOW_SIZE);
		this.createInfo();
		this.createMainMenu();
	}
	
	public void paintComponent(Graphics g) {
	}
	
	public MenuPanel getMain() {
		return main;
	}

	private void createMainMenu() {
		main= new MenuPanel(wd, 0, 0, Fix.WINDOW_SIZE.width, Fix.WINDOW_SIZE.height, 'm');
		this.add(main);
	}
	
	private void createInfo() {
		info= new InfoPanel(wd);
		this.add(info);
	}
	
	public void switchInfoVisibility() {
		info.setVisible(!info.isVisible());
	}
}
