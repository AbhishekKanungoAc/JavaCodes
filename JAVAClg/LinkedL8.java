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
class Linked8{
    
    ListNode head;
    //constructor to inia. LL
    Linked8(){
        this.head =null;
    }
    /*INSERTION OPERATION */
    //1. AT END
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
    //2. AT FRONT
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
    //3. AT SPECIFIED LOCATION

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
        /*DELETION OPERATIONS */
        //1. AT FRONT
        public ListNode deleteAtFront(){
            if (head == null) {
                return null;
            }
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return temp;

        }
        //2. AT END
        public ListNode deleteAtEnd(){
            
            if(head==null || head.next == null){
                return head;
            }
            else {
                ListNode Current  =head ;
                ListNode Previous = null;
                while (Current.next!=null) {
                    Previous = Current;
                    Current = Current.next;
                }
                Previous.next = null;
                return Current;
            }
            
        }
        //3. AT SPECIFIED LOCATION
        public void deleteAtSpecified(int pos){
            int nodeCount =0;
            ListNode temp=head;
            while (temp!=null) {
                nodeCount++;
                temp = temp.next;
            }
            System.out.println("nodeCount:"+nodeCount);
            if (pos <=nodeCount) {
                if(pos == 1){
                    head = head.next;
                 }else{
                    ListNode previous = head;
                    int count=1;
                    while (count<pos-1) {
                        previous = previous.next;
                        count++;
                    }
                    ListNode current = previous.next;
                    previous.next = current.next;
                 }
            }
            else{
                System.out.println("Invalide Location..");
            }
        }
        /*TO COUNT THE NUMBER OF NODES IN LIST */
            public void Count(){
                if (head==null) {
                    System.out.println("List is empty");
                    return;
                }
                int Count =0;
                ListNode temp=head;
                while (temp!=null) {
                Count++;
                temp = temp.next;
                    }
                System.out.println(Count);
            }
            /*TO SEARCH THE ELEMENT IN LIST */
            void Search(int n){
                if (head==null) {
                    System.out.println("list is empty");
                    return;
                }
                int found=0;
                int CountNode=1;
                ListNode temp = head;
                while (temp!=null) {
                    if (n==temp.data) {
                        found=1;
                        System.out.println("Found "+n+" at potion "+ CountNode);
                    }
                    CountNode = CountNode+1;
                    temp=temp.next;
                }
                if (found==0) {
                    System.out.println("Not Found Element "+n+ " in linked list.");
                }
            }
            /*TO REVERSE LINKED LIST */
             void ReverseList(){
                    if (head==null) {
                        System.out.println("List is empty");
                        return ;
                    }
                    ListNode curr =head;
                    ListNode pre = null;
                    ListNode next=null;
                    while (curr!=null) {
                        next = curr.next;
                        curr.next=pre;
                        pre = curr;
                        curr=next;
                    }
                    head=pre;
                    ListNode temp = head;
                    while (temp!=null) {
                        System.out.print(temp.data+"->");
                        temp = temp.next;
                        }
                     System.out.println("null");
            }

            /*TO DISPLAY THE LINKED LIST */
            void display(){
                ListNode temp = head;
                while (temp!=null) {
                    System.out.print(temp.data+"->");
                    temp = temp.next;
                    }
                 System.out.println("null");
            }
}
/*MAIN CLASS */
public class LinkedL8 {
    public static void main(String[] args) {
        Linked8 l = new Linked8();
        int code;
        do{
            System.out.println("==> MAIN MENU <==");
            System.out.println("1. Insert Operation");
            System.out.println("2. Deletion Opertaion");
            System.out.println("3. Display List");
            System.out.println("4. Count Nodes");
            System.out.println("5. Search Element");
            System.out.println("6. Reverse list");
            System.out.println("7. Exit");
            
            System.out.println("Enter Codse..");
            Scanner sc = new Scanner(System.in) ;
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
                    int deleteCode,loc;
                        do{
                            System.out.println("==> DELETION MENU <==");
                            System.out.println("1 At Front");
                            System.out.println("2 At End");
                            System.out.println("3 At Specified pos");
                            System.out.println("4 Back to Main Menu");
                            deleteCode = sc.nextInt();
                            switch (deleteCode) {
                                case 1:
                                    System.out.println("Delete Element At Front");
                                    l.deleteAtFront();
                                    break;
                                case 2:
                                     System.out.println("Delete Element At End");
                                     l.deleteAtEnd();
                                    break;
                                case 3:
                                    System.out.println("Delete Element At Specified pos");
                                    System.out.println("Enter loctaion :");
                                    loc = sc.nextInt();
                                    l.deleteAtSpecified(loc);
                                   break;
                                case 4:
                                System.out.println(" Back to Main Menu");
                                    break;
                                default:
                                    System.out.println("Invalid Code");
                                    break;
                            }
                        }while (deleteCode!=4) ;
                    break;
                    case 3:
                        System.out.println("Linked List:");
                        l.display();
                        break;
                    case 4:
                        System.out.print("Number of Nodes in Linked List is:");
                        l.Count();
                        break;
                    case 5:
                        System.out.println("Enter the Element to Search:");
                        int n=sc.nextInt();
                        l.Search(n);
                        break;
                    case 6:
                        System.out.println("Reversed Linked List is:");
                        l.ReverseList();
                        break;
                    case 7:
                        System.out.println("Closing Program");
                        break;
                
                    default:
                        System.out.println("Invalid Code");
                        break;
                
            }
        }while(code!=7);
    }
}
