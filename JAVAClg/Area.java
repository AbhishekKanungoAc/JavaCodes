package JAVAClg;
import java.util.Scanner;
public class Area {
    static void sq(double s){
        System.out.println("area of sq:"+(s*s));
        
    }
    static void re(double l,double b){
        System.out.println("area of rectangle:"+(l*b));
    }
    static void cir(double r){
        System.out.println("area of circle:"+(3.14*r*r));
    }
    static int natural(int i){
        if (i<=10) {
            System.out.println(i);
            return natural(i+1);
            
            }
            else{
                return 0;
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the number for sq side, lenth and radius:");
        double num = sc.nextInt();
        System.out.println("this is the weight of rectangle:");
        double num1 = sc.nextInt();
        sq(num);
        re(num,num1);
        cir(num);


        
        int result = natural(1);
    

        
    }
}
