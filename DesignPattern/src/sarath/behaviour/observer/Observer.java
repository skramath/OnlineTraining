package sarath.behaviour.observer;

public interface Observer {

    /*
    update(String desc), method is called by the subject on the observer in order to notify it, when there is a change in the
    state of the subject.
    */
    public void update(String desc);

    /*method is used to subscribe itself with the subject.*/
    public void subscribe();

    /*method is used to unsubscribe itself with the subject.*/
    public void unSubscribe();

}
