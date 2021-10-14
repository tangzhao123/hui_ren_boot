package cn.gson.hui_ren_boot.model.pojos.pharmacy;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Stockout {

    private long stockoutId;
    private Long stockoutProduct;
    private String stockoutGo;
    private Long stockoutAmount;
    private DrugInfo drugInfos;
    private String drugId;
    private String drugName;

    @OneToOne
    public DrugInfo getDrugInfos() {
        return drugInfos;
    }

    public void setDrugInfos(DrugInfo drugInfos) {
        this.drugInfos = drugInfos;
    }

    @Id
    @Column(name = "STOCKOUT_ID")
    public long getStockoutId() {
        return stockoutId;
    }

    public void setStockoutId(long stockoutId) {
        this.stockoutId = stockoutId;
    }

    @Basic
    @Column(name = "STOCKOUT_PRODUCT")
    public Long getStockoutProduct() {
        return stockoutProduct;
    }

    public void setStockoutProduct(Long stockoutProduct) {
        this.stockoutProduct = stockoutProduct;
    }

    @Basic
    @Column(name = "STOCKOUT_GO")
    public String getStockoutGo() {
        return stockoutGo;
    }

    public void setStockoutGo(String stockoutGo) {
        this.stockoutGo = stockoutGo;
    }

    @Basic
    @Column(name = "STOCKOUT_AMOUNT")
    public Long getStockoutAmount() {
        return stockoutAmount;
    }

    public void setStockoutAmount(Long stockoutAmount) {
        this.stockoutAmount = stockoutAmount;
    }

    @Transient
    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    @Transient
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stockout stockout = (Stockout) o;
        return stockoutId == stockout.stockoutId && Objects.equals(stockoutProduct, stockout.stockoutProduct) && Objects.equals(stockoutGo, stockout.stockoutGo) && Objects.equals(stockoutAmount, stockout.stockoutAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockoutId, stockoutProduct, stockoutGo, stockoutAmount);
    }

    @Override
    public String toString() {
        return "Stockout{" +
                "stockoutId=" + stockoutId +
                ", stockoutProduct=" + stockoutProduct +
                ", stockoutGo='" + stockoutGo + '\'' +
                ", stockoutAmount=" + stockoutAmount +
                '}';
    }
}
