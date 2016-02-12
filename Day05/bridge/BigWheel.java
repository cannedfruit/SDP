package Day05.bridge;

public class BigWheel extends Car {

    private String name;

    public BigWheel(Product product, String name) {
        super(product);
        this.name = name;
    }

    @Override
    public void produceProduct() {
        System.out.println("Modifying product " + product.getName() + " for " + name);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + product.getName() + " for " + name);
    }

    @Override
    public void printDetails() {
        System.out.println("Car: " + name + ", " + "Product: " + product.getName());
    }
}
