package org.noSaczException.observer.homework.notyfication;

import org.noSaczException.observer.homework.weatherForecast.WeatherForecast;

public interface Observer {
    void update(WeatherForecast weatherForecast);
}
