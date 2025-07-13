/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }
}
class Child extends Parent {
    Child() {
        super(); 
        System.out.println("Child constructor called");
    }   
}
public class Program24 {
    public static void main(String[] args) {
        Child c = new Child(); 
    }
}