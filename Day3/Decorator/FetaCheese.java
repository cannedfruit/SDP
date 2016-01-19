package Day3.Decorator;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Decorator Pattern
 */
public class FetaCheese extends PizzaDecorator {
    private static final double cost = 2.99;
    private static final String desc = "Crumbled Feta cheese";
    Pizza pizza;

    public FetaCheese(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getPrice() {
        return cost + pizza.getPrice();
    }
}
