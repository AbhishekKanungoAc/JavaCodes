import java.util.*;
public class Array6 
{
 public static void main(String[] args)
{
    int temp=0;
    int a[]=new int[5];
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the array element:");//min element of arr
    for(int i=0;i<=4;i++)
    a[i]=sc.nextInt();
    temp=a[0];
    
   for (int i=1;i<=4;i++)
   {
    if (temp > a[i])
    temp=a[i];
   }
    System.out.println(" min element :"+temp);

}   
}
