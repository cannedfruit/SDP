package Day05.bridge;

public class CentralLocking implements Product {

    private String name;

    public CentralLocking(String name){
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
