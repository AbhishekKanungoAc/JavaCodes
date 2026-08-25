import java.util.*;
class Factorial{
    int num,f=1;
    void ip(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        num = sc.nextInt();
    }
    void Fc()
    {
        for(int i=1;i<=num;i++)
        f=f*i;
        System.out.println("factorial of number is:"+f);
    }
}
public class Fact {
    public static void main(String[] args) {
            Factorial obj = new Factorial();
            obj.ip();
            obj.Fc();
     }
    }
