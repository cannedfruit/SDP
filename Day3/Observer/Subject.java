package Day3.Observer;

/**
 * Created by Sarah on 1/19/2016.
 */
public interface Subject {
    void subscribeObserver(Observer observer);

    void unSubscribeObserver(Observer observer);

    void notifyObservers();

    String subjectDetails();
}
