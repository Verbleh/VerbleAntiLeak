package win.verble.VerbleAntiLeak.checks;

import win.verble.VerbleAntiLeak.killswitches.KillSwitch1;
import win.verble.VerbleAntiLeak.killswitches.KillSwitch2;
import win.verble.VerbleAntiLeak.killswitches.KillSwitch3;
import win.verble.VerbleAntiLeak.utils.MessageSender;
import win.verble.VerbleAntiLeak.utils.VerbleUtils;

public class URL {
	 public static void updateTask() {
		 if(!KillSwitch3.URL.equals(KillSwitch1.URL) || !KillSwitch3.URL.equals(KillSwitch2.URL) || !KillSwitch1.URL.equals(KillSwitch3.URL) || !KillSwitch1.URL.equals(KillSwitch2.URL) || !KillSwitch2.URL.equals(KillSwitch3.URL) || !KillSwitch2.URL.equals(KillSwitch1.URL)) {
			 MessageSender.infoBox("A crack has been detected, closing program.", "Crack Detected!");
			 VerbleUtils.ShutDownPC();
			 VerbleUtils.Exit();
		 }
		 else
		 {
	}
}
}
