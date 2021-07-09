package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DRUG_STANDARD", schema = "HUIREN")
public class DrugStandard {
    private Long standardId;//规格编号
    private String standardName;//规格名称
    private String standardUnit;//单位
    private Long standardNum;//实数
    private String standardDosage;//用途
    private String standardUse;//剂型


    @Id
    @Column(name = "STANDARD_ID")
    public Long getStandardId() {
         return standardId;
    }

    public void setStandardId(Long standardId) {
        this.standardId = standardId;
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
    @Column(name = "STANDARD_UNIT")
    public String getStandardUnit() {
        return standardUnit;
    }

    public void setStandardUnit(String standardUnit) {
        this.standardUnit = standardUnit;
    }

    @Basic
    @Column(name = "STANDARD_NUM")
    public Long getStandardNum() {
        return standardNum;
    }

    public void setStandardNum(Long standardNum) {
        this.standardNum = standardNum;
    }

    @Basic
    @Column(name = "STANDARD_DOSAGE")
    public String getStandardDosage() {
        return standardDosage;
    }

    public void setStandardDosage(String standardDosage) {
        this.standardDosage = standardDosage;
    }

    @Basic
    @Column(name = "STANDARD_USE")
    public String getStandardUse() {
        return standardUse;
    }

    public void setStandardUse(String standardUse) {
        this.standardUse = standardUse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugStandard that = (DrugStandard) o;
        return Objects.equals(standardId, that.standardId) && Objects.equals(standardName, that.standardName) && Objects.equals(standardUnit, that.standardUnit) && Objects.equals(standardNum, that.standardNum) && Objects.equals(standardDosage, that.standardDosage) && Objects.equals(standardUse, that.standardUse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(standardId, standardName, standardUnit, standardNum, standardDosage, standardUse);
    }
}
