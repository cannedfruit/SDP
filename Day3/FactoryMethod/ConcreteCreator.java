package Day3.FactoryMethod;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Factory Method
 */
public class ConcreteCreator implements Creator {

    @Override
    public Product getProduct(String productType) {
        if(productType.equalsIgnoreCase("CONCRETEPRODUCT")) {
            return new ConcreteProduct();
        }else if(productType.equalsIgnoreCase("PIPEPRODUCT")){
            return new PipeProduct();
        }
        return null;
    }
}
