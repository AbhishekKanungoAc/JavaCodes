package JAVAClg;
 interface Interfaces{  //base1
    int x=20;
    int y=30;
    void sum(int a,int b);
   public abstract void msg(String str)  ;
    
}

 interface ABS extends Interfaces{  //Base2

    public abstract void msg1(String str1 );
}

class Base1 implements  ABS{    //child
   public void sum(int x,int y){
        int s=x+y;
        System.out.println("add:"+s);
    }
    public void msg(String str){
        System.out.println("string:"+str);}
    public void msg1(String str1){
        System.out.println("string:"+str1);
    }    
public static void main(String[] args) {
  /*  Interfaces obj = new Base1();//obj of base1 with child
   obj.msg("Base1");
   obj.sum(y, x);
   System.out.println("");
    */
    ABS obj1 = new Base1();//obj of base2 with child
    obj1.msg1("BAsE 2"); 
    obj1.msg("Base1");
    obj1.sum(y, x);
    
    
    System.out.println("hello");
    
}
}
