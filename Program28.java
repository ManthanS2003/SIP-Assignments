/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
abstract class BankAccount {
    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    abstract void calculateInterest();
}
class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest on savings account: " + interest);
    }
}
public class Program28 {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(10000);
        account.calculateInterest();
    }
}
