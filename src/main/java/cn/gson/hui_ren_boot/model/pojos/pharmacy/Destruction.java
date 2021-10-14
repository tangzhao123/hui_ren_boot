package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Destruction {

    private int deSerial; //详单序号
    private String deId; //详单编号
    private Integer deDrug; //产品编号
    private Long deSum; //销毁数量
    private String applyId; //销毁单编号
    private String deBatch; //产品批号
    private String drugName;//产品名称
    private DrugInfo drugInfos;

    @OneToOne
    public DrugInfo getDrugInfos() {
        return drugInfos;
    }

    public void setDrugInfos(DrugInfo drugInfos) {
        this.drugInfos = drugInfos;
    }

    @Id
    @Column(name = "DE_SERIAL")
    public int getDeSerial() {
        return deSerial;
    }

    public void setDeSerial(int deSerial) {
        this.deSerial = deSerial;
    }

    @Basic
    @Column(name = "DE_ID")
    public String getDeId() {
        return deId;
    }

    public void setDeId(String deId) {
        this.deId = deId;
    }

    @Basic
    @Column(name = "DE_DRUG")
    public Integer getDeDrug() {
        return deDrug;
    }

    public void setDeDrug(Integer deDrug) {
        this.deDrug = deDrug;
    }

    @Basic
    @Column(name = "DE_SUM")
    public Long getDeSum() {
        return deSum;
    }

    public void setDeSum(Long deSum) {
        this.deSum = deSum;
    }

    @Basic
    @Column(name = "APPLY_ID")
    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    @Basic
    @Column(name = "DE_BATCH")
    public String getDeBatch() {
        return deBatch;
    }

    public void setDeBatch(String deBatch) {
        this.deBatch = deBatch;
    }

    @Transient
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destruction that = (Destruction) o;
        return deSerial == that.deSerial && Objects.equals(deId, that.deId) && Objects.equals(deDrug, that.deDrug) && Objects.equals(deSum, that.deSum) && Objects.equals(applyId, that.applyId) && Objects.equals(deBatch, that.deBatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deSerial, deId, deDrug, deSum, applyId, deBatch);
    }

    public Destruction() {
    }

    public Destruction(int deSerial, String deId, Integer deDrug, Long deSum, String applyId, String deBatch) {
        this.deSerial = deSerial;
        this.deId = deId;
        this.deDrug = deDrug;
        this.deSum = deSum;
        this.applyId = applyId;
        this.deBatch = deBatch;
    }

    @Override
    public String toString() {
        return "Destruction{" +
                "deSerial=" + deSerial +
                ", deId='" + deId + '\'' +
                ", deDrug=" + deDrug +
                ", deSum=" + deSum +
                ", applyId='" + applyId + '\'' +
                ", deBatch='" + deBatch + '\'' +
                '}';
    }
}
