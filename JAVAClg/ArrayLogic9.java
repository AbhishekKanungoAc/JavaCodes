package JAVAClg;

public class ArrayLogic9 {
    public static void main(String[] args) {
        int N[]={10,0,3,17,0,3,14,0,-5,8};
        int Z[]= new int[N.length];
        for(int i=0;i<N.length;i++)
    {
        if (N[i]!=0) {
            System.out.print(N[i]+" ");
        }
    }
    for(int i=0;i<N.length;i++)
    {
        if (N[i]==0) {
            System.out.print(N[i]+" ");
        }
    }
    }
}
