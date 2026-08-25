import java.util.*;
class count{
    int num;
    void ip(){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        num=sc.nextInt();

    }
    void check(){
        int c = 0;
        while (num!=0) {
            num=num/10;
            c++;
        }
        System.out.println(c+ " digits in enterd number");
    }
}

public class Ifelse9 {
    public static void main(String[] args) {
        count obj = new count();
        obj.ip();
        obj.check();
    }
}
