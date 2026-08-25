import java.util.*;
public class Array3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // int i,j;
        int[][]a=new int [2][2];
        System.out.println("enter the mstrix element:");
        for (int i=0;i<=1;i++)
        {
            for( int j=0;j<=1;j++)
        
        a[i][j]=sc.nextInt();
        
        }
        for (int  i=0;i<=1;i++)
        {
        System.out.println(" ");
        
            for (int j=0;j<=1;j++)
            {
              System.out.print(" "+a[i][j]);
           
            }//endof innerloop
        } //end of outerloop   
    
          int[][]b=new int [2][2];
        System.out.println("enter the mstrix element:");//addition of two matrix
        for (int i=0;i<=1;i++)
        {
            for( int j=0;j<=1;j++)
        
        b[i][j]=sc.nextInt();
        
        }
        for (int  i=0;i<=1;i++)
        {
        System.out.println("   ");
        
            for (int j=0;j<=1;j++)
            {
              System.out.print("      "+b[i][j]);
           
            }//endof innerloop
        } //end of outerloop   
    int[][]c=new int [2][2];
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++)
c[i][j]=a[i][j]+b[i][j];
        }
         for (int  i=0;i<=1;i++)
        {
        System.out.println("   ");
        
            for (int j=0;j<=1;j++)
            {
              System.out.print("        "+c[i][j]);
           
            }//endof innerloop
        } //end of outerloop   
}//end of main()
}// end of class
