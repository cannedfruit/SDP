package Day02.DecoupledHelloWorldWithFactory;

/**
 * Created by Sarah on 1/12/2016.
 * SDP Keith Mannock
 */
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World!";
    }

}