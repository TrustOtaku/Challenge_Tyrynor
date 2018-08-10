package stg;

public abstract class Stage {

	int sX, sY;
	short[][] tilesGrid;
	
	protected Stage(int x,int y)
	{
		sX= x;
		sY= y;
		tilesGrid= new short[x][y];
	}
	
	protected abstract void generateGrid();
}
