package JAVAClg;
/*display using loop and insert and diply alg alg */
class ListNode{
    int data;
    ListNode next;
    //constructor to create a new node with given data
    ListNode(int data){
        this.data = data;
        this.next = null;
    }

}
class Linked1{
    
    ListNode head;
    //constructor to ini ll
    Linked1(){
        this.head =null;
    }
    void insert(){
        head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        head.next = second;
        second.next = third;
        third.next=fourth;
        System.out.println("Linked list has been created");

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
public class LinkedL1 {
    public static void main(String[] args) {
        Linked1 l = new Linked1();
        l.insert();
        l.display();
    }
}
