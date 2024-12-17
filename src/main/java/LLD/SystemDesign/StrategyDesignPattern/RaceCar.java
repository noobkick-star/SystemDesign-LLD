package LLD.SystemDesign.StrategyDesignPattern;

public class RaceCar extends Vehicle{
    public RaceCar() {
        super(new SpecialDriveStrategy());
    }
}
