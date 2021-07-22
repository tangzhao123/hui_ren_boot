package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PLAN_DETAILS", schema = "HUIREN")
public class PlanDetails {

    private long planId;
    private String planSerial;
    private Long purchasePrice;
    private String drugId;
    private Long supplierId;
    private Long planNum;
    private String purchaseId;
    private DrugSupplier suppliers;
    private List<DrugInfo> drugInfos;

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
    @Column(name = "PURCHASE_PRICE")
    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
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

    @OneToOne
    public DrugSupplier getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(DrugSupplier suppliers) {
        this.suppliers = suppliers;
    }


    @OneToMany
    public List<DrugInfo> getDrugInfos() {
        return drugInfos;
    }

    public void setDrugInfos(List<DrugInfo> drugInfos) {
        this.drugInfos = drugInfos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanDetails that = (PlanDetails) o;
        return planId == that.planId && Objects.equals(planSerial, that.planSerial) && Objects.equals(purchasePrice, that.purchasePrice) && Objects.equals(drugId, that.drugId) && Objects.equals(supplierId, that.supplierId) && Objects.equals(planNum, that.planNum) && Objects.equals(purchaseId, that.purchaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, planSerial, purchasePrice, drugId, supplierId, planNum, purchaseId);
    }

    @Override
    public String toString() {
        return "PlanDetails{" +
                "planId=" + planId +
                ", planSerial='" + planSerial + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", drugId='" + drugId + '\'' +
                ", supplierId=" + supplierId +
                ", planNum=" + planNum +
                ", purchaseId='" + purchaseId + '\'' +
                ", suppliers=" + suppliers +
                '}';
    }
}
