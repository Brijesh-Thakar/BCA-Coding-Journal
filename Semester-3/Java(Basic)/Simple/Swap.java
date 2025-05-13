import java.util.*;

class Swap
{
	public static void main(String args[])
	{
		int var_1 , var_2;
		int temp;
		
		Scanner var =new Scanner(System.in);
		System.out.print("Enter Value For Var_1:");
		var_1 = var.nextInt();
		System.out.print("Enter Value For Var_2:");
		var_2 = var.nextInt();
	    
        System.out.println("Value Of A:"+var_1);
        System.out.println("Value Of B:"+var_2);
		
       /* temp=var_1;
		var_1=var_2;
		var_2=temp;  */
		
		var_1= var_1 + var_2;
		var_2= var_1 - var_2;
		var_1= var_1 - var_2;
		
        System.out.println("Value Of A(Swapped):"+var_1);
		System.out.println("Value Of B(Swapped):"+var_2);
	}	
}