package JAVAClg;
import java.util.Scanner;
/*stack push pop search display implementation in linked list */
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }

}
class Queue{
    
    Node front, rear;
    //constructor to inia. LL
    Queue(){
        this.front =this.rear=null;
    }

    public boolean isEmpty(){
        return front == null;
    }
    /*method for  Enqueue element to stack  */
    public void  Enqueue(int data){
        Node newNode = new Node(data);
        if (rear==null) {
            front =rear=newNode;
            System.out.println(data+" enqueue to queue");
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println(data+" enqueue to queue");
        
    }
    /*Dequeue */
    public int Dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int deueueData = front.data;
        front = front.next;
        if (front==null) {
            rear=null;
        }
        return deueueData;
    }
    /*search */
    public void Search (int sData){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int count=0,found=0;
        Node temp =front;
        while (temp!=null) {
            if (sData==temp.data) {
                System.out.println(temp.data+" is found at loc "+(count+1));
                found =1;
            }
            count++;
            temp =temp.next;
        }
        if (found==0) {
            System.out.println("Not found element in Queue");
        }
    }
  
    
 public  void display(){
    if(isEmpty()){
        System.out.println("Queue is empty");
        return;
    }
        Node temp = front;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


public class QueueLinkedList {
    public static void main(String[] args) {
      Queue  queue= new Queue();
        int code;
        do{
            System.out.println("==> MAIN MENU <==");
            System.out.println("1. Enqueue Element");
            System.out.println("2. Dequeue Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");
            
            System.out.println("Enter Codse..");
            Scanner sc = new Scanner(System.in) ;
                code = sc.nextInt();
                switch (code) {
                    case 1:
                        System.out.println("Enqueue Element:");
                        int data = sc.nextInt();
                        queue.Enqueue(data);
                        break;
                    case 2:
                        System.out.println("Dequeue Element:");
                        int popData= queue.Dequeue();
                        if (popData != -1) {
                            System.out.println("Dequeue from Queue");
                        }                    
                        break;

                    case 3:
                        System.out.println("Display Element:");
                        queue.display();
                        break;

                    
                    case 4:
                        System.out.println("Enter the Element to Search:");
                        int n=sc.nextInt();
                        queue.Search(n);
                        break;

                    case 5:
                        System.out.println("Closing Program");
                        break;
                
                    default:
                        System.out.println("Invalid Code");
                        break;
                
            }
        }while(code!=5);
    }
}
