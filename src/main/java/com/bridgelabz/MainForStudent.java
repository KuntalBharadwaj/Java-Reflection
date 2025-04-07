package com.bridgelabz;

import java.lang.reflect.Constructor;

class Student {
    private String name;
    private int rollNo;

    // Constructor
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}


public class MainForStudent {
    public static void main(String[] args) {
        try {
            // Get the Class object of Student
            Class<?> studentClass = Class.forName("Student");

            // Get the constructor with parameters (String, int)
            Constructor<?> constructor = studentClass.getConstructor(String.class, int.class);

            // Create a new instance using the constructor
            Object studentObject = constructor.newInstance("Kuntal", 101);

            // Call displayInfo method
            studentClass.getMethod("displayInfo").invoke(studentObject);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
