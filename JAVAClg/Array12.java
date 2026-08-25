package JAVAClg;
/*Quick sort */
public class Array12 {
    public static int partition(int arr[],int l,int h){
        int pi =arr[h];
        int i = l-1;

        for(int j=l ; j<h;j++){
            if(arr[j]<pi){
                i++;

                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=pi;
        arr[h]=temp;
        return i;

    }
    public static void quickSort(int arr[],int l,int h){
        if(l<h){
            int pix = partition(arr,l,h);

            quickSort(arr, l, pix-1);
            quickSort(arr, pix+1, h);
        }   
     }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n = arr.length;

        quickSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
