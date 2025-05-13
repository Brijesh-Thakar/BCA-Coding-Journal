class human 
{
	String Frst_nme="Oscar";
	String Lst_nme="Piastri";
	
	void Disp()
	{
	  System.out.println("First Name:" +Frst_nme);
	  System.out.println("Last Name:" +Lst_nme);
	}
}

class student extends human
{
	String Grade;
	
	student(String G,String Fn,String Ln)
	{
	  Frst_nme=Fn;
	  Lst_nme=Ln;
	  Grade=G;
	}
	
	void Disp()
	{
	  System.out.println("First Name:" +Frst_nme);
	  System.out.println("Last Name:" +Lst_nme);
	  System.out.println("Grade:"+ Grade);
	}
}

class Inherit
{
  public static void main(String args[])
  {
	human H1= new human();
	H1.Disp();
	
	student S1= new student("O","Charles","Leclerc");
	S1.Disp();	
  }
}