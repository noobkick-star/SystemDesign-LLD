package LLD.SystemDesign.DecoratorPattern;


public class ExtraMushroomTopping implements ToppingDecorator{

    private final BasePizza basePizza;
    ExtraMushroomTopping(BasePizza basePizza){
        this.basePizza = basePizza ;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}
