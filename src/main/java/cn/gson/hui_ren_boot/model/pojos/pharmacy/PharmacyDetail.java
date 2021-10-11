package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "PHARMACY_DETAIL", schema = "HUIREN")
public class PharmacyDetail {

    private long detailId;
    private Long detailSerial;
    private String detailDrug;
    private Long detailInventory;
    private String detailBatch;
    private Date detailDate;

    @Id
    @Column(name = "DETAIL_ID")
    public long getDetailId() {
        return detailId;
    }

    public void setDetailId(long detailId) {
        this.detailId = detailId;
    }

    @Basic
    @Column(name = "DETAIL_SERIAL")
    public Long getDetailSerial() {
        return detailSerial;
    }

    public void setDetailSerial(Long detailSerial) {
        this.detailSerial = detailSerial;
    }

    @Basic
    @Column(name = "DETAIL_DRUG")
    public String getDetailDrug() {
        return detailDrug;
    }

    public void setDetailDrug(String detailDrug) {
        this.detailDrug = detailDrug;
    }

    @Basic
    @Column(name = "DETAIL_INVENTORY")
    public Long getDetailInventory() {
        return detailInventory;
    }

    public void setDetailInventory(Long detailInventory) {
        this.detailInventory = detailInventory;
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
    @Column(name = "DETAIL_DATE")
    public Date getDetailDate() {
        return detailDate;
    }

    public void setDetailDate(Date detailDate) {
        this.detailDate = detailDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PharmacyDetail that = (PharmacyDetail) o;
        return detailId == that.detailId && Objects.equals(detailSerial, that.detailSerial) && Objects.equals(detailDrug, that.detailDrug) && Objects.equals(detailInventory, that.detailInventory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailId, detailSerial, detailDrug, detailInventory);
    }

    public PharmacyDetail() {
    }

    public PharmacyDetail(Long detailSerial, String detailDrug, Long detailInventory, String detailBatch, Date detailDate) {
        this.detailSerial = detailSerial;
        this.detailDrug = detailDrug;
        this.detailInventory = detailInventory;
        this.detailBatch = detailBatch;
        this.detailDate = detailDate;
    }

    @Override
    public String toString() {
        return "PharmacyDetail{" +
                "detailId=" + detailId +
                ", detailSerial=" + detailSerial +
                ", detailDrug='" + detailDrug + '\'' +
                ", detailInventory=" + detailInventory +
                ", detailBatch='" + detailBatch + '\'' +
                '}';
    }
}
