package entity.creatures;

import java.awt.Graphics;

import entity.Entity;

public abstract class Creature extends Entity {
	
	protected double dX, dY;
	protected int moveX, moveY, speed;
	
 	protected Creature(int posX, int posY) {
		super(posX, posY);
	}

	private int life;
	
	@Override
	protected abstract void draw(Graphics g);
	
	protected abstract void move();
	
	public abstract void setPos(double posX, double posY);////////////////////////////////////////

}
