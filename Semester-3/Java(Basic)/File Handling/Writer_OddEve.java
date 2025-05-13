import java.io.*;
class Writer_OddEve
{
    public static void main(String args[])
    {
        try
        {
         int i;
         FileWriter Odd = new FileWriter("ODD_Num.txt");
         FileWriter Eve = new FileWriter("EVE_Num.txt");
         for(i=2;i<=25;i++)
         {
            if(i%2==0)
            {
                Eve.write(i + " ");                
            }
            else
            {
                Odd.write(i +" ");
            }
         }
         Eve.close();
         Odd.close();
         System.out.println("File Created SucessFully ^_^");
        }

        catch(Exception e)
        {
            System.out.println("Error Found:"+e);
        }
    }
}