import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        List<Lion> enclosure = new ArrayList();
        enclosure.add(new Lion(12));
        enclosure.add(new Lion(18));
        sort(enclosure);

        List<Animal> zoo = new ArrayList();
        zoo.add(new Lion(23));
        zoo.add(new Zebra(10));

        Reflection test = new Reflection(12, "abc");
        System.out.println(test.getClass());
        Class c1 = Class.forName("Reflection");
        System.out.println(c1);
        System.out.println(Arrays.toString(c1.getConstructors()));
        System.out.println(Arrays.toString(c1.getDeclaredFields()));
        Class c2 = Class.forName("Lion");
        System.out.println(c2.getSuperclass());
    }

    //lower bounded constraint
    //normally only happens when you're reading
    //upper bounded constraints normally happen during writing
    public static <A extends Comparable<? super A>> void sort(List<A> list){

        //throw new NotImplementedException();

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

