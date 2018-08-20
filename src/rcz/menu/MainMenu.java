package rcz.menu;

import fix.Fix;
import rcz.GamePanel;
import rcz.PrincipalPanel;
import rcz.Window;

public class MainMenu extends MenuPanel {

	public MainMenu() {
		super();
		System.out.println("MainMenu()");
		title= "Menu";
		choice= new String[3];
		choice[0]= "Play";
		choice[1]= "Options";
		choice[2]= "Exit";
		needSizeCalculation=true;
	}

	@Override
	public void enterPressed() {
		switch(select) {
		case 0:
			PrincipalPanel.getInstance().setMenuPanel(new GameSelectMenu());
			break;
		case 1:
			PrincipalPanel.getInstance().setMenuPanel(new OptionMenu());
			break;
		case 2:
			Window.getInstance().exit();
			break;
		}
	}
}
