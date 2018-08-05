package rcz;

import javax.swing.JPanel;
import java.awt.Color;

import fix.Fix;

public class PrincipalPanel extends JPanel {

	Window wd;
	
	public PrincipalPanel(Window w) {
		this.setPreferredSize(Fix.WINDOW_SIZE);
		this.setBackground(Color.WHITE);
		wd=w;
		this.displayMainMenu();
		this.repaint();//pour eviter bug du menu qui ne s affiche pas
	}
	
	public void displayMainMenu() {
		MenuPanel menu= new MenuPanel(wd, Fix.MAIN_MENU_TITLE, Fix.MAIN_MENU_CHOICES);
		this.add(menu);
	}
}
