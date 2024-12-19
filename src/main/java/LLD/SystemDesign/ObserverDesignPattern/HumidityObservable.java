package LLD.SystemDesign.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class HumidityObservable implements Observerable{

    private List<Observer> observerList = new ArrayList<>();
    private int humidity = 0 ;
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
    observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> {
            observer.update(this);
        });
    }

    @Override
    public void setData(int data) {
        if(this.humidity != data){
            this.humidity = data ;
            notifyObservers();
        }
    }

    @Override
    public int getData() {
        return this.humidity;
    }
}
