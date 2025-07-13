/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
class A {
    String type = "Animal";
}
class Dog extends A {
    String type = "Dog";
    void showType() {
        System.out.println("Child class type: " + type);
        System.out.println("Parent class type: " + super.type);
    }
}
public class Program22 {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.showType();
    }
}