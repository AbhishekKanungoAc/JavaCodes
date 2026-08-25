package JAVAClg;
import java.util.Scanner;
public class NestedStatm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*nested Switch */
        System.out.println("enter A:");
        int A =sc.nextInt();
        System.out.println("enter B:");
        int B=sc.nextInt();
        switch (A) {
            case 0:
              switch (B) {
                case 0:
                    System.out.println("0 and 0 , then 0");
                    
                    break;
                case 1:
                System.out.println("0 and 1 , then 0");
                break;    
              
                default:
                    break;
              }
                             
                break;
        
                case 1:
                switch (B) {
                    case 0:
                       System.out.println("1 and 0 , then 0"); 
                        break;
                case 1:
                System.out.println("1 and 1,then 1");
                break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        
        /*nested loops */
        System.out.println("enetr a:");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
            
        }        

    }
}
