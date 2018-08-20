package entity.creatures;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends Creature {

	private static Player instance;//------- Singleton -------//
	
	private Player(int posX, int posY) {
		super(posX, posY);
	}
	
	public static Player getInstance() {
		if(instance==null) {
			instance= new Player(0, 0);//TO DO: real var for Player(x, y)
		}
		return instance;
	}
	
	protected void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawOval(x, y, 32, 32);
		g.drawOval(x, y, 16, 16);
	}

	@Override
	protected void move(int mX, int mY) {
		// TODO Auto-generated method stub

	}

}
