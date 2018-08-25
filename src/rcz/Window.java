package rcz;

import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fix.Fix;
import rcz.panel.PrincipalPanel;
import control.*;

public class Window extends JFrame{
	
	private static Window instance;//------- Singleton -------//
	
	private JPanel activePanel;
	private boolean exit=false;
	private KeyListener kbControler;
	private MouseListener mzControler;
	
	private Window() {
		super(Fix.WINDOW_NAME);
		this.setResizable(false);
		this.setSize(Fix.WINDOW_SIZE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.setVisible(true);
		this.setContentPane(PrincipalPanel.getInstance());
		this.setActivePanel(PrincipalPanel.getInstance().getMenuPanel());
	}
	
	public static Window getInstance() {
		
		if(instance==null) {
			instance= new Window();
		}
		return instance;
	}
	
	public void exit() {
		exit=true;
	}
	
	public void loop() {
		while(!exit) {
			try {
				PrincipalPanel.getInstance().repaint();
				Thread.sleep((int)(1000/Fix.TARGETED_FPS));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//------- SETTERS & GETTERS -------//
	public KeyListener getControler() {
		return kbControler;
	}
	
	public JPanel getActivePanel() {
		return activePanel;
	}
	
	//Setters qui add un nouveau KeyListener en consequence
	public void setActivePanel(JPanel pan) {
		if(activePanel!=null) {
			activePanel.setVisible(false);
		}
		activePanel= pan;
		this.removeKeyListener(kbControler);
		this.removeMouseListener(mzControler);
		
		switch(activePanel.getClass().getName()) {
		case "rcz.panel.menu.PauseMenu":
		case "rcz.panel.menu.MainMenu":
		case "rcz.panel.menu.OptionMenu":
		case "rcz.panel.menu.GameSelectMenu":
			kbControler= new MenuControler();
			this.addKeyListener(kbControler);
			break;
		case "rcz.panel.GamePanel":
			kbControler= new GameControler();
			this.addKeyListener(kbControler);
			mzControler= new MouseControler();
			this.addMouseListener(mzControler);
		}
	}
}
