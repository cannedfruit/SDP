package Day3.Observer;

/**
 * Created by Sarah on 1/19/2016.
 */
public interface Observer {
    void update(String desc);
    void subscribe();
    void unSubscribe();
}
