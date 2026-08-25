import java.util.*;
public class Series 
{
public static void main(String[] args)
 {
 Scanner input = new Scanner (System.in);
 int sp;
 int ep;
 System.out.println("enter the starting point:");// number series endpoint starting point
 sp = input.nextInt();
 System.out.println("enter the end point:");
 ep=input.nextInt();
 if(sp<ep) 
 {
    for(int i=sp;i<=ep;i++)
    System.out.println(i);
 }   
 else{
    for(int i=sp;i>=ep;i--)
    System.out.println(i);
 }
}    
}
