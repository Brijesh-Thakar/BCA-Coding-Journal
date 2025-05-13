import java.util.*;
class Swtch_case
{
    public static void main(String args[])
    {
        int var_1;
        int var_2;
       char Opr;

       Scanner Var= new Scanner(System.in);

       Scanner Op= new Scanner(System.in);

       System.out.print("Enter Value For Variable_1:");
       var_1 = Var.nextInt();

       System.out.print("Enter Value For Variable_2:");
       var_2 = Var.nextInt();

       System.out.print("Enter an mathamatical operator to perform operation:");
       Opr = Op.next().charAt(0);

       switch (Opr) {
        case '+':
            System.out.println("Additon of given variables:"+(var_1 + var_2));
            break;

         case '-':
            System.out.println("Substraction of given variables:"+(var_1 - var_2));
            break;

        case '*':
            System.out.println("Multiplication of given variables:"+(var_1 * var_2));
            break;
            
        case '/':
            System.out.println("Division of given variables:"+(var_1 / var_2));
            break;    
            
        default: 
            System.out.println("Entered Character Invalid!!");
       }
    }
}