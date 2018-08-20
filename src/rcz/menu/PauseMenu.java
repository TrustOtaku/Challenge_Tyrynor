package rcz.menu;

import rcz.PrincipalPanel;

public class PauseMenu extends MenuPanel {

	public PauseMenu() {
		super();
		title= "Pause";
		choice= new String[2];
		choice[0]= "Continue";
		choice[1]= "Back to Menu";
		needSizeCalculation=true;
	}

	@Override
	public void enterPressed() {
		switch(select) {
		case 0:
			PrincipalPanel.getInstance().setGamePanel(PrincipalPanel.getInstance().getGamePanel());
			break;
		case 1:
			PrincipalPanel.getInstance().setMenuPanel(new MainMenu());
			break;
		}

	}

}
