/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
class parent {
    void disp() {
        System.out.println("Parent Class.");
    }          
}
class child extends parent {
    void show() {
        System.out.println("Child Class.");
    }
}
public class Program21 {
    public static void main(String[] args) {
        child ob = new child();
        ob.disp();
        ob.show();
    }
}
