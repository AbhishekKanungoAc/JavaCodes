package JAVAClg;
import java.util.*;
class ListNode{
    int data;
    ListNode next;
    
    ListNode(int data){
        this.data = data;
        this.next = null;
    }

}
class Linked4{
    
    ListNode head;
    //constructor to ini ll
    Linked4(){
        this.head =null;
    }
  public  void insertEnd(int data){
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
    public void insertFront(int data){
        ListNode newNode = new ListNode(data);
        if (head==null) {
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
       
    }
    public void insertSpecified(int data,int location){
        ListNode newNode = new ListNode(data);
        if (location ==1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        ListNode Current = head;
        for(int i=1;i<location-1;i++){
            if (Current == null) {
                throw new IndexOutOfBoundsException("location out of bound");
            }
                Current= Current.next;
            }
            newNode.next = Current.next;
            Current.next = newNode;
            
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
public class LinkedL4 {
    public static void main(String[] args) {
        Linked4 l = new Linked4();
        int code;
        do{
            System.out.println("==> MAIN MENU <==");
            System.out.println("1. Insert Operation");
            System.out.println("2. Display List");
            System.out.println("3. Exit");
            
            System.out.println("Enter Codse..");
            try (Scanner sc = new Scanner(System.in)) {
                code = sc.nextInt();
                switch (code) {
                    case 1:
                    int subCode,data,location;
                        do{
                            System.out.println("==> INSERT MENU <==");
                            System.out.println("1 At Front");
                            System.out.println("2 At End");
                            System.out.println("3 At Specified pos");
                            System.out.println("4 Back to Main Menu");
                            subCode = sc.nextInt();
                            switch (subCode) {
                                case 1:
                                    System.out.println("Insert Element At Front");
                                    System.out.println("Enter element:");
                                    data = sc.nextInt();
                                    l.insertFront(data);;
                                    break;
                                case 2:
                                     System.out.println("Insert Element At End");
                                     System.out.println("Enter element:");
                                      data = sc.nextInt();
                                     l.insertEnd(data);
                                    break;
                                case 3:
                                    System.out.println("Insert Element At Specified pos");
                                    System.out.println("Enter element and loctaion :");
                                    data = sc.nextInt();
                                    location = sc.nextInt();
                                    l.insertSpecified(data, location);
                                   break;
                                case 4:
                                System.out.println(" Back to Main Menu");
                                    break;
                                default:
                                    System.out.println("Invalid Code");
                                    break;
                            }
                        }while (subCode!=4) ;
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
