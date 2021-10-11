package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Allocating {

    private int allSerial;//序号
    private String allId;//详单号
    private Integer allDrug;//药品编号
    private Long allSum;//数量
    private String transfersId;//调拨单号
    private String drugName; //药品名称
    private String typeName; //药品类别
    private String materialName;//耗材名称
    private DrugInfo drugInfos;

    @OneToOne
    public DrugInfo getDrugInfos() {
        return drugInfos;
    }

    public void setDrugInfos(DrugInfo drugInfos) {
        this.drugInfos = drugInfos;
    }

    @Id
    @Column(name = "ALL_SERIAL")
    public int getAllSerial() {
        return allSerial;
    }

    public void setAllSerial(int allSerial) {
        this.allSerial = allSerial;
    }

    @Basic
    @Column(name = "ALL_ID")
    public String getAllId() {
        return allId;
    }

    public void setAllId(String allId) {
        this.allId = allId;
    }

    @Basic
    @Column(name = "ALL_DRUG")
    public Integer getAllDrug() {
        return allDrug;
    }

    public void setAllDrug(Integer allDrug) {
        this.allDrug = allDrug;
    }

    @Basic
    @Column(name = "ALL_SUM")
    public Long getAllSum() {
        return allSum;
    }

    public void setAllSum(Long allSum) {
        this.allSum = allSum;
    }

    @Basic
    @Column(name = "TRANSFERS_ID")
    public String getTransfersId() {
        return transfersId;
    }

    public void setTransfersId(String transfersId) {
        this.transfersId = transfersId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Allocating that = (Allocating) o;
        return allSerial == that.allSerial && Objects.equals(allId, that.allId) && Objects.equals(allDrug, that.allDrug) && Objects.equals(allSum, that.allSum) && Objects.equals(transfersId, that.transfersId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allSerial, allId, allDrug, allSum, transfersId);
    }

    @Override
    public String toString() {
        return "Allocating{" +
                "allSerial=" + allSerial +
                ", allId='" + allId + '\'' +
                ", allDrug=" + allDrug +
                ", allSum=" + allSum +
                ", transfersId=" + transfersId +
                ", drugName='" + drugName + '\'' +
                ", typeName='" + typeName + '\'' +
                ", materialName='" + materialName + '\'' +
                '}';
    }
}
