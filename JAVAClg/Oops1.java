package JAVAClg;

class Rectangle{
    static int length,width;
    static void getData(int a,int b){
        length =a;
        width=b;
    } 
    static int rectArea(){
        int area = length*width;
        return(area);
    }
}


public class Oops1 {
    public static void main(String[] args) {
        Rectangle.getData(10, 20);
        System.out.println("Area:"+Rectangle.rectArea());
    }
}
