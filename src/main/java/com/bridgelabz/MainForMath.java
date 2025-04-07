package com.bridgelabz;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}


class MainForMath {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        // Create an instance of MathOperations
        MathOperations operations = new MathOperations();

        // Get user input
        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = scanner.nextLine();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Get the Class object
        Class<?> mathClass = operations.getClass();

        // Get the Method object matching the method name with two int parameters
        Method method = mathClass.getMethod(methodName, int.class, int.class);

        // Invoke the method dynamically
        int result = (int) method.invoke(operations, num1, num2);

        System.out.println("Result: " + result);

    } catch (NoSuchMethodException e) {
        System.out.println("Invalid method name!");
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        scanner.close();
    }
}
}