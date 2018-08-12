package stg;

import java.awt.Graphics;

public abstract class Stage {

	protected int sX, sY;
	protected short[][] tilesGrid;
	
	protected Stage(int x,int y)
	{
		sX= x;
		sY= y;
		tilesGrid= new short[x][y];
	}
	
	protected abstract void generateGrid();
	
	public abstract void showQuartering(Graphics g);
}
