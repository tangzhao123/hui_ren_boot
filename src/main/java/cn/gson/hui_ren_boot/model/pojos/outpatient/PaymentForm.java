package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * 缴费表
 */
@Entity
@Table(name = "PAYMENT_FORM", schema = "HUIREN", catalog = "")
public class PaymentForm {
    private long paymentId;
    private String paymentNo;
    private String recordsNo;
    private double paymentMoney;
    private Date paymentTime;
    private long staffId;
    private long paymentType;
    private double paymentSum;
    private double paymentSmall;
    private List<PrescriptionDetail> prescriptionDetails;
    private String treatmentNo;
    private double treatmentBalance;
    private String rechargeType;

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getTreatmentNo() {
        return treatmentNo;
    }

    public void setTreatmentNo(String treatmentNo) {
        this.treatmentNo = treatmentNo;
    }

    public double getTreatmentBalance() {
        return treatmentBalance;
    }

    public void setTreatmentBalance(double treatmentBalance) {
        this.treatmentBalance = treatmentBalance;
    }

    @OneToMany
    public List<PrescriptionDetail> getPrescriptionDetails() {
        return prescriptionDetails;
    }

    public void setPrescriptionDetails(List<PrescriptionDetail> prescriptionDetails) {
        this.prescriptionDetails = prescriptionDetails;
    }

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "PAYMENT_ID")
    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    @Basic
    @Column(name = "PAYMENT_NO")
    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    @Basic
    @Column(name = "RECORDS_NO")
    public String getRecordsNo() {
        return recordsNo;
    }

    public void setRecordsNo(String recordsNo) {
        this.recordsNo = recordsNo;
    }

    @Basic
    @Column(name = "PAYMENT_MONEY")
    public double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    @Basic
    @Column(name = "PAYMENT_TIME")
    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Basic
    @Column(name = "STAFF_ID")
    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "PAYMENT_TYPE")
    public long getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(long paymentType) {
        this.paymentType = paymentType;
    }

    @Basic
    @Column(name = "PAYMENT_SUM")
    public double getPaymentSum() {
        return paymentSum;
    }

    public void setPaymentSum(double paymentSum) {
        this.paymentSum = paymentSum;
    }

    @Basic
    @Column(name = "PAYMENT_SMALL")
    public double getPaymentSmall() {
        return paymentSmall;
    }

    public void setPaymentSmall(double paymentSmall) {
        this.paymentSmall = paymentSmall;
    }

    @Override
    public String toString() {
        return "PaymentForm{" +
                "paymentId=" + paymentId +
                ", paymentNo='" + paymentNo + '\'' +
                ", recordsNo='" + recordsNo + '\'' +
                ", paymentMoney=" + paymentMoney +
                ", paymentTime=" + paymentTime +
                ", staffId=" + staffId +
                ", paymentType=" + paymentType +
                ", paymentSum=" + paymentSum +
                ", paymentSmall=" + paymentSmall +
                ", prescriptionDetails=" + prescriptionDetails +
                '}';
    }
}
