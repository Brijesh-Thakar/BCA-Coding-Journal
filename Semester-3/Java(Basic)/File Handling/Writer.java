import java.io.*;
class Writer
{
    public static void main(String args[])
    {
        try
        {
         FileWriter f1 = new FileWriter("File_Wrtr.txt");
         f1.write("Welcome to This File !!!");
         f1.close();
         System.out.println("File Created SucessFully ^_^");
        }

        catch(Exception e)
        {
            System.out.println("Error Found:"+e);
        }
    }
}