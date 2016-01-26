package Day03.Observer;

import java.util.List;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Long Exercise 4
 * Observer Pattern
 */
public class CommentaryObject implements Subject, Commentary{

    private List<Observer> subscribers;
    private static String title;
    private String desc;

    public CommentaryObject(List<Observer> subscribers, String title) {
        this.subscribers = subscribers;
        CommentaryObject.title = title;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        if(observer != null) subscribers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        if(observer != null){
            if (subscribers.contains(observer)) subscribers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o: subscribers
             ) {
            o.update(desc);
        }
    }

    @Override
    public String subjectDetails() {
        return title;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }

    public String toString(){
        String subs = "";
        for (Observer o : subscribers
             ) {
            subs += "\t" + o.toString();
        }
        return subs;
    }
}
