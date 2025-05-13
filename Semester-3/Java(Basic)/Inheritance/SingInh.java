class Uni
{
    void Show_Uni()
   {
    System.out.println("UNI_NME");
   }
}

class Dept extends Uni
{  
    void Show_Dept()
    {
        System.out.println("IT");
    }    
}

class SingInh
{
    public static void main(String args[])
    {
        Dept D1=new Dept();
        D1.Show_Uni();
        D1.Show_Dept();
    }
}