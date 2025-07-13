/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
public class Student {
    String name;
    int age;
    void setDetails(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }
    void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setDetails("Amit", 21);
        s.printDetails();
    }
}