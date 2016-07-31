package fi.server; 
import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 

import javax.microedition.io.Connector; 
import javax.microedition.io.SocketConnection; 

public class ClientThread implements Runnable { 
	ClientMIDlet midlet; 
 





public ClientThread(ClientMIDlet midlet) { 
	super(); 
this.midlet = midlet;
}
public void run() { 
// TODO Auto-generated method stub 
try { 
SocketConnection connection = 
(SocketConnection)Connector.open("socket://" + 
midlet.tbServer.getString(),Connector.READ_WRITE); 
DataInputStream dis = connection.openDataInputStream(); 

String msg = dis.readUTF(); 
CustomAlert.showAlert(midlet, midlet.tbServer, msg); 
DataOutputStream dos = connection.openDataOutputStream(); 

dos.writeUTF("time received thank you"); 

dos.flush(); 
CustomAlert.showAlert(midlet, midlet.tbServer, "connected to servere");
} catch (IOException e) { 
// TODO Auto-generated catch block 
e.printStackTrace(); 
} 
} 

} 
