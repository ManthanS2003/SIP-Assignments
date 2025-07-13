/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
public class OverloadDemo {
    void display() {
        System.out.println("Display method with no parameters.");
    }
    void display(String message) {
        System.out.println("Display method with one String: " + message);
    }
    void display(int number) {
        System.out.println("Display method with one int: " + number);
    }
    void display(String message, int number) {
        System.out.println("Display method with String and int: " + message + ", " + number);
    }
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.display();
        obj.display("Hello");
        obj.display(42);
        obj.display("Age", 21);
    }
}