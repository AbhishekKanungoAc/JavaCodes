package JAVAClg;
import java.util.Scanner;

public class MultipleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        /*multiple if */
        if (n>10) {
            System.out.println("N is Greater then 10");
        }
        if (n==10) {
            System.out.println("N is equal to 10");
        }
        if (n<10) {
            System.out.println("N is less then 10");
        }

        /* multiple if else */
        if (n>0 && n%2==0) {
            System.out.println("N is +ve");}
            else{
            System.out.println("N is Even");
        }
         if(n<0 && n%2==0){
            
            System.out.println("N is -ve");}
            else{
            System.out.println("N is odd");
        }

        /*multiple Switch ke bad ek or switch */
        System.out.println("Q.1. when is the object with new keyword?");
        System.out.println("1.at run time");
        System.out.println("2.at compile time");
        System.out.println("3. depend on the code");
        System.out.println("4.None");
        System.out.print("enter switch the option:");
        int code=sc.nextInt();
        switch (code) {
            case 1:
            System.out.println("True");
                break;
            case 2:
                System.out.println("False");
                    break;
            case 3:
            System.out.println("False");
            break;
            case 4:
            System.out.println("False");
            break;        

            default:
            System.out.println("invaild option");
                break;
        }

        /*Multiple loop meamns loop k bad ek or loop */
        System.out.println("enter for for loop the number:");
        int f=sc.nextInt();
        for(int i=1;i<=f;i++){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i=1;i<=f;i++){
            System.out.print(i*i+" ");
        }




    }
    
}
