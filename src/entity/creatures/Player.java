package entity.creatures;

import java.awt.Color;
import java.awt.Graphics;

import entity.Projectile;

public final class Player extends Creature {

	private static Player instance;//------- Singleton -------//
	
	private Player(int posX, int posY) {
		super(posX, posY);
		speed= 5;
	}
	
	public static Player getInstance() {
		if(instance==null) {
			instance= new Player(0, 0);//TO DO: real var for Player(x, y)
		}
		return instance;
	}
	
	public void draw(Graphics g) {
		this.move();
		g.setColor(Color.BLACK);
		g.fillOval((int)x-32, (int)y-32, 64, 64);
	}

	@Override
	protected void move() {
		int mX, mY;
		if(moveX*moveY==0)
			this.setPos(x+(speed*moveX), y+(speed*moveY));
		else
			this.setPos(x+(speed*moveX*Math.sqrt(2)/2), y+(speed*moveY*Math.sqrt(2)/2));
	}
	
	public void attack(int mouseX, int mouseY) {
		//TO DO: Mana ?
		double mouseDistance= Math.sqrt((Math.pow((mouseX-x), 2)+Math.pow((mouseY-y), 2)));
		double dirX= (mouseX-x)/mouseDistance;
		double dirY= (mouseY-y)/mouseDistance;
		new Projectile((int)x, (int)y, dirX, dirY, 10, 16);
	}
	
	//------- SETTERS & GETTERS -------//
	public void setPos(double posX, double posY) {
		x= posX;
		y= posY;
	}
	
	public void setMoveX(int dir) {
		if(dir==-1 || dir==0 || dir==1)
			moveX= dir;
	}

	public void setMoveY(int dir) {
		if(dir==-1 || dir==0 || dir==1)
			moveY= dir;
	}
	
	protected void setDistanceToPlayer() {
	}
}
