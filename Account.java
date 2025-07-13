/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
public class Account {
    private double balance;
    // Setter method to set balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount. Balance cannot be negative.");
        }
    }
    // Getter method to get balance
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(5000.75);
        System.out.println("Account Balance: ₹" + acc.getBalance());
    }
}