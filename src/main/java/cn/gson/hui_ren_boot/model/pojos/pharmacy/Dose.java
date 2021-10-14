package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Dose {

    private long doseId;
    private String doseDrug;
    private Long doseSum;
    private String doseReason;
    private Timestamp doseDate;
    private String doseSend;
    private DrugInfo drugInfos;

    @OneToOne
    public DrugInfo getDrugInfos() {
        return drugInfos;
    }

    public void setDrugInfos(DrugInfo drugInfos) {
        this.drugInfos = drugInfos;
    }

    @Id
    @Column(name = "DOSE_ID")
    public long getDoseId() {
        return doseId;
    }

    public void setDoseId(long doseId) {
        this.doseId = doseId;
    }

    @Basic
    @Column(name = "DOSE_DRUG")
    public String getDoseDrug() {
        return doseDrug;
    }

    public void setDoseDrug(String doseDrug) {
        this.doseDrug = doseDrug;
    }

    @Basic
    @Column(name = "DOSE_SUM")
    public Long getDoseSum() {
        return doseSum;
    }

    public void setDoseSum(Long doseSum) {
        this.doseSum = doseSum;
    }

    @Basic
    @Column(name = "DOSE_REASON")
    public String getDoseReason() {
        return doseReason;
    }

    public void setDoseReason(String doseReason) {
        this.doseReason = doseReason;
    }

    @Basic
    @Column(name = "DOSE_DATE")
    public Timestamp getDoseDate() {
        return doseDate;
    }

    public void setDoseDate(Timestamp doseDate) {
        this.doseDate = doseDate;
    }

    @Basic
    @Column(name = "DOSE_SEND")
    public String getDoseSend() {
        return doseSend;
    }

    public void setDoseSend(String doseSend) {
        this.doseSend = doseSend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dose dose = (Dose) o;
        return doseId == dose.doseId && Objects.equals(doseDrug, dose.doseDrug) && Objects.equals(doseSum, dose.doseSum) && Objects.equals(doseReason, dose.doseReason) && Objects.equals(doseDate, dose.doseDate) && Objects.equals(doseSend, dose.doseSend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doseId, doseDrug, doseSum, doseReason, doseDate, doseSend);
    }

    public Dose() {

    }

    public Dose(String doseDrug, Long doseSum, String doseReason, String doseSend) {
        this.doseDrug = doseDrug;
        this.doseSum = doseSum;
        this.doseReason = doseReason;
        this.doseSend = doseSend;
    }

    @Override
    public String toString() {
        return "Dose{" +
                "doseId=" + doseId +
                ", doseDrug=" + doseDrug +
                ", doseSum=" + doseSum +
                ", doseReason='" + doseReason + '\'' +
                ", doseDate=" + doseDate +
                ", doseSend=" + doseSend +
                '}';
    }
}
