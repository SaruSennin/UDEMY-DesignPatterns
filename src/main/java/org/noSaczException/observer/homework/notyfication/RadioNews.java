package org.noSaczException.observer.homework.notyfication;

import org.noSaczException.observer.homework.weatherForecast.WeatherForecast;

public class RadioNews implements Observer {

    @Override
    public void update(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa progonza pogody: " + weatherForecast.getTemperature() + ", ciśnienie:  " + weatherForecast.getPressure() + "hPa");
    }
}
