import java.util.*;
class P{
        int num,digit,rev=0;

    void ip(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        num = sc.nextInt();
    }

    void reverse()
    {
        while (num!=0) {
        digit=num%10;
        rev=(rev*10)+digit;
        num=num/10;
      }
      System.out.println("reverse number is:"+rev);
      /*  if (num == rev)
         {
           System.out.println("number is palindrome");
         }
         else{
            System.out.println("number is Not palindrom");
          }*/ 
    }
      
}
public class Palindrome {
    public static void main(String[] args) {
           P obj = new P();
           obj.ip();
           obj.reverse();
                   
    }
}
