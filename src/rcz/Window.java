package rcz;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fix.Fix;
import control.MenuControler;

public class Window extends JFrame{
	
	private static int nbInstance=0;
	
	private PrincipalPanel pPan;
	private JPanel activePanel;
	boolean exit=false;
	
	public Window() {
		super(Fix.WINDOW_NAME);
		this.setSize(Fix.WINDOW_SIZE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		nbInstance++;
		if(nbInstance!=1) {
			System.exit(0);
		}
		this.setVisible(true);
		pPan= new PrincipalPanel(this);
		this.setContentPane(pPan);
		this.setActivePanel(this.pPan.getMenu());
	}
	
	public void exit() {
		exit=true;
	}
	
	public void loop() {
		while(!exit) {
			try {
				pPan.repaint();
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
		case "rcz.MenuPanel":
			this.addKeyListener(new MenuControler(pPan));
			break;
		}
	}
}
