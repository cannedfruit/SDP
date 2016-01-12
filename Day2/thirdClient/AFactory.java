package Day2.thirdClient;

import Day2.second.AImpl;
import Day2.spec.A;

/**
 * Created by Sarah on 1/12/2016.
 */
public class AFactory {
        public static A getInstance(){
            return new AImpl();
        }

}
