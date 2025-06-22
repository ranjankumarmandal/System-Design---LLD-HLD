package org.example.observer_design_pattern;

public class MainFlow {
    public static void main(String[] args) {
        // Observer Design pattern:
           // create a functional interface Observer: with update abstract method
           // create a User class implements Observer: definition of update() and User name
           // create Subject class for with arrayList of users/Observer to attach, detach and notifyObservers or users
           // call same implementations on main method

        Observer u1 = new User("Alice");
        Observer u2 = new User("Bob");

        Subject subject = new Subject();
        subject.attach(u1);
        subject.attach(u2);

        subject.notifyObservers("New video uploaded!");
    }
}
