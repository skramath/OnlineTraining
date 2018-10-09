package sarath.creational.singleton;

public class SingletonSimple {

    private static SingletonSimple singleton = null;

    private SingletonSimple(){
        System.out.println("Creating a Singletone Instance");
    }

    public static SingletonSimple getInstance(){

        if(singleton == null){
            synchronized (SingletonSimple.class) {
                singleton = new SingletonSimple();
            }
        }
        return singleton;
    }
}
