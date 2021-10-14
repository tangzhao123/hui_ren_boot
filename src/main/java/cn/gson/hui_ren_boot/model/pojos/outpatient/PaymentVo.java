package cn.gson.hui_ren_boot.model.pojos.outpatient;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PaymentVo {
    private String outpatientName;
    private int outpatientSex;
    private String outpatientAge;
    private String paymentNo;
    private String recordsNo;
    private double paymentMoney;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date paymentTime;
    private long paymentType;
    private double paymentSum;
    private double paymentSmall;
    private String staffName;
    private String treatmentName;
    private Date start;
    private Date end;
    private int pageNo;
    private int size;

    public String getOutpatientName() {
        return outpatientName;
    }

    public void setOutpatientName(String outpatientName) {
        this.outpatientName = outpatientName;
    }

    public int getOutpatientSex() {
        return outpatientSex;
    }

    public void setOutpatientSex(int outpatientSex) {
        this.outpatientSex = outpatientSex;
    }

    public String getOutpatientAge() {
        return outpatientAge;
    }

    public void setOutpatientAge(String outpatientAge) {
        this.outpatientAge = outpatientAge;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getRecordsNo() {
        return recordsNo;
    }

    public void setRecordsNo(String recordsNo) {
        this.recordsNo = recordsNo;
    }

    public double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public long getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(long paymentType) {
        this.paymentType = paymentType;
    }

    public double getPaymentSum() {
        return paymentSum;
    }

    public void setPaymentSum(double paymentSum) {
        this.paymentSum = paymentSum;
    }

    public double getPaymentSmall() {
        return paymentSmall;
    }

    public void setPaymentSmall(double paymentSmall) {
        this.paymentSmall = paymentSmall;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }
}
