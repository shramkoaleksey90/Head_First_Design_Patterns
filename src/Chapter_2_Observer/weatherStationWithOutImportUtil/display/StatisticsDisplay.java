package Chapter_2_Observer.weatherStationWithOutImportUtil.display;

import Chapter_2_Observer.weatherStationWithOutImportUtil.DisplayElement;
import Chapter_2_Observer.weatherStationWithOutImportUtil.Observer;
import Chapter_2_Observer.weatherStationWithOutImportUtil.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTem = 0.0f;
    private float minTem = 200;
    private float temSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (temSum / numReadings)
                + "/" + maxTem + "/" + minTem);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temSum += temp;
        numReadings++;

        if (maxTem < temp){
            maxTem =  temp;
        }

        if (minTem > temp) {
            minTem = temp;
        }

        display();
    }
}
