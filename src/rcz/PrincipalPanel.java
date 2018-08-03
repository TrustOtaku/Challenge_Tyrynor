package rcz;

import javax.swing.JPanel;
import java.awt.Color;

import fix.Fix;

public class PrincipalPanel extends JPanel {

	public PrincipalPanel() {
		this.setPreferredSize(Fix.WINDOW_SIZE);
		this.setBackground(Color.WHITE);
		String tab[]= {"Play","Options","Exit"};
		MenuPanel mainMenu= new MenuPanel("MENU", tab);
		this.add(mainMenu);
	}
}
