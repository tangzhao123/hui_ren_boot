package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "DRUG_STOCK", schema = "HUIREN")
public class DrugStock {
    private Long stockId;
    private Long stockSurplus;
    private Long stockLimit;
    private Long stockFloor;
    private Long stockXnum;
    private Long stockZnum;
    private Long stockNumber;
    private Date stockDate;
    private String stockBatch;
    private Date stockIndate;



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
    @Column(name = "STOCK_LIMIT")
    public Long getStockLimit() {
        return stockLimit;
    }

    public void setStockLimit(Long stockLimit) {
        this.stockLimit = stockLimit;
    }

    @Basic
    @Column(name = "STOCK_FLOOR")
    public Long getStockFloor() {
        return stockFloor;
    }

    public void setStockFloor(Long stockFloor) {
        this.stockFloor = stockFloor;
    }

    @Basic
    @Column(name = "STOCK_XNUM")
    public Long getStockXnum() {
        return stockXnum;
    }

    public void setStockXnum(Long stockXnum) {
        this.stockXnum = stockXnum;
    }

    @Basic
    @Column(name = "STOCK_ZNUM")
    public Long getStockZnum() {
        return stockZnum;
    }

    public void setStockZnum(Long stockZnum) {
        this.stockZnum = stockZnum;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugStock drugStock = (DrugStock) o;
        return Objects.equals(stockId, drugStock.stockId) && Objects.equals(stockSurplus, drugStock.stockSurplus) && Objects.equals(stockLimit, drugStock.stockLimit) && Objects.equals(stockFloor, drugStock.stockFloor) && Objects.equals(stockXnum, drugStock.stockXnum) && Objects.equals(stockZnum, drugStock.stockZnum) && Objects.equals(stockNumber, drugStock.stockNumber) && Objects.equals(stockDate, drugStock.stockDate) && Objects.equals(stockBatch, drugStock.stockBatch) && Objects.equals(stockIndate, drugStock.stockIndate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockId, stockSurplus, stockLimit, stockFloor, stockXnum, stockZnum, stockNumber, stockDate, stockBatch, stockIndate);
    }
}
