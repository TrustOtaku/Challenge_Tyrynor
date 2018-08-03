package fix;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Font;

public class Fix {
	public static final String WINDOW_NAME= "The Drah-Nok Invasion";
	public static final Dimension WINDOW_SIZE= Toolkit.getDefaultToolkit().getScreenSize();
	
	public static final int TARGETED_FPS= 60;

	public static final Font TITLE_FONT= new Font("TimesRoman", Font.ITALIC,16);
	public static final Font DEFAULT_FONT= new Font("Dialog", Font.PLAIN,12);
}
