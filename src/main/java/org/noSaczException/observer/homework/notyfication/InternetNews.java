package org.noSaczException.observer.homework.notyfication;

import org.noSaczException.observer.homework.weatherForecast.WeatherForecast;

public class InternetNews implements Observer {

    @Override
    public void update(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa progonza pogody: " + weatherForecast.getTemperature() + ", ciśnienie:  " + weatherForecast.getPressure() + "hPa");
    }
}
