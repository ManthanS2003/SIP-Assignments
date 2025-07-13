/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
public class Employee_para {
    String name;
    double salary;
    Employee_para(String Name, double Salary) {
        name = Name;
        salary = Salary;
    }
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee_para emp = new Employee_para("Ravi" , 55000.0);
        emp.display();
    }
}
