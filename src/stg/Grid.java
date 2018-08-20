package stg;

public class Grid {
	
	private static Grid instance;//------- Singleton -------//
	
	private String[][] tiles;
	
	private Grid() {//TO DO: real constructor Grid(stage)
		tiles= new String[16][8];
	}
	
	public static Grid getInstance() {
		if(instance==null) {
			instance= new Grid();
		}
		return instance;
	}
	
	//------- SETTERS & GETTERS -------//
	public int getTilesX() {
		return tiles.length;
	}
	
	public int getTilesY() {
		return tiles[0].length;
	}
	
	
}
