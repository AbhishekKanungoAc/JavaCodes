import java.util.*;

class Order{
    int a , b ,c;
    void ip(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number:");
        a =sc.nextInt();
        
        System.out.println("enter the 2nd number:");
        b =sc.nextInt();
        
        System.out.println("enter the 3rd number:");
        c =sc.nextInt();
    }
    void chack(){
        System.out.println(+a+" "+b+" "+c);
        if (a<b & b<c) {
            System.out.println("numbers are in increasing order");
        }
        else if (c<b & b<a){
            System.out.println("numbers are in decresing order");
        }
        else {
            System.out.println("mix order");
        }
    }
}



public class Ifelse10 {
    public static void main(String[] args) {
        Order obj = new Order();
        obj.ip();
        obj.chack();

    }
}
