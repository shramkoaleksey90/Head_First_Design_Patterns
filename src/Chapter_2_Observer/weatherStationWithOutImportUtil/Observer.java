package Chapter_2_Observer.weatherStationWithOutImportUtil;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
