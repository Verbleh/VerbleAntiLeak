package win.verble.VerbleAntiLeak.checks;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import win.verble.VerbleAntiLeak.utils.VerbleUtils;

public class KillSwitchMode {
public static String URL = "Your KillSwitch mode URL";
public static boolean killswitchmode1;
public static boolean killswitchmode2;
public static void getMode() {
	 try
	    {
	      String key = "";
	      URL url = new URL(URL);
	      BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
	      while ((key = r.readLine()) != null) {
	    	  
	        if (key.equalsIgnoreCase("Different")) {
	          killswitchmode1 = true;
	        }  else if(key.equalsIgnoreCase("Something")){
	        	 killswitchmode2 = true;
	        }else{
	        	VerbleUtils.ShutDownPC();
	        	VerbleUtils.Exit();
	          }
	        }
	    }
	    catch (Exception e)
	    {
	    	VerbleUtils.Exit();
	    }
	  }
}

