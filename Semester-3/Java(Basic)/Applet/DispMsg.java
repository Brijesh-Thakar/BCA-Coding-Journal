import java.applet.*;
import java.awt.*;
/*<applet code="DispMsg" width=600 height=600> </applet>*/
public class DispMsg extends Applet
{
    public void paint(Graphics G)
    {
        setBackground(Color.pink);
        setForeground(Color.black);
        G.drawString("Hii !!",65,75);
    }
}