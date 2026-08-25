/*Java Array Program to Remove Duplicates elements from an Array */
/* Example : 
        Input : [1,2,2,3,3,4,5 ]
        Output:[ 1, 2, 3, 4, 5 ]
*/

public class Taskone1 {
    static int removeDuplicates(int[]arr){
        int temp = 0 ;

        for(int i=1;i<arr.length;i++){
            if(arr[temp]!=arr[i]){
                temp++;
                arr[temp]=arr[i];
            }
        }
    return temp+1;
    
    }


    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,4,5};
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int temp = removeDuplicates(arr);
        System.out.println();
        
        System.out.println("After Removing Duplicates:-");
        for(int i=0;i<temp;i++){
            System.out.print(arr[i]+" ");
        }

    }



}