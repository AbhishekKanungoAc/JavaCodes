package JAVAClg;

public class ArrayLogic4 {
    public static void main(String[] args) {
        int Sm [] = {10,5,3,17,5,2,14,-5,0,8};
        int mx=0;
        int min=0;
        
        int sum=0;
        for(int i=0;i<Sm.length;i++){
            if (Sm[i]>mx) {
                mx=Sm[i];
            }
            if (Sm[i]<min) {
                min =Sm[i];
            }
            sum = sum+Sm[i];

        }
        double av = (double)sum/Sm.length;
        System.out.println("Max ele:"+mx);
        System.out.println("min ele:"+min);
        System.out.println("average of ele:"+av);
    }
}
