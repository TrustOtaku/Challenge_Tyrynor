package rcz.menu;

import rcz.PrincipalPanel;
import rcz.Window;

public class OptionMenu extends MenuPanel {

	public OptionMenu() {
		super();
		title= "Options";
		choice= new String[5];
		choice[0]= "Options not implemented";
		choice[1]= "Don not touch !";
		choice[2]= "-";
		choice[3]= "Pointless button";
		choice[choice.length-1]= "Back to Menu";
		needSizeCalculation=true;
	}

	@Override
	public void enterPressed() {
		switch(select) {
		case 0:
		case 1:
			choice[0]= "You broke the game !";
			choice[1]= "You foolish creature...";
			break;
		case 2:
			choice[2]= (choice[2]=="-")?"+":"-";
			break;
		case 3:
			choice[3]= "Are you stupid ?";
			break;
		default:
			PrincipalPanel.getInstance().setMenuPanel(new MainMenu());
		}
	}

}
