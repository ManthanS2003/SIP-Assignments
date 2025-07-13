/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
class Grandparent {
    void showGrandparent() {
        System.out.println("I am the Grandparent.");
    }
}

class Parent extends Grandparent {
    void showParent() {
        System.out.println("I am the Parent.");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("I am the Child.");
    }
}

public class Program25 {
    public static void main(String[] args) {
        Child c = new Child();
        c.showChild();
        c.showParent();
        c.showGrandparent();
    }
}

