import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextBox;

import com.nokia.mid.ui.FullCanvas;


public class MyCanvas extends FullCanvas {
	
	TextBox editor;
	
	public MyCanvas(TextBox editor) {
		this.editor = editor;
	}

	protected void paint(Graphics g) {
		g.setColor(255, 0, 0);
		g.fillRect(0, 0, 20, 20);
	}

}
