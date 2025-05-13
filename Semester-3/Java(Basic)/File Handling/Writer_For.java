import java.io.*;
class Writer_For
{
    public static void main(String args[])
    {
        try
        {
         int i;
         FileWriter f1 = new FileWriter("For_Wrtr.txt");
         for(i=1;i<=10;i++)
         {
            f1.write(i + " ");
         }
         f1.close();
         System.out.println("File Created SucessFully ^_^");
        }

        catch(Exception e)
        {
            System.out.println("Error Found:"+e);
        }
    }
}