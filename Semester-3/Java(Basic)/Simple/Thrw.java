class Thrw
{
    public static void main(String args[])
    {
        try
        {
            //throw new ArithmeticException("Illegal Arithmetic Operation!!");
            throw new ArrayIndexOutOfBoundsException("Array Index Dosent Exist!!");
        }

        catch(Exception e)
        {
            System.out.println("Exception Found:"+e);
        }
    }
}