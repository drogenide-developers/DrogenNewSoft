package drogenidesoftwares.drogenideschool.homework;

/**
 * Created by Vicky on 22-Mar-18.
 */

public class HomeworkModel {
    public String getHomeWorkTitle() {
        return homeWorkTitle;
    }

    public void setHomeWorkTitle(String homeWorkTitle) {
        this.homeWorkTitle = homeWorkTitle;
    }

    public String getHomeWorkDate() {
        return homeWorkDate;
    }

    public void setHomeWorkDate(String homeWorkDate) {
        this.homeWorkDate = homeWorkDate;
    }

    public String getHomeworkSubject() {
        return homeworkSubject;
    }

    public void setHomeworkSubject(String homeworkSubject) {
        this.homeworkSubject = homeworkSubject;
    }

    public String getHomeWorkDescription() {
        return homeWorkDescription;
    }

    public void setHomeWorkDescription(String homeWorkDescription) {
        this.homeWorkDescription = homeWorkDescription;
    }

    private String homeWorkTitle,homeWorkDate,homeworkSubject,homeWorkDescription;
}
