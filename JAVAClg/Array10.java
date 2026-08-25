package JAVAClg;
/*insertion sort */
public class Array10 {
    public static void main(String[] args) {
        int a[]={25,1,5,4,6};
        insertionSort(a);
        System.out.println();
        System.out.print("sorted array:");
        for(int v:a){
            System.out.print(v+" ");
        }
    }
    public static void insertionSort(int []ar){
        int n =ar.length;
        for(int i=1;i<n;i++){
            int key =ar[i];
            int j = i-1;
            while (j>=0 && ar[j]>key) {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;
        }
    }
}
