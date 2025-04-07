package com.bridgelabz;


import java.lang.reflect.Field;

public class Configuration {
    private static String API_KEY = "sijdsndjsnudaca";
}

class MainForConfiguration {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        System.out.println(Configuration.class.getDeclaredField("API_KEY"));
        Configuration obj = new Configuration();
        Class<?> c = Configuration.class;
        Field f = c.getDeclaredField("API_KEY");
        f.setAccessible(true);
        System.out.println(f.get(null));
        f.set(null,"dgfjdjkcsbkvbkjs");
        System.out.println(f.get(null));
    }
}
