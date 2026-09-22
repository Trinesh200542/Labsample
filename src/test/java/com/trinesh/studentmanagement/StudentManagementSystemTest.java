package com.trinesh.studentmanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class StudentManagementSystemTest {

    @Test
    void testAddStudent() {
        StudentManagementSystem system = new StudentManagementSystem();

        system.addStudent(new Student(101, "Trinesh", 95.5));

        assertEquals(1, system.getStudentCount());
    }

    @Test
    void testFindExistingStudent() {
        StudentManagementSystem system = new StudentManagementSystem();
        system.addStudent(new Student(101, "Trinesh", 95.5));

        Student student = system.findStudentById(101);

        assertNotNull(student);
        assertEquals("Trinesh", student.getName());
        assertEquals(95.5, student.getMark());
    }

    @Test
    void testFindNonExistingStudent() {
        StudentManagementSystem system = new StudentManagementSystem();

        Student student = system.findStudentById(999);

        assertNull(student);
    }
}