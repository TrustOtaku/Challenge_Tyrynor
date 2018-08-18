package rcz.menu;

import rcz.PrincipalPanel;
import rcz.Window;

public class OptionMenu extends MenuPanel {

	public OptionMenu(int p_X, int p_Y, int s_X, int s_Y) {
		super(p_X, p_Y, s_X, s_Y);
		title= "Options";
		choice= new String[3];
		choice[0]= "Fenêtré: ";
		choice[1]= "option 2";
		choice[2]= "Back to Menu";
		needSizeCalculation=true;
	}

	@Override
	public void enterPressed() {
		switch(select) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			PrincipalPanel.getInstance().changeMenuType('m');
			break;
		}
	}

}
