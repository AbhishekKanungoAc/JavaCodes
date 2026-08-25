import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        /*Loosp;-(While loop impl.) */
        System.out.println("enter the cout:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while (n<=5) {
            System.out.println(n);
            sum = sum+n;
            n++;
           
        }
        System.out.println("sum:-"+sum);
    }
}
