package Day05.bridge;

/*
* the implementor of the bridge pattern
 */
public abstract class Car {

    protected Product product;


    public Car(Product product){
        this.product = product;
        product.produce();
    }

    public abstract void produceProduct();

    public abstract void assemble();

    public abstract void printDetails();
}
