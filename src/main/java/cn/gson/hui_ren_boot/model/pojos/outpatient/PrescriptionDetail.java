package cn.gson.hui_ren_boot.model.pojos.outpatient;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PRESCRIPTION_DETAIL", schema = "HUIREN", catalog = "")
public class PrescriptionDetail {
    private long prescribeId;
    private String recipelNo;
    private String prescriptionNo;
    private String drugName;
    private Long dose;
    private String drugRoute;
    private String usage;
    private Long days;
    private Long aggregate;
    private String totalUnit;
    private Long inject;
    private Long carryOut;
    private String remark;
    private String standardName;
    private Long subtotal;

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "PRESCRIBE_ID")
    public long getPrescribeId() {
        return prescribeId;
    }

    public void setPrescribeId(long prescribeId) {
        this.prescribeId = prescribeId;
    }

    @Basic
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
    @Column(name = "USAGE")
    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Basic
    @Column(name = "DAYS")
    public Long getDays() {
        return days;
    }

    public void setDays(Long days) {
        this.days = days;
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
    @Column(name = "TOTAL_UNIT")
    public String getTotalUnit() {
        return totalUnit;
    }

    public void setTotalUnit(String totalUnit) {
        this.totalUnit = totalUnit;
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
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "STANDARD_NAME")
    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    @Basic
    @Column(name = "SUBTOTAL")
    public Long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrescriptionDetail that = (PrescriptionDetail) o;
        return prescribeId == that.prescribeId && Objects.equals(recipelNo, that.recipelNo) && Objects.equals(prescriptionNo, that.prescriptionNo) && Objects.equals(drugName, that.drugName) && Objects.equals(dose, that.dose) && Objects.equals(drugRoute, that.drugRoute) && Objects.equals(usage, that.usage) && Objects.equals(days, that.days) && Objects.equals(aggregate, that.aggregate) && Objects.equals(totalUnit, that.totalUnit) && Objects.equals(inject, that.inject) && Objects.equals(carryOut, that.carryOut) && Objects.equals(remark, that.remark) && Objects.equals(standardName, that.standardName) && Objects.equals(subtotal, that.subtotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prescribeId, recipelNo, prescriptionNo, drugName, dose, drugRoute, usage, days, aggregate, totalUnit, inject, carryOut, remark, standardName, subtotal);
    }
}
