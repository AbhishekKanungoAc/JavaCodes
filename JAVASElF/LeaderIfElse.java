import java.util.Scanner;
public class LeaderIfElse {
 public static void main(String[] args) {
    /*LEADER IF ELSE:-STUDENT RESULT */
        int i;
        Scanner marks = new Scanner (System.in);
        System.out.println("enter the marks of student:");
        i = marks.nextInt();

        if(i>90){
            System.out.println("A+");
        }
        else if(i>=80){
            System.out.println("A");
        }
        else if(i>=75){
            System.out.println("B+");
        }
        
        else if(i>=65){
            System.out.println("B");
        }
        else
        {
            System.out.println("Fail");
        }

 }
}
