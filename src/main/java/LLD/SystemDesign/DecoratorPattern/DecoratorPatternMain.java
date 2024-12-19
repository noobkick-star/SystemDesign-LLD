package LLD.SystemDesign.DecoratorPattern;

public class DecoratorPatternMain {

//    notes
//    it has a is a and is a relation , we use this to avoid class bursting
    public static void main(String[] args) {
        BasePizza iconicPizza = new ExtraMushroomTopping(new ExtraCheeseTopping(new ExtraCheeseTopping(new FarmDelightBasePizza())));
        System.out.println(iconicPizza.cost());
    }
}
