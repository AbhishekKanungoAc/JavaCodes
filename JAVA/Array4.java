import java.util.*;
public class Array4
{
    
    public static void main(String[] args)
     {
        Scanner sc = new Scanner (System.in);
        // int i,j;
        int[][]a=new int [2][2];
        System.out.println("enter the matrix element: ");


        for (int i=0;i<=1;i++)
        {
            for( int j=0;j<=1;j++)
            {
            a[i][j]=sc.nextInt();
        
            }
        }

        for ( int i=0;i<=1;i++)
        {
        System.out.println(" ");
        
            for (int j=0;j<=1;j++)
            {
              System.out.print(" "+a[i][j]);//dekhna  hai output sahi nhi hai (sum of eklements)

            }//endof innerloop;
            System.out.println(" ");

        } //end of outerloop   
    
        int sum=0,r=0;
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++)
            {
                
                sum += a[i][j];
               // System.out.println("sum: "+sum);
            }
             System.out.println(" 1-row sum: " +sum);
             r=sum-r;
        }
        System.out.println("2-row sum: " +r);
    
    
    }
//end of main()
}// end of class
