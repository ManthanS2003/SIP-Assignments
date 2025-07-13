/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
import java.util.Scanner;
public class AddFloatNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Float Number: ");
        float n1 = sc.nextFloat();
        System.out.print("Enter Second Float Number: ");
        float n2 = sc.nextFloat();
        float sum = n1 + n2;
        System.out.println("Sum of Two Float Numbers: " + sum);
        
    }
}
