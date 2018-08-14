package rcz;

import java.awt.Color;
import java.awt.Graphics;

import fix.Fix;

public class PrincipalPanel extends MyPanel {

	private static PrincipalPanel instance;//Singleton
	
	private MenuPanel menu;
	private InfoPanel info;
	private GamePanel game;
	private TestPanel test;
	Window wd;
	
	private PrincipalPanel() {
		super(0, 0, Fix.WINDOW_SIZE);
		this.createInfo();
		this.createMenu();
		this.createGame();
	}
	
	public static PrincipalPanel getInstance() {
		if(instance==null)
			instance= new PrincipalPanel();
		return instance;
	}
	
	public void paintComponent(Graphics g) {
	}
	
	public MenuPanel getMenu() {
		return menu;
	}

	private void createMenu() {
		menu= new MenuPanel(0, 0, Fix.WINDOW_SIZE.width, Fix.WINDOW_SIZE.height, 'm');
		menu.setVisible(true);
		this.add(menu);
	}
	
	private void createInfo() {
		info= new InfoPanel();
		info.setVisible(false);
		this.add(info);
	}
	
	private void createGame() {
		game= new GamePanel(32, 32);
		game.setVisible(false);
		this.add(game);
	}
	
	public void switchInfoVisibility() {
		info.setVisible(!info.isVisible());
	}
}
