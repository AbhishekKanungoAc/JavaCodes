import java.util.*;
class Vehicle
{
    int reg_no;
    int Category;
    int model;
    String color;
    String company_name;
    void Input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the reg_no:");// cars and bike identificatin
        reg_no=sc.nextInt();
        System.out.println("enter the category:");
        Category=sc.nextInt(); }}
class Fourwheeler extends Vehicle{
    void Car(){
    if (Category==4)
    {
        System.out.println("Model:2023");
        System.out.println("color:BLACK and WHITE");
        System.out.println("company:MAHENDRA");}
    }
    }
class Twowheeler extends Vehicle{
    void bike(){
    if (Category==2){
    System.out.println("Model :2023");
    System.out.println("color:BLACK");
    System.out.println("company:TVS");}
}
}
class Inheritance1 {
    public static void main(String[] args) {
        Fourwheeler obj = new Fourwheeler();
        obj.Input();
        obj.Car();
       Twowheeler obj1 = new Twowheeler();  
       obj1.Input();
        obj1.bike();}
    }
