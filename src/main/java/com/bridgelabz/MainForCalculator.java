package com.bridgelabz;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class MainForCalculator {
    public static void main(String[] args) {
        try {
            // Create an instance of Calculator
            Calculator calculator = new Calculator();

            Class<?> calcClass = calculator.getClass();

            Method multiplyMethod = calcClass.getDeclaredMethod("multiply", int.class, int.class);

            multiplyMethod.setAccessible(true);

            int result = (int) multiplyMethod.invoke(calculator, 6, 7);

            System.out.println("Result of multiply(6, 7): " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
