//user definde thread
class UserThread extends Thread{
    public void run(){
        //task for thread
        System.out.println("this is user definde thread..");
    }
}

public class ThreadOperation {
    public static void main(String[] args) {
        System.out.println("Program Started......");
        int x =56+34;
        System.out.println("sum is:"+x);
        //THREAD
        Thread t = Thread.currentThread();
        /*GET METHOD */
        String tname = t.getName();
        System.out.println("Current running threa is:"+tname);
        /*SET METHOD */
        t.setName("Mymain");
        System.out.println(t.getName());

        /*SLEEP METHOD */
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            
        };

        /*ID METHOD */
        System.out.println(t.getId());

        /*USER DEFINDE METHOD */
        UserThread thread = new UserThread();
        thread.start();
        System.out.println("program closeing.....!!");
    }
}
