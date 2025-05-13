import java.applet.*;
import java.awt.*;

/*<applet code="Lbl" width=5000 height=300></applet>*/

public class Lbl extends Applet
{
    public void init ()
    {
        Label L1 = new Label("User Name:");
        Label L2 = new Label("Enter Password:");
        add(L1);
        add(L2);
    }
}