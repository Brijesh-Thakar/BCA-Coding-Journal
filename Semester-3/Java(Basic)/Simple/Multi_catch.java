class Multi_catch
{
    public static void main(String args[])
    {
        int B[]={12,20,32};
        int D;

        try
        {
            D = B[0]/1;
            System.out.println("Value Of A:"+D);
            int A = Integer.parseInt("AD");
        }

        catch(ArithmeticException e1)
        {
            System.out.println("Exception Found:"+e1);
        }

        catch(ArrayIndexOutOfBoundsException e2)
        {
            System.out.println("Exception Found:"+e2);
        }

        catch(Exception e)
        {
            System.out.println("Exception Found:"+e);
        }
    }
}