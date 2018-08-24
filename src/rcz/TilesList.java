package rcz;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public abstract class TilesList {

	private static HashMap<String, Image> tilesMap= null;
	
	private static void loadTiles() {
		tilesMap= new HashMap<String, Image>();
		File f= new File("C:/workspace/Eclipse/Challenge_Tyrynor_Git/src/rcz/tiles/");
		Image img;
		
		for(File file: f.listFiles()) {
			img= null;
			try {
				img= ImageIO.read(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			tilesMap.put(file.getName().substring(0, file.getName().length()-4), img);
		}
	}
	
	public static Image getImage(String tileName) {
		if(tilesMap==null) {
			loadTiles();
		}
		return tilesMap.get(tileName);
	}
	
}
