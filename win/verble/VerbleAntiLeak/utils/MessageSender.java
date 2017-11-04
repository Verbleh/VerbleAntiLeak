package win.verble.VerbleAntiLeak.utils;
import javax.swing.JOptionPane;

public class MessageSender
{

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "VerbleAntiLeak: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}