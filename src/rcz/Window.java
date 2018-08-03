package rcz;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fix.Fix;

public class Window extends JFrame{
	
	//String tab[]= {"Play","Options","Exit"};
	//MenuPanel mainMenu= new MenuPanel("MENU", tab);
	PrincipalPanel pPan= new PrincipalPanel();
	
	public Window() {
		super(Fix.WINDOW_NAME);
		this.setSize(Fix.WINDOW_SIZE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setContentPane(pPan);
		this.setVisible(true);
	}
	
	public void loop() {
		while(true) {
			try {
				pPan.repaint();
				Thread.sleep((int)(1000/Fix.TARGETED_FPS));
			}
			catch (Exception e) {
				//I DON T KNOW WHAT TO DO MOTHERFUCKER !!!!!!!!!!!!!!!!!!!!!
			}
		}
	}
	
}
