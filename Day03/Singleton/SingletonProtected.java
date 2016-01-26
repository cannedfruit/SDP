package Day03.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
/**
 * Created by Sarah on 1/19/2016.
 * SDP Day 3 Long Exercise 2
 * Singleton Pattern
 */
public class SingletonProtected  implements Serializable {
        private static final long serialVersionUID = -1093810940935189395L;
        private volatile static SingletonProtected sc;

        //2.(a) singleton can become thread safe by synchronizing the construction
        //      and declaring the singleton variable as volatile
        //2.(b) Multithreading increases speed by having multiple threads perform tasks concurrently
        //      By synchronising the constructor, only one thread can access it at a time and as a result
        //      the benefit of multithreading is lost
        //2.(d) see 2.a the alternative to 2.a being declaring the whole method getInstance() as synchronized
        private SingletonProtected() {
            if(sc == null){
                synchronized (SingletonProtected.class){
                    if(sc == null){
                        sc = new SingletonProtected();
                    }
                }
            } else {
                throw new IllegalStateException("Already created.");
            }
        }

        private static Class getClass(String classname) throws ClassNotFoundException {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            if (classLoader == null)
                classLoader = SingletonProtected.class.getClassLoader();
            return (classLoader.loadClass(classname));


        }

        public static SingletonProtected getInstance() {
            return sc;
        }

        private Object readResolve() throws ObjectStreamException {
            return sc;
        }

        private Object writeReplace() throws ObjectStreamException {
            return sc;
        }


        @Override
        public Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException("Singleton, cannot be cloned");
        }
}
