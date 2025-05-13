import java.applet.*;
import java.awt.*;

/*<applet code="Shapes" width=400 height=300></applet>*/

public class Shapes extends Applet
{
    public void paint (Graphics g)
    {
        g.drawRect(05,75,35,35);
        g.drawOval(50,55,45,65);
        g.drawRoundRect(100,75,45,35,20,20);
        g.drawArc(150,105,45,35,0,180);
        int x[]={150,155,100};
        int y[]={185,235,175};
        //g.drawPolygon(x,y,x.length);
        g.setColor(Color.pink);
        g.fillPolygon(x,y,x.length);
        g.fillRect(05,125,35,35);
        g.fillOval(50,125,45,65);
        g.fillRoundRect(100,125,45,35,20,20);
        g.fillArc(150,115,45,35,0,-180);       
    } 
}