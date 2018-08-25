package entity;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Projectile extends Entity {

	private static ArrayList<Projectile> projectileStock= new ArrayList(0);
	
	private int radius, speed;
	private double moveX, moveY;
	
	public Projectile(int posX, int posY, double mX, double mY, int spd, int rad) {
		super(posX, posY);
		moveX= mX;
		moveY= mY;
		speed= spd;
		radius= rad;
		
		projectileStock.add(this);
	}
	
	private void move() {
		x+= moveX*speed;
		y+= moveY*speed;
	}

	@Override
	public void draw(Graphics g) {
		this.move();
		g.setColor(Color.CYAN);
		g.fillOval((int)x-radius, (int)y-radius, 2*radius, 2*radius);
	}

	@Override
	protected void setDistanceToPlayer() {
		// TODO Auto-generated method stub

	}

	public static ArrayList<Projectile> getProjectileStock() {
		return projectileStock;
	}
}
