package org.example.singleton_design_pattern;

public class Singleton {
    // private static object
    // private constructor
    // public static getInstance method

    private static Singleton obj;

    private Singleton() {}

    public static Singleton getInstance() {
        if(obj == null) {
            obj = new Singleton();
        }

        return obj;
    }

    // any function we want to access through Singleton class object
    public void performTask() {
        System.out.println("Singleton class object is executing me - I am inside Singleton class!");
    }

    // special case: working with multithreading
       // private static volatile object
       // private constructor
       // public static getInstance method: should have synchronized(mutex) wrapped for new object creation
}
