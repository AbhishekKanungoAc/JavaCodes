package JAVAClg;

public class ArrayLogic8 {
    public static void main(String[] args) {
        int [] AR1 = {10,5,3,17,10,3,14,-5,-5,8};
        
        for(int i=0;i<AR1.length;i++){
                     
            for(int j=i+1;j<AR1.length;j++){
                if(AR1[i]==AR1[j]){
                    int temp=AR1[i+1];
                    AR1[i+1]=AR1[j];
                    AR1[j]=temp;
                    i++;
                }
            }  
        }
        System.out.println("new Array:");
        for (int el : AR1) {
            System.out.print(el+" ");
        }
    }
}
