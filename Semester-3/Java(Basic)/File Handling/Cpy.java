import java.io.*;
class Cpy
{
    public static void main(String args [])
    {
        try
        {
            FileReader Fr = new FileReader("Writen.txt");
            FileWriter Fw = new FileWriter("Cpy.txt");

            int i;
            
            while((i=Fr.read()) != -1)
            {
                Fw.write(i);
            }
            System.out.println("File Copied !!");
            Fr.close();
            Fw.close();
        }

        catch(Exception E)
        {
            System.out.println("Error Fount:"+E);
        }
    }
}