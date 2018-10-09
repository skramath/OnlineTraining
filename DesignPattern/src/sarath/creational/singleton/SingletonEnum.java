package sarath.creational.singleton;

public class SingletonEnum {

    public enum SingleEnum{
        SINGLE_ENUM;
    }

    public static SingleEnum getInstance(){
        return SingleEnum.SINGLE_ENUM;
    }
}
