package rcz.menu;

import rcz.PrincipalPanel;

public class GameSelectMenu extends MenuPanel {

	private int nbSaves;
	
	public GameSelectMenu(int p_X, int p_Y, int s_X, int s_Y) {
		super(p_X, p_Y, s_X, s_Y);
		nbSaves= 0; //TO DO: load number of saves
		title= "Select a Game";
		choice= new String[nbSaves+2];
		choice[nbSaves]= "New Game";
		choice[nbSaves+1]= "Back to Menu";
		needSizeCalculation=true;
	}

	@Override
	public void enterPressed() {
		//TO DO: load the selected saves
		if(select<nbSaves) {
			
		}
		else {
			if(select==nbSaves) {
				//TO DO: Launch a new game
			}
			else {
				PrincipalPanel.getInstance().changeMenuType('m');
			}
		}
	}

}
