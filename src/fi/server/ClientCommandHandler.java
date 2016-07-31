package fi.server; 

import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
 






import javax.microedition.io.Connector; 
import javax.microedition.io.SocketConnection; 
import javax.microedition.lcdui.Command; 
import javax.microedition.lcdui.CommandListener; 
import javax.microedition.lcdui.Displayable; 


public class ClientCommandHandler implements CommandListener { 


ClientMIDlet midlet; 

public ClientCommandHandler(ClientMIDlet midlet) { 
	super(); 
this.midlet = midlet;
}


public void commandAction(Command c, Displayable d) {
// TODO Auto-generated method stub


new Thread(new ClientThread(midlet));
}


} 
