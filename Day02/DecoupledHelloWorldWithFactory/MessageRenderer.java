package Day02.DecoupledHelloWorldWithFactory;

/**
 * Created by Sarah on 1/12/2016.
 * SDP Keith Mannock
 */
public interface MessageRenderer {

    public void render();

    public void setMessageProvider(MessageProvider provider);

    public MessageProvider getMessageProvider();
}
