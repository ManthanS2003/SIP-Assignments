/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
abstract class Vehicle {
    abstract void start();
}
interface Honker {
    void honk();
}
class Car extends Vehicle implements Honker {
    public void start() {
        System.out.println("Car engine starts with a key.");
    }
    public void honk() {
        System.out.println("Car horn goes beep beep!");
    }
}
public class Program29 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.honk();
    }
}
