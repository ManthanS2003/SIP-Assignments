/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
abstract class Shape {
    abstract void area();
}
class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5);
        s1.area();
        Shape s2 = new Rectangle(4, 7);
        s2.area();
    }
}
