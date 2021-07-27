package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PURCHASE_PLAN", schema = "HUIREN")
public class PurchasePlan {

    private long purchaseSerial;
    private String purchaseId;
    private Long operator;
    private String staffName;
    private Long purchaseAmount;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date purchaseDate;
    private Long purchaseState;
    private List<PlanDetails> planDetails;


    @Id
    @Column(name = "PURCHASE_SERIAL")
    public long getPurchaseSerial() {
        return purchaseSerial;
    }

    public void setPurchaseSerial(long purchaseSerial) {
        this.purchaseSerial = purchaseSerial;
    }

    @Basic
    @Column(name = "PURCHASE_ID")
    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    @Basic
    @Column(name = "OPERATOR")
    public Long getOperator() {
        return operator;
    }

    public void setOperator(Long operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "PURCHASE_AMOUNT")
    public Long getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Long purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }


    @Basic
    @Column(name = "PURCHASE_DATE")
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Basic
    @Column(name = "PURCHASE_STATE")
    public Long getPurchaseState() {
        return purchaseState;
    }

    public void setPurchaseState(Long purchaseState) {
        this.purchaseState = purchaseState;
    }

    @OneToMany
    public List<PlanDetails> getPlanDetails() {
        return planDetails;
    }

    public void setPlanDetails(List<PlanDetails> planDetails) {
        this.planDetails = planDetails;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchasePlan that = (PurchasePlan) o;
        return purchaseSerial == that.purchaseSerial && Objects.equals(purchaseId, that.purchaseId) && Objects.equals(operator, that.operator) && Objects.equals(purchaseAmount, that.purchaseAmount) && Objects.equals(purchaseDate, that.purchaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchaseSerial, purchaseId, operator, purchaseAmount, purchaseDate);
    }

    @Override
    public String toString() {
        return "PurchasePlan{" +
                "purchaseSerial=" + purchaseSerial +
                ", purchaseId='" + purchaseId + '\'' +
                ", operator=" + operator +
                ", purchaseAmount=" + purchaseAmount +
                ", purchaseDate=" + purchaseDate +
                ", planDetails=" + planDetails +
                '}';
    }
}