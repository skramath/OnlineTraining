package sarath.behaviour.observer;

import java.util.Observable;

public class BuiltInCommentaryObject extends Observable implements Commentary {

    private String desc;
    private final String subjectDetails;

    public BuiltInCommentaryObject(String subjectDetails) {
        this.subjectDetails = subjectDetails;
    }


    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        setChanged();
        notifyObservers();
    }

    public String subjectDetails(){
        return  subjectDetails;
    }
}
