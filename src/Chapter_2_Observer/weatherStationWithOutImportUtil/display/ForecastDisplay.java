package Chapter_2_Observer.weatherStationWithOutImportUtil.display;

import Chapter_2_Observer.weatherStationWithOutImportUtil.DisplayElement;
import Chapter_2_Observer.weatherStationWithOutImportUtil.Observer;
import Chapter_2_Observer.weatherStationWithOutImportUtil.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure ;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
