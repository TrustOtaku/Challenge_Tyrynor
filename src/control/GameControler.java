package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import entity.creatures.Player;
import rcz.panel.PrincipalPanel;
import rcz.panel.menu.PauseMenu;

public class GameControler implements KeyListener {

	private boolean up= false, 
					down= false, 
					right= false,
					left= false;
	
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
			up= true;
			Player.getInstance().setMoveY(-1);
			break;
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_S:
			down= true;
			Player.getInstance().setMoveY(1);
			break;
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_D:
			right= true;
			Player.getInstance().setMoveX(1);
			break;
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_Q:
			left= true;
			Player.getInstance().setMoveX(-1);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		switch(arg0.getKeyCode()) {
		case KeyEvent.VK_UP:
		case KeyEvent.VK_Z:
			up= false;
			Player.getInstance().setMoveY(0);
			break;
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_S:
			down= false;
			Player.getInstance().setMoveY(0);
			break;
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_D:
			right= false;
			Player.getInstance().setMoveX(0);
			break;
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_Q:
			left= false;
			Player.getInstance().setMoveX(0);
			break;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean getUp() {
		return up;
	}
	
	public boolean getDown() {
		return down;
	}
	
	public boolean getRight() {
		return right;
	}
	
	public boolean getLeft() {
		return left;
	}
}
