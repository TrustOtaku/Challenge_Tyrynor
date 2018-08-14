package rcz;

import java.awt.Graphics;

import entity.creatures.Player;
import stg.*;

public class GamePanel extends MyPanel {

	private int tX, tY;
	private Stage stg;
	private Player p;
	
	protected GamePanel(int tilesX, int tilesY) {
		super(0, 0, 64*tilesX, 64*tilesY);
		tX= tilesX;
		tY= tilesY;
		Stage stg= new TestStage(tX, tY);
	}
	
	public void paintComponent(Graphics g) {
		stg.showQuartering(g);
	}

}