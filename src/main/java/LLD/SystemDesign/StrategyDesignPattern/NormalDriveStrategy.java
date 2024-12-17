package LLD.SystemDesign.StrategyDesignPattern;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("normal drive strategy used");
    }
}
