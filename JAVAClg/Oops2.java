package JAVAClg;


class Rectangle1{
     int length,width;
    void getData(int a,int b){
        length =a;
        width=b;
    } 
    int rectArea(){
        int area = length*width;
        return(area);
    }
}



public class Oops2 {
    public static void main(String[] args) {
        Rectangle1 reboj = new Rectangle1();
        reboj.getData(10, 20);
       int r= reboj.rectArea();
       System.out.println("area:"+r);
    }
    
}
