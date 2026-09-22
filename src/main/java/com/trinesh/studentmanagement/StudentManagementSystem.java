package com.trinesh.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public int getStudentCount() {
        return students.size();
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }
    public boolean removeStudentById(int id) {
        return students.removeIf(student -> student.getId() == id);
    }
}
