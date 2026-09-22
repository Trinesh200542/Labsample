package com.trinesh.studentmanagement;

public class Student {
    private int id;
    private String name;
    private double mark;

    public Student(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Mark: " + mark;
    }
}