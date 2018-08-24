package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import entity.creatures.Player;
import rcz.panel.PrincipalPanel;
import rcz.panel.menu.PauseMenu;

public class GameControler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		switch(arg0.getKeyCode()) {
		case KeyEvent.VK_ESCAPE:
			PrincipalPanel.getInstance().setMenuPanel(new PauseMenu());
			break;
		case KeyEvent.VK_F1:
			PrincipalPanel.getInstance().getInfoPanel().setVisible(!PrincipalPanel.getInstance().getInfoPanel().isVisible());;
			break;
		case KeyEvent.VK_UP:
		case KeyEvent.VK_Z:
			Player.getInstance().setMoveY(-1);
			break;
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_S:
			Player.getInstance().setMoveY(1);
			break;
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_D:
			Player.getInstance().setMoveX(1);
			break;
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_Q:
			Player.getInstance().setMoveX(-1);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		switch(arg0.getKeyCode()) {
		case KeyEvent.VK_UP:
		case KeyEvent.VK_Z:
			Player.getInstance().setMoveY(0);
			break;
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_S:
			Player.getInstance().setMoveY(0);
			break;
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_D:
			Player.getInstance().setMoveX(0);
			break;
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_Q:
			Player.getInstance().setMoveX(0);
			break;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
