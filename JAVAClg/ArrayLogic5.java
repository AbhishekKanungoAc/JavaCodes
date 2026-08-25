package JAVAClg;

public class ArrayLogic5 {
    public static void main(String[] args) {
        int Sm [] = {10,5,3,17,5,2,14,-5,0,8};
        int mx=0,smx=0;
        for(int i=0;i<Sm.length;i++){
            if (Sm[i]>mx) {
                smx =mx;
                mx=Sm[i];
            }
            else if (Sm[i]>smx && Sm[i]<mx) {
                smx =Sm[i];
            }

        }
        System.out.println(smx);
    }
}
