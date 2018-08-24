package rcz.panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import entity.creatures.Player;
import rcz.TilesList;
import stg.Grid;

public class GamePanel extends MyPanel {
	
	private Grid grid;
	
	public GamePanel() {
		super(0, 0, 0, 0);
		grid= Grid.getInstance();
		this.setSize(grid.getTilesX()*64, grid.getTilesY()*64);
	}
	
	//------- GRAPHICS -------//
	public void paintComponent(Graphics g) {
		//DEV-TEST: Fond en rouge pour verifier "pixels manquants"
		g.setColor(Color.RED);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		grid.draw(g);
		this.paintQuartering(g);
		
		/*g.setColor(Color.GREEN); // DEV-TEST
		this.fRect(g, 0, 0, 64, 64);*/
		Player.getInstance().draw(g);
	}
	
	private void paintQuartering(Graphics g) {
		for(int x=0; x<grid.getTilesX(); x++) {
			for(int y=0; y<grid.getTilesY(); y++) {
				g.setColor(((x+y)%2==0)?Color.BLUE:Color.BLUE);
				g.drawRect(64*x, 64*y, 64, 64);
			}
		}
	}
	
	//------- DEV-TEST -------//
	private void fRect(Graphics g, int x, int y, int w, int h) {
		for(int i=x; i<x+w; i++) {
			for(int j=y; j<y+h; j++) {
				g.drawRect(i, j, 1, 1);
			}
		}
	}
}