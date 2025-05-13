import java.io.*;
class OptStr
{
    public static void main(String args [])
    {
        try
        {
            FileOutputStream Optst =new FileOutputStream("OptStr.txt");
            String A ="Hii!!!";
            byte D[] = A.getBytes();

            Optst.write(D);
            Optst.close();
            System.out.println("File Copied Via Output Stream Method !!!");
        }
        catch(Exception E)
        {
            System.out.println("Error Fount:"+E);
        }
    }
}