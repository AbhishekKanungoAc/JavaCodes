package JAVAClg;


class Rectangle3{
     int length=5,width=10;
    Rectangle3(int a,int b){
        length=a;
        width=b;
    }
    Rectangle3(){
    
    }
    int rectArea(){
        int area = length*width;
        return(area);
    }
}



public class Oops4 {
    public static void main(String[] args) {
        Rectangle3 reboj1 = new Rectangle3();
       int r= reboj1.rectArea();
       System.out.println("area:"+r);

       Rectangle3 reobj2 = new Rectangle3(100,200);
       int r1=reobj2.rectArea();
       System.out.println("area:"+r1);
    }
    
}