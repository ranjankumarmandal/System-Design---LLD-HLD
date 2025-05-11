package org.example.singleton_design_pattern;

public class Singleton {
    // private static object
    // private constructor
    // public static getInstance method

    private static Singleton obj;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(obj == null) {
            obj = new Singleton();
        }

        return obj;
    }
}
