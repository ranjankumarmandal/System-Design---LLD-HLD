package org.example.observer_design_pattern;

public class MainFlow {
    public static void main(String[] args) {
        // Observer Design pattern
           // Create a functional interface Observer: with update abstract method
           // Create a User class implements Observer
           // create Subject class for

        Observer u1 = new User("Alice");
        Observer u2 = new User("Bob");

        Subject subject = new Subject();
        subject.attach(u1);
        subject.attach(u2);

        subject.notifyObservers("New video uploaded!");
    }
}
