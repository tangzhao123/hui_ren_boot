package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PLAN_DETAILS", schema = "HUIREN")
public class PlanDetails {

    private long planId;
    private String planSerial;
    private double planPrice;
    private String drugId;
    private Long supplierId;
    private Long planNum;
    private String purchaseId;
    private DrugSupplier suppliers;
    private String drugName;
    private String standardName;
    private String supplierName;
    private String typeName;
    private DrugInfo drugInfo;

    @OneToOne
    public DrugInfo getDrugInfo() {
        return drugInfo;
    }

    public void setDrugInfo(DrugInfo drugInfo) {
        this.drugInfo = drugInfo;
    }
    @OneToOne
    public DrugSupplier getSuppliers() {
        return suppliers;
    }
    public void setSuppliers(DrugSupplier suppliers) {
        this.suppliers = suppliers;
    }
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
    public double getPurchasePrice() {
        return planPrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.planPrice = purchasePrice;
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



    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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

    @Override
    public String toString() {
        return "PlanDetails{" +
                "planId=" + planId +
                ", planSerial='" + planSerial + '\'' +
                ", purchasePrice=" + planPrice +
                ", drugId='" + drugId + '\'' +
                ", supplierId=" + supplierId +
                ", planNum=" + planNum +
                ", purchaseId='" + purchaseId + '\'' +
                ", suppliers=" + suppliers +
                '}';
    }
}
