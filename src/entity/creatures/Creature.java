package entity.creatures;

import java.awt.Graphics;

import entity.Entity;

public abstract class Creature extends Entity {

	int life;
	
	@Override
	protected abstract void draw(Graphics g);
	
	protected abstract void move(int mX, int mY);

}
