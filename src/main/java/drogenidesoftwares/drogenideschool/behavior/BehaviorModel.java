package drogenidesoftwares.drogenideschool.behavior;

/**
 * Created by Vicky on 22-Mar-18.
 */

public class BehaviorModel {

    public String getBehaviorSubject() {
        return behaviorSubject;
    }

    public void setBehaviorSubject(String behaviorSubject) {
        this.behaviorSubject = behaviorSubject;
    }

    public String getSubjectRating() {
        return subjectRating;
    }

    public void setSubjectRating(String subjectRating) {
        this.subjectRating = subjectRating;
    }

    public String getSubjectRemark() {
        return subjectRemark;
    }

    public void setSubjectRemark(String subjectRemark) {
        this.subjectRemark = subjectRemark;
    }

    String behaviorSubject;
    String subjectRating;
    String subjectRemark;

}
