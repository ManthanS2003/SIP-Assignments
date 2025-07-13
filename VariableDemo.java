/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
public class VariableDemo {
    int instanceVar = 20;
    static int staticVar = 30;
    void displayVariables() {
        int localVar = 10;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
    public static void main(String[] args) {
        VariableDemo obj = new VariableDemo();
        obj.displayVariables();
    }
}
