import java.util.*;
abstract class Abstraction1
{
        public 
        int num,f=1,t;
        abstract  void fact();
}
class Demo extends Abstraction1
{
    void fact()
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("enter the number :");//problem with abstraction
            num=sc.nextInt();
            for(int i=1;i<=num;i++)
            f=f*i;
            System.out.println("fact:"+f);
        }
    void table()
        {

        for(int i=1;i<=10;i++){
        t=num*i;
        System.out.println(t);}

        }
}
class Abst 
{
    public static void main(String[] args) 
    {
        Demo obj=new Demo();
        obj.fact();
        obj.table();
    }
    
}
