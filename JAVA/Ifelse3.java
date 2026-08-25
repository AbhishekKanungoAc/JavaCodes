import java.util.*;
public class Ifelse3 
{
public static void main(String[] args)
 {
    Scanner input = new Scanner (System.in);
    int temp;
    System.out.println("enter the current temprature:");
    temp = input.nextInt();
    if (temp<=0){
  System.out.println("Freezing weather");}
  else if (temp<=10 && temp>0)  {
    System.out.println("very cold weather");}// temp to condition
else if (temp<=20 && temp>10)
{
  System.out.println("cold weather");}
else if (temp<=30 && temp>20){
  System.out.println("normal weather");}
  else if (temp<=40 && temp>30){
    System.out.println("hot weather");}
    else
      System.out.println("very hot weather");



}    
}
