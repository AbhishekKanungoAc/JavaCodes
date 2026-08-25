package JAVAClg;
import java.util.*;
/*find  array elemeent */
public class Array7 {
    private static void check(int []ar , int n){
        boolean test = false;
        for(int ele:ar){
            if(ele == n){
                test = true;
                break;
            }
        }
        System.out.println("Is "+n+" present in the array: "+test);
    }

    public static void main(String[] args) {
        int[] a ={1,5,2,4,6,8,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to find ");
        int n = sc.nextInt();
        System.out.println("Array: "+Arrays.toString(a));
        check(a,n);
        
    }
}
