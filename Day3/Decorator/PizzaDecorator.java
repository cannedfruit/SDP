package Day3.Decorator;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Decorator Pattern
 */
public abstract class PizzaDecorator implements Pizza{
    public abstract String getDesc();

    public abstract double getPrice();
}
