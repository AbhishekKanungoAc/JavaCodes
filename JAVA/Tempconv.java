import java.util.Scanner;

public class Tempconv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius ;
        double fahrenheit;
        System.out.println("enter the temp. in celsius:");// convesion of temp
        celsius=sc.nextDouble();
        fahrenheit=(celsius*9/5)+32;
        System.out.println("temp. in fehrenheit is:"+fahrenheit);
        

    }
}
