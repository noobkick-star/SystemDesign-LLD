package LLD.SystemDesign.ObserverDesignPattern;

public interface Observerable {
     void add(Observer observer) ;
     void remove(Observer observer);

     void notifyObservers();

     void setData(int data);

     int getData();


}
