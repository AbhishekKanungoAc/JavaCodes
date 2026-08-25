import java.util.*;
class Number{
    void check(int x){
        if (x>0) {
            System.out.println("num is positive");
        }
        else if (x<0)
        {
            System.out.println("num is negative");
        }
        else {
            System.out.println("num is zero");
        }
                    
    }
}



public class Ifelse6 {
public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    a = sc.nextInt();
    Number obj = new Number();
    obj.check(a );
}    
}

