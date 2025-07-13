/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
class Bike {
    void showBike() {
        System.out.println("This is a Bike.");
    }
}
class Car extends Bike {
    void showCar() {
        System.out.println("This is a Car.");
    }
}
public class BikeCarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.showCar();   
        myCar.showBike();
    }
}