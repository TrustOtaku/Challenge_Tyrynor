package launcher;

import rcz.Window;

public class Launcher {

	public static void main(String[] args) {
		Window fenetre= Window.getInstance();
		fenetre.loop();
		fenetre.exit();
		System.exit(0);
	}
}
