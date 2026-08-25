import java.util.*;
class Demo 
{
    public
    int num;
void getdata()
{
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");// not ruuning to check this program
        num = sc.nextInt();
}
void Calculate()
{
     int f=1,i;
     System.out.println("demo class");
     for(i=num;i>=1;i--)
     f=f*i;
     System.out.println("fact"+f);
}    
}
class Table extends Demo
{
    int t;
void Calculate()
    { 
        System.out.print("table class"+num);
        for (int i=1;i<=10;i++){
        t=num*i;
        System.out.println(+t);}
    }
}
class Overriding
{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.getdata();
        obj.Calculate();
        Table obj2 = new Table();
       // System.out.println("ob2 call");
        obj2.getdata();
        obj2.Calculate();
    }
}
