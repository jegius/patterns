package orealy.observer.manualobserver.models;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int observerIndex = observers.indexOf(observer);
        if (observerIndex >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChange() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float himidity, float pressure) {
        this.temperature = temperature;
        this.humidity = himidity;
        this.pressure = pressure;
        measurementsChange();
    }
}
