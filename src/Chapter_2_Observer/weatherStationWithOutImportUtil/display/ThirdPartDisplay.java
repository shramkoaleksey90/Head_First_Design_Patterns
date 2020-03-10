package Chapter_2_Observer.weatherStationWithOutImportUtil.display;

import Chapter_2_Observer.weatherStationWithOutImportUtil.DisplayElement;
import Chapter_2_Observer.weatherStationWithOutImportUtil.Observer;
import Chapter_2_Observer.weatherStationWithOutImportUtil.WeatherData;

public class ThirdPartDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ThirdPartDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("New view of temperature "+ temperature);
        System.out.print(" New view of humidity "+ humidity);
        System.out.print(" New view of pressure "+ pressure);
        System.out.println();
    }
}
