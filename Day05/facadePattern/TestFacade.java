package Day05.facadePattern;

public class TestFacade {
    public static void main(String[] args) {
        ServerFacade serverFacade = new ServerFacade();
        serverFacade.startServer();
        serverFacade.stopServer();
    }
}
