package drogenidesoftwares.drogenideschool.schedule;

/**
 * Created by Vicky on 29-Mar-18.
 */

public class examScheduleModel {
    String examTitle;

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    String examDate;

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    public String getExamDetail() {
        return examDetail;
    }

    public void setExamDetail(String examDetail) {
        this.examDetail = examDetail;
    }

    String examDetail;
}
