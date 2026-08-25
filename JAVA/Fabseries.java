import java.util.*;
class Fab
{
    void fib(int n)
    {
        int n1=0,n2=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(n1);
            int num3=n2+n1;
            n1=n2;
            n2=num3;
        }
    }
}
class Fabseries
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number:");//fab series program 
        int n = sc.nextInt();
        Fab obj=new Fab ();
        obj.fib(n); 

    }
}