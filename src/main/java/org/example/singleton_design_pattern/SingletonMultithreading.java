package org.example.singleton_design_pattern;

public class SingletonMultithreading {
    // special case: working with multithreading
        // private static volatile object
        // private constructor
        // public static getInstance method: should have synchronized(mutex) wrapped for new object creation

    private static volatile SingletonMultithreading obj;

    private SingletonMultithreading() {}

    public static SingletonMultithreading getInstance() {
        if(obj == null) {
            synchronized (SingletonMultithreading.class) {
                if(obj == null) {
                    obj = new SingletonMultithreading();
                }
            }
        }

        return obj;
    }
}
