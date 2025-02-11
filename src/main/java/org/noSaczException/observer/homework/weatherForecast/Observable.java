package org.noSaczException.observer.homework.weatherForecast;

import org.noSaczException.observer.homework.notyfication.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
