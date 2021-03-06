package cn.gson.hui_ren_boot.model.pojos.outpatient;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStandard;

import javax.persistence.*;

@Entity
@Table(name = "PRESCRIPTION_DETAIL", schema = "HUIREN", catalog = "")
public class PrescriptionDetail {
    private String detailNo;
    private String recipelNo;
    private String prescriptionNo;
    private String drugName;
    private Long dose;
    private String drugRoute;
    private String drugUse;
    private String drugNext;
    private Long aggregate;
    private String drugBig;
    private Long inject;
    private Long carryOut;
    private double subtotal;
    private Long typeId;
    private DrugInfo drug;
    private DrugStandard standards;

    @OneToOne
    public DrugInfo getDrug() {
        return drug;
    }

    public void setDrug(DrugInfo drug) {
        this.drug = drug;
    }

    @OneToOne
    public DrugStandard getStandards() {
        return standards;
    }

    public void setStandards(DrugStandard standards) {
        this.standards = standards;
    }

    @Id
    @Column(name = "RECIPEL_NO")
    public String getRecipelNo() {
        return recipelNo;
    }

    public void setRecipelNo(String recipelNo) {
        this.recipelNo = recipelNo;
    }

    @Basic
    @Column(name = "PRESCRIPTION_NO")
    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    @Basic
    @Column(name = "DRUG_NAME")
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @Basic
    @Column(name = "DOSE")
    public Long getDose() {
        return dose;
    }

    public void setDose(Long dose) {
        this.dose = dose;
    }

    @Basic
    @Column(name = "DRUG_ROUTE")
    public String getDrugRoute() {
        return drugRoute;
    }

    public void setDrugRoute(String drugRoute) {
        this.drugRoute = drugRoute;
    }

    @Basic
    @Column(name = "DRUG_USE")
    public String getDrugUse() {
        return drugUse;
    }

    public void setDrugUse(String drugUse) {
        this.drugUse = drugUse;
    }

    @Basic
    @Column(name = "DRUG_NEXT")
    public String getDrugNext() {
        return drugNext;
    }

    public void setDrugNext(String drugNext) {
        this.drugNext = drugNext;
    }

    @Basic
    @Column(name = "AGGREGATE")
    public Long getAggregate() {
        return aggregate;
    }

    public void setAggregate(Long aggregate) {
        this.aggregate = aggregate;
    }

    @Basic
    @Column(name = "DRUG_BIG")
    public String getDrugBig() {
        return drugBig;
    }

    public void setDrugBig(String drugBig) {
        this.drugBig = drugBig;
    }

    @Basic
    @Column(name = "INJECT")
    public Long getInject() {
        return inject;
    }

    public void setInject(Long inject) {
        this.inject = inject;
    }

    @Basic
    @Column(name = "CARRY_OUT")
    public Long getCarryOut() {
        return carryOut;
    }

    public void setCarryOut(Long carryOut) {
        this.carryOut = carryOut;
    }

    @Basic
    @Column(name = "SUBTOTAL")
    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Transient
    public String getDetailNo() {
        return detailNo;
    }

    public void setDetailNo(String detailNo) {
        this.detailNo = detailNo;
    }



    @Override
    public String toString() {
        return "PrescriptionDetail{" +
                "detailNo='" + detailNo + '\'' +
                ", recipelNo='" + recipelNo + '\'' +
                ", prescriptionNo='" + prescriptionNo + '\'' +
                ", drugName='" + drugName + '\'' +
                ", dose=" + dose +
                ", drugRoute='" + drugRoute + '\'' +
                ", drugUse='" + drugUse + '\'' +
                ", drugNext='" + drugNext + '\'' +
                ", aggregate=" + aggregate +
                ", drugBig='" + drugBig + '\'' +
                ", inject=" + inject +
                ", carryOut=" + carryOut +
                ", subtotal=" + subtotal +
                ", drug=" + drug +
                ", standards=" + standards +
                '}';
    }
}
