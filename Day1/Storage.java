package Day1;

/**
 * SDP Day 1
 * @author Sarah on 1/8/2016.
 */
public class Storage<T> {
    T x;
    public void setValue(T value) {
        x = value;
    }
    public T getValue() {
        return x;
    }
}
