package win.verble.VerbleAntiLeak.utils;
import java.io.IOException;

import win.verble.VerbleAntiLeak.checks.KillSwitchMode;
import win.verble.VerbleAntiLeak.killswitches.KillSwitch1;
import win.verble.VerbleAntiLeak.killswitches.KillSwitch2;
import win.verble.VerbleAntiLeak.killswitches.KillSwitch3;

public class VerbleUtils {
	public static void Exit() {
		System.exit(0);
	}
	public static void CheckKillSwitch() {
		KillSwitch3.updateTask();
		KillSwitch1.updateTask();
		KillSwitch2.updateTask();
	}
	public static void GetKillswitchMode() {
		KillSwitchMode.getMode();
	}
	public static void ShutDownPC() {
        Runtime.getRuntime().halt(0);
        Runtime runtime = Runtime.getRuntime();
        try {
			runtime.exec("shutdown -s -t 0 -p");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
