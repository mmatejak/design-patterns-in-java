package com.mtjk.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private final List<Observer> observers;
    private String state;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
