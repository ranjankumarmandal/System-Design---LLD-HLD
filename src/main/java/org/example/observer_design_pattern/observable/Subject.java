package org.example.observer_design_pattern.observable;

import org.example.observer_design_pattern.osbserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        for(Observer o : observers) {
            o.update(message);
        }
    }
}
