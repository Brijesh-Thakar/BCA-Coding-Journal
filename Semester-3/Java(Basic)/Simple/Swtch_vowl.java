import java.util.*;
class Swtch_vowl
{
	public static void main(String args[])
	{
		char vowl;
		Scanner VW = new Scanner(System.in);
		System.out.print("Enter An Vowel:");
	    vowl = VW.next().charAt(0);
		
		 switch (vowl) 
		 {
			case 'a' || 'A':
			case 'e' || 'E':
			case 'i' || 'I':
			case 'o' || 'O':
			case 'u' || 'U':
				System.out.println("Entered Character is vowel.");
            break;
			
			default:
				System.out.println("Entered Charcter is not an Vowel.");
		 }	
	}
}
/*
Create A Class Named MmrkSg=heet With input student rollno name 
5 subs mrks
After that find the avg and print msg as given below

if(avg>70)
{
	distinction
}
	if(>=60)
	{	
	 first class
	}
	if(>=50)
	{	
	 second class
	}
	if(>=40)
	{	
	 pass
	}
	else Fail */