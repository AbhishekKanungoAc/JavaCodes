package JAVAClg;
import java.util.*;
public class Assignment2 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
/*even numbers from 1 to 10 */
System.out.println("Even Numbers Between 1 to 10 are: ");
for(int i=1;i<=10;i++){
    if (i%2==0) {
        System.out.print(i+" ");
    }}
System.out.println("");
 /*REad five n number and sum of them */
 System.out.println("Enter the five n numbers to sum:");
 int sum=0;
 for(int i=1;i<=5;i++){
    i = sc.nextInt();
    sum=i+sum;
 }
 System.out.println("sum of n number is:"+sum);   

 /*read five number and print smallest number */
 System.out.println("Enter the five numbers:");
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
 int d = sc.nextInt();
 int e = sc.nextInt();
 int small = a;
 if(b<a){small=b;}
 if(c<b){small=c;}
 if(d<c){small=d;}
 if(e<d){small=e;}
 System.out.println("Smallest among five is:"+small);

 /*read a number and display in reverse */
 System.out.println("Enter any number above 9 digit");
 int N = sc.nextInt();
 int rev=0,rem;
 while (N>0) {
    rem=N%10;
    rev=(rev*10)+rem;
    N=N/10;
     }
     System.out.println("Reversed Number is:"+rev);

 

 





 }   
}
