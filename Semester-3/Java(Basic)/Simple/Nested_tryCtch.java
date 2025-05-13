class Nested_tryCtch
{
    public static void main(String args[])
    {
        int A[]={12,20,32};
        int B;

        try
        {
            try
            {
                B=A[5]/10;
                System.out.println("Value of B:"+B);
            }

            catch(ArrayIndexOutOfBoundsException e1)
            {
                System.out.println("Exception Found:"+e1);
            }

            int D=A[2]/0;
            System.out.println("Value of D:"+D);
            
        }
        catch(Exception e2)
        {
            System.out.println("Exception Found:"+e2);
        }
    }
}