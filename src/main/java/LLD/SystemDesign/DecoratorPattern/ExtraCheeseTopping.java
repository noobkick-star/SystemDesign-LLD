package LLD.SystemDesign.DecoratorPattern;



public class ExtraCheeseTopping implements ToppingDecorator{

    private final  BasePizza basePizza;

    ExtraCheeseTopping(BasePizza basePizza){
        this.basePizza = basePizza ;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
