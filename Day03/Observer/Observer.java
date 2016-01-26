package Day03.Observer;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Long Exercise 4
 * Observer Pattern
 */
public interface Observer {
    void update(String desc);
    void subscribe();
    void unSubscribe();
}
