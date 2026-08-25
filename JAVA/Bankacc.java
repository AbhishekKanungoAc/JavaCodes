import java.util.*;
class Input
{
    
    float id;
    float balance;
    int accno;
    Input()
{accno=1234567;
}
   
    void acc()
    {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("id of acc holder:");
        id=sc.nextFloat();
        if(accno==id)
        balance=500;
        System.out.println("total Balance:"+balance);
    }
   public void credit()
    {
        if(accno==id){
         Scanner sc = new Scanner (System.in);
        System.out.println("enter the amt to credit:");
        float cd=sc.nextFloat();
        balance=balance+cd;
        System.out.println("total balance after credit:"+balance);}

    }
  public  void debit()
    {
        if(accno==id){
           Scanner sc = new Scanner (System.in);
   System.out.println("enter the amt to debit:");
   float dt=sc.nextFloat();
   balance=balance-dt;
   System.out.println("total balance after debit:"+balance);
         } }

}

class Bankacc {
    public static void main(String[] args) {
        Input obj = new Input();
        obj.acc();
        obj.credit();
        obj.debit();
    }
    
}
