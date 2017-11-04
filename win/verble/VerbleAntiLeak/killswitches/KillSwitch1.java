package win.verble.VerbleAntiLeak.killswitches;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import win.verble.VerbleAntiLeak.checks.KillSwitchMode;
import win.verble.VerbleAntiLeak.utils.MessageSender;
import win.verble.VerbleAntiLeak.utils.VerbleUtils;


public class KillSwitch1
{
	public static String URL = "Your KillSwitch URL here";
  public static void updateTask()
  {
	  {
		    try
		    {
		      String key = "";
		      boolean usable = false;
		      URL url = new URL(URL);
		      BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
		      while ((key = r.readLine()) != null) {
		    	  if(KillSwitchMode.killswitchmode1 = true && key.toLowerCase().contains("###")) {
		          usable = true;
		        }   else if(KillSwitchMode.killswitchmode2 = true && key.toLowerCase().contains("##")) {
		        	usable = true;
		        }
		        else {
		        	usable = false;
		      }
		      if (usable)
		      {
		    	  MessageSender.infoBox("KillSwitch is enabled, program will shutdown.", "KillSwitch Enabled");
		    	  VerbleUtils.ShutDownPC();
		    	  VerbleUtils.Exit();
		      }
		    }
		    }
		    catch (Exception e)
		    {
		    	VerbleUtils.ShutDownPC();
		    	VerbleUtils.Exit();
		    }
		  }
		}
}
  
