package rcz;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fix.Fix;
import control.MenuControler;

public class Window extends JFrame{
	
	private static Window instance;//Singleton
	
	private JPanel activePanel;
	private boolean exit=false;
	
	private Window() {
		super(Fix.WINDOW_NAME);
		this.setSize(Fix.WINDOW_SIZE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.setVisible(true);
		this.setContentPane(PrincipalPanel.getInstance());
		this.setActivePanel(PrincipalPanel.getInstance().getMenu());
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
	
	public JPanel getActivePanel() {
		return activePanel;
	}
	
	//Setters qui add un nouveau KeyListener en consequence
	public void setActivePanel(JPanel pan) {
		activePanel=pan;
		
		switch(activePanel.getClass().getName()) {
		case "rcz.menu.MainMenu":
			this.addKeyListener(new MenuControler());
			break;
		}
	}
}
