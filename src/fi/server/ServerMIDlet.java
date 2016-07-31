package fi.server; 


import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;


public class ServerMIDlet extends MIDlet 
{ 
static ServerMIDlet midlet; 
ServerForm mainForm = new ServerForm("Server"); 


public ServerMIDlet() { 
// TODO Auto-generated constructor stub
}


protected void destroyApp(boolean unconditional) 
throws MIDletStateChangeException { // TODO Auto-generated method stub 


} 


protected void pauseApp() { 
// TODO Auto-generated method stub 


} 

protected void startApp() throws MIDletStateChangeException { 
	// TODO Auto-generated method stub 
midlet=this; 
Display display = Display.getDisplay(this); display.setCurrent(mainForm); 
} 
} 

