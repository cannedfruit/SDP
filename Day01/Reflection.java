package Day01;
/**
 * Created by sconno05 on 05/01/2016.
 * Day 1 Reflection
 */
public class Reflection {

    private int age;
    private String name;
    private static int id = 0;

    public Reflection(int age, String name){
        this.age = age;
        this.name = name;
        this.id = id + 1;
    }
}
