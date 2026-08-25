package JAVAClg;
import java.util.Scanner;
/*test2 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,n1=0,n2=1;
        /*Series */
        System.out.println("Enter the value of n to print series:");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(n1+" ");
            int num= n2+n1;
            n1=n2;
            n2=num;
            }

        /*prime */
        System.out.println("Enter the number to check:");
        int N=sc.nextInt();
        if (N%1==0 && N%N==0) {
            System.out.println("NUmber is prime number");
        }
        else{
            System.out.println("not prime number");
        }

        /*check year */
        System.out.println("Enter the number to check:");
        int year=sc.nextInt();
        if ((year%4==0 || year%100==0)&&year%400==0) {
            System.out.println("year is leap year");
        }
        else{
            System.out.println("not leap year");
        }
        /*patter */
        System.out.println("Print pattern ");
        int p=5;
        for (int i = 0; i < p; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < p; j++) {
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }

        char i, j, k;
        for (i = 69; i >= 65; i--) {
            for (k = i; k <= 69 - 1; k++) {
                System.out.print(" ");
            }
            for (j = 65; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
        



    }
}
