package fix;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Graphics;

public class Fix {
	public static final String WINDOW_NAME= "The Drah-Nok Invasion";
	public static final Dimension WINDOW_SIZE= Toolkit.getDefaultToolkit().getScreenSize();
	
	public static final int TARGETED_FPS= 60;

	public static final Font TITLE_FONT= new Font("TimesRoman", Font.BOLD+Font.ITALIC,64);
	public static final Font DEFAULT_FONT= new Font("Dialog", Font.PLAIN,32);
	
	public static final String MAIN_MENU_TITLE= "Menu";
	public static final String[] MAIN_MENU_CHOICES= {"Play", "Options", "Exit"};
}
