package org.example.singleton_design_pattern;

public class MainClass {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.performTask();
    }
}
