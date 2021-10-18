package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

//药品库存查询vo类
public class DrugStockVo {
    private Long stockId;
    private Long stockSurplus;//剩余库存
    private Long stockNumber;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date stockDate;
    private String stockBatch;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date stockIndate;
    private Long drugId;
    private String drugName;
    private String typeName;

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public Long getStockSurplus() {
        return stockSurplus;
    }

    public void setStockSurplus(Long stockSurplus) {
        this.stockSurplus = stockSurplus;
    }

    public Long getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Long stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Date getStockDate() {
        return stockDate;
    }

    public void setStockDate(Date stockDate) {
        this.stockDate = stockDate;
    }

    public String getStockBatch() {
        return stockBatch;
    }

    public void setStockBatch(String stockBatch) {
        this.stockBatch = stockBatch;
    }

    public Date getStockIndate() {
        return stockIndate;
    }

    public void setStockIndate(Date stockIndate) {
        this.stockIndate = stockIndate;
    }

    public Long getDrugId() {
        return drugId;
    }

    public void setDrugId(Long drugId) {
        this.drugId = drugId;
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

    @Override
    public String toString() {
        return "DrugStockVo{" +
                "stockId=" + stockId +
                ", stockSurplus=" + stockSurplus +
                ", stockNumber=" + stockNumber +
                ", stockDate=" + stockDate +
                ", stockBatch='" + stockBatch + '\'' +
                ", stockIndate=" + stockIndate +
                ", drugId=" + drugId +
                ", drugName='" + drugName + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
