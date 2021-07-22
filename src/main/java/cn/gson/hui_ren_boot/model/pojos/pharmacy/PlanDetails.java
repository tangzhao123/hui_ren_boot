package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PLAN_DETAILS", schema = "HUIREN")
public class PlanDetails {

    private long planId;
    private String planSerial;
    private Long planPrice;
    private String drugId;
    private Long supplierId;
    private Long planNum;
    private String purchaseId;



    @Id
    @Column(name = "PLAN_ID")
    public long getPlanId() {
        return planId;
    }

    public void setPlanId(long planId) {
        this.planId = planId;
    }

    @Basic
    @Column(name = "PLAN_SERIAL")
    public String getPlanSerial() {
        return planSerial;
    }

    public void setPlanSerial(String planSerial) {
        this.planSerial = planSerial;
    }

    @Basic
    @Column(name = "PLAN_PRICE")
    public Long getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(Long planPrice) {
        this.planPrice = planPrice;
    }

    @Basic
    @Column(name = "DRUG_ID")
    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    @Basic
    @Column(name = "SUPPLIER_ID")
    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "PLAN_NUM")
    public Long getPlanNum() {
        return planNum;
    }

    public void setPlanNum(Long planNum) {
        this.planNum = planNum;
    }

    @Basic
    @Column(name = "PURCHASE_ID")
    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanDetails that = (PlanDetails) o;
        return planId == that.planId && Objects.equals(planSerial, that.planSerial) && Objects.equals(planPrice, that.planPrice) && Objects.equals(drugId, that.drugId) && Objects.equals(supplierId, that.supplierId) && Objects.equals(planNum, that.planNum) && Objects.equals(purchaseId, that.purchaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, planSerial, planPrice, drugId, supplierId, planNum, purchaseId);
    }
}
