package Day05.facadePattern;

public class ScheduleServerImpl implements ScheduleServer {
    @Override
    public void startBooting() {
        System.out.println("starting to boot");
    }

    @Override
    public void readSystemConfigFile() {
        System.out.println("reading system config file");
    }

    @Override
    public void init() {
        System.out.println("initializing...");
    }

    @Override
    public void initializeContext() {
        System.out.println("initializing context");
    }

    @Override
    public void initializeListeners() {
        System.out.println("initializing listeners");
    }

    @Override
    public void createSystemObjects() {
        System.out.println("creating system objects");
    }

    @Override
    public void releaseProcesses() {
        System.out.println("releasing processes");
    }

    @Override
    public void destroy() {
        System.out.println("destroying...");
    }

    @Override
    public void destroySystemObjects() {
        System.out.println("destroying system objects");
    }

    @Override
    public void destroyListeners() {
        System.out.println("destroying listeners");
    }

    @Override
    public void destroyContext() {
        System.out.println("destroying context");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down. Goodbye.");
    }
}
