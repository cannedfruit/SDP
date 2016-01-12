package Day2.thirdClient;

//import Day2.orig.AImplNew;
import Day2.spec.A;
//import Day2.first.AImpl;

/**
 * Created by Sarah on 1/12/2016.
 */
public class AClient {
    public static void main(String[] args) {
        //
        A a = AFactory.getInstance();
        System.out.println(a.getClass().getName());
    }
}
