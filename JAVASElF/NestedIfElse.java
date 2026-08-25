import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        /*Nested if else : - (if ke ander if else ) */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n = sc.nextInt();

        if(n>0){
            if(n%2==0){
                System.out.println("number is grater then Zero And divisible by 2");
            }
            else{
                System.out.println("number is greater then zero but not divisible bye 2");
            }

        }
        else{
            System.out.println("number is less then zero");
        }
    }
    
}
