package Day2.DecoupledHelloWorldWithFactory;

/**
 * Created by Sarah on 1/12/2016.
 * SDP Keith Mannock
 */
public class HelloWorldDecoupledWithFactory {

        public static void main(String[] args) {
            MessageRenderer mr = MessageSupportFactory.getInstance()
                    .getMessageRenderer();
            MessageProvider mp = MessageSupportFactory.getInstance()
                    .getMessageProvider();
            mr.setMessageProvider(mp);
            mr.render();
        }
}
