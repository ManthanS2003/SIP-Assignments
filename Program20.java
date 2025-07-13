/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
public class Program20 {
    String s;
    Program20(String s) {
        this.s = s;
        System.out.println("Parameterized Constructor Called.");
    }
    Program20() {
        this("Hello Visitor...");
        System.out.println("Default Constructor Calls Parameterized Constructor."); 
    }
    public static void main(String[] args) {
        Program20 ob = new Program20();
    }
}
