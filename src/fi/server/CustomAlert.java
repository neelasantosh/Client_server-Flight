package fi.server; 

import javax.microedition.lcdui.Alert; 
import javax.microedition.lcdui.AlertType; 
import javax.microedition.lcdui.Display; 
import javax.microedition.lcdui.Displayable; 
import javax.microedition.midlet.MIDlet; 

public class CustomAlert { 

public static void showAlert(MIDlet midlet, Displayable	form, String
message)
{ 
Alert alert = new Alert("Alert",message,null,AlertType.INFO); alert.setTimeout(Alert.FOREVER); 
Display display = Display.getDisplay(midlet); display.setCurrent(alert, form); 
} 
} 
