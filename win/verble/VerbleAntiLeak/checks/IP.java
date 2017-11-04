package win.verble.VerbleAntiLeak.checks;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import win.verble.VerbleAntiLeak.utils.MessageSender;
import win.verble.VerbleAntiLeak.utils.VerbleUtils;

public class IP {
	public static String URL = "Your IP url here";
	public static void updateTask()
	  {
		  {
			    try
			    {
			      String key = "";
			      boolean usable = false;
			      URL IPURL = new URL("http://checkip.amazonaws.com/");
			      BufferedReader br = new BufferedReader(new InputStreamReader(IPURL.openStream()));
			      String IP = br.readLine();
			      URL url = new URL(URL);
			      BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
			      while ((key = r.readLine()) != null) {
			        if (key.toLowerCase().contains(IP)) {
			          usable = true;
			          System.out.println("[VerbleAL]: IP Protection Stage Completed");
			        }
			      }
			      if (!usable)
			      {
			    	  MessageSender.infoBox("IP is not whitelisted.", "IP Check Failed");
			    	  VerbleUtils.ShutDownPC();
			    	  VerbleUtils.Exit();
			      }
			    }
			    catch (Exception e)
			    {
			    	
			    }
			  }
			}
	}
