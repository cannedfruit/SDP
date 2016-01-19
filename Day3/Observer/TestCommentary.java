package Day3.Observer;

import java.util.ArrayList;

/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Long Exercise 4
 * Observer Pattern
 */
public class TestCommentary {
    public static void main(String[] args) {
        Subject subject = new CommentaryObject(new ArrayList<>(),
                "Soccer - Match[2014AUG24]");
        Observer observer = new SMSUsers(subject, "Adam Warner [New York]");
        observer.subscribe();
        System.out.println(subject);
        Observer observer2 = new SMSUsers(subject, "Wayne Rooney [Manchester]");
        observer2.subscribe();
        Commentary cObject = ((Commentary) subject);
        cObject.setDesc("Welcome to live Soccer match");
        System.out.println(subject);
        cObject.setDesc("Current score 0-0");
        System.out.println(subject);
        observer2.unSubscribe();
        System.out.println(subject);
        cObject.setDesc("It’s a goal!!");
        cObject.setDesc("Current score 1-0");
        System.out.println();
        Observer observer3 = new SMSUsers(subject, "Marie [Paris]");
        observer3.subscribe();
        System.out.println(subject);
        cObject.setDesc("It’s another goal!!");
        cObject.setDesc("Half-time score 2-0");
        System.out.println(subject);
    }
}
