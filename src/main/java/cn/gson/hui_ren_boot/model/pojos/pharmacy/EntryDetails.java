package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ENTRY_DETAILS", schema = "HUIREN")
public class EntryDetails {

    private long detailsId;
    private String detailsDrug;
    private Long detailsEntry;
    private String detailBatch;
    private Long detailNumber;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp detailProduction;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp detailValidity;


    @Id
    @Column(name = "DETAILS_ID")
    public long getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(long detailsId) {
        this.detailsId = detailsId;
    }

    @Basic
    @Column(name = "DETAILS_DRUG")
    public String getDetailsDrug() {
        return detailsDrug;
    }

    public void setDetailsDrug(String detailsDrug) {
        this.detailsDrug = detailsDrug;
    }

    @Basic
    @Column(name = "DETAILS_ENTRY")
    public Long getDetailsEntry() {
        return detailsEntry;
    }

    public void setDetailsEntry(Long detailsEntry) {
        this.detailsEntry = detailsEntry;
    }

    @Basic
    @Column(name = "DETAIL_BATCH")
    public String getDetailBatch() {
        return detailBatch;
    }

    public void setDetailBatch(String detailBatch) {
        this.detailBatch = detailBatch;
    }

    @Basic
    @Column(name = "DETAIL_NUMBER")
    public Long getDetailNumber() {
        return detailNumber;
    }

    public void setDetailNumber(Long detailNumber) {
        this.detailNumber = detailNumber;
    }

    @Basic
    @Column(name = "DETAIL_PRODUCTION")
    public Timestamp getDetailProduction() {
        return detailProduction;
    }

    public void setDetailProduction(Timestamp detailProduction) {
        this.detailProduction = detailProduction;
    }

    @Basic
    @Column(name = "DETAIL_VALIDITY")
    public Timestamp getDetailValidity() {
        return detailValidity;
    }

    public void setDetailValidity(Timestamp detailValidity) {
        this.detailValidity = detailValidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntryDetails that = (EntryDetails) o;
        return detailsId == that.detailsId && Objects.equals(detailsDrug, that.detailsDrug) && Objects.equals(detailsEntry, that.detailsEntry) && Objects.equals(detailBatch, that.detailBatch) && Objects.equals(detailNumber, that.detailNumber) && Objects.equals(detailProduction, that.detailProduction) && Objects.equals(detailValidity, that.detailValidity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailsId, detailsDrug, detailsEntry, detailBatch, detailNumber, detailProduction, detailValidity);
    }

    @Override
    public String toString() {
        return "EntryDetails{" +
                "detailsId=" + detailsId +
                ", detailsDrug='" + detailsDrug + '\'' +
                ", detailsEntry=" + detailsEntry +
                ", detailBatch='" + detailBatch + '\'' +
                ", detailNumber=" + detailNumber +
                ", detailProduction=" + detailProduction +
                ", detailValidity=" + detailValidity +
                '}';
    }
}
