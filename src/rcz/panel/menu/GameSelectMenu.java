package rcz.panel.menu;

import fix.Fix;
import rcz.panel.GamePanel;
import rcz.panel.PrincipalPanel;

public class GameSelectMenu extends MenuPanel {

	private int nbSaves;
	
	public GameSelectMenu() {
		super();
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
				PrincipalPanel.getInstance().setGamePanel(new GamePanel());;
			}
			else {
				PrincipalPanel.getInstance().setMenuPanel(new MainMenu());
			}
		}
	}

}
