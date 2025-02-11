package org.noSaczException.observer.example.order;

import org.noSaczException.observer.example.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
