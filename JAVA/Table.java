import java.util.*;
class Num
{
    public

    int n,table=0;
     void input()
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("enter number:");
            n = sc.nextInt();
            
        }
        void table()
        {
            for(int i=1;i<=10;i++)
            {
             table=n*i;
             System.out.println(table);//table with two method(fun)
            }
        }
    
}

 class Table {
    public static void main(String[] args) {
     Num obj = new Num();
     obj.input();
     obj.table();   
    }
    
}
