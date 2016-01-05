import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Lion> enclosure = new ArrayList();
        enclosure.add(new Lion(12));
        enclosure.add(new Lion(18));
        sort(enclosure);

        List<Animal> zoo = new ArrayList();
        zoo.add(new Lion(23));
        zoo.add(new Zebra(10));
        System.out.println("Hello World!");
    }

    //lower bounded constraint
    //normally only happens when you're reading
    //upper bounded constraints normally happen during writing
    public static <A extends Comparable<? super A>> void sort(List<A> list){
        throw new NotImplementedException();
    }
}

class Animal implements Comparable<Animal>{
    private Integer age;

    @Override
    public int compareTo(Animal animal) {
        return age.compareTo(animal.age);
    }
}
class Lion extends Animal{
    private Integer age;

    public Lion(int age){
        this.age = age;
    }
}
class Zebra extends Animal{
    private Integer age;

    public Zebra(int age){
        this.age = age;
    }
}

