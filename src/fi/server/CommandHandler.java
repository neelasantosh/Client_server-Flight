package fi.server; 


import javax.microedition.lcdui.Command; 
import javax.microedition.lcdui.CommandListener; import javax.microedition.lcdui.Displayable; 


public class CommandHandler implements CommandListener { 

public void commandAction(Command c, Displayable d) 
{ 
ServerThread target = new ServerThread(); Thread objThread = new Thread(target); objThread.start(); 


} 
 





} 
