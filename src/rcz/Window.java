package rcz;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fix.Fix;

public class Window extends JFrame{
	
	public Window() {
		super(Fix.WINDOW_NAME);
		this.setSize(Fix.WINDOW_SIZE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
	}
}
