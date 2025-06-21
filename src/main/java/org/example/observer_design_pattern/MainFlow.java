package org.example.observer_design_pattern;

public class MainFlow {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer u1 = new User("Alice");
        Observer u2 = new User("Bob");

        subject.attach(u1);
        subject.attach(u2);

        subject.notifyObservers("New video uploaded!");
    }
}
