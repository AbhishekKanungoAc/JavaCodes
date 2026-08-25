import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        /*Loosp;-(For loop impl.) */
        System.out.println("enter the cout:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println("sum:-"+sum);
        
    }
}
