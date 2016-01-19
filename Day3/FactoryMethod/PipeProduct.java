package Day3.FactoryMethod;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Factory Method
 */
public class PipeProduct implements Product {

    @Override
    public void shipProduct(){
        System.out.println("Pipes were shipped");
    }
}
