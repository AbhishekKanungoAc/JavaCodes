package JAVAClg;
import java.util.*;
class LNode{
    int data;
    LNode next;

    LNode(int data){
        this.data=data;
        this.next = null;
    }
}

class LList{
    LNode head;

    LList(){
        this.head = null;
    }

    public void insertEd(int data){
        LNode newNode = new LNode(data);
        if(head==null){
            head  =newNode;
        }
        else {
            LNode temp =head ;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public void insertFrnt(int data){
        LNode newNode = new LNode(data);
        if (head==null) {
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }

    }

    public void insertSpeci(int data , int loca){
        LNode newNode = new LNode(data);
        if (loca ==1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        LNode Current = head;
        for(int i=1;i<loca-1;i++){
            if (Current == null) {
                throw new IndexOutOfBoundsException("location out of bound");
            }
                Current= Current.next;
            }
            newNode.next = Current.next;
            Current.next = newNode;
            

    }


    public LNode deleteAtFront(){
        if (head == null) {
            return null;
        }
        LNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;

    }

    public LNode deleteAtEnd(){
        
        if(head==null || head.next == null){
            return head;
        }
        else {
            LNode Current  =head ;
            LNode Previous = null;
            while (Current.next!=null) {
                Previous = Current;
                Current = Current.next;
            }
            Previous.next = null;
            return Current;
        }
        
    }
    public void deleteAtSpecified(int pos){
        int nodeCount =0;
        LNode temp=head;
        while (temp!=null) {
            nodeCount++;
            temp = temp.next;
        }
        System.out.println("nodeCount:"+nodeCount);
        if (pos <=nodeCount) {
            if(pos == 1){
                head = head.next;
             }else{
                LNode previous = head;
                int count=1;
                while (count<pos-1) {
                    previous = previous.next;
                    count++;
                }
                LNode current = previous.next;
                previous.next = current.next;
             }
        }
        else{
            System.out.println("Invalide Location..");
        }
    }

    void ReverseList(){
        if (head==null) {
            System.out.println("List is empty");
            return ;
        }
        LNode curr =head;
        LNode pre = null;
        LNode next=null;
        while (curr!=null) {
            next = curr.next;
            curr.next=pre;
            pre = curr;
            curr=next;
        }
        head=pre;
        LNode temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
            }
         System.out.println("null");
}
void display(){
    LNode temp = head;
    while (temp!=null) {
        System.out.print(temp.data+"->");
        temp = temp.next;
        }
     System.out.println("null");
}
public void Swap(int x , int y){
    if (x == y) {
        System.out.println("Both nodes are the same.");
        return;
    }

    
    LNode prevX = null, currX = head;
    while (currX != null && currX.data != x) {
        prevX = currX;
        currX = currX.next;
    }


    LNode prevY = null, currY = head;
    while (currY != null && currY.data != y) {
        prevY = currY;
        currY = currY.next;
    }

    
    if (currX == null || currY == null) {
        System.out.println("Element not present, cannot swap.");
        return;
    }

    
    if (prevX != null) {
        prevX.next = currY;
    } else { 
        head = currY;
    }

    if (prevY != null) {
        prevY.next = currX;
    } else { 
        head = currX;
    }

    LNode temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;

    System.out.println("Nodes " + x + " and " + y + " swapped.");
}
}


class HandsOn
{
    public static void main(String[] args) {
        LList l = new LList();
        int code;
        do{
            System.out.println("==> MAIN MENU <==");
            System.out.println("1. Insert Operation");
            System.out.println("2. Deletion Opertaion");
            System.out.println("3. Display List");
            System.out.println("4. Reverse list");
            System.out.println("5. Swap");
            System.out.println("6. Exit");
            
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
                                    l.insertFrnt(data);
                                    break;
                                case 2:
                                     System.out.println("Insert Element At End");
                                     System.out.println("Enter element:");
                                      data = sc.nextInt();
                                     l.insertEd(data);
                                    break;
                                case 3:
                                    System.out.println("Insert Element At Specified pos");
                                    System.out.println("Enter element and loctaion :");
                                    data = sc.nextInt();
                                    location = sc.nextInt();
                                    l.insertSpeci(data, location);
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
                        System.out.println("Reversed Linked List is:");
                        l.ReverseList();
                        break;
                    case 5:
                    System.out.println("Enter two element to swap:");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    l.Swap(x,y);
                    break;
                
                    case 6:
                        System.out.println("Closing Program");
                        break;
                
                    default:
                        System.out.println("Invalid Code");
                        break;
                
            }
        }while(code!=5);
        
    }
}
