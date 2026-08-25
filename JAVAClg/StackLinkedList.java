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
class Stack{
    
    Node top;
    //constructor to inia. LL
    Stack(){
        this.top =null;
    }

    public boolean isEmpty(){
        return top == null;
    }
    /*method for push element to stack  */
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data+" pushed to stack");
    }
    /*POP */
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }
    /*search */
    public void Search(int sData){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int count=0,found=0;
        Node temp =top;
        while (temp!=null) {
            if (sData==temp.data) {
                System.out.println(temp.data+" is found at loc "+(count+1));
                found =1;
            }
            count++;
            temp =temp.next;
        }
        if (found==0) {
            System.out.println("Not found element in stack");
        }
    }
  
    
 void display(){
    if(isEmpty()){
        System.out.println("Stack is empty");
        return;
    }
        Node temp = top;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


public class StackLinkedList {
    public static void main(String[] args) {
      Stack  stack= new  Stack();
        int code;
        do{
            System.out.println("==> MAIN MENU <==");
            System.out.println("1. Push Element");
            System.out.println("2. pop Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");
            
            System.out.println("Enter Codse..");
            Scanner sc = new Scanner(System.in) ;
                code = sc.nextInt();
                switch (code) {
                    case 1:
                        System.out.println("Push Element:");
                        int data = sc.nextInt();
                        stack.push(data);
                        break;
                    case 2:
                        System.out.println("Pop Element:");
                        int popData=(int) stack.pop();
                        if (popData != -1) {
                            System.out.println("popped from stack");
                        }                    
                        break;

                    case 3:
                        System.out.println("Display Element:");
                        stack.display();
                        break;

                    
                    case 4:
                        System.out.println("Enter the Element to Search:");
                        int n=sc.nextInt();
                        stack.Search(n);
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
