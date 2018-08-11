package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import rcz.PrincipalPanel;

public class MenuControler implements KeyListener{

	private PrincipalPanel pan;
	
	public MenuControler(PrincipalPanel p) {
		pan= p;
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		switch(arg0.getKeyCode()) {
		case KeyEvent.VK_UP:
			pan.getMenu().setSelect(pan.getMenu().getSelect()-1);
			break;
		case KeyEvent.VK_DOWN:
			pan.getMenu().setSelect(pan.getMenu().getSelect()+1);
			break;
		case KeyEvent.VK_ENTER:
			pan.getMenu().enterPressed();
			break;
		case KeyEvent.VK_F1:
			pan.switchInfoVisibility();
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
