package LLD.SystemDesign.StrategyDesignPattern;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("special drive strategy used");
    }
}