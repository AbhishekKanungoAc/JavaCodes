import java.util.*;
class Number
{
    public
    int num;
    void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");// to check this code
         num=sc.nextInt();
    }
}
class Calculate extends Number
{
    public
    int f=1;
    int sum=0;
    int temp ;
    void fact()
    { temp =num;
int r;
               
     while(num!=0)
     { f=1;
        r=num%10;
        for(int i=1;i<=r;i++)
        {
            f=f*i;
            
        }
        

        sum = sum+f;
     num = num/10;
     
}
System.out.println("sum="+sum);
if (sum==temp)
System.out.println("num is strong num");
else
System.out.println("not a strong num");

    }

}
class Strongnum
{
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.input();
        obj.fact();
    }
}