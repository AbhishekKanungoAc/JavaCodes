package JAVAClg;

public class ArrayLogic7 {
    public static void main(String[] args) {
        int c[]={10,-15,3,17,5,2,14,-5,8,9};
        int v[]=new int[c.length];
        
        for(int i=0;i<c.length;i++){
            if(c[i]%2==0){
                v[i]=c[i];
                System.out.print(v[i]+" ");
            

            }
        }
        
        for(int i=0;i<c.length;i++){
            if (c[i]%2!=0) {
                v[i]=c[i];
                System.out.print(v[i]+" ");
            }
        }
        
    }
}
