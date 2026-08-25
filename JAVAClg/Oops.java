package JAVAClg;
public class Oops {
    static int length,width;
    static void getData(int a,int b){
        length =a;
        width=b;
    } 
    static int rectArea(){
        int area = length*width;
        return(area);
    }




    public static void main(String[] args) {
        getData(10,20);
        System.out.println("area:"+rectArea());
    }

}