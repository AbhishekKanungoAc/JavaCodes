import java.util.*;

class triangle{

void prmd(int x)
{
System.out.println("qu. 1 only for row value");
    for (int i=0;i<=x;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}

void prmd1(int x)
{
System.out.println("qu. 2 only for row value");
    for(int i=x;i>=0;i--)
    {
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
void prmd2(int x ,int y){
    System.out.println("qu. 3  for row and column value");
    for(int i=0;i<=x;i++){
        for(int j=0;j<=y;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
}
}

public class Pattern{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row:");
        a = sc.nextInt();
        System.out.println("enter the number of column:");
        b = sc.nextInt();
    
        triangle obj = new triangle();
        obj.prmd(a);
        obj.prmd1(a);
        obj.prmd2(a, b);
    }
}