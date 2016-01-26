package Day03.FactoryMethod;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Factory Method
 */
public class ConcreteProduct implements Product {

    @Override
    public void shipProduct(){
        System.out.println("ConcreteProduct was shipped");
    }
}
