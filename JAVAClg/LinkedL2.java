package JAVAClg;
/*insert at end  */
class ListNode{
    int data;
    ListNode next;
    //constructor to create a new node with given data
    ListNode(int data){
        this.data = data;
        this.next = null;
    }

}
class Linked2{
    
    ListNode head;
    //constructor to ini ll
    Linked2(){
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
public class LinkedL2 {
    public static void main(String[] args) {
        Linked2 l = new Linked2();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        System.out.println("Linked List:-");
        l.display();
    }
}
