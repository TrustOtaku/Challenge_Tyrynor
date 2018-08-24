package rcz.panel;

import java.awt.Color;
import java.awt.Graphics;

import fix.Fix;
import rcz.Window;
import rcz.panel.menu.*;
import rcz.panel.menu.MainMenu;
import rcz.panel.menu.MenuPanel;

public class PrincipalPanel extends MyPanel {

	private static PrincipalPanel instance;//------- Singleton -------//
	
	private MenuPanel menu;
	private InfoPanel info;
	private GamePanel game;
	private TestPanel test;
	
	private PrincipalPanel() {
		super(0, 0, Fix.WINDOW_SIZE);
		info= new InfoPanel();
		info.setVisible(false);
		this.add(info);//Doit etre ajouter en premier pour avoir la priorité sur l affichage
		menu= new MainMenu();
		this.add(menu);
		menu.setVisible(true);
	}
	
	public static PrincipalPanel getInstance() {
		if(instance==null)
			instance= new PrincipalPanel();
		return instance;
	}
	
	public void paintComponent(Graphics g) {
	}

	//------- SETTERS & GETTERS -------//
	public MenuPanel getMenuPanel() {
		return menu;
	}
	
	public void setMenuPanel(MenuPanel m) {
		menu= m;
		menu.setVisible(true);
		this.add(menu);
		Window.getInstance().setActivePanel(menu);
	}
	
	public GamePanel getGamePanel() {
		return game;
	}
	
	public void setGamePanel(GamePanel g) {
		game= g;
		game.setVisible(true);
		this.add(game);
		Window.getInstance().setActivePanel(game);
	}
	
	public InfoPanel getInfoPanel() {
		return info;
	}
}
