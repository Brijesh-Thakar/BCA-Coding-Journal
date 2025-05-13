class Uni
{
    Uni()
    {
        System.out.println("Uni_Nme");
    }
}

class Dept extends Uni
{
    Dept()
    {
        System.out.print("C.S & I.T");
    }
}

class ConstructInh
{
    public static void main(String args[]) 
    {
        Dept D1 =new Dept();
    }
}