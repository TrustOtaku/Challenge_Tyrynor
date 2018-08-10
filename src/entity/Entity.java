package entity;

import java.awt.Graphics;

public abstract class Entity {

	short x, y;
	
	protected abstract void draw(Graphics g);
}
