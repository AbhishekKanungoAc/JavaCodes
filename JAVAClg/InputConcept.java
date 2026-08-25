package JAVAClg;
import java.util.Scanner;
/*input concept */
public class InputConcept {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter your name:");
        String name  = sc.nextLine();//for Strig ip
        System.out.println("enter the age:");
        int age = sc.nextInt();//for int ip 
        System.out.println("enter the cgpa:");
        double cgpa = sc.nextDouble();
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("cgpa:"+cgpa);

    }
    
}
