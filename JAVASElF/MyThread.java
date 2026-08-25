//MULTITHRADING BY USING RUNNABLE INTERFACE AND THREAD CLASS//

/*Creating our thread using Runable Inteface */
class MyThread implements Runnable {
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("value for i is "+i );
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyAnotherthread t2 = new MyAnotherthread();
        Thread thr = new Thread(t1);
        thr.start();
        t2.start();


    }
}
/*creating thread using thread class */
class MyAnotherthread extends Thread{
    public void run(){
        for(int i=10;i>=1;i++){
            System.out.println("Another thread = "+i);
            try{
                Thread.sleep(2200);
            }
            catch(Exception e){

            }
        }
    }
}