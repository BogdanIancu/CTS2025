package com.netlfex.observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Observable {
    protected Set<Observer> observers = new HashSet<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for(Observer o : observers) {
            o.receiveNotification(message);
        }
    }
}
