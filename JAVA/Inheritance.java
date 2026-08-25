import java.util.*;
class Calculate
{
    int num;
    void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the num:");// inheritance program of table and factorial
        num = sc.nextInt();

    }
}
class Table extends Calculate
{
    int t;
    void table()
    {
        for (int i=1;i<=10;i++){
        t=num*i;
    System.out.println(+t);}

    }
} 
class Fact extends Table
{
    int f=1;
    void fact()
    {
     for(int i=1;i<=num;i++)
     
        f=f*i;
        
     
     System.out.println("fact:"+f);
    }
}

class Inheritance {
    public static void main(String [] args) {
        Fact obj = new Fact();
        obj.input();
        obj.table();
        obj.fact();
    }
}
