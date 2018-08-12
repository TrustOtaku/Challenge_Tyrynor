package entity;

import java.awt.Graphics;

public abstract class Entity {

	protected int x, y;
	
	protected Entity(int posX, int posY) {
		x= posX;
		y= posY;
	}
	
	protected abstract void draw(Graphics g);
}
