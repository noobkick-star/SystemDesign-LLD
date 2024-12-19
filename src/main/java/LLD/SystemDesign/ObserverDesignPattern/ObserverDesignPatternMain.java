package LLD.SystemDesign.ObserverDesignPattern;


public class ObserverDesignPatternMain {
    public static void main(String[] args) {
        Observerable temperatureObservable = new TemperatureObservable();
        Observerable humidityObservable = new HumidityObservable();
        Observer obj1 = new MobileScreenObserver();
        Observer obj2 = new TvScreenObserver();
        temperatureObservable.add(obj1);
        temperatureObservable.add(obj2);
        humidityObservable.add(obj1);

        temperatureObservable.setData(3);
        humidityObservable.setData(2);




    }
}
