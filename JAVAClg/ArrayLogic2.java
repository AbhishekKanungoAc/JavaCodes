package JAVAClg;
import java.util.*;
public class ArrayLogic2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number to shift:");
    int k = sc.nextInt();
    int ar[] = {1,2,3,4,5};
    int ar1[] = new int[ar.length];
    for(int i=0;i<ar.length;i++){
        
        ar1[i] = ar[(i+k)%ar.length];
    }
    for(int b:ar1){
        System.out.print(b+" ");
    }
}    
}
