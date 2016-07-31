package fi.server; 
import javax.microedition.lcdui.Command; 
import javax.microedition.lcdui.Form; 
import javax.microedition.lcdui.StringItem; 
import javax.microedition.lcdui.TextField; 
public class ServerForm extends Form 
{ 
TextField tfPort = new TextField("Port","2000",10,TextField.NUMERIC); StringItem siMessage = new StringItem("Message",""); 
Command cmdStart = new Command("Start",Command.SCREEN,1); public ServerForm(String title) { 
super(title); 
// TODO Auto-generated constructor stub 
append(tfPort); 
append(siMessage); 

addCommand(cmdStart); 
setCommandListener(new	CommandHandler());
}
} 
