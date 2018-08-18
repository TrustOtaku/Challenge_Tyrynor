package rcz.menu;

import rcz.Window;

public class MainMenu extends MenuPanel {

	public MainMenu(int p_X, int p_Y, int s_X, int s_Y) {
		super(p_X, p_Y, s_X, s_Y);
		title= "Menu";
		choice= new String[3];
		choice[0]= "Play";
		choice[1]= "Options";
		choice[2]= "Exit";
	}

	@Override
	public void enterPressed() {
		switch(select) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			Window.getInstance().exit();
			break;
		}
	}
}
