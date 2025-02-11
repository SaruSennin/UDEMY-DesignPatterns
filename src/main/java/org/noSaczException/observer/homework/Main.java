package org.noSaczException.observer.homework;

import org.noSaczException.observer.homework.notyfication.InternetNews;
import org.noSaczException.observer.homework.notyfication.RadioNews;
import org.noSaczException.observer.homework.notyfication.TvNews;
import org.noSaczException.observer.homework.weatherForecast.WeatherForecast;

public class Main {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);

        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.notifyObservers();

        weatherForecast.removeObserver(tvNews);
        weatherForecast.removeObserver(radioNews);

        System.out.println("\nNowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weatherForecast.updateForecast(18, 1007);
    }
}
