package JAVAClg;
import java.util.LinkedList;
import java.util.Scanner;
class Task{//to do
    Arra
}


public class ArrayListCaseStudy {
    public static void main(String[] args) {
        LinkedList<Integer> Listt = new LinkedList<>();
        int code;
        do{
            System.out.println("==> MAIN MENU <==");
            System.out.println("1. Insert Ele At End");
            System.out.println("2. Insert Ele At Top");
            System.out.println("3. Insert Ele At Specified");
            System.out.println("4. Display List");
            System.out.println("5. Delete Ele At End");
            System.out.println("6. Delete Ele At top");
            System.out.println("7. Delete Ele At Specified");
            System.out.println("8. Delete All ele");
            System.out.println("9. Search Element");
            System.out.println("10. Sort the list");
            System.out.println("11. Exit");

            System.out.println("Enter the Code..");
            Scanner sc =new Scanner(System.in);
            code = sc.nextInt();
            int data,pos;
            switch (code) {
                case 1:
                System.out.println("Insert Element At End");
                System.out.println("Enter element:");
                data = sc.nextInt();
                Listt.addLast(data);
                break;
                case 2:
                System.out.println("Insert Element At Front");
                System.out.println("Enter element:");
                data = sc.nextInt();
                Listt.addFirst(data);
                break;
                case 3:
                System.out.println("Insert Element At Specified pos");
                System.out.println("Enter element and postion:");
                data = sc.nextInt();
                pos = sc.nextInt();
                Listt.add(data, pos);
                break;
                
                case 4:
                System.out.print(Listt+" ");
                break;

                case 5:
                System.out.println("Delete Ele At End");
                Listt.removeLast();
                break;

                case 6:
                System.out.println("Delete Ele At front");
                Listt.removeFirst();
                break;

                case 7:
                System.out.println("Delete Ele At Specified pos");
                
               
               // Listt.remove(pos);
                break;

                case 8:
                System.out.println("Delete all ele");
                Listt.removeAll(Listt);
                break;

                case 9:
                System.out.println("Search element");
                System.out.println("enter the indx to get element");
                int i = sc.nextInt();
                Listt.get(i);
                

                break;
            
                case 10:
                System.out.println("Sort the list");
                break;

                case 11:
                System.out.println("Closing the program");
                break;

                default:
                System.out.println("Invalid code");
                    break;
            }}while (code!=11);            
            
            

        
    
    
}
}