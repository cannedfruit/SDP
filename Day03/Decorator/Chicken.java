package Day03.Decorator;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Decorator Pattern
 */
public class Chicken extends PizzaDecorator{
    private static final double cost = 1.99;
    private static final String desc = "Sliced chicken breast";
    Pizza pizza;

    public Chicken(Pizza pizza) {
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
