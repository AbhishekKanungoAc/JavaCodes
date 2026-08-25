/*Getter and setter for Encapsulation */

public class GetterAndSetter {
    private String name;
    private int rollnumber;

    //GETTER
    public int getRollNumber(){
        return this.rollnumber;
    }

    //SETTER
    public void setRollNumber(int rollnumber){
        if (rollnumber<=0) {
            throw new  IllegalArgumentException("Invaid Args");
        }
        this.rollnumber =rollnumber;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.rollnumber);
    }
    
}
class main{
    
    public static void main(String[] args) {
        GetterAndSetter gs1 = new GetterAndSetter();
        gs1.setRollNumber(2);
        gs1.display();
    }
}
