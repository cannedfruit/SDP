package Day3.Decorator;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Decorator Pattern
 */
public class Spinach extends PizzaDecorator {
    private static final double cost = 1.99;
    private static final String desc = "fresh baby spinach";
    Pizza pizza;

    public Spinach(Pizza pizza) {
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
