class Thrws_keywrd
{
    void Exp() throws Exception
    {
        System.out.println("Thrown An Exception By This Method!!!");
    }
}
class Thrws
{
    public static void main(String args[])
    {
        Thrws_keywrd T1 = new Thrws_keywrd();

        try
        {
            T1.Exp();
        }

        catch(Exception e)
        {
        }
    }
}