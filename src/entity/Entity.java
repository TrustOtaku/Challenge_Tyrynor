package entity;

import java.awt.Graphics;

public abstract class Entity {

	protected int x, y;
	protected int distanceToPlayer;
	
	protected Entity(int posX, int posY) {
		x= posX;
		y= posY;
	}
	
	protected abstract void draw(Graphics g);//La position des Entitées doit etre centré par rapport au dessein, sauf exceptions
	
	protected abstract void setDistanceToPlayer();
}
