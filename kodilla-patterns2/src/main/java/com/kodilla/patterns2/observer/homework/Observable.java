package com.kodilla.patterns2.observer.homework;

public interface Observable {

    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObservers(Observer observer);
}
