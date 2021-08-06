package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "DRUG_STOCK", schema = "HUIREN")
public class DrugStock {
    private Long stockId;
    private Long stockSurplus;//剩余库存
    private Long stockNumber;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date stockDate;
    private String stockBatch;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date stockIndate;
    private Long drugId;


    @Id
    @Column(name = "STOCK_ID")
    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    @Basic
    @Column(name = "STOCK_SURPLUS")
    public Long getStockSurplus() {
        return stockSurplus;
    }

    public void setStockSurplus(Long stockSurplus) {
        this.stockSurplus = stockSurplus;
    }



    @Basic
    @Column(name = "STOCK_NUMBER")
    public Long getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Long stockNumber) {
        this.stockNumber = stockNumber;
    }

    @Basic
    @Column(name = "STOCK_DATE")
    public Date getStockDate() {
        return stockDate;
    }

    public void setStockDate(Date stockDate) {
        this.stockDate = stockDate;
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
    @Column(name = "STOCK_INDATE")
    public Date getStockIndate() {
        return stockIndate;
    }

    public void setStockIndate(Date stockIndate) {
        this.stockIndate = stockIndate;
    }

    @Basic
    @Column(name = "DRUG_ID")
    public Long getDrugId() {
        return drugId;
    }

    public void setDrugId(Long drugId) {
        this.drugId = drugId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugStock drugStock = (DrugStock) o;
        return Objects.equals(stockId, drugStock.stockId) && Objects.equals(stockSurplus, drugStock.stockSurplus) && Objects.equals(stockNumber, drugStock.stockNumber) && Objects.equals(stockDate, drugStock.stockDate) && Objects.equals(stockBatch, drugStock.stockBatch) && Objects.equals(stockIndate, drugStock.stockIndate) && Objects.equals(drugId, drugStock.drugId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockId, stockSurplus, stockNumber, stockDate, stockBatch, stockIndate, drugId);
    }

    @Override
    public String toString() {
        return "DrugStock{" +
                "stockId=" + stockId +
                ", stockSurplus=" + stockSurplus +
                ", stockNumber=" + stockNumber +
                ", stockDate=" + stockDate +
                ", stockBatch='" + stockBatch + '\'' +
                ", stockIndate=" + stockIndate +
                ", drugId=" + drugId +
                '}';
    }
}
