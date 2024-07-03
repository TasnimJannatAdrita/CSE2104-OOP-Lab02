/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

public class Student {
     int id;
     String name;
     String department;
     double cgpa;
     static String university;
     static int studentCount = 0;

    
    public Student(int id, String name, String department, double cgpa, String university) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        Student.university = university;
        studentCount++;
    }

    
    public void displayStudentDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }

    // Class method to display the total number of students
    public static void displayStudentCount() {
        System.out.println("Total number of students: " + studentCount);
    }

    public static void main(String[] args) {
        Student s1 = new Student(140, "Tamim", "CSE", 3.8, "ABC University");
        Student s2 = new Student(160, "Shakib", "EEE", 3.9, "ABC University");
        Student s3 = new Student(110, "Tanzib", "BBA", 3.5, "ABC University");

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println();
        s3.displayStudentDetails();
        System.out.println();

        Student.displayStudentCount();
    }
}

