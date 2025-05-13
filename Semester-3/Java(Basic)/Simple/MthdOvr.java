class calc 
{
    int add(int a ,int b)
    {
        return(a+b);
    }
    int add(int a ,int b, int d)
    {
        return(a+b+d);
    }
    
}

class MthdOvr
{
   public static void main(String args[])
   {
     calc C1 = new calc();
     System.out.println("Addition Of Two Variables Is:"+C1.add(12,20));
     System.out.println("Addition Of Three Variables Is:"+C1.add(12,20,12));
   }
}