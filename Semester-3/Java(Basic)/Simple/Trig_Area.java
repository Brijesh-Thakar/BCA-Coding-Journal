class triangle
{
    double Base,Height;

    triangle()
    {
        Base=12;
        Height=20;
    }

    triangle(double B , double H)
    {
        Base=B;
        Height=H;
    }

    void Calc_Area()
    {
        double Area_;
        Area_= 0.5*Base*Height;
        System.out.println("Area Of Triangle With Base:" +Base +" " +"and Height:" +Height +" " +"is:"+Area_ );
    }
}

class Trig_Area
{
    public static void main(String args[])
    {
       triangle t1= new triangle();
       t1.Calc_Area();
       
       
       triangle t2= new triangle(12,20);
       t2.Calc_Area();
    }
}