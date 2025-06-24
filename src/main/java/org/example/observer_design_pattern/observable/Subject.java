package org.example.observer_design_pattern.observable;

import org.example.observer_design_pattern.osbserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        boolean notifyEventReceived = true;

        if(notifyEventReceived) {
            for(Observer o : observers) {
                o.update(message);
            }
        }
    }
}