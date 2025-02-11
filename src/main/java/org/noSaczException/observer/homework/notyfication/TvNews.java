package org.noSaczException.observer.homework.notyfication;

import org.noSaczException.observer.homework.weatherForecast.WeatherForecast;

public class TvNews implements Observer {

    @Override
    public void update(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa progonza pogody: " + weatherForecast.getTemperature() + ", ciśnienie:  " + weatherForecast.getPressure() + "hPa");
    }
}
