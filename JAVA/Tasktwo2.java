/*Java Array Program for Array Rotation */
/* Input : arr [] = { 1, 2, 3, 4, 5, 6, 7 } ,     d=2
 Explanation: d=2 so 2 elements are rotate to the end of the array. So 1 2 is rotate back. 
So, Final Output : 3, 4, 5, 6, 7, 1, 2
 */

 public class Tasktwo2 {
    static void rotateone(int[] a){
        int temp = a[0];

        for(int i=1;i<a.length;i++){
            a[i-1]= a[i];
        }
        a[a.length-1]=temp;
    }

    static void rotate(int[] a ,int k){
        
        k=k%a.length;
        if(k<0){
            k=k+a.length;
        }
        for(int i=1;i<=k;i++){
            rotateone(a);
        }
    }
    

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");           
        }
        System.out.println();
        rotate(a, 2);
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");           
        }

    }



}
