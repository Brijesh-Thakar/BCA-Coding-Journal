class try_cth
{
    public static void main(String args[])
    {
        int D[]={12,20,32};
        int B;

        try
        {
            B = D[12]/0;
            System.out.println("Value of B:"+B);
        }

        catch(Exception e)
        {
            System.out.println("Exception Found:"+e);
        }
    }
}