package sarath.behaviour.observer;


import java.util.List;

public class CommentaryObject implements Subject,Commentary {

    private final List<Observer> observers;
    private String desc;
    private final String subjectDetails;

    public CommentaryObject(List<Observer> observers,String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObserver();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        int index  = observers.indexOf(observer);
        observers.remove(index);

    }

    @Override
    public void notifyObserver() {
        System.out.println(" ");
        for(Observer observe : observers){
            observe.update(desc);
        }
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}
