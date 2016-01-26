package Day03.Decorator;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Decorator
 */
public class SimplyNonVegPizza implements Pizza {

    private static final String desc = "Meat Pizza";
    private static final double cost = 12.99;

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
