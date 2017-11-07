package orealy.observer.observerwithjavaapi;

import orealy.observer.observerwithjavaapi.models.CurrentConditionsDisplay;
import orealy.observer.observerwithjavaapi.models.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData anotherWeatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(anotherWeatherData);

        anotherWeatherData.setMeasurements(80, 65, 39.3f);
        anotherWeatherData.setMeasurements(70, 62, 29.3f);
        anotherWeatherData.setMeasurements(78, 90, 32.3f);
    }
}
