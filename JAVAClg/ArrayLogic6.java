package JAVAClg;

public class ArrayLogic6 {
    public static void main(String[] args) {
        int c[]={10,-15,3,17,5,2,14,-5,8,9};
        int even=0;
        int odd=0;
        for(int i=0;i<c.length;i++){
            if(c[i]%2==0){
                even++;
                

            }
            else{
                odd++;
                
            }
        }
        System.out.println("even:"+even);
        System.out.println("odd:"+odd);
    }
}
