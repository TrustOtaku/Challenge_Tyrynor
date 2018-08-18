package rcz.menu;

public class PauseMenu extends MenuPanel {

	public PauseMenu(int p_X, int p_Y, int s_X, int s_Y) {
		super(p_X, p_Y, s_X, s_Y);
		title= "Pause";
		choice= new String[4];
		choice[0]= "Continue";
		choice[1]= "Options";
		choice[2]= "Save";
		choice[3]= "Back";
	}

	@Override
	public void enterPressed() {
		// TODO Auto-generated method stub

	}

}
