package JAVAClg;

public class ArrayLogic {
    public static void main(String[] args) {
        int[] a ={10,20,30,40,50};
        int [] b = new int [a.length];

        int fn=0,sn=1;
        for(int i=0;i<a.length;i++){
            int tn = fn+sn;
            b[i]=a[i]+tn;
            fn=sn;
            sn=tn;
            System.out.print(b[i]+" ");
        }
    }
}
