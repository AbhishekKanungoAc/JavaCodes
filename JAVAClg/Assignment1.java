package JAVAClg;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Calculate Simple Interest */
        System.out.println("enter the principle in rupees:");
        double p = sc.nextDouble();
        System.out.println("enter the rate in %:");
        double r = sc.nextDouble();
        System.out.println("enter the time in years:");
        double t = sc.nextDouble();
        System.out.println("Simple Interest:"+((p*r*t)/100));

        /*Calculate Body Mass Index (BMI)  */
        System.out.println("Enter the Weight in KG:");
        Double KG = sc.nextDouble();
        System.out.println("Enter thr Height in Meter:");
        Double M =sc.nextDouble();
        Double BMI = (KG/M);
        System.out.println("BMI is:"+BMI); 
        
       
    }
}
