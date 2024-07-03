/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

public class Employee {
    
     String name;
     int age;
     String designation;
     double salary;

    
     static String companyName = "Company Name : Alpha";
     static String companyAddress = "Company Address : Dhaka, Bangladesh";
     static int employeeCount = 0;

    
    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        employeeCount++;
    }

    
    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
    }

    
    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + employeeCount);
    }

    
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Md. Aziz", 35, "Manager", 75000);
        Employee emp2 = new Employee("Kazi Rahman", 25, "Developer", 60000);
        Employee emp3 = new Employee("Md. Hassan", 28, "Designer", 55000);

        
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();

        
        Employee.displayTotalEmployees();
    }
}

