package org.example.observer_design_pattern.observable;

import org.example.observer_design_pattern.osbserver.Observer;

public interface Observable {
    void add(Observer o);
    void remove(Observer o);
    void notifyObservers(String message);
}
