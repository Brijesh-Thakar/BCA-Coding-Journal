class Stat
{
  static int Sqrt(int d)
  {
	  return(d*d);
  }
  
  static int Cube(int d)
  {
	  return(d*d*d);
  }
}

class StatMthd
{
	public static void main(String args[])
    {
		Stat S1 = new Stat();
		System.out.println("Square Root Of[12]Is:"+S1.Sqrt(12));
		System.out.println("Cube Root Of[12]Is:"+S1.Cube(12));
	}		
}	