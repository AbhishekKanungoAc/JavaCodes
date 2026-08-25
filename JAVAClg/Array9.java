package JAVAClg;
/*selection sort */
public class Array9 {
    public static void main(String[] args) {
        int a[]={7,1,4,2,3};
        selectionSort(a);
        System.out.println();
        System.out.print("sorted array:");
        for(int v:a){
            System.out.print(v+" ");
        }
    }

    public static void selectionSort(int []ar){
        int n =ar.length;
        for(int i=0;i<n-1;i++){
            int minIdx =i;
            for(int j=i+1;j<n;j++){
            if (ar[j]<ar[minIdx]) {
                minIdx=j;
            }}
            if (minIdx !=i) {
                int temp = ar[i];
                ar[i]=ar[minIdx];
                ar[minIdx]=temp;
            }
            
        }
        
    }
}
