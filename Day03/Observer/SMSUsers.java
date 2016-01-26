package Day03.Observer;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Long Exercise 4
 * Observer Pattern
 */
public class SMSUsers implements  Observer{
    private Subject subject;
    private String msg;
    private String desc;

    public SMSUsers(Subject s, String msg){
        this.subject = s;
        this.msg = msg;
        this.desc = "";
    }

    @Override
    public void update(String desc) {
        this.desc = desc;
    }

    @Override
    public void subscribe() {
        subject.subscribeObserver(this);
    }

    @Override
    public void unSubscribe() {
        subject.unSubscribeObserver(this);
    }

    public String toString(){
        return msg + " - " + desc;
    }
}
