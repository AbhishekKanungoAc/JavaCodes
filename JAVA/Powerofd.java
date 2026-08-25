
import java.util.*;
public class Powerofd 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner (System.in);
System.out.println("enter the number:");
int num =sc.nextInt();
System.out.println("enter the power:");
int power = sc.nextInt();
for(int i=1;i<power;i++){
//while(i<num)
{
    int ans=num*power;
     System.out.println(ans);
}
} 
}   
}
