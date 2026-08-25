package JAVAClg;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("welcome to DAA training");
        int[] a ={10,20,30,40,50};
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            if (i==0) {
                b[i]=a[i]+1;
                }
            else if(i==1){
                b[i]=a[i]+2;
            }
            
            else if(i==2){
                b[i]=a[i]+3;
            }
            
            else if(i==3){
                b[i]=a[i]+5;
            }
            
            else if(i==4){
                b[i]=a[i]+8;
            }
        }
        for(int n: b){
            System.out.println(n);
        }
    }
}
