package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;

import javax.persistence.*;
import java.sql.Time;
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
    private Time paymentTime;
    private List<PrescriptionDetail> prescriptionDetails;

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
    public Time getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Time paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Override
    public String toString() {
        return "PaymentForm{" +
                "paymentId=" + paymentId +
                ", paymentNo='" + paymentNo + '\'' +
                ", recordsNo='" + recordsNo + '\'' +
                ", paymentMoney=" + paymentMoney +
                ", paymentTime=" + paymentTime +
                ", prescriptionDetails=" + prescriptionDetails +
                '}';
    }
}