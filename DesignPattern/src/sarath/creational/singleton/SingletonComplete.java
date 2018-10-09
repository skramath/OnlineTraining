package sarath.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonComplete implements Serializable {

    public final static long serialVersionUID = -123456L;
    private static SingletonComplete sc = new SingletonComplete();

    private SingletonComplete(){
        if(sc != null){
            new IllegalStateException("Already Created");
        }
    }

    public static SingletonComplete getInstance(){
        return sc;
    }

    private Object readResolve() throws ObjectStreamException {
        return  sc;
    }

    private Object writeReplace() throws ObjectStreamException{
        return  sc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, not cloneable");
    }

    private static Class getClass(String className) throws ClassNotFoundException{
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = SingletonComplete.class.getClassLoader();
        }
        return (classLoader.loadClass(className));
    }

}
