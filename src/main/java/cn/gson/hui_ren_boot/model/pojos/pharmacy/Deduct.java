package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Deduct {

    private long deductId;
    private Long drugId;
    private String drugName;
    private Long deductSum;
    private String goNum;


    @Id
    @Column(name = "DEDUCT_ID")
    public long getDeductId() {
        return deductId;
    }

    public void setDeductId(long deductId) {
        this.deductId = deductId;
    }

    @Basic
    @Column(name = "DRUG_ID")
    public Long getDrugId() {
        return drugId;
    }

    public void setDrugId(Long drugId) {
        this.drugId = drugId;
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
    @Column(name = "DEDUCT_SUM")
    public Long getDeductSum() {
        return deductSum;
    }

    public void setDeductSum(Long deductSum) {
        this.deductSum = deductSum;
    }

    @Basic
    @Column(name = "GO_NUM")
    public String getGoNum() {
        return goNum;
    }

    public void setGoNum(String goNum) {
        this.goNum = goNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deduct deduct = (Deduct) o;
        return deductId == deduct.deductId && Objects.equals(drugId, deduct.drugId) && Objects.equals(drugName, deduct.drugName) && Objects.equals(deductSum, deduct.deductSum) && Objects.equals(goNum, deduct.goNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deductId, drugId, drugName, deductSum, goNum);
    }

    public Deduct(Long drugId, String drugName, Long deductSum, String goNum) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.deductSum = deductSum;
        this.goNum = goNum;
    }

    public Deduct() {
    }

    @Override
    public String toString() {
        return "Deduct{" +
                "deductId=" + deductId +
                ", drugId=" + drugId +
                ", drugName='" + drugName + '\'' +
                ", deductSum=" + deductSum +
                ", goNum='" + goNum + '\'' +
                '}';
    }
}
