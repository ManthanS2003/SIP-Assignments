/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
public class ConstructorOverloading {
    String s,s1,s2;
    ConstructorOverloading() {
        System.out.println("This is Default Constructor..");
    }
    ConstructorOverloading(String s) {
        this.s = s;
    }
    ConstructorOverloading(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    void display(){
        System.out.println("Constructor : " + s);
        
    }
    void show() {
        System.out.println("Name and Lastname : " + s1 + " " + s2);
    }
    public static void main(String[] args) {
        ConstructorOverloading ob = new ConstructorOverloading();
        ConstructorOverloading ob1 = new ConstructorOverloading("One Argument");
        ConstructorOverloading ob2 = new ConstructorOverloading("Manthan","Surkar");
        ob1.display();
        ob2.show();
    }
}
