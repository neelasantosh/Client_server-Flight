package fi.server; 

import javax.microedition.lcdui.Command; 
import javax.microedition.lcdui.Display; 
import javax.microedition.lcdui.TextBox; 
import javax.microedition.lcdui.TextField; 
import javax.microedition.midlet.MIDlet; 
import javax.microedition.midlet.MIDletStateChangeException; 


public class ClientMIDlet extends MIDlet 
{ 
TextBox tbServer = new 
TextBox("IP:Port","192.168.76.54:2000",40,TextField.ANY); 
Command cmdConnect = new Command("Connect",Command.SCREEN,1); public ClientMIDlet() { 
 



// TODO Auto-generated constructor stub 
tbServer.addCommand(cmdConnect); 


} 


protected void destroyApp(boolean unconditional) 
throws MIDletStateChangeException { // TODO Auto-generated method stub 


} 


protected void pauseApp() { 
// TODO Auto-generated method stub 


} 

protected void startApp() throws MIDletStateChangeException { 
	// TODO Auto-generated method stub 
Display display = Display.getDisplay(this); 
tbServer.setCommandListener(new ClientCommandHandler(this)); display.setCurrent(tbServer); 


} 


} 
