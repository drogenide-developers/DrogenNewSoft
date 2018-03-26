package drogenidesoftwares.drogenideschool.payment;

/**
 * Created by Vicky on 23-Mar-18.
 */

public class PaymentModel {
    private String paymentStudentName;

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    private String paymentStatus;

    public String getPaymentStudentName() {
        return paymentStudentName;
    }

    public void setPaymentStudentName(String paymentStudentName) {
        this.paymentStudentName = paymentStudentName;
    }

    public String getPaymentTitle() {
        return PaymentTitle;
    }

    public void setPaymentTitle(String paymentTitle) {
        PaymentTitle = paymentTitle;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        PaymentDate = paymentDate;
    }

    private String PaymentTitle;
    private String paymentAmount;
    private String PaymentDate;
}
