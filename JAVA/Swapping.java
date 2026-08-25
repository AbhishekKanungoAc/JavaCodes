
import java.util.*;
public class Swapping
{
void Swap (int a ,int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
System.out.println("after swaping  :"+a);// swaping code
System.out.println(":"+b);
}

  
}
class Temp
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //int a = sc.nextInt();
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        //int b = sc.nextInt();

        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        Swapping obj=new Swapping();
        obj.Swap(a,b);

    }
}