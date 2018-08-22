package entity.creatures;

import java.awt.Color;
import java.awt.Graphics;

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
		g.fillOval(x, y, 64, 64);
	}

	@Override
	protected void move() {
		int mX, mY;
		if(moveX*moveY==0)
			this.setPos(dX+(speed*moveX), dY+(speed*moveY));
		else
			this.setPos(dX+(speed*moveX*Math.sqrt(2)/2), dY+(speed*moveY*Math.sqrt(2)/2));
	}
	
	//------- SETTERS & GETTERS -------//
	public void setPos(double posX, double posY) {
		dX= posX;
		dY= posY;
		x= (int)dX;
		y= (int)dY;
	}
	
	public void setMoveX(int dir) {
		if(dir==-1 || dir==0 || dir==1)
			moveX= dir;
	}

	public void setMoveY(int dir) {
		if(dir==-1 || dir==0 || dir==1)
			moveY= dir;
	}
}
