package com.bridgelabz;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Author{
    String name();
}

@Author(name="Author Name : XYZ")
public class CustomAnnotation {
    final String name = "Kuntal";
    void doNothing() {
        System.out.println("Do nothing function");
    }
}

class MainForCustomAnnotaion{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<?> c = CustomAnnotation.class;
        Author an = (Author) CustomAnnotation.class.getAnnotation(Author.class);
        System.out.println(an.name());
    }
}
