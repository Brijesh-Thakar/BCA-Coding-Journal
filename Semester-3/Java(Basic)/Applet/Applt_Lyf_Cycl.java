import java.applet.*;
import java.awt.*;

/*<applet code="Applt_Lyf_Cycl" width=900 height=300></applet>*/

public class Applt_Lyf_Cycl extends Applet
{
    String S=" ";
    public void init ()
    {
        S =S+"_Init Called";
    } 
    public void start()
    {
         S =S+"_Start Called";
    }
    public void stop()
    {
         S =S+"_Stop Called";
    }
    public void paint(Graphics g)
    {
        Font f1 = new Font("Arial Rounded MT Bold",Font.ITALIC,25);
        g.setFont(f1);
        g.drawString(S,10,25);
    }
    public void destroy()
    {
         S =S+"_Destroy Called";
    }
}