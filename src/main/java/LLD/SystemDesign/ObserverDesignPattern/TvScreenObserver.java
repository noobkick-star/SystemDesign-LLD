package LLD.SystemDesign.ObserverDesignPattern;

import lombok.AllArgsConstructor;

import java.util.List;

public class TvScreenObserver implements Observer {

    @Override
    public void update(Observerable observerable) {
        System.out.println("new tv  screen data is " + observerable.getData());
    }
}
