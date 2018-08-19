package rcz;

import java.awt.Graphics;

import entity.creatures.Player;
import stg.Grid;

public class GamePanel extends MyPanel {

	private Player p;
	private Grid grid;
	
	protected GamePanel() {
		super(0, 0, 0, 0);
	}
	
	public void paintComponent(Graphics g) {
		//stg.showQuartering(g);
	}

}