package Day02.thirdClient;

import Day02.second.AImpl;
import Day02.spec.A;

/**
 * Created by Sarah on 1/12/2016.
 */
public class AFactory {
        public static A getInstance(){
            return new AImpl();
        }

}
