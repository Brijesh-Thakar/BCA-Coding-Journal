import java.util.*;
class Area_ofRec
{
    public static void main(String args[])
    {
        int l;
        int b;
        int Area=0;

        Scanner L= new Scanner(System.in);
        Scanner B= new Scanner(System.in);
        
        System.out.print("Enter Length Of Rectangle:");
        l = L.nextInt();

        System.out.print("Enter Breadth Of Rectangle:");
        b = B.nextInt();
        
        Area=l*b;
        System.out.println("Length:"+l);
        System.out.println("Breadth:"+b);
        System.out.println("Area Of Rectangle :"+Area);
    }
}