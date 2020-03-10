package Chapter_2_Observer.weatherStationWithOutImportUtil;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity =  humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0)
            observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }
}
