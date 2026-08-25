import java.util.*;
public class Array2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // int i,j;
        int[][]a=new int [2][2];
        System.out.println("enter the mstrix element:");// to create a matrix
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
    
}//end of main()
}// end of class
