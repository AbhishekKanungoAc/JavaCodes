
/*bubble sort a={5,1,4,2,8} */
public class Array8 {
    public static void main(String[] args) {
        int a[]={5,1,4,2,8};
        bubbleSort(a);
        System.out.print("sorted array:");
        for(int v:a){
            System.out.print(v+" ");
        }
       }
       public static void bubbleSort(int []ar){
        int n =ar.length; boolean swaped;
        for(int i=0;i<n-1;i++){
            swaped=false;
            for(int j=0;j<n-i-1;j++){
                if (ar[j]>ar[j+1]) {
                    int temp =ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    swaped=true;
                }
                if (!swaped) {
                    break;
                }
            }
        }
       }

    }
