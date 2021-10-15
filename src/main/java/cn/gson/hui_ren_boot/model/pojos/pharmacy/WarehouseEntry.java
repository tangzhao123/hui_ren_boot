package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "WAREHOUSE_ENTRY", schema = "HUIREN")
public class WarehouseEntry {

    private long entryId;
    private String entrySerial;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date entryDate;
    private Long entryPharmacy;
    private String entryBatch;
    private String entryOrder;
    private List<EntryDetails> entryDetailsData;
    private List<DrugStock> drugStocks;
    private DrugDeport deports;
    private Integer pageNo;
    private Integer size;
    private String drugName;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @OneToOne
    public DrugDeport getDeports() {
        return deports;
    }

    public void setDeports(DrugDeport deports) {
        this.deports = deports;
    }




    @Id
    @Column(name = "ENTRY_ID")
    public long getEntryId() {
        return entryId;
    }

    public void setEntryId(long entryId) {
        this.entryId = entryId;
    }

    @Basic
    @Column(name = "ENTRY_SERIAL")
    public String getEntrySerial() {
        return entrySerial;
    }

    public void setEntrySerial(String entrySerial) {
        this.entrySerial = entrySerial;
    }


    @Basic
    @Column(name = "ENTRY_DATE")

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Basic
    @Column(name = "ENTRY_PHARMACY")
    public Long getEntryPharmacy() {
        return entryPharmacy;
    }

    public void setEntryPharmacy(Long entryPharmacy) {
        this.entryPharmacy = entryPharmacy;
    }

    @Basic
    @Column(name = "ENTRY_BATCH")
    public String getEntryBatch() {
        return entryBatch;
    }

    public void setEntryBatch(String entryBatch) {
        this.entryBatch = entryBatch;
    }

    @Basic
    @Column(name = "ENTRY_ORDER")
    public String getEntryOrder() {
        return entryOrder;
    }

    public void setEntryOrder(String entryOrder) {
        this.entryOrder = entryOrder;
    }

    @OneToMany
    public List<EntryDetails> getEntryDetailsData() {
        return entryDetailsData;
    }

    public void setEntryDetailsData(List<EntryDetails> entryDetailsData) {
        this.entryDetailsData = entryDetailsData;
    }


    @OneToMany
    public List<DrugStock> getDrugStocks() {
        return drugStocks;
    }

    public void setDrugStocks(List<DrugStock> drugStocks) {
        this.drugStocks = drugStocks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WarehouseEntry that = (WarehouseEntry) o;
        return entryId == that.entryId && Objects.equals(entrySerial, that.entrySerial) && Objects.equals(entryDate, that.entryDate) && Objects.equals(entryPharmacy, that.entryPharmacy) && Objects.equals(entryBatch, that.entryBatch) && Objects.equals(entryOrder, that.entryOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entryId, entrySerial, entryDate, entryPharmacy, entryBatch, entryOrder);
    }

    @Override
    public String toString() {
        return "WarehouseEntry{" +
                "entryId=" + entryId +
                ", entrySerial='" + entrySerial + '\'' +
                ", entryDate=" + entryDate +
                ", entryPharmacy=" + entryPharmacy +
                ", entryBatch='" + entryBatch + '\'' +
                ", entryOrder='" + entryOrder + '\'' +
                ", entryDetailsData=" + entryDetailsData +
                ", drugStocks=" + drugStocks +
                '}';
    }
}
