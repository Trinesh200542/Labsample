package com.trinesh.studentmanagement;

public class App {

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        system.addStudent(new Student(101, "Trinesh", 95.5));
        system.addStudent(new Student(102, "Arun", 88.0));
        system.addStudent(new Student(103, "Priya", 91.5));

        System.out.println("----- STUDENT MANAGEMENT SYSTEM -----");

        System.out.println("\nAll Students:");
        system.displayStudents();

        System.out.println("\nSearching for student ID 102:");
        Student foundStudent = system.findStudentById(102);

        if (foundStudent != null) {
            System.out.println(foundStudent);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nTotal Students: " + system.getStudentCount());
    }
}