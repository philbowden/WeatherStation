package observers;

import observables.WeatherStation;

public class CurrentConditionsDisplay implements IObserver, IDisplay {
    private double temp;
    private double humidity;
    private double pressure;

    private WeatherStation weatherStation;
    @Override
    public void display() {

    }

    @Override
    public void update(double temp, double humidity, double pressure) {

    }
}
