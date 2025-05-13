import java.applet.*;
import java.awt.*;
/*<applet code="fonts" width=600 height=600> </applet>*/
public class fonts extends Applet
{
    public void paint(Graphics G)
    {
        Font a = new Font("Comic Sans MS",Font.ITALIC,20);
        G.setFont(a);
        setBackground(Color.pink);
        setForeground(Color.black);
        G.drawString("Hii !!",275,212);
    }
}