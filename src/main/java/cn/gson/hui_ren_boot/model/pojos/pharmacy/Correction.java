package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Correction {
    private int correctionId;
    private String drugId;
    private String stockBatch;
    private Integer stockNumber;
    private Integer correctionNumber;
    private Integer stockNum;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date correctionDate;
    private String drugName;

    private Date str;
    private Date str1;
    private String search;


    @Id
    @Column(name = "CORRECTION_ID")
    public int getCorrectionId() {
        return correctionId;
    }

    public void setCorrectionId(int correctionId) {
        this.correctionId = correctionId;
    }

    @Basic
    @Column(name = "DRUG_ID")
    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    @Basic
    @Column(name = "STOCK_BATCH")
    public String getStockBatch() {
        return stockBatch;
    }

    public void setStockBatch(String stockBatch) {
        this.stockBatch = stockBatch;
    }

    @Basic
    @Column(name = "STOCK_NUMBER")
    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    @Basic
    @Column(name = "CORRECTION_NUMBER")
    public Integer getCorrectionNumber() {
        return correctionNumber;
    }

    public void setCorrectionNumber(Integer correctionNumber) {
        this.correctionNumber = correctionNumber;
    }

    @Basic
    @Column(name = "STOCK_NUM")
    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    @Basic
    @Column(name = "CORRECTION_DATE")
    public Date getCorrectionDate() {
        return correctionDate;
    }

    public void setCorrectionDate(Date correctionDate) {
        this.correctionDate = correctionDate;
    }

    @Transient
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Correction() {
    }

    @Transient
    public Date getStr() {
        return str;
    }

    public void setStr(Date str) {
        this.str = str;
    }

    @Transient
    public Date getStr1() {
        return str1;
    }

    public void setStr1(Date str1) {
        this.str1 = str1;
    }

    @Transient
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Correction(String drugId, String stockBatch, Integer stockNumber, Integer correctionNumber, Integer stockNum) {
        this.drugId = drugId;
        this.stockBatch = stockBatch;
        this.stockNumber = stockNumber;
        this.correctionNumber = correctionNumber;
        this.stockNum = stockNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Correction that = (Correction) o;
        return correctionId == that.correctionId && Objects.equals(drugId, that.drugId) && Objects.equals(stockBatch, that.stockBatch) && Objects.equals(stockNumber, that.stockNumber) && Objects.equals(correctionNumber, that.correctionNumber) && Objects.equals(stockNum, that.stockNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correctionId, drugId, stockBatch, stockNumber, correctionNumber, stockNum);
    }

    @Override
    public String toString() {
        return "Correction{" +
                "correctionId=" + correctionId +
                ", drugId='" + drugId + '\'' +
                ", stockBatch='" + stockBatch + '\'' +
                ", stockNumber=" + stockNumber +
                ", correctionNumber=" + correctionNumber +
                ", stockNum=" + stockNum +
                ", correctionDate=" + correctionDate +
                '}';
    }
}
