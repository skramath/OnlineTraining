package sarath.behaviour.observer;

public interface Subject {

    /*
    subscribeObserver, which is used to subscribe observers or we can say register the observers so that if there is a change
    in the state of the subject, all these observers should get notified.
    */
    public void subscribeObserver(Observer observer);

    /*
    unSubscribeObserver, which is used to unsubscribe observers so that if there is a change in the state of the subject, this
    unsubscribed observer should not get notified.
    */
    public void unSubscribeObserver(Observer observer);

    /*
    NotifyObservers, this method notifies the registered observers when there is a change in the state of the subject.
    */
    public void notifyObserver();

    public String subjectDetails();
}
