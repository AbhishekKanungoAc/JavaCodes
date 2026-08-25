package JAVAClg;
import java.util.*;

/*user friendly  */
class ListNode{
    int data;
    ListNode next;
    //constructor to create a new node with given data
    ListNode(int data){
        this.data = data;
        this.next = null;
    }

}
class Linked3{
    
    ListNode head;
    //constructor to ini ll
    Linked3(){
        this.head =null;
    }
  public  void insert(int data){
        ListNode newNode = new ListNode(data);
        if(head==null){
            head  =newNode;
        }
        else {
            ListNode temp =head ;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    void display(){
        ListNode temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class LinkedL3 {
    public static void main(String[] args) {
        Linked3 l = new Linked3();
        int code;
        do{
            System.out.println("==>MENU<==");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display List");
            System.out.println("3. Exit");
            System.out.println("Enter Codse..");
            try (Scanner sc = new Scanner(System.in)) {
                code = sc.nextInt();
                switch (code) {
                    case 1:
                        System.out.println("Enter element:");
                        int data = sc.nextInt();
                        l.insert(data);
                        break;
                    case 2:
                        System.out.println("Linked List:");
                        l.display();
                        break;
                    case 3:
                        System.out.println("Closing Program");
                        break;
                
                    default:
                        System.out.println("Invalid Code");
                        break;
                }
            }
        }while(code!=3);
    }
}
