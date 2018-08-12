package stg;

import java.awt.Color;
import java.awt.Graphics;

public class TestStage extends Stage {

	public TestStage(int x, int y) {
		super(x, y);
	}

	@Override
	protected void generateGrid() {
		
	}

	 public void showQuartering(Graphics g) {
		 for(int i=0; i<sX; i++) {
			 for(int j=0; j<sY; j++) {
				 g.setColor(((i+j)%2==0)?Color.RED:Color.BLUE);
				 g.drawRect(64*i, 64*j, 64, 64);
			 }
		 }
	 }
	
}
