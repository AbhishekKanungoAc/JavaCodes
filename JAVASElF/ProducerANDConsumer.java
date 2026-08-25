import java.util.*;

class Company{
    int n;
    boolean f =false;
    synchronized public void Producer_item(int n) throws Exception{
        if (f) {
            wait();
        }
        this.n=n;
        System.out.println("producer :"+this.n);
        f=true;
        notify();
    }
    synchronized public int Consumer_item() throws Exception{
        if (!f) {
            wait();
        }
        System.out.println("Consumed:"+this.n);
        f=false;
        notify();
        return this.n;
    }
}
class Producer extends Thread{
    Company c;
    Producer(Company c){
        this.c=c;}
        public void run(){
            int i=1;
            while (true) {
                try {
                    this.c.Producer_item(i);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                };
                i++;
            }

        }
    }


class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c=c;
    }
    public void run(){
        while (true) {
            try {
                this.c.Consumer_item();
            } catch (Exception e) {
                
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            };

        }
    }
}

public class ProducerANDConsumer {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer p=new Producer(comp);
        Consumer c=new Consumer(comp);
        p.start();
        c.start();
    }
}
