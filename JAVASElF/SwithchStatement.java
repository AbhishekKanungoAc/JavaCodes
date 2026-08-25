import java.util.Scanner;
public class SwithchStatement {
    public static void main(String[] args) {
        /*Switch Statement:-(weekdays) */
        System.out.println("enter the number of weekday:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("monday");
                break;
           
            case 2:
                System.out.println("teusday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saterday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
