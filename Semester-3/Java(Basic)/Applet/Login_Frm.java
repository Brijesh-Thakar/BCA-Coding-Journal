import java.applet.*;
import java.awt.*;

/*<applet code="Login_Frm" width=450 height=300></applet>*/

public class Login_Frm extends Applet
{
    public void init ()
    {
        Label L1 = new Label("User Name:");
        TextField T1 = new TextField(15);
        add(L1);
        add(T1);
        Label L2 = new Label("Enter Password:");
        add(L2);
        TextField T2 = new TextField(10);
        T2.setEchoChar('*');
        add(T2);
        Checkbox C1 = new Checkbox("C++");
        Checkbox C2 = new Checkbox("Java");
        Checkbox C3 = new Checkbox("PHP");
        add(C1);
        add(C2);
        add(C3);
        CheckboxGroup CG = new CheckboxGroup();
        Checkbox G1 = new Checkbox("Male",CG,false);
        Checkbox G2 = new Checkbox("Female",CG,false);
        Choice Ch1 = new Choice();
        Ch1.add("Bca");
        Ch1.add("Bsc.It");
        Ch1.add("Civil_eng");
        Ch1.add("Bba");
        add(Ch1);
        add(G1);
        add(G2);
        TextArea TA1 = new TextArea(4,15);
        add(TA1);
        Button B1 = new Button("Login");
        add(B1);
    } 
}