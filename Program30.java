/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
public class Program30 {
    static {
        System.out.println("Static block executed");
    }
    {
        System.out.println("Instance block executed");
    }
    Program30() {
        System.out.println("Constructor executed");
    }
    public static void main(String[] args) {
        System.out.println("Main method starts");

        Program30 obj1 = new Program30();
        System.out.println("---");
        Program30 obj2 = new Program30();
        System.out.println("Main method ends");
    }
}
