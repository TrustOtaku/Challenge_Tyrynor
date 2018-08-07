package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import rcz.MenuPanel;

public class MenuControler implements KeyListener{

	private MenuPanel menu;
	
	public MenuControler(MenuPanel m) {
		menu=m;
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		switch(arg0.getKeyCode()) {
		case KeyEvent.VK_UP:
			menu.moveSelect(menu.getSelect()-1);
			break;
		case KeyEvent.VK_DOWN:
			menu.moveSelect(menu.getSelect()+1);
			break;
		case KeyEvent.VK_ENTER:
			menu.enterPressed();
			break;
		case KeyEvent.VK_F1:
			menu.testF1();
			System.out.println("F1 pressed !");
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
