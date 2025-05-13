class University
{
 void Showuni()
 {
   System.out.println("Uni_Nme");
 }
}

class Department extends University
{
 void ShowDept()
 {
   System.out.println("Dept_Nme");
 }
}

class Stream extends Department
{
 void ShowStrm()
 {
   System.out.println("Strm_Nme");
 }
}

class MultInh
{
	public static void main(String args[])
	{
		Stream S1 = new Stream();
		S1.Showuni();
		S1.ShowDept();
		S1.ShowStrm();
	}	
}