package Day05.bridge;

public class GearLocking implements Product {

    private String name;

    public GearLocking(String name) {
        this.name = name;
    }

    @Override
    public void produce() {
        System.out.println("Producing " + name);
    }

    @Override
    public String getName() {
        return name;
    }
}
