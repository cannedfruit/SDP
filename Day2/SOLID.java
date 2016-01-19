package Day2;

/**
 * Created by Sarah on 1/12/2016.
 */
public class SOLID {

    /*separating the interfaces from the spec
    interfaces <-> abstract<-> classes
        normally put interfaces into packages and implementation into packages but where should the abstracts go?
    Dependency injection:
        the injection is the compiler relying on an external file telling it which implementation to use.
        -> configuration file put it in a jar file which contains class files. at the top of that specifies what class uses what, where
        can be done via annotations, scanning byte code...
        dependency management: jigsaw (compile time management), OSGi (Runtime management)
        Injection frameworks: SpringDI, Guice/Dagger, CDI, Jave EE...
        (Dagger is exclusively in Java,
        Spring DI creates a Spring framework which is an alternative to Java Enterprise but is heavy and has IDE support,
        Guice is lighter and Dagger is even lighter)
    design by contract will be seen later

    common patterns of design based of c++ code (structural, behavioural...)
    singleton pattern - only want one instance of a class
    */


}
