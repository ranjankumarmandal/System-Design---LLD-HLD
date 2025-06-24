package org.example.observer_design_pattern;

import org.example.observer_design_pattern.osbserver.Observer;
import org.example.observer_design_pattern.observable.Subject;
import org.example.observer_design_pattern.osbserver.User;

public class MainFlow {
    public static void main(String[] args) {
        // Observer Design pattern:
           // create Observable(add, remove, notifyObservers()) and Observer(update()) interface
           // create class Subject implements Observable & class User implements Observer
           // create Main class and method and call Observer and Observable

        Observer u1 = new User("Alice");
        Observer u2 = new User("Bob");

        Subject subject = new Subject();
        subject.add(u1);
        subject.add(u2);

        subject.notifyObservers("New video uploaded!");
    }
}
