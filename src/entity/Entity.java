package entity;

import java.awt.Graphics;

public abstract class Entity {

	protected int x, y;
	
	protected abstract void draw(Graphics g);
}
