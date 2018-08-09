package rcz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Date;

import javax.swing.JPanel;

import fix.Fix;

public class InfoPanel extends MyPanel{
	
	int nbOfRedraw;
	int fps;
	long t0, t1;
	Window wd;
	
	/*
	public InfoPanel(Window w) {
		this.setSize(200, 50);
		this.setLocation(0, 0);
		wd=w;
		t0= new Date().getTime();
		fps=-1;
		nbOfRedraw=0;
		System.out.println("InfoPanel constructeur");
		this.repaint();
		System.out.println(t0);
	}*/
	
	protected InfoPanel(Window w) {
		super(w, 0, 0, 128, 64);
		t0= new Date().getTime();
		nbOfRedraw=0;
	}

	public void paintComponent(Graphics g) {
		t1= new Date().getTime();
		nbOfRedraw++;
		/*if(t1-t0>=1000) {
			fps=(int)(nbOfRedraw/(t1-t0));
			
			//nbOfRedraw=0;
		}*/
		g.setColor(Color.RED);
		//g.fillRect(0,0,50,50);
		
		g.setColor(Color.BLACK);
		g.drawString("dt: "+(t1-t0), 0, 10);
		g.drawString("t1: "+t1, 0, 20);
		
		
		
	}
	
}
