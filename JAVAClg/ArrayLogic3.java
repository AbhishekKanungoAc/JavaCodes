package JAVAClg;

public class ArrayLogic3 {
    public static void main(String[] args) {
        int A[]={123,456,789};
        int B[] = new int[A.length];
        for(int i=0;i<A.length;i++){         
        
        while (A[i]!= 0) {
            int digit = A[i] % 10;   
            B[i] =B[i]* 10 + digit;
            A[i] /= 10;  
        }
        System.out.println(B[i]+" ");
        }
        
    }
}
