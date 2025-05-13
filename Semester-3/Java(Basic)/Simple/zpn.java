import java.util.*;
class zpn
{
	 public static void main(String args[])
	 {
		 int var_1;
		 Scanner Inpt= new Scanner(System.in);
         
		 System.out.print("Enter a value:");
		 var_1 = Inpt.nextInt();
		 
		 if(var_1<0)
		 {
			 System.out.println("Entered Number:" +var_1 + " " +"is negative");
		 }
		 
		 	 else if(var_1>0)
		 {
			 System.out.println("Entered Number:" +var_1 + " " +"is Positive");
		 }
		 
		 	 else
		 {
			 System.out.println("Entered Number:" +var_1 + " " +"is Zero");
		 }
	 }
}