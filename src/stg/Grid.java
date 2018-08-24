package stg;

import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import rcz.TilesList;
import rcz.panel.PrincipalPanel;

public class Grid {
	
	private static Grid instance;//------- Singleton -------//
	private static String stageName= "First";
	
	private String[][] tiles;
	
	private Grid() {//Constructeur devra etre "vide" a la fin du developpement, set d editeur de map
		tiles= new String[16][12];
		for(int x=0; x<tiles.length; x++) {
			for(int y=0; y<tiles[x].length; y++) {
				tiles[x][y]= (x+y>3&&x+y<7)?"cobble":"grass";
			}
		}
	}
	
	public static Grid getInstance() {
		if(instance==null) {
			instance= new Grid();
		}
		return instance;
	}
	
	private void loadStage() {
		ObjectInputStream ois= null;
		try {
			ois= new ObjectInputStream(new BufferedInputStream(new FileInputStream("C:/workspace/Eclipse/Challenge_Tyrynor_Git/src/stg/"+stageName+".png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			this.instance= (Grid)ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		try {
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//------- GRAPHICS -------//
	
	public void draw(Graphics g) {
		for(int x=0; x<tiles.length; x++) {
			for(int y=0; y<tiles[x].length; y++) {
				g.drawImage(TilesList.getImage(tiles[x][y]), 64*x, 64*y, PrincipalPanel.getInstance().getGamePanel());
			}
		}
	}
	
	//------- SETTERS & GETTERS -------//
	public int getTilesX() {
		return tiles.length;
	}
	
	public int getTilesY() {
		return tiles[0].length;
	}
	
	public void setStage(String stgName) {
		stageName= stgName;
		this.loadStage();
	}
}
