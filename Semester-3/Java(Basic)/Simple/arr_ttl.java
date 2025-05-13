import java.util.*;
class arr_ttl
{
  public static void main(String args[])
  {
    Scanner ar_1= new Scanner(System.in);

    int arr[]=new int[5];
    int even=0,odd=0;
    for(int i=0; i<arr.length;i++)
    {
      System.out.print("Enter["+ i +"]value:");
      arr[i]= ar_1.nextInt();
    }

    System.out.println("Values Of Array:");
    for(int i=0; i<arr.length;i++)
    {
      System.out.println("Indexing["+i +"]Value:"+arr[i]);
    }
    
    for(int i=0; i<arr.length;i++)
    {
      if(arr[i] %2 ==0)
      {
        even++;
      }
      else
      {
        odd++;
      }
    }
    System.out.println("Number Of even numbers present in Array:"+even);
    System.out.println("Number Of odd numbers present in Array:"+odd);
  }
}