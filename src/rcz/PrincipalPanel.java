package rcz;

import java.awt.Color;
import java.awt.Graphics;

import fix.Fix;
import rcz.menu.*;

public class PrincipalPanel extends MyPanel {

	private static PrincipalPanel instance;//Singleton
	
	private MenuPanel menu;
	private InfoPanel info;
	private GamePanel game;
	private TestPanel test;
	
	private PrincipalPanel() {
		super(0, 0, Fix.WINDOW_SIZE);
		info= new InfoPanel();
		info.setVisible(false);
		this.add(info);//Doit etre ajouter en premier pour avoir la priorité sur l affichage
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
		menu= new MainMenu(0, 0, Fix.WINDOW_SIZE.width, Fix.WINDOW_SIZE.height);
		menu.setVisible(true);
		this.add(menu);
	}
	
	private void createGame() {
		game= new GamePanel();
		game.setVisible(false);
		this.add(game);
	}
	
	public void changeMenuType(char type) {
		this.remove(menu);
		switch(type) {
		case 'm':
			menu= new MainMenu(0, 0, Fix.WINDOW_SIZE.width, Fix.WINDOW_SIZE.height);
			break;
		case 'o':
			menu= new OptionMenu(0, 0, Fix.WINDOW_SIZE.width, Fix.WINDOW_SIZE.height);
			break;
		case 'p':
			menu= new PauseMenu(0, 0, Fix.WINDOW_SIZE.width, Fix.WINDOW_SIZE.height);
			break;
		}
		this.add(menu);
	}
	
	public void switchInfoVisibility() {
		info.setVisible(!info.isVisible());
	}
}
