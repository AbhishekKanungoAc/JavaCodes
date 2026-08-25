import java.util.*;
class Result2
{
    void marks (int sum)
{
 
 System.out.println("sum of five sub.:"+sum);
 int per ;
 per = sum/5;
 System.out.println("percent:"+per+"%");    
 if (per>=95)  
 System.out.println("Grade-A+");
else if(per>=80)
System.out.println("Grade-A");
else if(per>=65)
System.out.println("Grade-B");
else if(per>=55)
System.out.println("Grade-C");
else if(per>=50)
System.out.println("Grade-D");
else
System.out.println("Fail");
}
}
class Result
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[]=new int [5];
        System.out.println("enter the marks of five subjects:");
        for (int i=0;i<=4;i++)
        a[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<=4;i++)
        sum=sum+a[i];
        Result2 obj = new Result2();
        obj.marks(sum);
   }
}