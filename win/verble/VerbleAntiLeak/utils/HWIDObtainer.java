package win.verble.VerbleAntiLeak.utils;


public class HWIDObtainer
{
    static String processor_identifier = "PROCESSOR_IDENTIFIER";
    static String computername = "COMPUTERNAME";
    static String user = "user";
    static String name = "name";

    public static final String hwid = getMD5((System.getenv(processor_identifier) + System.getenv(computername) + System.getProperty(user + "." + name)).trim());
    private static String getMD5(final String input) {
        //Get your own MD5 thingy
    	return input;
    }
}

