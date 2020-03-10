package Chapter_2_Observer.weatherStationWithOutImportUtil;

import Chapter_2_Observer.weatherStationWithOutImportUtil.display.ForecastDisplay;
import Chapter_2_Observer.weatherStationWithOutImportUtil.display.HeatIndexDisplay;
import Chapter_2_Observer.weatherStationWithOutImportUtil.display.StatisticsDisplay;
import Chapter_2_Observer.weatherStationWithOutImportUtil.display.ThirdPartDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =  new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        ThirdPartDisplay thirdPartDisplay = new ThirdPartDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
