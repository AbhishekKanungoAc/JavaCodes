import java.util.*;
public class Ifelse2
{
 
public static void main(String[] args)//grade acceptance prog
  {
    Scanner input = new Scanner (System.in);
    Character grade;
    System.out.println("enter the grade:");
    grade = input.next().charAt(0);
    if ( grade=='E')
    {
        System.out.println("Excellent");
    }
    else if (grade=='V'){
        System.out.println("very good");
    }
    else if (grade=='G')
    {
        System.out.println("good");
    }
    else if (grade=='A')
    {
        System.out.println("average");
    }
    else
    {
        System.out.println("fail");
    }
    
 }   
}
