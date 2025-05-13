import java.util.*;
class Atm
{
  public static void main(String args[])
   {
	 System.out.print("Enter Amount to Withdraw:");
	 Scanner Am = new Scanner(System.in);
	 int Amt= Am.nextInt();
		int five= Amt/500;
		System.out.println("Notes Of Rupees 500 Requied for genarating Amount:"+Amt +" Is:"+five);
		Amt=Amt%500;
		System.out.println("Remaining Amount:"+Amt);
		int two= Amt/200;
		System.out.println("Notes Of Rupees 200 Requied for genarating Amount:"+Amt +" Is:"+two);
		Amt=Amt%200;
		System.out.println("Remaining Amount:"+Amt);
		int one=Amt/100;
		System.out.println("Notes Of Rupees 100 Requied for genarating Amount:"+Amt +" Is:"+one);
		Amt=Amt%100;
		System.out.println("Remaining Amount:"+Amt);
		int Fify=Amt/50;
		System.out.println("Notes Of Rupees 50 Requied for genarating Amount:"+Amt +" Is:"+Fify);
		Amt=Amt%50;
		System.out.println("Remaining Amount:"+Amt);
		int Tweny=Amt/20;
		System.out.println("Notes Of Rupees 20 Requied for genarating Amount:"+Amt +" Is:"+Tweny);
		Amt=Amt%20;
		int Ten=Amt/10;
		System.out.println("Notes Of Rupees 10 Requied for genarating Amount:"+Amt +" Is:"+Ten);
		Amt=Amt%10;
		System.out.println("Remaining Amount:"+Amt);
    }
 }