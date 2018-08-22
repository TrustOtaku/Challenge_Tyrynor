package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import rcz.PrincipalPanel;

public class MenuControler implements KeyListener{
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		switch(arg0.getKeyCode()) {
		case KeyEvent.VK_UP:
			PrincipalPanel.getInstance().getMenuPanel().setSelect(PrincipalPanel.getInstance().getMenuPanel().getSelect()-1);
			break;
		case KeyEvent.VK_DOWN:
			PrincipalPanel.getInstance().getMenuPanel().setSelect(PrincipalPanel.getInstance().getMenuPanel().getSelect()+1);
			break;
		case KeyEvent.VK_ENTER:
			PrincipalPanel.getInstance().getMenuPanel().enterPressed();
			break;
		case KeyEvent.VK_F1:
			PrincipalPanel.getInstance().getInfoPanel().setVisible(!PrincipalPanel.getInstance().getInfoPanel().isVisible());
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
