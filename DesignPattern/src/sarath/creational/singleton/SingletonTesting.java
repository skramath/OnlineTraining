package sarath.creational.singleton;

public class SingletonTesting {

    public void testSingletonSimple(){
        System.out.println("Singleton Simple Result");
        System.out.println(SingletonSimple.getInstance());
        System.out.println(SingletonSimple.getInstance());
        System.out.println(SingletonSimple.getInstance());
        System.out.println(SingletonSimple.getInstance());
    }

    public static void main(String args[]){

        new SingletonTesting().testSingletonSimple();
        new SingletonTesting().testSingletonComplete();
        new SingletonTesting().testSingletonEnums();
    }

    private void testSingletonEnums() {
        System.out.println("Enum Result");
        System.out.println(SingletonEnum.getInstance().hashCode());
        System.out.println(SingletonEnum.getInstance().hashCode());
        System.out.println(SingletonEnum.getInstance().hashCode());
        System.out.println(SingletonEnum.getInstance().hashCode());
    }

    private void testSingletonComplete() {

        System.out.println("Singeton Complete result");
        SingletonComplete sc1 = SingletonComplete.getInstance();
        SingletonComplete sc2 = SingletonComplete.getInstance();
        SingletonComplete sc3 = SingletonComplete.getInstance();
        System.out.println(sc1.getClass().hashCode());
        System.out.println(sc2.getClass().hashCode());
        System.out.println(sc3.getClass().hashCode());

    }


}
