package Chapter_2_Observer.weatherStationWithOutImportUtil;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void  notifyObserver();
}
