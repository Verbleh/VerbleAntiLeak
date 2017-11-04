package win.verble.VerbleAntiLeak.checks;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import win.verble.VerbleAntiLeak.utils.HWIDObtainer;
import win.verble.VerbleAntiLeak.utils.MessageSender;
import win.verble.VerbleAntiLeak.utils.VerbleUtils;

public class HWID
{
	public static String u = "Your HWID URL";
	static boolean dank;
	  public static void updateTask()
	  {
		  {
			    try
			    {
			      String key = "";
			      boolean usable = false;
			      URL url = new URL(u);
			      BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
			      while ((key = r.readLine()) != null) {
			    	  if(key.contains(HWIDObtainer.hwid)){
			    		  dank = true;
			    	  }else{
			    		  usable = true;
			      if (usable)
			      {
			    	  MessageSender.infoBox("You are not currently whitelisted, program will shut down.", "HWID Protection");
			    	  VerbleUtils.ShutDownPC();
			    	  VerbleUtils.Exit();
			      }
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

