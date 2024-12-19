package LLD.SystemDesign.ObserverDesignPattern;


public class MobileScreenObserver implements Observer {

    @Override
    public void update(Observerable observerable) {
        System.out.println("printing in mobile screen" + observerable.getData());
    }
}
