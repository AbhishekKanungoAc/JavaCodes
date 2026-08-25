
import java.util.*;
public class Sumofdigit {
    public static void main(String [] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int n= num;
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum=sum+digit;
           n=n/10;
        }
        System.out.println("sum of num:"+sum);

    }
}

