/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
public class NonStaticDemo {
    void showMessage() {
        System.out.println("This is a non-static method.");
    }
    public static void main(String[] args) {
        NonStaticDemo obj = new NonStaticDemo();
        obj.showMessage();
    }
}

