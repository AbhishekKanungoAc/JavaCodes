package JAVAClg;


class Rectangle2{
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



public class Oops3 {
    public static void main(String[] args) {
        Rectangle2 reboj1 = new Rectangle2();
        reboj1.getData(10, 20);
       int r= reboj1.rectArea();
       System.out.println("area:"+r);

       Rectangle2 reobj2 = new Rectangle2();
       reobj2.getData(100, 200);
       int r1=reobj2.rectArea();
       System.out.println("area:"+r1);
    }
    
}