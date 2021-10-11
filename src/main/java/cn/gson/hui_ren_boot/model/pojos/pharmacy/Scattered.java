package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
public class Scattered {

    private int scId;
    private String drugName;
    private Long scNumber;
    private String drugBatch;
    private Date drugDate;


    @Id
    @Column(name = "SC_ID")
    public int getScId() {
        return scId;
    }

    public void setScId(int scId) {
        this.scId = scId;
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
    @Column(name = "SC_NUMBER")
    public Long getScNumber() {
        return scNumber;
    }

    public void setScNumber(Long scNumber) {
        this.scNumber = scNumber;
    }

    @Basic
    @Column(name = "DRUG_BATCH")
    public String getDrugBatch() {
        return drugBatch;
    }

    public void setDrugBatch(String drugBatch) {
        this.drugBatch = drugBatch;
    }

    @Basic
    @Column(name = "DRUG_DATE")
    public Date getDrugDate() {
        return drugDate;
    }

    public void setDrugDate(Date drugDate) {
        this.drugDate = drugDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scattered scattered = (Scattered) o;
        return scId == scattered.scId && Objects.equals(drugName, scattered.drugName) && Objects.equals(scNumber, scattered.scNumber) && Objects.equals(drugBatch, scattered.drugBatch) && Objects.equals(drugDate, scattered.drugDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scId, drugName, scNumber, drugBatch, drugDate);
    }

    public Scattered() {
    }

    public Scattered(String drugName, Long scNumber, String drugBatch, Date drugDate) {
        this.drugName = drugName;
        this.scNumber = scNumber;
        this.drugBatch = drugBatch;
        this.drugDate = drugDate;
    }

    @Override
    public String toString() {
        return "Scattered{" +
                "scId=" + scId +
                ", drugName='" + drugName + '\'' +
                ", scNumber=" + scNumber +
                ", drugBatch='" + drugBatch + '\'' +
                ", drugDate=" + drugDate +
                '}';
    }
}
