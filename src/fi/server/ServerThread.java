package fi.server; 

import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.util.Date; 

import javax.microedition.io.Connector; 
import javax.microedition.io.ServerSocketConnection; import javax.microedition.io.SocketConnection; 

public class ServerThread implements Runnable { 

public void run() 
{ 
String portNo = ServerMIDlet.midlet.mainForm.tfPort.getString(); 

ServerSocketConnection serverSocket = null; 
try { 
serverSocket = 
(ServerSocketConnection)Connector.open("socket://:" + portNo,Connector.READ_WRITE); 
SocketConnection client = 
(SocketConnection)serverSocket.acceptAndOpen(); 

//CustomAlert.showAlert(ServerMIDlet.midlet, ServerMIDlet.midlet.mainForm,"Client Connected"); 

DataOutputStream dos = client.openDataOutputStream(); 

dos.writeUTF("Welcome to the Server, current time is " + new
Date());
dos.flush(); 
DataInputStream dis = client.openDataInputStream(); String msg = dis.readUTF(); 
CustomAlert.showAlert(ServerMIDlet.midlet, 
ServerMIDlet.midlet.mainForm, msg); 


} catch (IOException e) { 
// TODO Auto-generated catch block 
e.printStackTrace(); 
 





}
}
} 
