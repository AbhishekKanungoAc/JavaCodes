import java.util.*;
 class Addition 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in); 
        {
            int num1;
            int num2;
            int sum;
            System.out.println("enter the value of num1:");//simple addtion program
            num1 = input.nextInt(); 
               System.out.println("enter the value of num2:");
               num2 = input.nextInt();
               sum = num1 + num2 ;
               System.out.println("sum of two number is:"+sum);
        }
    }
}
