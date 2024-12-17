package LLD.SystemDesign.StrategyDesignPattern;

public class NormalCar extends Vehicle{
    public NormalCar() {
        super(new NormalDriveStrategy());
    }
}
