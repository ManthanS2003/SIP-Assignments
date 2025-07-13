/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
import java.util.Scanner;
public class Program19 {
    String name;
    Program19(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        Program19 p = new Program19(userName);
        p.show();
    }
}
