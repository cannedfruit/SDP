package Day02.DecoupledHelloWorldWithFactory;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Sarah on 1/12/2016.
 * SDP Keith Mannock
 */
public class MessageSupportFactory {
    //MessageSupportFactory is a singleton
    private static MessageSupportFactory instance = null;
    private Properties props = null;
    private MessageRenderer renderer = null;
    private MessageProvider provider = null;

    private MessageSupportFactory() {
        props = new Properties();

        try {
            props.load(new FileInputStream("/Users/Sarah/IdeaProjects/S_D_P/src/Day2/DecoupledHelloWorldWithFactory/bean.properties"));

            // get the implementation classes
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass)
                    .newInstance();
            provider = (MessageProvider) Class.forName(providerClass)
                    .newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //static initialisation block (could be placed up at the initialisation above but this makes it clearer)
    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
