import java.util.*;
public class Factorial1 
{
public static void main(String[] args) 
{
int f = fact();

System.out.println("factorial of num:"+f);  
}

 static int fact()
{    
    int f=1;
Scanner sc = new Scanner (System.in);
System.out.println("enter the number :");
int num =sc.nextInt();
for(int i=num;i>=1;i--)
{
   f=f*i;
    
}
// return num;

return f;
}
}
