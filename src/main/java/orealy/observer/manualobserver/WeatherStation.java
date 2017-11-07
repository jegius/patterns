package orealy.observer.manualobserver;

import orealy.observer.manualobserver.models.CurrentConditionsDisplay;
import orealy.observer.manualobserver.models.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 39.3f);
        weatherData.setMeasurements(70, 62, 29.3f);
        weatherData.setMeasurements(78, 90, 32.3f);
    }
}
