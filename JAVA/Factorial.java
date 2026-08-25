import java.util.*;
public class Factorial 
{
public static void main(String[] args)
{
    int num;
 
  System.out.println("enter the number:");
   Scanner sc = new Scanner (System.in);
  num =sc.nextInt();
  int f = fact (num);
  System.out.println("factorial:"+f);

} 
static int fact  (int num)
{
    int fact=1;
    for(int i=1;i<=num;i++)
    fact=fact*i;
    return fact;
}

}
