package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import rcz.PrincipalPanel;
import rcz.menu.PauseMenu;

public class GameControler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		switch(arg0.getKeyCode()) {
		case KeyEvent.VK_ESCAPE:
			PrincipalPanel.getInstance().setMenuPanel(new PauseMenu());
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
