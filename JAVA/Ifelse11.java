import java.util.*;

class Calculater{
    int n1,n2;
    char op;
    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operator from given:-  +,-,*,/,%");
        op = sc.next().charAt(0);
        System.out.println("enter the first number:");
        n1 = sc.nextInt();
        
        System.out.println("enter the second number:");
        n2 = sc.nextInt();
    }
    void Result(){
        switch (op) {
            case '+':
                System.out.println("sum "+(n1+n2));
                break;

            case '-':
                System.out.println("sub "+(n1-n2));
                break;

            case '*':
                System.out.println("mul "+(n1*n2));
                break;

            case '/':
                System.out.println("dvsr "+(n1/n2));
                break;

            case '%':
                System.out.println("rem "+(n1%n2));
                break;
            default:
            System.out.println("invalid operator");
                break;
        }
    }
    
    
}

public class Ifelse11 {
    public static void main(String[] args) {
        Calculater obj = new Calculater();
        obj.Input();
        obj.Result();
    }
    
}
