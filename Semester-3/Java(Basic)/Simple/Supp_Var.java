class A
{
  int D=12;    
}

class B extends A
{
  int D=20;
  void Show()
  {
    System.out.println("Value Of Base Class Variable D(Super):" +super.D);
    System.out.println("Value Of Derived Class D:" +D);
  }
}
class Supp_Var
{
    public static void main(String args[])
    {
        B Obj = new B();
        Obj.Show();
    }
}