package com.bridgelabz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

class BasicClass1{
    private String name;
    private int age;

    BasicClass1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void print() {
        System.out.println(name);
        System.out.println(age);
    }
}

class BasicClass2{
    private String empname;
    private int salary;

    BasicClass2(String empname, int salary) {
        this.empname = empname;
        this.salary = salary;
    }
    void calculateSalary() {
        System.out.println("Calculated salary:" + salary);
    }

    void isMorethen10lac() {
        System.out.println("yes");
    }

}

public class GetClassInfo {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String a = "com.bridgelabz.";
        String className = sc.nextLine();
        Class<?> className2 = Class.forName(a+className);
        Method methods[] = className2.getDeclaredMethods();
        Field field[] = className2.getDeclaredFields();
        Constructor constructors[] = className2.getDeclaredConstructors();

        for(Constructor m: constructors) {
            System.out.println(m.getName());
        }

        for(Field f: field) {
            System.out.println(f.getName());
        }

        for(Method m: methods) {
            System.out.println(m.getName());
        }
    }
}
