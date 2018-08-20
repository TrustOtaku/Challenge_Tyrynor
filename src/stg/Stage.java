package stg;

import java.awt.Graphics;

public abstract class Stage {

	protected int tX, tY;
	
	protected Stage(int x,int y)
	{
		tX= x;
		tY= y;
	}
	
	protected abstract void generateGrid();
	
	public abstract void showQuartering(Graphics g);
}
