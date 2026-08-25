import java.util.*;
class Input
{

void number(float n,int f)
   {
            int fact=f;
            for(int i=1;i<=n;i++)
            fact=fact*i;
            System.out.println("fact:"+fact);
    }
void number (int n)
    {
        for(int i=1;i<=10;i++)
            {
                int t;
                t =n*i;
                System.out.println(+t);
            }
    }
}
class Funoverload
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");//fact and table program
        int num =sc.nextInt();
        double n;
        n=num;
        Input obj = new Input();
        obj.number(num,1);
        obj.number(num);

        


    }
    
}
