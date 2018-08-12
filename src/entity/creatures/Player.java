package entity.creatures;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends Creature {

	protected Player(int posX, int posY) {
		super(posX, posY);
	}

	@Override
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
