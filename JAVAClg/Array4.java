package JAVAClg;

import java.util.Arrays;
/*insert at front and delete at front */

public class Array4{
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int newEle = 60;
        a = insertAtFront(a,newEle);
        System.out.println("insert"+Arrays.toString(a));
        
        a = deletAtFront(a);
        System.out.println("delete"+Arrays.toString(a));
      }
      public static int[] insertAtFront(int[]arr , int newE){
        int [] newAr = new int[arr.length+1];
        newAr [0] = newE;
        for(int i=0;i<arr.length;i++){
            newAr[i+1]=arr[i];
        }
       
        return newAr;
      }
      public static int[] deletAtFront(int[]arr ){
        if (arr.length <= 0) {
          return new int[0];
        }
        int [] newAr = new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            newAr[i-1]=arr[i];
        }
      
        return newAr;
      }
     
}
