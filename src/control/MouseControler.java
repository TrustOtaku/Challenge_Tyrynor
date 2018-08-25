package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import entity.Projectile;
import entity.creatures.Player;

public class MouseControler implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		switch(arg0.getButton()) {
		case MouseEvent.BUTTON1:
			Player.getInstance().attack(arg0.getX()-9, arg0.getY()-31);//Correction necessaire sans raisons connues
			break;
		case MouseEvent.BUTTON3:
			break;
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
