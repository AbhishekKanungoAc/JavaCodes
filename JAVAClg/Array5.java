package JAVAClg;

import java.util.Arrays;

/*insert AND delet at any postion  */
public class Array5{
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int newEle = 60;
        int index=2;
        a = insertAtAnyp(a,newEle,index);
        System.out.println("insert:"+Arrays.toString(a));
        
        a = deletAtAnyp(a,index);
        System.out.println("delete:"+Arrays.toString(a));
      }
      public static int[] insertAtAnyp(int[]arr , int newE,int idx){
        if (idx<0 || idx>arr.length) {
            throw new IndexOutOfBoundsException("invalid idx");
         } int [] newAr = new int[arr.length+1];
            
        for(int i=0;i<arr.length;i++){
            newAr[i]=arr[i];
        }
        newAr [idx] = newE;
        for(int i=idx;i<arr.length;i++){
            newAr[i+1]=arr[i];
        }
        return newAr;
        
      }
      public static int[] deletAtAnyp(int[]arr ,int idx){
        if (idx<0 || idx>arr.length) {
            throw new IndexOutOfBoundsException("invalid idx");
         } 
        int [] newAr = new int[arr.length-1];  
        for(int i=0;i<idx;i++){
            newAr[i]=arr[i];
        }
        
        for(int i=idx+1;i<arr.length;i++){
            newAr[i-1]=arr[i];
        }
        return newAr;
       
       
        
      }
     
}
