import java.util.*;
class Scnnr
{
    public static void main(String args[])
    {
        int Roll_no;
        String name;
        float Per;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No.:");
        Roll_no = sc.nextInt();
        
        
        System.out.print("Enter Name:");
        name = sc.next();

        
        System.out.print("Enter Percentage:");
        Per = sc.nextFloat();

        
        System.out.println("Roll_No:"+Roll_no);

        System.out.println("Name:"+name);

        System.out.println("Percentage:"+Per);
    }
}

//Wap to find out total Area Of A rectangle