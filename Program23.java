/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat Meow...");
        super.sound(); 
    }
}
public class Program23 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}
