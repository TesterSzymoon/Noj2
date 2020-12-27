/*
 * Noj2
 * © 2020 by osminee (Thomas Juzerski)
 * I don't want to provide my real name now, maybe later
 * If you want to contact me, here are some ways to do it:
 * - e-mail: tomek.juzerski@gmail.com
 * - Discord: sszymoon#7106
 * - Twitter: osminee
 * This project is MIT License
 * Made with Eclipse 
 */

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import com.nokia.mid.ui.*;
import MyCanvas;


public class Start extends MIDlet implements CommandListener {

	Command run = new Command("Run code", Command.SCREEN, 1);
	TextBox editor = new TextBox("Code editor", "", 65535, 0x0);
	FullCanvas canvas = new MyCanvas(editor);

	public Start() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean uncond) throws MIDletStateChangeException {
		notifyDestroyed();

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {
		// TODO Auto-generated method stub
		editor.setCommandListener(this);
		editor.addCommand(run);
		Display.getDisplay(this).setCurrent(editor);
	}

	public void commandAction(Command c, Displayable d) {
		if (c == run) {
			Display.getDisplay(this).setCurrent(canvas);
		}
	}
}
