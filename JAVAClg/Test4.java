package JAVAClg;
import java.util.*;
public class Test4 {
    /*roration of sun array in array circular */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number to shift:");
    int k = sc.nextInt();
    int ar[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int ar1[][] = new int[ar.length][ar[0].length];
      
      for (int i = 0; i < ar.length; i++) {
        
        for (int j = 0; j < ar[i].length; j++) {
            ar1[i][j] = ar[(i + k) % ar.length][j];
        }
    }
    for (int i = 0; i < ar1.length; i++) {
        for (int j = 0; j < ar1[i].length; j++) {
            System.out.print(ar1[i][j] + " ");
        }
        System.out.println();
    }





    
}    
}

