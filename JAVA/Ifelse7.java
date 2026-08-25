import java.util.*;
class Number{
    void check(int x){
        if (x%5==0 && x%11==0) {
            System.out.println(x+"num is divisible by 11 and 5");
        }
        else{
            System.out.println(x+"num is NOT divisible by 11 and 5");
        
        }              
    }
    void Year(int y ){
        if ((y%4==0 && y%100!=0)||y%400==0) {
            System.out.println(y+" is leap year");
        }
        else{
            
            System.out.println(y+" is NOT leap year");
        }
    }

    void check1(int x){
        if (x%2==0) {
            System.out.println(x+" is even number");
        }
        else{
            System.out.println(x+" is odd num");
        }
    }
}



public class Ifelse7 {
public static void main(String[] args) {
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    a = sc.nextInt();
    System.out.println("enter the year:");
    b = sc.nextInt();
    
    System.out.println("enter the number:");
    c = sc.nextInt();
    Number obj = new Number();
    obj.check(a );
    obj.Year(b);
    obj.check1(c);
}    
}

