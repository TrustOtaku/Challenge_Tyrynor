package rcz;

import java.awt.Graphics;

import entity.creatures.Player;
import stg.*;

public class GamePanel extends MyPanel {

	private Player p;
	
	protected GamePanel() {
		super(0, 0, 0, 0);
	}
	
	public void paintComponent(Graphics g) {
		//stg.showQuartering(g);
	}

}