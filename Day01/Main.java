package Day01;
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

    //lower bounded constraint <? super A>
    //normally only happens when you're reading
    //upper bounded constraints normally happen during writing <? extends number>
    //unbounded wildcards <?> ex: Box<?> = new <Integer> Box()
    // use when reading in and the variable can be access using methods defined in object class
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
/* Generics

E - Element
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types

-Java generics implements parametric polymorphism (type parameter, can take many forms)
-implemented using type erasure -> once the compiler does its type checking, it discards generics
    the JVM never sees the generics info

    if you don't specify a type when you instantiate a generic, it is a raw type -> doesn't catch the
    type checks until runtime (BAD)

-pro: backward compatibility is maintained
-con: generic class info can not be figured out at runtime

fixing compile-time errors is easier than fixing runtime errors
 */

/* Reflection
used to inspect code at runtime without knowing the names of classes and methods.
also used to instantiate new objects, invoke methods and get/set field values

Encoding scheme used by Class.forName()
    B ⇒ byte; C ⇒ char; D ⇒ double; F ⇒ float; I ⇒ int;
    J ⇒ long; Lclass-name ⇒ class-name[];
    S ⇒ short; Z ⇒ boolean
    Use as many "["s as there are dimensions in the array
    ex: Class cStringArray = Class.forName("[[Ljava.lang.String;"); corresponds to a 2D String array (String[][])

to call a constructor:
    default:
        Class c = Class.forName(className);
        c.newInstance();
    non-default:
        Class.getConstructor(Class[] parameterTypes)
        Constructor.newInstance(Object[] parameters)

-can change modifiers (abstract, final, native, private, protected, public, static, strictfp, synchronized, transient, and volatile)
   ex:
    if (!Modifier.isPublic(field.getModifiers()) {
        field.setAccessible(true);
    }
    Object obj = field.get(obj);


 */

