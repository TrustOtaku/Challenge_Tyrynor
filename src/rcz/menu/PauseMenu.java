package rcz.menu;

import rcz.PrincipalPanel;

public class PauseMenu extends MenuPanel {

	public PauseMenu(int p_X, int p_Y, int s_X, int s_Y) {
		super(p_X, p_Y, s_X, s_Y);
		title= "Pause";
		choice= new String[4];
		choice[0]= "Continue";
		choice[1]= "Options";
		choice[2]= "Save";
		choice[3]= "Back";
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
			break;
		case 3:
			break;
		}

	}

}
