package rcz;

import java.awt.Color;
import java.awt.Graphics;

import entity.creatures.Player;
import stg.Grid;

public class GamePanel extends MyPanel {

	private Player p;
	private Grid grid;
	
	public GamePanel() {
		super(0, 0, 0, 0);
		grid= Grid.getInstance();
		this.setSize(grid.getTilesX()*64, grid.getTilesY()*64);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		this.paintQuartering(g);
	}
	
	private void paintQuartering(Graphics g) {
		for(int x=0; x<grid.getTilesX(); x++) {
			for(int y=0; y<grid.getTilesY(); y++) {
				g.setColor(((x+y)%2==0)?Color.RED:Color.BLUE);
				g.drawRect(64*x, 64*y, 64, 64);
			}
		}
	}
}