package Day3.FactoryMethod;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Factory Method
 */
public class TestFactory {
    public static void main(String[] args) {
        Creator factory = new ConcreteCreator();

        Product p1 = factory.getProduct("ConcreteProduct");
        p1.shipProduct();

        Product p2 = factory.getProduct("PipeProduct");
        p2.shipProduct();
    }
}
