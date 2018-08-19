package rcz.menu;

import rcz.PrincipalPanel;
import rcz.Window;

public class OptionMenu extends MenuPanel {

	public OptionMenu(int p_X, int p_Y, int s_X, int s_Y) {
		super(p_X, p_Y, s_X, s_Y);
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
		case 3:
			choice[3]= "Are you stupid ?";
			break;
		default:
			PrincipalPanel.getInstance().changeMenuType('m');
		}
	}

}
