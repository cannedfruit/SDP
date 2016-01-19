package Day3.Decorator;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Decorator Pattern
 */
public class SimplyVegPizza implements Pizza{

    private static final String desc = "Vegetarian Pizza";
    private static final double cost = 10.99;

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
