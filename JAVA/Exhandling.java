import java.util.*;
class Input
{
    private static final Exception ArithmeticException = null;

    void number ()
    {
        int a,b;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of a:");
        a =sc.nextInt();
        System.out.println("enter the value of b:");
        b = sc.nextInt();
        try{
            int c;
            c=a/b;
            // System.out.println("c:"+c);
            throw new  ArithmeticException("result="+c);
            

        }
        catch(ArithmeticException obj)

        {
            System.out.println(obj);

        }
        finally
        {
            System.out.println("end");
        }
    }
}



public class Exhandling {
    public static void main(String[] args) {
        Input obj =new Input();
        obj.number();
    }
}
