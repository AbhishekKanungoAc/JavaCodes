package JAVAClg;
/*mannualy */
class ListNode{
    int data;
    ListNode next;
    //constructor to create a new node with given data
    ListNode(int data){
        this.data = data;
        this.next = null;
    }

}
class Linked{
    
    ListNode head;
    //constructor to ini ll
    Linked(){
        this.head =null;
    }
    void insertDisplay(){
        head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        head.next = second;
        second.next = third;
        third.next=fourth;
        System.out.println("Linked list has been created");

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
    }
}
public class LinkedL {
    public static void main(String[] args) {
        Linked list = new Linked();
        list.insertDisplay();
    }
}
