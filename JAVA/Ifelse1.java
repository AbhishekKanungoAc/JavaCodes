import java.util.*;
public class Ifelse1
 {
    public static void main(String[] args) 
    {
        int age;
     Scanner sc = new Scanner (System.in);
        System.out.println("enter the age:");
        age=sc.nextInt();
        if(age>=18)
        System.out.println("your are eligible for casting your vote");
        else 
        System.out.println("you are not eligible for casting your vote");
    }
    
}
