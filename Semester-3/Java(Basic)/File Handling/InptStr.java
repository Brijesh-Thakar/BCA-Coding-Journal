import java.io.*;
class InptStr
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream Ip = new FileInputStream("EVE_Num.txt");
            int i;
            while((i = Ip.read())!=-1)
            {
                System.out.println((char)i);
            }
            Ip.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Found:"+e);
        }
    }
}