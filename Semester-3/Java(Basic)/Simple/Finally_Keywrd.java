class Finally_Keywrd
{
    public static void main(String args[])
    {
        int D[] ={12,20,32};
        int A;

        try
        {
            A =D[12]/2;
            System.out.println("Value Of A:"+A);
        }

        catch(Exception e)
        {
            System.out.println("Exception found:"+e);
        }

        finally
        {
            System.out.println("Finally block executed!!");
        }
    }
}